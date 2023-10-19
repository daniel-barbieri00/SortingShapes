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
					
					if (names == "Cone") {
						shapeADT Shape = new cone(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
					}
					else if (names == "Cylinder") {
						shapeADT Shape = new cylinder(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
					}
					else if (names == "OctagonalPrism") {
						shapeADT Shape = new octagonBase(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
					}
					else if (names == "PentagonalPrism") {
						shapeADT Shape = new pentagonBase(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
					}
					else if (names == "Pyramid") {
						shapeADT Shape = new pyramid(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
					}
					else if (names == "SquarePrism") {
						shapeADT Shape = new retangularPrism(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
					}
					else if (names == "TriangularPrism") {
						shapeADT Shape = new triangleBase(names, Double.parseDouble(v1), Double.parseDouble(v2));
						Shapes.add(Shape);
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
