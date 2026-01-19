//Example 2.2.6
import javax.swing.JOptionPane;
public class SecondDegreeEquation {
    public static void main(String[] args){
        
        String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        String strNum3 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num3 = Double.parseDouble(strNum3);

        double d = num2 * num2 - 4 * num1 * num3;

        if(d > 0)
            JOptionPane.showMessageDialog(null, "this equation has two solution: x1 = " + (((-num2) - Math.sqrt(d)) / (2 * num1)) + ", x2 = " + (((-num2) + Math.sqrt(d)) / (2 * num1)), "Solution", JOptionPane.INFORMATION_MESSAGE);
        else if(d == 0)
            JOptionPane.showMessageDialog(null, "this equation has one solution: x = " + ((-num2) / (2 * num1)), "Solution", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "this equation has no solution!", "Solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}