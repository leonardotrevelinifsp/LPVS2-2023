import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalWindow extends JFrame implements ActionListener{

    //atributos
    private JPanel panel;
    private JLabel lblName;
    private JTextField txtName;
    private JButton btnShow;

    public GraphicalWindow(){
        createComponents();
        addComponents();
        configWindow();
    }

    private void createComponents(){
        //instanciar os componentes da interface gráfica
        panel = new JPanel();
        lblName = new JLabel("Informe seu nome:");
        txtName = new JTextField(20);
        btnShow = new JButton("Exibir nome");
        //adicionando ação ao botão
        btnShow.addActionListener(this);
    }

    private void addComponents(){
        // adicionar os componentes ao painel
        panel.add(lblName);
        panel.add(txtName);
        panel.add(btnShow);
        // adicionar o painel à janela
        add(panel);
    }

    private void configWindow(){
        setTitle("Janela de boas vindas");
        setVisible(true);
        pack();
        //setSize(540, 540); tamanho da janela altura x largura
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //metodo para ação do botão
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnShow){
            JOptionPane.showMessageDialog(null, "Seja bem-vindo(a), " + txtName.getText());
        }
    }

}
