package testenv;
import shapes;
import FileImport.FileImport;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {

	
	@Before
	public void setUp() throws Exception {
		
		// util should be able to call all sorts and the return the list afterwards
		Utility util = new Utility();
		
	}

	

	@Test
    public void testBubbleSort() {
		startTime = System.currentTimeMillis();
        List<shapeADT> list = new arrayList<shapeADT> = util.bubbleSort();
        list.get(0);
        int i;
        for (i =0; i< list.size(); i+=1000) {
        	list.get(i);
        }
        list.get(list.size() - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");

    }

    @Test
    public void testInsertionSort() {
    	startTime = System.currentTimeMillis();
    	List<shapeADT> list = new arrayList<shapeADT> = util.bubbleSort();
        list.get(0);
        int i;
        for (i =0; i< list.size(); i+=1000) {
        	list.get(i);
        }
        list.get(list.size() - 1);
    	endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");

    }

    @Test
    public void testGnomeSort() {
    	startTime = System.currentTimeMillis();
    	List<shapeADT> list = new arrayList<shapeADT> = util.bubbleSort();
        list.get(0);
        int i;
        for (i =0; i< list.size(); i+=1000) {
        	list.get(i);
        }
        list.get(list.size() - 1);
    	endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");

    }

    @Test
    public void testMergeSort() {
    	startTime = System.currentTimeMillis();
    	List<shapeADT> list = new arrayList<shapeADT> = util.bubbleSort();
        list.get(0);
        int i;
        for (i =0; i< list.size(); i+=1000) {
        	list.get(i);
        }
        list.get(list.size() - 1);
    	endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");

    }

    @Test
    public void testQuickSort() {
    	startTime = System.currentTimeMillis();
    	List<shapeADT> list = new arrayList<shapeADT> = util.bubbleSort();
        list.get(0);
        int i;
        for (i =0; i< list.size(); i+=1000) {
        	list.get(i);
        }
        list.get(list.size() - 1);
    	endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");

    }

    @Test
    public void testSelectionSort() {
    	startTime = System.currentTimeMillis();
    	List<shapeADT> list = new arrayList<shapeADT> = util.bubbleSort();
        list.get(0);
        int i;
        for (i =0; i< list.size(); i+=1000) {
        	list.get(i);
        }
        list.get(list.size() - 1);
    	endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");

    }

}
