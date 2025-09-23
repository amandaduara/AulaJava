package exemplojoptionpane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJOptionPane extends JFrame {
    private JButton perguntar;
    private JButton fechar;
    private JTextField inputNome; // Campo de entrada

    public ExemploJOptionPane() {
        super("Exemplo com InputDialog");

        perguntar = new JButton("Perguntar");
        fechar = new JButton("Fechar");
        inputNome = new JTextField();

        Container pane = this.getContentPane();
        pane.setLayout(null);

        // Adiciona os componentes
        pane.add(perguntar);
        pane.add(fechar);
        pane.add(inputNome);

        // Posições e tamanhos
        inputNome.setBounds(20, 30, 200, 30);
        perguntar.setBounds(20, 80, 150, 35);
        fechar.setBounds(20, 130, 150, 35);

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

        this.setSize(450, 250); // janela maior
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // centralizar
        this.setVisible(true);
    }

    // Método do botão perguntar
    private void buttonPerguntarActionPerformed(ActionEvent e) {
        String nome = inputNome.getText().trim();

        if (!nome.isEmpty()) {
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
