import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int num1, num2, suma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un num: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un num: "));
        suma = num1+num2;
        JOptionPane.showMessageDialog(null,"la suma es : "+ suma);
    }
}
