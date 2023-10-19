package FileImport;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import shapes.shapes;



public class FileImport {
	/**
	 * Reads from the given file and separates all contents into classes
	 * 
	 * @param f = filename, the name of the file
	 */
	
	// change the "shapes" part to whatever is the super class of all shapes
	public List<shapes> Shapes = new ArrayList<shapes>();
	
	public FileImport() {
		
	}
	
	public void readFile(String f) {
		File file = new File(f);
		
		Scanner scan;
		try {
			scan = new Scanner(file);
			scan.useDelimiter(" ");
			int amount = Integer.parseInt(scan.next());
			while (scan.hasNext()) {
				String name = scan.next();
				Double v1 = Double.parseDouble(scan.next());
				Double v2 = Double.parseDouble(scan.next());
				shapes shape = new shapes(name, v1, v2);
				Shapes.add(shape);
			}
			System.out.println(Shapes.size());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
