package FileImport;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import shapes.shapes;


public class FileImport {
	List<List> full = new ArrayList<List>();
	List<shapes> Shapes = new ArrayList<shapes>();
	
	/**
	 * Reads from the given file and separates all contents into classes
	 * @param f = filename, the name of the file
	 */
	public FileImport() {
		
	}
	
	public void readFile(String f) {
		try {
			// This part creates a file called fil then creates a scanner reading fil
			File fil = new File(f);
			Scanner myReader = new Scanner(fil);
			// this is the loop that goes through the file
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] values = data.split(" ");
				int i;
				for (i = 0; i < values.length; i+=3) {
					String names = values[i];
					String v1 = values[i+1];
					String v2 = values[i+2];
					shapes Shape = new shapes(names, v1, v2);
					
					Shapes.add(Shape);
					
;					
				}
			}
			System.out.println(Shapes.size());
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}
	

}
