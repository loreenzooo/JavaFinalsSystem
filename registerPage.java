import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class registerPage extends JFrame {

    final String[][] userData = new String[100][100];
    static int userIndex = 0;

    Font poppinsRegular;
    Font poppinsBold;
    Font poppinsMedium;

    public registerPage() {
        try {
            poppinsRegular = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Regular.ttf"))
                    .deriveFont(18f);
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Bold.ttf"))
                    .deriveFont(48f);
            poppinsMedium = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Medium.ttf"))
                    .deriveFont(24f);

            Font smallerReg = poppinsRegular.deriveFont(20f);
            Font smallerBold = poppinsBold.deriveFont(24f);
            Font smallerBold1 = poppinsBold.deriveFont(32f);
        } catch (Exception e) {
            e.printStackTrace();
            poppinsRegular = new Font("SansSerif", Font.PLAIN, 18);
            poppinsBold = new Font("SansSerif", Font.BOLD, 22);
        }
    }

    public void register() {

        JFrame frame = new JFrame("Register");
        frame.setBounds(100, 100, 940, 519);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        Panel leftPanel = new Panel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(0, 0, 597, 519);
        leftPanel.setBackground(Color.decode("#F6DEB9"));

        JLabel register_tagline = new JLabel("Unleash Comfort,");
        register_tagline.setFont(poppinsBold.deriveFont(48f));
        register_tagline.setBounds(31, 131, 500, 100);
        register_tagline.setForeground(Color.decode("#F39C12"));
        leftPanel.add(register_tagline);

        JLabel register_tagline2 = new JLabel("embrace purrfection.");
        register_tagline2.setFont(poppinsBold.deriveFont(48f));
        register_tagline2.setBounds(30, 223, 550, 80);
        register_tagline2.setForeground(Color.decode("#F39C12"));
        leftPanel.add(register_tagline2);

        JButton loginButton = new JButton("Log In");
        loginButton.setFont(poppinsBold.deriveFont(24f));
        loginButton.setForeground(Color.decode("#EBF5FB"));
        loginButton.setBackground(Color.decode("#8EB8EB"));
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        loginButton.setFocusPainted(false);
        loginButton.setBounds(31, 420, 200, 43);
        leftPanel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPage logPage = new loginPage();
                logPage.login();
                frame.setVisible(false);
            }
        });

        frame.add(leftPanel);

        Panel rightPanel = new Panel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(597, 0, 343, 519);
        rightPanel.setBackground(Color.decode("#FDEBD0"));

        JLabel registrationLabel = new JLabel("Registration");
        registrationLabel.setBounds(675, 10, 203, 48);
        registrationLabel.setFont(poppinsBold.deriveFont(32f));
        registrationLabel.setForeground(Color.decode("#8D6E63"));
        rightPanel.add(registrationLabel);

        JLabel emailLabel = new JLabel(" Email");
        emailLabel.setFont(poppinsRegular.deriveFont(20f));
        emailLabel.setForeground(Color.decode("#8D6E63"));
        emailLabel.setBounds(617, 75, 100, 30);

        JTextField emailInput = new JTextField();
        emailInput.setFont(poppinsRegular.deriveFont(20f));
        emailInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        emailInput.setBackground(Color.decode("#EDDCC4"));
        emailInput.setBounds(617, 105, 270, 40);

        emailInput.setText(" Email");
        emailInput.setForeground(Color.decode("#999999"));
        emailInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (emailInput.getText().equals(" Email")) {
                    emailInput.setText("");
                    emailInput.setForeground(Color.decode("#333333"));
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (emailInput.getText().isEmpty()) {
                    emailInput.setText(" Email");
                    emailInput.setForeground(Color.decode("#999999"));
                }
            }
        });

        rightPanel.add(emailInput);
        rightPanel.add(emailLabel);

        JLabel usernameLabel = new JLabel(" Username");
        usernameLabel.setFont(poppinsRegular.deriveFont(20f));
        usernameLabel.setForeground(Color.decode("#8D6E63"));
        usernameLabel.setBounds(617, 155, 200, 30);

        JTextField usernameInput = new JTextField();
        usernameInput.setFont(poppinsRegular.deriveFont(20f));
        usernameInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        usernameInput.setBackground(Color.decode("#EDDCC4"));
        usernameInput.setBounds(617, 185, 270, 40);

        usernameInput.setText(" Username");
        usernameInput.setForeground(Color.decode("#999999"));
        usernameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (usernameInput.getText().equals(" Username")) {
                    usernameInput.setText("");
                    usernameInput.setForeground(Color.decode("#333333"));
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (usernameInput.getText().isEmpty()) {
                    usernameInput.setText(" Username");
                    usernameInput.setForeground(Color.decode("#999999"));
                }
            }
        });

        rightPanel.add(usernameInput);
        rightPanel.add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(poppinsRegular.deriveFont(20f));
        passwordLabel.setForeground(Color.decode("#8D6E63"));
        passwordLabel.setBounds(617, 235, 200, 30);

        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setFont(poppinsRegular.deriveFont(20f));
        passwordInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        passwordInput.setBackground(Color.decode("#EDDCC4"));
        passwordInput.setBounds(617, 265, 270, 40);
        passwordInput.setEchoChar((char) 0);

        passwordInput.setText(" Password");
        passwordInput.setForeground(Color.decode("#999999"));
        passwordInput.setEchoChar((char) 0);
        passwordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                String pass = new String(passwordInput.getPassword());
                if (pass.equals(" Password")) {
                    passwordInput.setText("");
                    passwordInput.setForeground(Color.decode("#333333"));
                    passwordInput.setEchoChar('\u2022');
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                String pass = new String(passwordInput.getPassword());
                if (pass.isEmpty()) {
                    passwordInput.setText(" Password");
                    passwordInput.setForeground(Color.decode("#999999"));
                    passwordInput.setEchoChar((char) 0);
                }
            }
        });

        rightPanel.add(passwordInput);
        rightPanel.add(passwordLabel);

        JLabel confirmPassword = new JLabel("Confirm Password");
        confirmPassword.setFont(poppinsRegular.deriveFont(20f));
        confirmPassword.setForeground(Color.decode("#8D6E63"));
        confirmPassword.setBounds(617, 315, 200, 30);

        JPasswordField confirmPasswordInput = new JPasswordField();
        confirmPasswordInput.setFont(poppinsRegular.deriveFont(20f));
        confirmPasswordInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        confirmPasswordInput.setBackground(Color.decode("#EDDCC4"));
        confirmPasswordInput.setBounds(617, 345, 270, 40);

        confirmPasswordInput.setText(" Confirm Password");
        confirmPasswordInput.setForeground(Color.decode("#999999"));
        confirmPasswordInput.setEchoChar((char) 0);
        confirmPasswordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                String pass = new String(confirmPasswordInput.getPassword());
                if (pass.equals(" Confirm Password")) {
                    confirmPasswordInput.setText("");
                    confirmPasswordInput.setForeground(Color.decode("#333333"));
                    confirmPasswordInput.setEchoChar('\u2022');
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                String pass = new String(confirmPasswordInput.getPassword());
                if (pass.isEmpty()) {
                    confirmPasswordInput.setText(" Confirm Password");
                    confirmPasswordInput.setForeground(Color.decode("#999999"));
                    confirmPasswordInput.setEchoChar((char) 0);
                }
            }
        });

        JButton registerButton = new JButton("Register");
        registerButton.setFont(poppinsBold.deriveFont(24f));
        registerButton.setBackground(Color.decode("#3CB371"));
        registerButton.setForeground(Color.decode("#FDEBD0"));
        registerButton.setFocusPainted(false);
        registerButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        registerButton.setBounds(657, 420, 200, 43);

        registerButton.addActionListener(e -> {
            String pass = new String(passwordInput.getPassword());
            String confirmPass = new String(confirmPasswordInput.getPassword());

            String email = emailInput.getText().trim();
            String username = usernameInput.getText().trim();
            String password = new String(passwordInput.getPassword()).trim();
            String confirmPw = new String(confirmPasswordInput.getPassword()).trim();

            if (!password.equals(confirmPw) || !email.endsWith("@gmail.com")) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Passwords must match AND email must end with @gmail.com",
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                // Saving user data
                if (userIndex < userData.length) {
                    userData[userIndex][0] = email;
                    userData[userIndex][1] = username;
                    userData[userIndex][2] = password;
                    // user index ++
                    userIndex++;
                    JOptionPane.showMessageDialog(frame, "Registration successful!");

                    // clear form fields
                    emailInput.setText(" Email");
                    emailInput.setForeground(Color.decode("#999999"));

                    usernameInput.setText(" Username");
                    usernameInput.setForeground(Color.decode("#999999"));

                    passwordInput.setText(" Password");
                    passwordInput.setForeground(Color.decode("#999999"));
                    passwordInput.setEchoChar((char) 0);

                    confirmPasswordInput.setText(" Confirm Password");
                    confirmPasswordInput.setForeground(Color.decode("#999999"));
                    confirmPasswordInput.setEchoChar((char) 0);
                } else { // if array is full
                    JOptionPane.showMessageDialog(frame,
                            "Array is full",
                            "Alert",
                            JOptionPane.WARNING_MESSAGE);
                }

            }
        });// registerButton action listener

        rightPanel.add(registerButton);
        rightPanel.add(confirmPasswordInput);
        rightPanel.add(confirmPassword);
        frame.add(rightPanel);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            registerPage rp = new registerPage();
            rp.register();
        });

    }

}