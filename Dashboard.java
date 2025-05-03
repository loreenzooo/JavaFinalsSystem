import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bark & Meow Dashboard");
        frame.setSize(1000, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Colors from image
        Color headerBg = new Color(0xEDD3A1);
        Color headerText = new Color(0x8C6B5D);
        Color sidebarBg = new Color(0x926F60);
        Color sidebarText = new Color(0xEDD3A1);
        Color contentBg = new Color(0x726E69);

        // Header Panel
        JPanel header = new JPanel(null);
        header.setBounds(0, 0, 1000, 50);
        header.setBackground(headerBg);

        JLabel title = new JLabel("BARK & MEOW DASHBOARD");
        title.setFont(new Font("SansSerif", Font.BOLD, 16));
        title.setForeground(headerText);
        title.setBounds(20, 10, 300, 30);

        JLabel profile = new JLabel("Admin [username] ▾");
        profile.setFont(new Font("SansSerif", Font.BOLD, 14));
        profile.setForeground(headerText);
        profile.setBounds(800, 10, 180, 30);
        profile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Profile menu popup
        JPopupMenu profileMenu = new JPopupMenu();
        JMenuItem profileItem = new JMenuItem("Profile");
        JMenuItem logoutItem = new JMenuItem("Logout");
        profileMenu.add(profileItem);
        profileMenu.add(logoutItem);

        profile.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                profileMenu.show(profile, e.getX(), e.getY());
            }
        });

        header.add(title);
        header.add(profile);
        frame.add(header);

        // Sidebar Panel
        JPanel sidebar = new JPanel(null);
        sidebar.setBounds(0, 50, 180, 550);
        sidebar.setBackground(sidebarBg);

        String[] buttons = { "Sales", "Stocks", "Inventory", "Reports", "Logout" };
        JButton[] btnArray = new JButton[buttons.length];
        int y = 20;

        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            btn.setBounds(10, y, 160, 50);
            btn.setBackground(sidebarBg);
            btn.setForeground(sidebarText);
            btn.setFont(new Font("SansSerif", Font.BOLD, 14));
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, headerBg));
            sidebar.add(btn);
            btnArray[i] = btn;
            y += 70;
        }

        frame.add(sidebar);

        // Content Panels
        JPanel content = new JPanel(null);
        content.setBounds(180, 50, 820, 550);
        content.setBackground(contentBg);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 780, 510);
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setBackground(contentBg);
        textArea.setForeground(Color.WHITE);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        content.add(textArea);

        frame.add(content);

        btnArray[0].addActionListener(e -> textArea
                .setText("📊 Sales Overview\n\nTotal Orders: 120\nRevenue: $3,450\nTop Product: Tuna Delight"));
        btnArray[1].addActionListener(
                e -> textArea.setText("📦 Stock Status\n\nCat Food: 300 pcs\nDog Toys: 120 pcs\nBeds: 45 pcs"));
        btnArray[2].addActionListener(e -> textArea
                .setText("📋 Inventory List\n\n1. Chew Bone - 50\n2. Fish Flakes - 100\n3. Pet Shampoo - 75"));
        btnArray[3].addActionListener(
                e -> textArea.setText("📈 Reports\n\nMonthly Sales Report Ready\nClick Export to download PDF"));
        btnArray[4].addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Logout",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION)
                System.exit(0);
        });

        profileItem.addActionListener(
                e -> textArea.setText("👤 Profile Info\n\nName: John Doe\nEmail: john@example.com\nRole: Admin"));
        logoutItem.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Logout",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION)
                System.exit(0);
        });

        frame.setVisible(true);
    }
}
