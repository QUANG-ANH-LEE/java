// Example 2.2.6
import javax.swing.JOptionPane;
public class FirstDegreeEquation {
    public static void main(String[] args){
        String strNum1, strNum2;


        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        if(num1 != 0)
            JOptionPane.showMessageDialog(null, "the solution of equation: " + (-num1 / num2), "Solution", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "this equation has no solution!", "Solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}