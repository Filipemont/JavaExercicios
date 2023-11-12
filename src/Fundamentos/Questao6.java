package Fundamentos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Nome: ");
        JTextField entrada = new JTextField();

        panel.setLayout(new GridLayout(4,1));
        JLabel nameLabel = new JLabel("Nome: ");
        JTextField name = new JTextField(20);
        JButton botao = new JButton("Enviar");
        JLabel saidaLabel = new JLabel();

        panel.add(nameLabel);
        panel.add(name);
        panel.add(botao);
        panel.add(saidaLabel);

        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saidaLabel.setText(name.getText());
            }
        });
    }
}
