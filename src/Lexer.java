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
	
	private Lexer() {};

	public Lexer(InputStream in) {
		this.in = in;
	};
    private void getChar(){
		if (c >= 0) {
			try {
				yylval += c;
				c = System.in.read();	
			} catch (Exception e) {
				c = (-1);
			}
		}
    }
	
	private void nextChar() {
		if (c >= 0) {
			try {
				c = System.in.read();
			} catch (Exception e) {
				c = (-1);
			}
		}
	}
	
	private void yyerror(String s){
		System.err.println("in line "+ line + ": " + s);
		System.exit(-1);
	}

	private void ContinueGetID(){
		do {
			String s = "";
			s += c;
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
//		        	       ; let; in; end; if; then; else; while; do; nil; ; snd; head; tail; and; or; not
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
		        default  : if (Character.isDigit((char)c)) {
		                     int n = 0;
		                       do {
		                         n = 10*n + (c - '0');
		                         nextChar();
		                       } while (Character.isDigit((char)c));
		                       yylval += n;
		                       return token=0;
		                     } else {
		                       //yyerror("Illegal character "+c);
		                       nextChar();
		                     }
		      }
		    }
	}

}
