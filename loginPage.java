import javax.swing.*;
import java.awt.*;
import java.io.File;

public class loginPage {

    // Initialize fonts as class variables
    Font poppinsRegular;
    Font poppinsBold;
    Font poppinsMedium;

    public loginPage() {
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

    public void login() {
        JFrame frame = new JFrame("Bark & Meow Essentials - Login");
        frame.setResizable(false);
        frame.setSize(940, 427);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.decode("#F6DEB9"));
        leftPanel.setPreferredSize(new Dimension(597, 427));
        leftPanel.setLayout(null);

        /*
         * JLabel logo = new JLabel(new ImageIcon("img/logo/barkAndMeowLogo.png"));
         * logo.setBounds(50, 30, 500, 400);
         * leftPanel.add(logo);
         */

        JLabel tagline = new JLabel("Unleash Comfort,");
        tagline.setBounds(31, 131, 500, 100);
        tagline.setFont(poppinsBold);
        tagline.setForeground(Color.decode("#F39C12"));
        leftPanel.add(tagline);

        JLabel tagline2 = new JLabel("Embrace Purrfection.");
        tagline2.setBounds(31, 251, 550, 80);
        tagline2.setFont(poppinsBold);
        tagline2.setForeground(Color.decode("#F39C12"));
        leftPanel.add(tagline2);

        JButton registerButton = new JButton("Register");
        registerButton.setFont(poppinsBold.deriveFont(24f));
        registerButton.setForeground(Color.decode("#FAD7A0"));
        registerButton.setBackground(Color.decode("#3CB371"));
        registerButton.setBounds(31, 361, 200, 43);
        registerButton.setFocusPainted(false);
        registerButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        leftPanel.add(registerButton);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.decode("#FDEBD0"));
        rightPanel.setPreferredSize(new Dimension(343, 427));
        rightPanel.setLayout(null);

        JLabel loginTxt = new JLabel("Login");
        loginTxt.setFont(poppinsBold.deriveFont(32f));
        loginTxt.setForeground(Color.decode("#8D6E63"));
        loginTxt.setBounds(129, 32, 100, 50);
        rightPanel.add(loginTxt);

        JLabel username = new JLabel("Username");
        username.setForeground(Color.decode("#8D6E63"));
        username.setFont(poppinsRegular.deriveFont(20f));
        username.setBounds(20, 132, 130, 50);
        rightPanel.add(username);

        JTextField usernameTxF = new JTextField();
        usernameTxF.setBackground(Color.decode("#EDDCC4"));
        usernameTxF.setFont(poppinsRegular.deriveFont(20f));
        usernameTxF.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        usernameTxF.setBounds(20, 170, 283, 40);
        rightPanel.add(usernameTxF);

        JLabel password = new JLabel("Password");
        password.setForeground(Color.decode("#8D6E63"));
        password.setFont(poppinsRegular.deriveFont(20f));
        password.setBounds(20, 240, 130, 50);
        rightPanel.add(password);

        JPasswordField passwordPF = new JPasswordField();
        passwordPF.setBackground(Color.decode("#EDDCC4"));
        passwordPF.setFont(poppinsRegular.deriveFont(20f));
        passwordPF.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        passwordPF.setBounds(20, 280, 283, 40);
        rightPanel.add(passwordPF);

        JButton loginBtn = new JButton("Log In");
        loginBtn.setFont(poppinsMedium);
        loginBtn.setForeground(Color.decode("#EBF5FB"));
        loginBtn.setBackground(Color.decode("#8EB8EB"));
        loginBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        loginBtn.setBounds(67, 343, 203, 48);
        loginBtn.setFocusPainted(false);
        rightPanel.add(loginBtn);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            loginPage lp = new loginPage();
            lp.login();
        });
    }
}