package antidiagonal;
import java.util.Scanner;
public class Antidiagonal {
    public  static void antiDiagonals(int arr[][]){
        int i;
        int j;

        for(int x=0;x< arr.length;x++){
            i=0;j=x;
            while (i<=arr.length&&j>=0){

                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();

        }
        for(int y=1;y< arr.length;y++){
            i=y;j=arr.length-1;
            while (i<arr.length&&j>=0){
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        antiDiagonals(arr);
    }
}