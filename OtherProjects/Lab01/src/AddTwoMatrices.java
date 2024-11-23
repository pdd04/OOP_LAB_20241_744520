//6.6
import java.util.Scanner;
public class AddTwoMatrices {
    int[][] arr1 , arr2, arr;
    int n, m;

    public void setTwoMatrices() {
        System.out.println("Enter the size of matrices");
        System.out.print("Enter the row number matrices: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter the column number matrices: ");
        m = sc.nextInt();
        arr1 = new int[n][m];
        arr2 = new int[n][m];
        arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter the element " + (i+1) + ":" + (j+1) + " of the matrix 1: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter the element " + (i+1) + ":" + (j+1) + " of the matrix 2: ");
                arr2[i][j] = sc.nextInt();
            }
        }
    }

    public void addTwoMatrices() {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public void display(int[][] arr){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void display(){
        System.out.println("The answer: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AddTwoMatrices addTwoMatrices = new AddTwoMatrices();
        addTwoMatrices.setTwoMatrices();
        System.out.println("the matric 1: ");
        addTwoMatrices.display(addTwoMatrices.arr1);
        System.out.println("the matric 2: ");
        addTwoMatrices.display(addTwoMatrices.arr2);
        addTwoMatrices.addTwoMatrices();
        addTwoMatrices.display();
    }
}

