import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=2*n;
        int[] arr2=new int[m];
        int n1=m/2;
        for(int i=0;i<n1;i++){
            arr2[i]=arr[i];
        }
        for(int i=n1;i<m;i++){
            arr2[i]=arr1[i];
        }
        Arrays.sort(arr2);
        for(int i=0;i<m;i++){
            System.out.println(arr2[i]+" ");
        }

    }
}
