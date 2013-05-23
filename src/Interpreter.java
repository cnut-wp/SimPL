import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Interpreter {
	public static Lexer lexer = null;

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
			lexer = new Lexer(System.in);
		} else if (args.length == 2 && args[0].equals("-f")) {
			lexer = new Lexer(getFileInputStream(args[1]));
		} else {
			printUsage(args);
		}
		for (;;) {
			if (lexer.yylex() > 0)
				System.out.println(lexer.token + " " + lexer.yylval);
			else
				break;
		}
		return;
	}

}
