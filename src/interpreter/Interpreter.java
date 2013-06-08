package interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import symbol.SymbolTable;
import syntax.Value;

public class Interpreter {
	public static String PROMTINFOMETA = "SimPL> ";
	public static String PROMTINFO = "";
	public static SymbolTable symbolTable = new SymbolTable();
	public static boolean shellMode = false;
	public static boolean debug = false;
	public static Lexer lexer = null;
	public static Parser parser = null;
	public static Value final_result = null;
	
	public static String tokenName[] = {"ENDINPUT","AND", "ASSIGN","BOOLEAN", "COMMA", "CONS", 
		"DEVIDE", "DO", "ELSE","END","EQ", "FST","FUN","GT","HEAD","ID","IF","IN","INTEGER",
		"LAMDA","LET","LOW","LPAREN", "LT", "MINUS","NIL","NOT","OR","PLUS","RPAREN", "SEMICOLON",
		"SKIP","SND","TAIL","THEN", "TIMES", "UMINUS", "WHILE","error"};

 
	private static void printUsage(String args[]) {
		System.out.println("SimPL -f src  or  SimPL -s");
		System.out.println("Your argument: ");
		for (String s : args) {
			System.out.print(s + ' ');
		}
		System.out.print('\n');
		System.exit(-1);
	}

	private static InputStream getFileInputStream(String fileName) {
		File file = new File(fileName);
		InputStream in = null;
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Cannot file [" + fileName + "]");
			System.exit(-1);
		}
		return in;
	}
	
	private static boolean writeFileResult(String fileName, String result) {
		File file = new File(fileName);
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
			out.write(result.getBytes());
			out.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Cannot file [" + fileName + "]");
			System.exit(-1);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Cannot write to file [" + fileName + "]");
			System.exit(-1);
		}
		return false;
	}
	
	public static String getResultFileName(String inputFile){
		int i = 0;
		for (i = inputFile.length()-1; i >= 0 ; i--){
			if (inputFile.charAt(i) == '.'){
				break;
			}
		}
		if (i == 0){
			System.err.println("FileName Error. Your name is :" + inputFile);
			System.exit(-1);
		}
		String name = inputFile.substring(0, i);
		return name+".rst";
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-s")) {
			Interpreter.shellMode = true;
			lexer = new Lexer(System.in);	
		} else if (args.length == 2 && args[0].equals("-f")) {
			lexer = new Lexer(getFileInputStream(args[1]));
		} else if (args.length == 2 && args[0].equals("-s") && args[1].equals("-d")) {
			Interpreter.shellMode = true;
			Interpreter.debug = true;
			lexer = new Lexer(System.in);
		} else {
			printUsage(args);
		}
		if (Interpreter.shellMode){
			Interpreter.PROMTINFO = Interpreter.PROMTINFOMETA;
			System.out.print(Interpreter.PROMTINFO);
		}
		lexer.nextChar();
		lexer.yylex();
		parser = new Parser();
		parser.parse();
		if (Interpreter.shellMode){
			System.out.println(Interpreter.PROMTINFO+Interpreter.final_result);
		} else {
			writeFileResult(getResultFileName(args[1]), Interpreter.final_result.toString());
		}

		/*
		for (;;) {
			if (lexer.yylex() > 0){
				if (Lexer.token == Tokens.ID || Lexer.token == Tokens.BOOLEAN || Lexer.token == Tokens.INTEGER)
					System.out.println(Lexer.token + " " + Lexer.yylval);
				else if (Lexer.token < 25)
					System.out.println(Lexer.token + " " + tokenName[Lexer.token]);
				else 
					System.out.println(Lexer.token + " " + (char)(Lexer.token));
			}
			else
				break;
		}
		*/
		return;
	}

}
