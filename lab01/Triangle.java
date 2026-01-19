import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the height of the triangle: ");
        int iHeight = keyboard.nextInt();

        for(int i=1; i<=iHeight; i++){
            for(int j=0; j<(iHeight - i); j++)
                System.out.print(" ");
            for(int j=0; j<(2*i-1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
