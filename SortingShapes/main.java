import FileImport.FileImport;
import java.util.Scanner;


public class Main {
	/** 
	 * Takes command line arguments to take
	 * -f for file name
	 * -t for what to sort by
	 * -s for what sort to use
	 * 
	 * used to select what parameters are used by the program,
	 * 
	 * 
	 */
	public static String filename = null;
	public static String type = null;
	public static String sort = null;
	static Scanner scanner = new Scanner(System.in);
	static String path = scanner.nextLine();
	
	public static void main(String[] args) {
		int i;
		for (i = 0; i < args.length; i++) {
			switch (args[i].toLowerCase()) {
			case "-f":
				filename = args[i+1];
				i++;
				System.out.println(filename);
				
			case "-t":
				switch (args[i+1].toLowerCase()) {
				case "v":
					type = "Volume";
					System.out.println("v");
					return;
				case "h":
					type = "Height";
					System.out.println("h");
					return;
				case "a":
					type = "Base Area";
					System.out.println("a");
					return;
				default:
					System.out.println("not a valid type");
					return;
				}
				
			case "-s":
				switch (args[i+1].toLowerCase()) {
				case "b":
					sort = "Bubble";
					System.out.println("b");
					return;
				case "s":
					sort = "selection";
					System.out.println("s");
					return;
				case "i":
					sort = "insertion";
					System.out.println("i");
					return;
				case "m":
					sort = "merge";
					System.out.println("m");
					return;
				case "q":
					sort = "quick";
					System.out.println("q");
					return;
				case "z":
					sort = "gnome";
					System.out.println("z");
					return;
				default:
					System.out.println("not a valid sort");
					return;
				}
			}
		}	
		FileImport fil = new FileImport();
		fil.readFile(filename);


	}

}
