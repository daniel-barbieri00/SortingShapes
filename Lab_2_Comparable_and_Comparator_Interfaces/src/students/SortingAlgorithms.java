package students;

public class SortingAlgorithms {
	
	// Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    
 // Quick Sort
 public static void quickSort(int[] arr, int low, int high) {
     if (low < high) {
         int pi = partition(arr, low, high);

         quickSort(arr, low, pi - 1);
         quickSort(arr, pi + 1, high);
     }
 }
 
 private static int partition(int[] arr, int low, int high) {
     int pivot = arr[high];
     int i = (low - 1);
     for (int j = low; j < high; j++) {
         if (arr[j] <= pivot) {
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;

     return i + 1;
 }

 
 // Insertion Sort
 public static void insertionSort(int[] arr) {
     int n = arr.length;
     for (int i = 1; i < n; ++i) {
         int key = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = key;
     }
 }

 
 // Selection Sort
 public static void selectionSort(int[] arr) {
     int n = arr.length;

     for (int i = 0; i < n - 1; i++) {
         int min_idx = i;
         for (int j = i + 1; j < n; j++) {
             if (arr[j] < arr[min_idx]) {
                 min_idx = j;
             }
         }

         int temp = arr[min_idx];
         arr[min_idx] = arr[i];
         arr[i] = temp;
     }
 }

}
