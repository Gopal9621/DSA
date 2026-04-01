import java.util.*;
public class SumOfAllEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum = sum+ matrix[i][j];
                    }
                } 
    System.out.println(sum);
    }
}
