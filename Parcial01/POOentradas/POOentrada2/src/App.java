import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre;

        nombre =JOptionPane.showInputDialog("ingresa un nombre:");
        JOptionPane.showMessageDialog(null,"nombre: "+nombre);

        int n1, n2, suma;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un num: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un num:"));
        suma = n1+n2;

        JOptionPane.showMessageDialog(null, "la suma es: "+suma);
    }
}
