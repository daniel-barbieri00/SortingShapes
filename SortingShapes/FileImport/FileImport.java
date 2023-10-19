package SortingShapes.FileImport;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SortingShapes.shapes.*;


public class FileImport {
	List<List> full = new ArrayList<List>();
	List<shapeADT> Shapes = new ArrayList<>();
	
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
										
					switch (names) {
					case "Cone":
						//Cone cone = new cone(names, v1, v2)
					case "SquarePrism":
						//Sqp sqp = new Sqp(names, v1, v2)
					case "OctagonalPrism":
						//Ocp ocp = new Ocp(names, v1, v2)
					case "PentagonalPrism":
						//Pep pep = new Pep(names, v1, v2)
					case "Pyramid":
						//Pyrimid pyramid = new Pyramid(names, v1, v2)
					case "TriangularPrism":
						//Trp trp = new Trp(names, v1, v2)
					}
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
