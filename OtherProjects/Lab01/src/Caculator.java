//2.2.5
import javax.swing.JOptionPane;
public class Caculator {
     String strNum1, strNum2;
     double result, num1, num2;

    public void setNum1(){
        strNum1 = JOptionPane.showInputDialog(null,"Enter First Number", "Input", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
    }
    public void setNum2(){
        strNum2 = JOptionPane.showInputDialog(null,"Enter Second Number", "Input", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
    }

    public void showSum(){
        result = num1 + num2;
        JOptionPane.showMessageDialog(null, "The Sum is: " + result);
    }

    public void showDifference(){
        result = num1 - num2;
        JOptionPane.showMessageDialog(null, "The Difference is: " + result);
    }

    public void showProduct(){
        result = num1 * num2;
        JOptionPane.showMessageDialog(null, "The Product is: " + result);
    }

    public void showQuotient(){
        result = num1 / num2;
        JOptionPane.showMessageDialog(null, "The Quotient is: " + result);
    }

    public static void main(String[] args) {
        Caculator c = new Caculator();
        c.setNum1();
        c.setNum2();
        c.showSum();
        c.showDifference();
        c.showProduct();
        c.showQuotient();
    }
}
