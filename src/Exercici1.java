/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
/**
 * Objectiu: Genereu manualment el codi que mostraria una interfície gràfica  am botons
 * @author Ferran Castillo Beltri
 * @version 15/12/2016
 */
public class Exercici1 {  
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercici 1");
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(new GridBagLayout());
       
        JButton boto1 = new JButton("Botó 1");
        JButton boto2 = new JButton("Botó 2");
        JButton boto3 = new JButton("Botó 3");
        JButton boto4 = new JButton("Botó 4");
        JButton boto5 = new JButton("Botó 5");
        JButton boto6 = new JButton("Botó 6");
        JButton boto7 = new JButton("Botó 7");
        
        GridBagConstraints cgb1 = new GridBagConstraints();
        cgb1.fill = GridBagConstraints.BOTH;
        cgb1.gridheight = 2;
        cgb1.insets = new Insets(0, 0, 0, 1);
               
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridwidth = GridBagConstraints.REMAINDER;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
             
        GridBagConstraints cgb3 = new GridBagConstraints();
        cgb3.fill = GridBagConstraints.HORIZONTAL;
        
        GridBagConstraints cgb4 = new GridBagConstraints();
        cgb4.fill = GridBagConstraints.HORIZONTAL;
        cgb4.gridwidth = GridBagConstraints.REMAINDER;
        
        GridBagConstraints cgb5 = new GridBagConstraints();
        cgb5.insets = new Insets(10, 10, 8, 10);
             
        GridBagConstraints cgb6 = new GridBagConstraints();    
        cgb6.gridwidth = GridBagConstraints.REMAINDER;
        cgb6.fill = GridBagConstraints.HORIZONTAL;
        cgb6.insets = new Insets(10, 7, 7, 7);
        
        GridBagConstraints cgb7 = new GridBagConstraints();
        cgb7.fill = GridBagConstraints.BOTH;
        cgb7.gridwidth = GridBagConstraints.REMAINDER;
          
        panel.add(boto1, cgb1);
        panel.add(boto2, gbc2);
        panel.add(boto3, cgb3);
        panel.add(boto4, cgb4);
        panel.add(boto5, cgb5);
        panel.add(boto6, cgb6);
        panel.add(boto7, cgb7);
        
        frame.setSize(300,200);
        frame.setVisible(true);
    } 
    
}
