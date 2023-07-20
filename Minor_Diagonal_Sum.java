import java.util.Scanner;

public class Minor_Diagonal_Sum {


    public static int diagonalSum(int arr[][],int n) {
        int i=0,j=n-1;
        int sum=0;
        while(i<n && j>=0) {
            sum+=arr[i][j];
            i++;
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int value=diagonalSum(arr,n);
        System.out.println(value);

    }

}
