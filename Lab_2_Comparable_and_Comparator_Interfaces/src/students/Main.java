package students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        // Exercise 1
        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students("Luffy", 17));
        studentList.add(new Students("Zoro", 32));
        studentList.add(new Students("Usopp", 43));
        studentList.add(new Students("Sanji", 20));

        System.out.println("Original List: " + studentList);
        
        Collections.sort(studentList);
        System.out.println("\nSorted by Name: " + studentList);

        studentList.sort(new Students.AgeComparator());
        System.out.println("\nSorted by Age: " + studentList);
        
        
        
        // Exercise 2
        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 8, 9, 11, 13, 15);
        
        int target = 9;
        
        int resultIndex = BinarySearcher.binarySearch(numbers, target);
        
        if (resultIndex != -1) {
        	
        	System.out.println("\n\nThe Array list is: (1, 2, 4, 6, 8, 9, 11, 13, 15)");
            System.out.println("\nNumber target is " + target + " found at index: " + resultIndex);
            
        } else {
        	
            System.out.println("Number " + target + " not found.");
            
        }
        
        
        
        while (true) {
        	
        	// Exercise 3
            Scanner sc = new Scanner(System.in);
            
            System.out.println("\n\nEnter integers separated by spaces (Ex: 1 2 3 6 7 ):");
            
            String input = sc.nextLine().trim();
            
            int[] array = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println("Choose a sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Selection Sort");
            
            int choice = sc.nextInt();

            System.out.println("Original Array: " + Arrays.toString(array));
            
            switch (choice) {
            case 1:
                SortingAlgorithms.bubbleSort(array);
                break;
            case 2:
                SortingAlgorithms.quickSort(array, 0, array.length - 1);
                break;
            case 3:
                SortingAlgorithms.insertionSort(array);
                break;
            case 4:
                SortingAlgorithms.selectionSort(array);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
            }
            
            System.out.println("Sorted Array: " + Arrays.toString(array));
            
            System.out.println("\nWould you like to sort another array? Enter 'yes' to continue or 'no' to exit:");
            
            String response = sc.nextLine().trim().toLowerCase();
            if (input.equalsIgnoreCase("no")) {
                break;
            }
            
        }
        
        System.out.println("Thank you for using the sorting system!");
        //sc.close();

    }
}