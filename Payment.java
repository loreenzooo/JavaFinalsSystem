import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Payment {

    Font poppinsRegular;
    Font poppinsBold;
    Font poppinsMedium;

    public Payment() {
        loadFonts();
    }

    private void loadFonts() {
        try {
            poppinsRegular = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Regular.ttf"))
                    .deriveFont(18f);
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Bold.ttf"))
                    .deriveFont(48f);
            poppinsMedium = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Medium.ttf"))
                    .deriveFont(24f);
        } catch (Exception e) {
            e.printStackTrace();
            poppinsRegular = new Font("SansSerif", Font.PLAIN, 18);
            poppinsBold = new Font("SansSerif", Font.BOLD, 48);
            poppinsMedium = new Font("SansSerif", Font.PLAIN, 24);
        }
    }

    // Inner class for drawing circular step indicators
    class StepCircle extends JPanel {
        String stepNumber;
        Color fillColor;
        Font font;

        public StepCircle(String stepNumber, Color fillColor, Font font) {
            this.stepNumber = stepNumber;
            this.fillColor = fillColor;
            this.font = font;
            setBounds(0, 0, 36, 36);
            setOpaque(false);
            setLayout(null);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(fillColor);
            g2.fillOval(0, 0, getWidth(), getHeight());

            g2.setColor(Color.WHITE);
            g2.setFont(font.deriveFont(20f));
            FontMetrics fm = g2.getFontMetrics();
            int textWidth = fm.stringWidth(stepNumber);
            int textHeight = fm.getAscent();

            int x = (getWidth() - textWidth) / 2;
            int y = (getHeight() + textHeight / 2) / 2;
            g2.drawString(stepNumber, x, y);
        }
    }

    public void paymentSection() {
        JFrame frame = new JFrame("Payment");
        frame.setSize(1535, 873);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setUndecorated(false);

        ImageIcon cartImage = new ImageIcon("icons/shopping-cart.png");
        Image getCartImage = cartImage.getImage();
        Image cartImageResize = getCartImage.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        ImageIcon resizedCartImage = new ImageIcon(cartImageResize);

        ImageIcon BackIcon = new ImageIcon("icons/right-arrow.png");
        Image getBackIcon = BackIcon.getImage();
        Image backIconResize = getBackIcon.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        ImageIcon resizedBackIcon = new ImageIcon(backIconResize);

        JPanel navPanel = new JPanel();
        navPanel.setBounds(0, 0, frame.getWidth(), 80);
        navPanel.setBackground(Color.decode("#D0A495"));
        navPanel.setLayout(null);

        JLabel brandLabel = new JLabel("BARK & MEOW CART");
        brandLabel.setFont(poppinsBold.deriveFont(48f));
        brandLabel.setForeground(Color.decode("#F6DEB9"));
        brandLabel.setBounds(22, 17, 600, 48);
        navPanel.add(brandLabel);

        JLabel cartIconLabel = new JLabel(resizedCartImage);
        cartIconLabel.setBounds(530, 17, resizedCartImage.getIconWidth(), resizedCartImage.getIconHeight());
        navPanel.add(cartIconLabel);

        JButton backButton = new JButton(resizedBackIcon);
        backButton.setBackground(Color.decode("#8D6E63"));
        backButton.setBounds(1450, 21, 65, 35);
        backButton.setFocusPainted(false);
        navPanel.add(backButton);

        JPanel bodyPanel = new JPanel();
        bodyPanel.setLayout(null);
        bodyPanel.setBackground(Color.decode("#F6DEB9"));
        bodyPanel.setBounds(0, 80, frame.getWidth(), frame.getHeight());

        // Step indicators (custom circular components)
        StepCircle stepOneCircle = new StepCircle("1", Color.decode("#D0EFFF"), poppinsBold);
        stepOneCircle.setBounds(560, 115, 36, 36);

        StepCircle stepTwoCircle = new StepCircle("2", Color.decode("#00CFFF"), poppinsBold);
        stepTwoCircle.setBounds(752, 115, 36, 36);

        StepCircle stepThreeCircle = new StepCircle("3", Color.decode("#D0EFFF"), poppinsBold);
        stepThreeCircle.setBounds(945, 115, 36, 36);

        // Connector lines between steps
        JPanel lineOne = new JPanel();
        lineOne.setBackground(Color.decode("#D0EFFF"));
        lineOne.setBounds(596, 132, 156, 4);

        JPanel lineTwo = new JPanel();
        lineTwo.setBackground(Color.decode("#D0EFFF"));
        lineTwo.setBounds(788, 132, 156, 4);

        // Labels under each circle
        JLabel shoppingCartLabel = new JLabel("Shopping Cart");
        shoppingCartLabel.setBounds(stepOneCircle.getX() - 40, 165, 200, 30);
        shoppingCartLabel.setForeground(Color.decode("#8D6E63"));
        shoppingCartLabel.setFont(poppinsRegular);

        JLabel confirmOrderLabel = new JLabel("Payment");
        confirmOrderLabel.setBounds(stepTwoCircle.getX() - 20, 165, 200, 30);
        confirmOrderLabel.setForeground(Color.decode("#8D6E63"));
        confirmOrderLabel.setFont(poppinsRegular);

        JLabel paymentLabel = new JLabel("Receipt");
        paymentLabel.setBounds(stepThreeCircle.getX() - 15, 165, 200, 30);
        paymentLabel.setForeground(Color.decode("#8D6E63"));
        paymentLabel.setFont(poppinsRegular);

        JPanel secondBody = new JPanel();
        secondBody.setLayout(null);
        secondBody.setBackground(Color.decode("#D0A495"));
        secondBody.setBounds(70, 200, 1400, 550);

        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(null);
        itemPanel.setBackground(Color.decode("#F6DEB9"));
        itemPanel.setBounds(6, 11, 1387, 55);

        JLabel productName = new JLabel("Sample Product");
        productName.setFont(poppinsRegular);
        productName.setForeground(Color.decode("#45454B"));
        productName.setBounds(15, 20, 150, 20);
        itemPanel.add(productName);

        JLabel productQuantity = new JLabel("x2");
        productQuantity.setFont(poppinsRegular);
        productQuantity.setForeground(Color.decode("#45454B"));
        productQuantity.setBounds(700, 20, 150, 20);
        itemPanel.add(productQuantity);

        JLabel productPrice = new JLabel("Price: \u20B1" + "9,000");
        productPrice.setFont(new Font("SansSerif", Font.PLAIN, 18));
        productPrice.setForeground(Color.decode("#45454B"));
        productPrice.setBounds(1150, 20, 150, 20);
        itemPanel.add(productPrice);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(null);
        lowerPanel.setBounds(6, 340, 1387, 200);
        lowerPanel.setBackground(Color.decode("#FBF5DF"));

        // Create left panel - half the width of lowerPanel
        JPanel lowerLeftPanel = new JPanel();
        lowerLeftPanel.setLayout(null);
        lowerLeftPanel.setBounds(0, 0, 694, 200);
        lowerLeftPanel.setBackground(Color.decode("#FBF5DF"));

        // Create right panel - half the width of lowerPanel
        JPanel lowerRightPanel = new JPanel();
        lowerRightPanel.setLayout(null);
        lowerRightPanel.setBounds(704, 0, 683, 200);
        lowerRightPanel.setBackground(Color.decode("#FBF5DF"));

        JLabel cashLabel = new JLabel("Cash:");
        cashLabel.setFont(poppinsRegular);
        cashLabel.setBounds(6, 15, 50, 50);
        cashLabel.setForeground(Color.decode("#B1B7BA"));
        lowerRightPanel.add(cashLabel);

        JTextArea cashTextArea = new JTextArea();
        cashTextArea.setBounds(90, 20, 150, 30);
        cashTextArea.setEditable(false);
        cashTextArea.setFont(poppinsRegular);
        cashTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lowerRightPanel.add(cashTextArea);

        JLabel changeLabel = new JLabel("Change:");
        changeLabel.setFont(poppinsRegular);
        changeLabel.setForeground(Color.decode("#B1B7BA"));
        changeLabel.setBounds(6, 50, 100, 50);

        JTextArea changeTextArea = new JTextArea();
        changeTextArea.setBounds(90, 60, 150, 30);
        changeTextArea.setEditable(false);
        changeTextArea.setFont(poppinsRegular);
        changeTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lowerRightPanel.add(changeTextArea);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(poppinsRegular);
        submitButton.setBackground(Color.decode("#8EB8EB"));
        submitButton.setForeground(Color.decode("#FBF5DF"));
        submitButton.setBounds(270, 20, 100, 30);
        submitButton.setFocusPainted(false);
        lowerRightPanel.add(submitButton);
        lowerRightPanel.add(changeLabel);

        JLabel allsetLabel = new JLabel("All set? Click me");
        allsetLabel.setFont(poppinsRegular);
        allsetLabel.setForeground(Color.decode("#B1B7BA"));
        allsetLabel.setBounds(6, 140, 200, 100);
        lowerRightPanel.add(allsetLabel);

        JButton continueButton = new JButton("Continue");
        continueButton.setFont(poppinsRegular);
        continueButton.setForeground(Color.decode("#FBF5DF"));
        continueButton.setBackground(Color.decode("#64AD6A"));
        continueButton.setBounds(170, 168, 115, 30);
        lowerRightPanel.add(continueButton);

        JLabel subTotalLabel = new JLabel("Subtotal: \u20B1" + "9,000");
        subTotalLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        subTotalLabel.setForeground(Color.decode("#B1B7BA"));
        subTotalLabel.setBounds(6, 10, 200, 50);
        lowerLeftPanel.add(subTotalLabel);

        JLabel tax = new JLabel("12% Tax:\u20B1" + "1,080");
        tax.setFont(new Font("SansSerif", Font.PLAIN, 18));
        tax.setForeground(Color.decode("#B1B7BA"));
        tax.setBounds(6, 40, 200, 50);
        lowerLeftPanel.add(tax);

        JLabel total = new JLabel("Total: \u20B1" + "10,080");
        total.setFont(new Font("SansSerif", Font.PLAIN, 18));
        total.setForeground(Color.decode("#B1B7BA"));
        total.setBounds(6, 70, 200, 50);
        lowerLeftPanel.add(total);

        JPanel straightLine = new JPanel();
        straightLine.setLayout(null);
        straightLine.setBackground(Color.decode("#DFE2E2"));
        straightLine.setBounds(694, 0, 10, 200);

        // Add the components to lowerPanel
        lowerPanel.add(lowerLeftPanel);
        lowerPanel.add(lowerRightPanel);
        lowerPanel.add(straightLine);

        secondBody.add(lowerPanel);
        secondBody.add(itemPanel);

        bodyPanel.add(lineOne);
        bodyPanel.add(lineTwo);
        bodyPanel.add(stepOneCircle);
        bodyPanel.add(stepTwoCircle);
        bodyPanel.add(stepThreeCircle);
        bodyPanel.add(shoppingCartLabel);
        bodyPanel.add(confirmOrderLabel);
        bodyPanel.add(paymentLabel);
        bodyPanel.add(secondBody);

        frame.add(bodyPanel);
        frame.add(navPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Payment payment = new Payment();
            payment.paymentSection();
        });
    }
}