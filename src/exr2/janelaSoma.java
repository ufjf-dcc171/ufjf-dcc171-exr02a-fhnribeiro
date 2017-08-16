/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr2;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 11944413600
 */
public class janelaSoma extends JFrame{
    private final JLabel lblEntrada = new JLabel("Numero 1:");
    private final JTextField num1 = new JTextField(20);
    private final JLabel lblEntrada2 = new JLabel("Numero 2:");
    private final JTextField num2 = new JTextField(20);
    private final JLabel lblResult = new JLabel("Resultado: ");
    private final JButton btn1 = new JButton("Calcular");
    private int n1=0;
    private int n2=0;
    public janelaSoma() throws HeadlessException{
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lblEntrada);
        add(num1);
        add(lblEntrada2);
        add(num2);
        add(lblResult);
        
        num1.addActionListener(new enterNum1());
        num2.addActionListener(new calculaSoma());
    } 

    private class enterNum1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(num1.getText());
            num2.requestFocus();
        }
    }
    
    private class calculaSoma implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(num1.getText());
            n2 = Integer.parseInt(num2.getText());
            lblResult.setText("Resultado: ".concat(Integer.toString(n1+n2)));
        }
    }
}


