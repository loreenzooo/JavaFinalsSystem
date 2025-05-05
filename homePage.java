import javax.swing.*;
import java.awt.*;

public class homePage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Home Page");
        frame.setSize(940, 519);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.decode("#F6DEB9"));
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 940, 519);
        panel.setBackground(Color.decode("#F6DEB9"));

        // home navigation bar
        JButton homeButton = new JButton("Home");
        homeButton.setBounds(5, 5, 120, 40);
        homeButton.setFont(new Font("Arial", Font.PLAIN, 25));
        homeButton.setForeground(Color.decode("#8D6E63"));
        homeButton.setOpaque(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setBorderPainted(false);
        homeButton.setFocusPainted(false);
        panel.add(homeButton);

        // cart navigation bar
        JButton cartButton = new JButton("Cart");
        cartButton.setBounds(160, 5, 120, 40);
        cartButton.setFont(new Font("Arial", Font.PLAIN, 25));
        cartButton.setForeground(Color.decode("#8D6E63"));
        cartButton.setOpaque(false);
        cartButton.setContentAreaFilled(false);
        cartButton.setBorderPainted(false);
        cartButton.setFocusPainted(false);
        panel.add(cartButton);

        // shop navigation bar
        JButton shopButton = new JButton("Shop");
        shopButton.setBounds(340, 5, 120, 40);
        shopButton.setFont(new Font("Arial", Font.PLAIN, 25));
        shopButton.setForeground(Color.decode("#8D6E63"));
        shopButton.setOpaque(false);
        shopButton.setContentAreaFilled(false);
        shopButton.setBorderPainted(false);
        shopButton.setFocusPainted(false);
        panel.add(shopButton);

        // [user name]
        JLabel usernameLabel = new JLabel("[username]");
        usernameLabel.setBounds(770, 5, 200, 40);
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        usernameLabel.setForeground(Color.decode("#8D6E63"));
        panel.add(usernameLabel);

        // greetings
        JLabel greetingsLabel = new JLabel("Good day, user " + "\\uD83D\\uDC4B");
        greetingsLabel.setText("Good day, user " + "\uD83D\uDC4B");
        greetingsLabel.setBounds(30, 130, 300, 30);
        greetingsLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 30));
        greetingsLabel.setForeground(Color.decode("#F39C12"));
        panel.add(greetingsLabel);

        // message
        JLabel msgLabel = new JLabel("Let's find something");
        msgLabel.setBounds(30, 200, 500, 30);
        msgLabel.setFont(new Font("Arial", Font.BOLD, 30));
        msgLabel.setForeground(Color.decode("#F39C12"));
        panel.add(msgLabel);

        // extended msg
        JLabel msgExLabel = new JLabel("paw-some for your pet");
        msgExLabel.setBounds(30, 250, 500, 30);
        msgExLabel.setFont(new Font("Arial", Font.BOLD, 30));
        msgExLabel.setForeground(Color.decode("#F39C12"));
        panel.add(msgExLabel);

        // extended msg
        JLabel msgEx2Label = new JLabel("today!");
        msgEx2Label.setBounds(30, 300, 500, 30);
        msgEx2Label.setFont(new Font("Arial", Font.BOLD, 30));
        msgEx2Label.setForeground(Color.decode("#F39C12"));
        panel.add(msgEx2Label);

        ImageIcon originalIcon = new ImageIcon("dogncat.png.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        JLabel dogndcatImageLabel = new JLabel(resizedIcon);
        dogndcatImageLabel.setBounds(300, 5, 800, 500);
        panel.add(dogndcatImageLabel);

        // lagout button
        JButton lagoutButton = new JButton("Logout");
        lagoutButton.setBounds(835, 445, 80, 25);
        lagoutButton.setBackground(Color.red);
        lagoutButton.setForeground(Color.decode("#7E0A0A"));
        panel.add(lagoutButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
