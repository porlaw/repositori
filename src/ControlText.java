
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Ferran Castillo Beltri
 * @version 20/12/2016
 */
public class ControlText {   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Control de text"); 
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(new GridBagLayout());      
        JTextField campText = new JTextField();
        JLabel text = new JLabel("Escriu aquí el teu text...");
        JButton borrar = new JButton("Esborrar text");
        JButton color = new JButton("Canviar color");
        JButton random = new JButton("Genera text a l'atzar");
      
        ActionListener botoBorrar = new ActionListener() {
              @Override
            public void actionPerformed(ActionEvent e) {
                     campText.setText("");
            }
        };
        borrar.addActionListener(botoBorrar);
        
        ActionListener botoColor = new ActionListener() {
              @Override
            public void actionPerformed(ActionEvent e) {
                     Color color = JColorChooser.showDialog(null, "Elige un color", Color.yellow);
                     campText.setForeground(color);
            }
        };
        color.addActionListener(botoColor);
        
        ActionListener botoRandom = new ActionListener() {
              @Override
            public void actionPerformed(ActionEvent e) {
                     String[] lletras={"a","b","c","d","e","f","g","h","i","j","k","l","m","n ","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
                     String cadena = "";
                     for(int i=0;i<10;i++){                  
                         int lletra = (int)(Math.random()*27);
                         cadena += lletras[lletra];
                     }
                     campText.setText(cadena);
            }
        };
        random.addActionListener(botoRandom);
        
        
        GridBagConstraints cgb1 = new GridBagConstraints();
        cgb1.fill = GridBagConstraints.HORIZONTAL;
        cgb1.weightx = 200;
        cgb1.gridwidth = GridBagConstraints.REMAINDER;
        cgb1.insets = new Insets(7, 10, 1, 10);
        
        GridBagConstraints cgb2 = new GridBagConstraints();
        cgb2.fill = GridBagConstraints.HORIZONTAL;
        cgb2.weightx = 200;
        cgb2.gridwidth = GridBagConstraints.REMAINDER;
        cgb2.insets = new Insets(10, 10, 10, 10);
        
        GridBagConstraints cgb3 = new GridBagConstraints();
        cgb3.anchor = GridBagConstraints.WEST;
        cgb3.insets = new Insets(10, 10, 10, 10);
        cgb3.gridwidth = GridBagConstraints.REMAINDER;
        
        panel.add(text, cgb1);
        panel.add(campText, cgb2);
        panel.add(borrar, cgb3);
        panel.add(color, cgb3);
        panel.add(random, cgb3);
              
        frame.setVisible(true);
        frame.pack();
    }
}
