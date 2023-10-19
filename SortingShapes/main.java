import FileImport.FileImport;
public class main {

	static Scanner scanner = new Scanner(System.in);
	static String path = scanner.nextLine();;
	
	public static void main(String[] args) {
		FileImport fil = new FileImport();
		fil.readFile(path);
		// testing
		//Hi
		//trying to recommit the files
	}

}
