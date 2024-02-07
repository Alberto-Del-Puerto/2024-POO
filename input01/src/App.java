import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // objeto scanner
        
        Scanner input = new Scanner(System.in);
        int n1,n2, suma;

        System.out.println("ingresa un num: ");
        n1 = input.nextInt();
        System.out.println("ingresa un num: ");
        n2 = input.nextInt();
        suma = n1+n2;
        System.out.println("la suma es: "+suma);

        // objeto joptionpane

        n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un num: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un num: "));

        suma = n1+n2;

        JOptionPane.showMessageDialog(null,"la suma es: "+suma);


    }
}
