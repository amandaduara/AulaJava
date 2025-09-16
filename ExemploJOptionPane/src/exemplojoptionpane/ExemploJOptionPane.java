package exemplojoptionpane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJOptionPane extends JFrame {
    private JButton perguntar;
    private JButton fechar;

    public ExemploJOptionPane() {
        super("Exemplo com InputDialog");
        
        perguntar = new JButton("Perguntar");
        fechar = new JButton("Fechar");

        Container pane = this.getContentPane();
        pane.setLayout(null);

        pane.add(perguntar);
        pane.add(fechar);

        perguntar.setBounds(20, 30, 150, 35);
        fechar.setBounds(20, 90, 150, 35);

        // Evento do botão perguntar
        perguntar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPerguntarActionPerformed(e);
            }
        });

        // Evento do botão fechar
        fechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonFecharActionPerformed(e);
            }
        });

        this.setSize(400, 310);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Método do botão perguntar
    private void buttonPerguntarActionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(this, 
                        "Qual é o seu nome?", 
                        "Pergunta", 
                        JOptionPane.QUESTION_MESSAGE);

        if (nome != null && !nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                        "Olá, " + nome + "!", 
                        "Saudação", 
                        JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, 
                        "Você não digitou nada.", 
                        "Aviso", 
                        JOptionPane.WARNING_MESSAGE);
        }
    }

    // Método do botão fechar
    private void buttonFecharActionPerformed(ActionEvent e) {
        int retorno = JOptionPane.showConfirmDialog(this, 
                        "Deseja realmente fechar?", 
                        "Confirmação", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE);

        if (retorno == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ExemploJOptionPane();
    }
}
