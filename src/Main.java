import java .util.Scanner;
class Colsum{
    public static void colsum(int[][] array,int m,int n)
    {
       for(int i=0;i<m;i++)
       {
           int sum=0;
           for(int j=0;j<n;j++)
           {
               sum+=array[j][i];
           }
           System.out.println(sum);
       }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the array values: ");
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Colsum cs=new Colsum();
        cs.colsum(arr,col,row);

    }
}