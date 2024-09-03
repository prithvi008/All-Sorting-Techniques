import java.util.Scanner;

public class selection {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of array you want");;
        int n=scn.nextInt();
        int[] arr=new int[n];

        int i=0;

        while (i<n) {
            System.out.println("enter number: "+i);
            arr[i]=scn.nextInt();
            i++;
        }

        for(int j=0;j<n-1;j++){
            int min=j;

            for(int k=j+1;k<n;k++){
                if(arr[k]<arr[min]){
                    min=k;
                }
            }

            if(min!=j){
                int temp=arr[j];
                arr[j]=arr[min];
                arr[min]=temp;
            }
        }

        for(int d=0;d<n;d++){
            System.out.println(arr[d]);
        }

    }
}
