//2.2.4
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public String strNum1, strNum2;
    public String strNotification = "You've just entered: ";

    public void setStrNum1() {
        strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setStrNum2() {
        strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
    }

    public void display() {
        strNotification += strNum1 + " and ";
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public static void main(String[] args) {
        ShowTwoNumbers num1 = new ShowTwoNumbers();
        num1.setStrNum1();
        num1.setStrNum2();
        num1.display();
    }
}


