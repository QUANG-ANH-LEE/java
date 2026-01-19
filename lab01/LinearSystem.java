//Example 2.2.6
import javax.swing.JOptionPane;
public class LinearSystem {
    public static void main(String[] args){

        String strNum11 = JOptionPane.showInputDialog(null, "Please input the first number of first equation: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num11 = Double.parseDouble(strNum11);

        String strNum12 = JOptionPane.showInputDialog(null, "Please input the second number of first equation: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num12 = Double.parseDouble(strNum12);

        String strNum1 = JOptionPane.showInputDialog(null, "Please input the third number of fist equation: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        String strNum21 = JOptionPane.showInputDialog(null, "Please input the first number of the second equation: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num21 = Double.parseDouble(strNum21);

        String strNum22 = JOptionPane.showInputDialog(null, "Please input the second number of the second equation: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num22 = Double.parseDouble(strNum22);

        String strNum2 = JOptionPane.showInputDialog(null, "Please input the third number of the second equation: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double D = num11 * num22 - num21 * num12;
        double D1 = num1 * num22 - num2 * num12;
        double D2 = num11 * num2 - num21 * num1;

        if(D != 0)
            JOptionPane.showMessageDialog(null, "This linear system has one solution: x = " + (D1/D) + " ,y = " + (D2/D), "Solution", JOptionPane.INFORMATION_MESSAGE);
        else if(D1 == 0 && D2 ==0)
            JOptionPane.showMessageDialog(null, "This linear system has infinitely many solutions!", "Solution", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, "This linear system has no solution!", "Solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}