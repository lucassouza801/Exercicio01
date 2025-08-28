package br.unip.exercicio.exercicio01;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lucas Araújo de Souza - R016BI9
 */
public class Exercicio01 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 01");
        frame.setSize(500, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel();
        label1.setText("Nome: ");
        label1.setBounds(50, 100, 50, 30);
        label1.setVisible(true);
        
        JTextField nomeTextField = new JTextField();
        nomeTextField.setEditable(true);
        nomeTextField.setBounds(100, 100, 300, 30);
        nomeTextField.setVisible(true);

        JLabel label2 = new JLabel();
        label2.setText("Idade: ");
        label2.setBounds(50, 150, 50, 30);
        label2.setVisible(true);
        
        JTextField idadeTextField = new JTextField();
        idadeTextField.setEditable(true);
        idadeTextField.setBounds(100, 150, 300, 30);
        idadeTextField.setVisible(true);

        JLabel label3 = new JLabel();
        label3.setText("Profissão: ");
        label3.setBounds(30, 200, 100, 30);
        label3.setVisible(true);
        
        JTextField profissaoTextField = new JTextField();
        profissaoTextField.setEditable(true);
        profissaoTextField.setBounds(100, 200, 300, 30);
        profissaoTextField.setVisible(true);
        
        JButton botaoCadastrar = new JButton();
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBounds(100, 250, 130, 30);
        botaoCadastrar.setVisible(true);
        botaoCadastrar.addActionListener(e -> {
            
            JFrame frame02 = new JFrame();
            frame02.setTitle("Resultado");
            frame02.setSize(300, 300);
            frame02.setLayout(null);
            
            JLabel labelResultado = new JLabel();
            labelResultado.setBounds(0, 0, 200, 200);
            labelResultado.setText("<html>Nome: <b>" + nomeTextField.getText() + "</b><br>Idade: <b>" + idadeTextField.getText() + "</b><br>Profissão: <b>" + profissaoTextField.getText() + "</b></html>");
            labelResultado.setVisible(true);
            
            frame02.add(labelResultado);
            frame02.setVisible(true);
            
        });
        
        JButton botaoLimpar  = new JButton();
        botaoLimpar.setText("Limpar");
        botaoLimpar.setBounds(270, 250, 130, 30);
        botaoLimpar.setVisible(true);
        botaoLimpar.addActionListener(e -> {
            nomeTextField.setText("");
            idadeTextField.setText("");
            profissaoTextField.setText("");
        });       
        
        frame.add(label1);
        frame.add(nomeTextField);
        frame.add(label2);
        frame.add(idadeTextField);
        frame.add(label3);
        frame.add(profissaoTextField);
        frame.add(botaoCadastrar);
        frame.add(botaoLimpar);
        frame.setVisible(true);
    }
}
