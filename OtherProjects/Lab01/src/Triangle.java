//6.3
import javax.swing.JOptionPane;
public class Triangle {
    private int n;

    public void setN(){
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows of triangle"));
    }
    public void printTriangle(){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2 - 1; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i - i; j++){
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setN();
        triangle.printTriangle();
        System.exit(0);
    }
}
