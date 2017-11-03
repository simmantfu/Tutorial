import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JPanel
{
    private ActionListener action;
    private JLabel scanningJLabel;
    private JLabel loginJLabel;
    private JLabel passwordJLabel;
    private JTextField usernameJTextField;
    private JPasswordField passwordJPasswordField;
    private JButton configureJButton;

    public LoginPage() {
        init();
    }

    private void init() 
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        JPanel content = new JPanel(new GridBagLayout());
                    content.setBorder(new EmptyBorder(20, 20, 20, 20));
                    setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        scanningJLabel = new JLabel();
        loginJLabel = new JLabel();
        passwordJLabel = new JLabel();
        usernameJTextField = new JTextField();
        passwordJPasswordField = new JPasswordField();
        configureJButton = new JButton();

        scanningJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scanningJLabel.setForeground(new Color(0, 0, 255));
        scanningJLabel.setText("Scanning");

        loginJLabel.setFont(loginJLabel.getFont().deriveFont(18.0f));
        loginJLabel.setHorizontalAlignment(SwingConstants.LEFT);
        loginJLabel.setForeground(new Color(0, 0, 255));
        loginJLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        loginJLabel.setText("User Name");

        passwordJLabel.setFont(passwordJLabel.getFont().deriveFont(18.0f));
        passwordJLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passwordJLabel.setForeground(new Color(0, 0, 255));
        passwordJLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        passwordJLabel.setText("Password");

        usernameJTextField.setFont(loginJLabel.getFont().deriveFont(18.0f));
        usernameJTextField.setHorizontalAlignment(SwingConstants.LEFT);
        usernameJTextField.setForeground(new Color(0, 0, 255));
        usernameJTextField.setToolTipText("Enter your username");
        usernameJTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                jTextField1_actionPerformed(e);
            }
        });

        passwordJPasswordField.setFont(passwordJLabel.getFont().deriveFont(18.0f));
        passwordJPasswordField.setHorizontalAlignment(SwingConstants.LEFT);
        passwordJPasswordField.setForeground(new Color(0, 0, 255));
        passwordJPasswordField.setToolTipText("Enter your password");
        passwordJPasswordField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                jPasswordField1_actionPerformed(e);
            }
        });

        usernameJTextField.setBounds(70,30,150,20);
        passwordJPasswordField.setBounds(70,65,150,20);

        configureJButton.setPreferredSize(new Dimension(140, 40));
        configureJButton.setBackground(new Color(204, 204, 204));
        configureJButton.setForeground(new Color(0, 0, 255));
        configureJButton.setFont(loginJLabel.getFont().deriveFont(16.0f));
                    configureJButton.setText("Configure");
        configureJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                jButton1_actionPerformed(e);
            }
        });


        add(loginJLabel, gbc);
        gbc.gridy++;
        add(passwordJLabel, gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        add(usernameJTextField, gbc);
        gbc.gridy++;
        add(passwordJPasswordField, gbc);

        gbc.gridx = 1;
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        add(configureJButton, gbc);
    }
        protected void jButton1_actionPerformed(ActionEvent e) {
        String username = new String(usernameJTextField.getText());
        String password = new String(passwordJPasswordField.getText());
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username should not be empty", "InfoBox: " + "warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password should not be empty", "InfoBox: " + "warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (username.equals("admin") && password.equals("admin")) {
            JPanel parent = (JPanel)getParent();
            CardLayout cardLayout = (CardLayout) parent.getLayout();
            cardLayout.next(parent);  
        }else{
            System.out.println("enter the valid username and password");
            JOptionPane.showMessageDialog(null, "Username and Password are not correct, please try again", "InfoBox: " + "warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    protected void jTextField1_actionPerformed(ActionEvent e) {
        System.out.println("user name given");
    }

    protected void jPasswordField1_actionPerformed(ActionEvent e) {
        System.out.println("password given");
    }
}