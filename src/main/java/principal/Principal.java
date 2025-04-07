
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

/**
 *
 * @author Jonny
 */
public class Principal {
    public static void main(String[] args) {
        //declara e intancia o objeto
        Triangulo trill = new Triangulo();
        
        //entrada
        trill.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a base do triângulo")));
        trill.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a altura do triângulo")));
        
        //saida
        JOptionPane.showMessageDialog(null,"A Area do triangulo é " + trill.getArea());
    }
}
