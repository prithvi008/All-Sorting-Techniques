import java.util.Scanner;

public class bubble {
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
            //int=n
            for(int k=0;k<n-1;k++){
                if(arr[k]>arr[k+1]){
                    int tamp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=tamp;
                }
            }
        }

        for(int d=0;d<n;d++){
            System.out.println(arr[d]);
        }
    }
    
}
