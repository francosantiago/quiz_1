
import javax.swing.JOptionPane;

public class NumeroEnLetras {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero de un solo dígito:"));

        String[] numerosEnLetras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, numerosEnLetras[numero]);
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado no es válido. Por favor, ingrese un número entero de un solo dígito.");
        }
    }
}


