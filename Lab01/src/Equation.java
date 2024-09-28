//2.2.6
import javax.swing.JOptionPane;
public class Equation {
    private String stra, strb, strc;
    private double a, b, c, x, delta;
    private double a11, a12, a21, a22, b1, b2, x1, x2;
    private double D, D1, D2;

    public void setFirstDegreeEquationsOneVariable(){
        stra = JOptionPane.showInputDialog(null, "Enter a: ", "ax + b = ", JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null, "Enter b: ", "ax + b = ", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(stra);
        b = Double.parseDouble(strb);
        if(a == 0){
            JOptionPane.showMessageDialog(null, "Neu a = 0 phuong trinh se co vo so nghiem \n vui long nhap lai a va b", "Error", JOptionPane.WARNING_MESSAGE);
            setFirstDegreeEquationsOneVariable();
        }
    }

    public void getResultFirstDegreeEquationsOneVariable(){
        x = -b/a;
        JOptionPane.showMessageDialog(null, "x = "+x, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setFirstDegreeEquationTwoVariable(){
         a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a11: ", "a11x1 + a12x2 = b1 \na21x1 + a22x2 = b2 ", JOptionPane.INFORMATION_MESSAGE));
         a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a12: ", "a11x1 + a12x2 = b1 \na21x1 + a22x2 = b2 ", JOptionPane.INFORMATION_MESSAGE));
         b1  = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1: ", "a11x1 + a12x2 = b1 \na21x1 + a22x2 = b2 ", JOptionPane.INFORMATION_MESSAGE));
         a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a21: ", "a11x1 + a12x2 = b1 \na21x1 + a22x2 = b2 ", JOptionPane.INFORMATION_MESSAGE));
         a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a22: ", "a11x1 + a12x2 = b1 \na21x1 + a22x2 = b2 ", JOptionPane.INFORMATION_MESSAGE));
         b2  = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2: ", "a11x1 + a12x2 = b1 \na21x1 + a22x2 = b2 ", JOptionPane.INFORMATION_MESSAGE));
    }

    public void getResultFirstDegreeEquationsTwoVariable(){
        D  = a11*a22 - a21*a12;
        D1 = b1*a22 - b2*a12;
        D2 = a11*b2 - a21*b1;

        if(D != 0){
            x1 = D1 / D;
            x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "x1 = "+x1, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "x2 = "+x2, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }else if(D == 0 && (D1 != 0 || D2 != 0)){
            JOptionPane.showMessageDialog(null, "phuong trinh khong co nghiem");
        }else if(D == 0 && D1 == 0 && D2 == 0){
            JOptionPane.showMessageDialog(null, "phuong trinh co vo so nghiem");
        }
    }

    public void setSecondDegreeEquationsOneVariable(){
        stra = JOptionPane.showInputDialog(null, "Enter a: ", "ax^2 + b + c = 0 ", JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null, "Enter b: ", "ax^2 + b + c = 0 ", JOptionPane.INFORMATION_MESSAGE);
        strc = JOptionPane.showInputDialog(null, "Enter c: ", "ax^2 + b + c = 0 ", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(stra);
        b = Double.parseDouble(strb);
        c = Double.parseDouble(strc);
        if(a == 0){
            getResultFirstDegreeEquationsOneVariable();
        }
    }

    public void getResultSecondDegreeEquationsOneVariable(){
        delta = b*b - 4*a*c;
        if(delta > 0){
            x = (-b + Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "x1 = "+x, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            x = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "x2 = "+x, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }else if(delta == 0){
            x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "x1 = x2 = "+x, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }else if(delta < 0){
            JOptionPane.showMessageDialog(null, "phuong trinh khong co nghiem");
        }
    }

    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog(null, "Choose an equation: " +
                "\n1.first-degree equation with one variable" +
                "\n2.first-degree equations with two variables" +
                "\n3.second-degree equation with one variable", "equation", JOptionPane.PLAIN_MESSAGE);
        Equation equation = new Equation();
        if(option.equals("1")){
            equation.setFirstDegreeEquationsOneVariable();
            equation.getResultFirstDegreeEquationsOneVariable();
        }else if(option.equals("2")){
            equation.setFirstDegreeEquationTwoVariable();
            equation.getResultFirstDegreeEquationsTwoVariable();
        }else if(option.equals("3")){
            equation.setSecondDegreeEquationsOneVariable();
            equation.getResultSecondDegreeEquationsOneVariable();
        }
        System.exit(0);
    }
}
