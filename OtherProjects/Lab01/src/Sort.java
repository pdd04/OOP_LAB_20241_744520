//6.5
import java.util.Scanner;
public class Sort {
    int n;
    int[] arr;
    public void createArray(){
        System.out.print("Number Of Array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
    }

    public void sort(){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printArray(){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.createArray();
        sort.sort();
        sort.printArray();
        System.exit(0);
    }
}
