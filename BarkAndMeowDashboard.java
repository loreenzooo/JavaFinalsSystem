import javax.swing.*;
import java.awt.*;

public class BarkAndMeowDashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bark & Meow Dashboard");
        frame.setSize(940, 519);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel topPanel = new JPanel();
        topPanel.setBounds(0, 0, 6000, 100);
        topPanel.setBackground(Color.decode("#F6DEB9"));
        topPanel.setLayout(null);
        frame.add(topPanel);

        JLabel bmdLabel = new JLabel("BARK & MEOW DASHBOARD");
        bmdLabel.setBounds(20, 45, 600, 40);
        bmdLabel.setFont(new Font("Arial", Font.BOLD, 25));
        bmdLabel.setForeground(Color.decode("#8D6E63"));
        topPanel.add(bmdLabel);

        JLabel adminLabel = new JLabel("Admin");
        adminLabel.setBounds(1290, 45, 200, 40);
        adminLabel.setFont(new Font("Ariel", Font.BOLD, 25));
        adminLabel.setForeground(Color.decode("#8D6E63"));
        topPanel.add(adminLabel);

        JLabel usernameLabel = new JLabel("[username]");
        usernameLabel.setBounds(1370, 45, 200, 40);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 25));
        usernameLabel.setForeground(Color.decode("#8D6E63"));
        topPanel.add(usernameLabel);

        JLabel arrowLabel = new JLabel("▼");
        arrowLabel.setBounds(1510, 45, 200, 40);
        arrowLabel.setFont(new Font("Arial", Font.PLAIN, 10));
        arrowLabel.setForeground(Color.decode("#8D6E63"));
        topPanel.add(arrowLabel);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem profile = new JMenuItem("Profile");
        JMenuItem logout = new JMenuItem("Logout");

        popupMenu.add(profile);
        popupMenu.add(logout);

        usernameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                popupMenu.show(usernameLabel, 0, usernameLabel.getHeight());
            }
        });
        topPanel.add(adminLabel);

        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(0, 100, 200, 803);
        leftPanel.setBackground(Color.decode("#8D6E63"));
        leftPanel.setLayout(null);
        frame.add(leftPanel);

        JLabel salesLine = new JLabel("────────");
        salesLine.setBounds(25, 100, 200, 10);
        salesLine.setFont(new Font("Arial", Font.BOLD, 50));
        salesLine.setForeground(Color.decode("#F6DEB9"));
        leftPanel.add(salesLine);

        JButton salesButton = new JButton("Sales");
        salesButton.setBounds(40, 50, 120, 40);
        salesButton.setFont(new Font("Arial", Font.BOLD, 25));
        salesButton.setForeground(Color.decode("#F6DEB9"));
        salesButton.setOpaque(false);
        salesButton.setContentAreaFilled(false);
        salesButton.setBorderPainted(false);
        leftPanel.add(salesButton);

        JLabel stocksLine = new JLabel("────────");
        stocksLine.setBounds(25, 200, 200, 10);
        stocksLine.setFont(new Font("Arial", Font.BOLD, 50));
        stocksLine.setForeground(Color.decode("#F6DEB9"));
        leftPanel.add(stocksLine);

        JButton stocksButton = new JButton("Stocks");
        stocksButton.setBounds(40, 150, 120, 40);
        stocksButton.setFont(new Font("Arial", Font.BOLD, 25));
        stocksButton.setForeground(Color.decode("#F6DEB9"));
        stocksButton.setOpaque(false);
        stocksButton.setContentAreaFilled(false);
        stocksButton.setBorderPainted(false);
        leftPanel.add(stocksButton);

        JLabel inventoryLine = new JLabel("────────");
        inventoryLine.setBounds(25, 300, 200, 10);
        inventoryLine.setFont(new Font("Arial", Font.BOLD, 50));
        inventoryLine.setForeground(Color.decode("#F6DEB9"));
        leftPanel.add(inventoryLine);

        JButton inventoryButton = new JButton("Inventory");
        inventoryButton.setBounds(25, 250, 150, 40);
        inventoryButton.setFont(new Font("Arial", Font.BOLD, 25));
        inventoryButton.setForeground(Color.decode("#F6DEB9"));
        inventoryButton.setOpaque(false);
        inventoryButton.setContentAreaFilled(false);
        inventoryButton.setBorderPainted(false);
        leftPanel.add(inventoryButton);

        JLabel reportsLine = new JLabel("────────");
        reportsLine.setBounds(25, 400, 200, 10);
        reportsLine.setFont(new Font("Arial", Font.BOLD, 50));
        reportsLine.setForeground(Color.decode("#F6DEB9"));
        leftPanel.add(reportsLine);

        JButton reportsButton = new JButton("Reports");
        reportsButton.setBounds(20, 350, 150, 40);
        reportsButton.setFont(new Font("Arial", Font.BOLD, 25));
        reportsButton.setForeground(Color.decode("#F6DEB9"));
        reportsButton.setOpaque(false);
        reportsButton.setContentAreaFilled(false);
        reportsButton.setBorderPainted(false);
        leftPanel.add(reportsButton);

        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(0, 0, 6000, 803);
        rightPanel.setBackground(Color.decode("#7E7B76"));
        rightPanel.setLayout(null);
        frame.add(rightPanel);

        frame.setVisible(true);
    }
}