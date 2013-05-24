import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
	String SPERATORSET = "[:;()+-/=><~\n\f\r\t /*]";
    Pattern SPERATOR = Pattern.compile(SPERATORSET);
	public static int token;
	public static String yylval;;

	private InputStream in;
	private int c;
    private int line = 1;
	

	@SuppressWarnings("unused")
	private Lexer() {};

	public Lexer(InputStream in) {
		this.in = in;
	};
	
	/*
	 * called for saved the char into the yyval
	 * it will append the current char to  the yylval, and read next char 
	 */
    private void getChar(){
		if (c >= 0) {
			try {
				yylval += (char)c;
				c = in.read();	
			} catch (Exception e) {
				c = (-1);
			}
		}
    }
	
    /*
     * read next char
     */
	public void nextChar() {
		if (c >= 0) {
			try {
				c = in.read();
			} catch (Exception e) {
				c = (-1);
			}
		}
	}
	
	private void yyerror(String s){
		System.err.println("in line "+ line + ": " + s);
		System.exit(-1);
	}

	/*
	 * get a ID started with the key words
	 */
	private void ContinueGetID(){
		do {
			String s = "";
			if (c < 0)
				break;
			s += (char)c;
			Matcher matcher = SPERATOR.matcher(s);
			if (matcher.matches() == true)
				break;
			getChar();
		}while(true);
	}
	
	public int yylex() {
		 for (;;) {
		      // Skip whitespace
		      while (c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f') {
		    	  if (c == '\n')
		    		  line++;
		          nextChar();
		      }
		      if (c<0) {
		        return (token=Tokens.ENDINPUT);
		      }
		      switch (c) {
		        case '$' : 
		        	      if (Interpreter.shellMode == true){
		        	    	  return (token=Tokens.ENDINPUT);
		        	      } else {
		        	    	  yyerror("Illegal character "+"$" + "in file mode");
		        	      }
		        case '+' : nextChar();
		                   return token='+';
		        case '-' : // '-' and  ->
		        	       nextChar();
		        	       if (c != '>'){
		        	    	   return token='-';
		        	       } else {
		        	    	  nextChar();
		        	    	  return token=Tokens.LAMDA;
		        	       }
		        case '*' : nextChar();
		                   return token='*';
		        case '/' :  // '/' and /*  */
		        	       nextChar();
		             	   if (c != '*'){
		        			   return token='/'; 
		        		   }
		        		   while(true){
		        				nextChar();
		        				if (c != '*'){
		        					continue;
		        				}else{
		        					nextChar();
		        					if (c == '/'){
		        						break;
		        					}
		        				}
		        			}
		        			nextChar();
		        			break;
		        case '=' : nextChar();
		        		   return token='=';
		        case '>' : nextChar();
	        		       return token='>';
		        case '<' : nextChar();
	        		       return token='<';

		        case '(' : nextChar();
		                   return token='(';
		        case ')' : nextChar();
		                   return token=')';
		        case ';' : nextChar();
		                   return token=';';
		        case ',' : nextChar();
    				       return token=',';
		        case '~' : nextChar();
			               return token='~';
			               
		        case ':' :  // := assignment  :: cons
		        	       nextChar();
		        	       if (c == '=')
		        	       {
		        	    	   nextChar();
		        	    	   return token = Tokens.ASSIGNMENT;
		        	       }else if (c == ':'){
		        	    	   nextChar();
		        	    	   return token = Tokens.CONS;
		        	       } else {
		        	    	   yyerror("Illegal character "+c);
		        	       }
//	-----------------------------------------------------------------------------
		        case 'f' :  // fun and fst
		        		   yylval="";
		        	       getChar();
		        	       if (c == 'u'){
		        	    	   getChar();
		        	    	   if (c == 'n')
		        	    	   {
		        	    		   getChar();
		        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
		        	    			   return token=Tokens.FUN;
		        	    	   }
		        	       } else if (c == 's'){
		        	    	   getChar();
		        	    	   if (c == 't')
		        	    	   {
		        	    		   getChar();
		        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
		        	    			   return token=Tokens.FST;
		        	    	   }
		        	       }
		        	       ContinueGetID();
		        	       return token=Tokens.ID;
		        case 'l' :  // let
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'e'){
	        	    	   getChar();
	        	    	   if (c == 't')
	        	    	   {
	        	    		   getChar();
	        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    			   return token=Tokens.LET;
	        	    	   }
	        	       } 
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'i' : // in and if
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'n'){
	        	    	   getChar();
	        
	        	    	   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    		   return token=Tokens.IN;

	        	       } else if (c == 'f'){
	          	    	   getChar();
	          		        
        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
        	    			   return token=Tokens.IF;

	        	       }
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'e' : // end and else
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'n'){
	        	    	   getChar();
	        	    	   if (c == 'd'){
	        	    		   getChar();
	        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    			   return token=Tokens.END;
	        	    	   }

	        	       } else if (c == 'l'){
	          	    	   getChar();
	          		       if (c == 's'){
	          		    	   getChar();
	          		    	   if (c == 'e'){
	          		    		   getChar();
	          		    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	          		    			   return token=Tokens.ELSE;
	          		    	   }
	          		       }

	        	       }
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 't' : // then and tail
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'h'){
	        	    	   getChar();
	        	    	   if (c == 'e'){
	        	    		   getChar();
	        	    		   if (c == 'n'){
	        	    			   getChar();
	        	    			   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    				   return token=Tokens.THEN;
	        	    		   }
	        	    	   }
	        	       } else if (c == 'a'){
	          	    	   getChar();
	          		       if (c == 'i'){
	          		    	   getChar();
	          		    	   if (c == 'l'){
	          		    		   getChar();
	          		    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	          		    			   return token=Tokens.TAIL;
	          		    	   }
	          		       }

	        	       }
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'w' : // while
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'h'){
	        	    	   getChar();
	        	    	   if (c == 'i'){
	        	    		   getChar();
	        	    		   if (c == 'l'){
	        	    			   getChar();
	        	    			   if (c == 'e'){
	        	    				   getChar();
	        	    			   	   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    					   return token=Tokens.WHILE;
	        	    			   }
	        	    			   
	        	    		   }
	        	    	   }
	        	       }
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'd' :  // do
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'o'){
	        	    	   getChar();
	        	    	   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    		   return token=Tokens.DO;
	        	       } 
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'n' :  // nil and not
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'i'){
	        	    	   getChar();
	        	    	   if (c == 'l')
	        	    	   {
	        	    		   getChar();
	        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    			   return token=Tokens.NIL;
	        	    	   }
	        	       } else if (c == 'o'){
	        	    	   getChar();
	        	    	   if (c == 't')
	        	    	   {
	        	    		   getChar();
	        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    			   return token=Tokens.NOT;
	        	    	   }
	        	       }
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 's' :  // snd
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'n'){
	        	    	   getChar();
	        	    	   if (c == 'd')
	        	    	   {
	        	    		   getChar();
	        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    			   return token=Tokens.SND;
	        	    	   }
	        	       } 
	        	       ContinueGetID();
	        	       return token=Tokens.ID;

		        case 'h' :  // head
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'e'){
	        	    	   getChar();
	        	    	   if (c == 'a')
	        	    	   {
	        	    		   getChar();
		        	    	   if (c == 'd')
		        	    	   {
		        	    		   getChar();
		        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
		        	    			   return token=Tokens.HEAD;
		        	    	   }
	        	    	   }
	        	       } 
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'a' :  // and
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'n'){
	        	    	   getChar();
	        	    	   if (c == 'd')
	        	    	   {
	        	    		   getChar();
	        	    		   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    			   return token=Tokens.AND;
	        	    	   }
	        	       } 
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        case 'o' :  // or
	        		   yylval="";
	        	       getChar();
	        	       if (c == 'r'){
	        	    	   getChar();
	        	    	   if ( c==' ' || c=='\n' || c=='\t' || c=='\r' || c == '\f')
	        	    		   return token=Tokens.OR;
	        	       } 
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		        default  : 
		        	   yylval="";
	        	       ContinueGetID();
	        	       return token=Tokens.ID;
		      }
		    }
	}

}
