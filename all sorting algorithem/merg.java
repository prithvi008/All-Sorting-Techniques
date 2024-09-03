import java.util.Scanner;

public class merg {

    
    void mergsort(int[] a, int low, int hig) {
        if (low < hig) { 
            int mid = (low + hig) / 2;

            
            mergsort(a, low, mid);
            mergsort(a, mid + 1, hig);

           
            mergarr(a, low, mid, hig);
        }
    }

    
    void mergarr(int[] a, int low, int mid, int hig) {
        int n1 = mid - low + 1;
        int n2 = hig - mid;

       
        int[] ad1 = new int[n1];
        int[] ad2 = new int[n2];

       
        System.arraycopy(a, low, ad1, 0, n1);
        System.arraycopy(a, mid + 1, ad2, 0, n2);

        
        int i = 0; 
        int j = 0; 
        int k = low; 

        while (i < n1 && j < n2) {
            if (ad1[i] <= ad2[j]) {
                a[k] = ad1[i];
                i++;
            } else {
                a[k] = ad2[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            a[k] = ad1[i];
            i++;
            k++;
        }

        
        while (j < n2) {
            a[k] = ad2[j];
            j++;
            k++;
        }
    }

   
    void printArray(int[] array) {
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

        merg obj = new merg();

        
        obj.mergsort(arr, 0, n - 1);

        
        System.out.println("Sorted Array:");
        obj.printArray(arr);

        scn.close();
    }
}
