import javax.swing.*;
import java.awt.*;
import java.io.File;

public class registerPage {

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

        JLabel email = new JLabel("Email");
        email.setFont(poppinsRegular.deriveFont(20f));
        email.setForeground(Color.decode("#8D6E63"));
        email.setBounds(617, 75, 55, 30);

        JTextField emailInput = new JTextField();
        emailInput.setFont(poppinsRegular.deriveFont(20f));
        emailInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        emailInput.setBackground(Color.decode("#EDDCC4"));
        emailInput.setBounds(617, 105, 270, 40);

        rightPanel.add(emailInput);
        rightPanel.add(email);

        JLabel username = new JLabel("Username");
        username.setFont(poppinsRegular.deriveFont(20f));
        username.setForeground(Color.decode("#8D6E63"));
        username.setBounds(617, 155, 105, 30);

        JTextField userInput = new JTextField();
        userInput.setFont(poppinsRegular.deriveFont(20f));
        userInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        userInput.setBackground(Color.decode("#EDDCC4"));
        userInput.setBounds(617, 185, 270, 40);

        rightPanel.add(userInput);
        rightPanel.add(username);

        JLabel password = new JLabel("Password");
        password.setFont(poppinsRegular.deriveFont(20f));
        password.setForeground(Color.decode("#8D6E63"));
        password.setBounds(617, 235, 200, 30);

        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setFont(poppinsRegular.deriveFont(20f));
        passwordInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        passwordInput.setBackground(Color.decode("#EDDCC4"));
        passwordInput.setBounds(617, 265, 270, 40);

        rightPanel.add(passwordInput);
        rightPanel.add(password);

        JLabel confirmPassword = new JLabel("Confirm Password");
        confirmPassword.setFont(poppinsRegular.deriveFont(20f));
        confirmPassword.setForeground(Color.decode("#8D6E63"));
        confirmPassword.setBounds(617, 315, 200, 30);

        JPasswordField confirmPasswordInput = new JPasswordField();
        confirmPasswordInput.setFont(poppinsRegular.deriveFont(20f));
        confirmPasswordInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        confirmPasswordInput.setBackground(Color.decode("#EDDCC4"));
        confirmPasswordInput.setBounds(617, 345, 270, 40);

        rightPanel.add(confirmPasswordInput);
        rightPanel.add(confirmPassword);

        JButton register = new JButton("Register");
        register.setFont(poppinsBold.deriveFont(24f));
        register.setBackground(Color.decode("#3CB371"));
        register.setForeground(Color.decode("#FDEBD0"));
        register.setFocusPainted(false);
        register.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        register.setBounds(657, 420, 200, 43);

        rightPanel.add(register);

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