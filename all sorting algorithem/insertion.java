import java.util.Scanner;
public class insertion {

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the length of array");
        n=ss.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the number : ");
            arr[i]=ss.nextInt();
        }

        for(int j=1;j<n;j++){
            
            for(int k=j;k>0;k--){
                if (arr[k] < arr[k-1]) {
                    int temp= arr[k-1];
                    arr[k-1]=arr[k];
                    arr[k]= temp;
                }
            }
        }

        for(int l=0;l<n;l++){
            System.out.print(" "+ arr[l]);
            
        }
    }
}
