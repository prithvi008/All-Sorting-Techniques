import java.util.Scanner;

public class quicksort {

    public void quicksort(int[] arr, int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, h);
        }
    }

    public int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (i <= h && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }

    public void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array you want:");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = scn.nextInt();
        }

        quicksort obj = new quicksort();
        obj.quicksort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        obj.printArray(arr);

        scn.close();
    }
}
