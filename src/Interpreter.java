import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Interpreter {
	public static boolean shellMode = false;
	public static Lexer lexer = null;
	static String tokenName[] = {"ENDINPUT","AND", "ASSIGN","BOOLEAN","CONS","DO",
		"ELSE","END","FST","FUN","HEAD","ID","IF","IN","INTEGER","LAMDA","LET","NIL",
        "NOT","OR","SKIP","SND","TAIL","THEN","WHILE","error"};

 
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

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-s")) {
			Interpreter.shellMode = true;
			lexer = new Lexer(System.in);
		} else if (args.length == 2 && args[0].equals("-f")) {
			lexer = new Lexer(getFileInputStream(args[1]));
		} else {
			printUsage(args);
		}
		lexer.nextChar();

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
		return;
	}

}
