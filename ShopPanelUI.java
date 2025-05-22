import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopPanelUI extends JFrame {

    public ShopPanelUI() {
        setTitle("Shop UI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header
        JLabel header = new JLabel("Welcome to My Online Store", SwingConstants.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 28));
        header.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(header, BorderLayout.NORTH);

        // Product grid
        JPanel productGrid = new JPanel(new GridLayout(2, 3, 10, 10));
        productGrid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Example product data
        String[] productNames = {"Laptop", "Phone", "Headphones", "Keyboard", "Mouse", "Monitor"};
        String[] imagePaths = {"laptop.png", "phone.png", "headphones.png", "keyboard.png", "mouse.png", "monitor.png"};
        double[] prices = {899.99, 499.99, 79.99, 49.99, 29.99, 199.99};

        for (int i = 0; i < productNames.length; i++) {
            productGrid.add(createProductPanel(productNames[i], imagePaths[i], prices[i]));
        }

        add(new JScrollPane(productGrid), BorderLayout.CENTER);
    }

    private JPanel createProductPanel(String name, String imagePath, double price) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.setBackground(Color.WHITE);

        // Product image
        ImageIcon icon;
        try {
            icon = new ImageIcon(getClass().getResource(imagePath));
            Image scaled = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
        } catch (Exception e) {
            icon = new ImageIcon(); // fallback
        }
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Name and price
        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel priceLabel = new JLabel(String.format("$%.2f", price));
        priceLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Quantity spinner
        SpinnerModel quantityModel = new SpinnerNumberModel(1, 1, 99, 1);
        JSpinner quantitySpinner = new JSpinner(quantityModel);
        quantitySpinner.setMaximumSize(new Dimension(60, 25));
        quantitySpinner.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add to cart button
        JButton addButton = new JButton("Add to Cart");
        addButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int qty = (int) quantitySpinner.getValue();
                JOptionPane.showMessageDialog(panel, qty + " x " + name + " added to cart.");
            }
        });

        // Assemble
        panel.add(Box.createVerticalStrut(10));
        panel.add(imageLabel);
        panel.add(Box.createVerticalStrut(10));
        panel.add(nameLabel);
        panel.add(priceLabel);
        panel.add(Box.createVerticalStrut(5));
        panel.add(quantitySpinner);
        panel.add(Box.createVerticalStrut(5));
        panel.add(addButton);
        panel.add(Box.createVerticalGlue());

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShopPanelUI().setVisible(true);
        });
    }
}
