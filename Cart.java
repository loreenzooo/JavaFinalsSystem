import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Cart extends JPanel {

    Font poppinsRegular;
    Font poppinsBold;
    Font poppinsMedium;

    public Cart() {
        try {

            poppinsRegular = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Regular.ttf"))
                    .deriveFont(12f);
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Bold.ttf"))
                    .deriveFont(48f);
            poppinsMedium = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins/Poppins-Medium.ttf"))
                    .deriveFont(24f);

            Font smallerReg = poppinsRegular.deriveFont(20f);
            Font smallerBold = poppinsBold.deriveFont(24f);
            Font smallerBold1 = poppinsBold.deriveFont(32f);

        } catch (Exception exception) {
            exception.printStackTrace();
            poppinsRegular = new Font("Arial", Font.PLAIN, 18);
            poppinsBold = new Font("Arial", Font.BOLD, 22);

        }

        this.setBackground(Color.decode("#F6DEB9"));
        this.setBounds(0, 0, 1535, 853);
        this.setLayout(null);

    }

    public void cart() {

        JFrame frame = new JFrame("Cart");
        frame.setSize(1535, 873);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(true);

        frame.setUndecorated(false); // Full of the full screen

        Cart panel = new Cart();

        JPanel headSection = new JPanel();
        headSection.setBackground(Color.decode("#D0A495"));
        headSection.setLayout(null);
        headSection.setBounds(0, 0, 1535, 64);
        panel.add(headSection);

        JLabel headTitle = new JLabel("BARK & MEOW CART");
        headTitle.setBounds(17, 12, 853, 40);
        headTitle.setForeground(Color.decode("#8D6E63"));
        headTitle.setFont(poppinsBold.deriveFont(30f));

        ImageIcon cartImage = new ImageIcon(
                "/C:/Users/adria/IdeaProjects/4b3fb35864c3479d561ccb4d43dff62156290da8.png/");
        Image getCartImage = cartImage.getImage();
        Image cartImageResize = getCartImage.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        ImageIcon resizedCartImage = new ImageIcon(cartImageResize);

        JLabel resizedCartImageInLabel = new JLabel(resizedCartImage);
        resizedCartImageInLabel.setBounds(340, 15, 36, 36);

        headSection.add(resizedCartImageInLabel);
        headSection.add(headTitle);

        panel.add(headSection, BorderLayout.NORTH);

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.decode("#8D6E63"));
        backButton.setForeground(Color.decode("#F6DEB9"));
        backButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        backButton.setFont(poppinsBold.deriveFont(20f));
        backButton.setFocusPainted(false);
        backButton.setBounds(1400, 18, 96, 35);

        panel.add(backButton);

        JLabel oneLabel = new JLabel("1");
        oneLabel.setBounds(563, 120, 30, 30);
        oneLabel.setForeground(Color.WHITE);
        oneLabel.setFont(poppinsBold);

        JLabel twoLabel = new JLabel("2");
        twoLabel.setBounds(755, 120, 30, 30);
        twoLabel.setForeground(Color.WHITE);
        twoLabel.setFont(poppinsBold);

        JLabel threeLabel = new JLabel("3");
        threeLabel.setBounds(948, 120, 30, 30);
        threeLabel.setForeground(Color.WHITE);
        threeLabel.setFont(poppinsBold);

        panel.add(oneLabel);
        panel.add(twoLabel);
        panel.add(threeLabel);

        JLabel shoppingCartLabel = new JLabel("Shopping Cart");
        shoppingCartLabel.setBounds(oneLabel.getX() - 52, 165, 200, 30);
        shoppingCartLabel.setForeground(Color.decode("#8D6E63"));
        shoppingCartLabel.setFont(poppinsRegular);

        JLabel confirmOrderLabel = new JLabel("Payment");
        confirmOrderLabel.setBounds(twoLabel.getX() - 50, 165, 200, 30);
        confirmOrderLabel.setForeground(Color.decode("#8D6E63"));
        confirmOrderLabel.setFont(poppinsRegular);

        JLabel paymentLabel = new JLabel("Receipt");
        paymentLabel.setBounds(threeLabel.getX() - 30, 165, 200, 30);
        paymentLabel.setForeground(Color.decode("#8D6E63"));
        paymentLabel.setFont(poppinsRegular);

        panel.add(shoppingCartLabel);
        panel.add(confirmOrderLabel);
        panel.add(paymentLabel);

        JPanel cartTable = new JPanel();
        cartTable.setBackground(Color.decode("#D0A495"));
        cartTable.setBounds(363, 210, 808, 280);
        cartTable.setLayout(null);
        panel.add(cartTable);

        JPanel cartTableHead = new JPanel();
        cartTableHead.setBounds(0, 0, cartTable.getWidth(), 29);
        cartTableHead.setBackground(Color.decode("#8D6E63"));
        cartTableHead.setLayout(null);
        cartTable.add(cartTableHead);

        JLabel productTitle = new JLabel("Product");
        productTitle.setForeground(Color.decode("#F6DEB9"));
        productTitle.setBounds(60, 0, 100, 30);
        productTitle.setFont(poppinsRegular.deriveFont(16f));
        cartTableHead.add(productTitle);

        JLabel quantityTitle = new JLabel("Quantity");
        quantityTitle.setForeground(Color.decode("#F6DEB9"));
        quantityTitle.setBounds(470, 0, 100, 30);
        quantityTitle.setFont(poppinsRegular.deriveFont(16f));

        cartTableHead.add(quantityTitle);

        JLabel priceTitle = new JLabel("Price");
        priceTitle.setForeground(Color.decode("#F6DEB9"));
        priceTitle.setBounds(615, 0, 100, 30);
        priceTitle.setFont(poppinsRegular.deriveFont(16f));

        cartTableHead.add(priceTitle);

        JLabel subTotalTitle = new JLabel("Subtotal");
        subTotalTitle.setForeground(Color.decode("#F6DEB9"));
        subTotalTitle.setBounds(715, 0, 100, 30);
        subTotalTitle.setFont(poppinsRegular.deriveFont(16f));

        cartTableHead.add(subTotalTitle);

        JPanel cartTableContent = new JPanel();
        cartTableContent.setLayout(null);
        cartTableContent.setBackground(Color.decode("#D0A495"));
        cartTableContent.setBounds(0, 29, cartTable.getWidth(), 251);
        cartTable.add(cartTableContent);

        JPanel product1 = new JPanel();
        product1.setBackground(Color.decode("#D9D9D9"));
        product1.setLayout(null);
        product1.setBounds(15, 10, 778, 50);
        cartTableContent.add(product1);

        JButton removeButton = new JButton("X") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create(); // <- clone for safety
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // To remove
                                                                                                         // jagged edges

                // Painting rounded button
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);

                // Optional: set clip to avoid overflow when painting text/icon
                g2.setClip(new java.awt.geom.RoundRectangle2D.Float(0, 0, 32, 32, 50, 50));

                super.paintComponent(g2); // Now it paints cleanly inside
                g2.dispose();
            }
        };

        // Customize the button
        removeButton.setFocusPainted(false);
        removeButton.setForeground(Color.white);
        removeButton.setOpaque(false);
        removeButton.setFont(poppinsRegular.deriveFont(16f));
        removeButton.setBackground(Color.red);
        removeButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        removeButton.setBorderPainted(false);
        removeButton.setBounds(10, 10, 32, 32);

        product1.add(removeButton);

        ImageIcon prod1 = new ImageIcon("C:/Users/adria/IdeaProjects/bc7120a56e73bd5b21f98ea369e334a2b3065d91.png");
        Image getProd1Image = prod1.getImage();

        // Convert to BufferedImage for better quality, SCALE_SMOOTH is replaced
        BufferedImage bufferedImage = new BufferedImage(
                getProd1Image.getWidth(null),
                getProd1Image.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D bGr = bufferedImage.createGraphics();
        bGr.drawImage(getProd1Image, 0, 0, null);
        bGr.dispose();

        // Resize with high-quality rendering
        int width = 42, height = 42;
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage(bufferedImage, 0, 0, width, height, null);
        g2d.dispose();

        // Create ImageIcon and JLabel
        ImageIcon prod1ResizedImage = new ImageIcon(resizedImage);
        JLabel prod1ResizedImageLabel = new JLabel(prod1ResizedImage);
        prod1ResizedImageLabel.setBounds(50, 5, width, height);
        product1.add(prod1ResizedImageLabel);

        JLabel prod1Title = new JLabel("<html> Kibbles ‘n Bits Original Savory Beef <br>" +
                "& Chicken Flavors Dry Dog Food</html>");
        prod1Title.setBounds(105, 5, 300, 40);
        prod1Title.setFont(poppinsBold.deriveFont(15f));
        prod1Title.setForeground(Color.decode("#8D6E63"));
        product1.add(prod1Title);

        JPanel amountButton = new JPanel();
        amountButton.setBounds(425, 5, 120, 40);
        amountButton.setLayout(null);
        amountButton.setBackground(Color.decode("#D9D9D9"));
        product1.add(amountButton);

        JButton subtractAmount = new JButton("-");
        subtractAmount.setBounds(15, 7, 28, 28);
        subtractAmount.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        subtractAmount.setBackground(Color.decode("#F6DEB9"));
        subtractAmount.setForeground(Color.decode("#8D6E63"));
        subtractAmount.setFocusPainted(false);
        amountButton.add(subtractAmount);

        JLabel amountText = new JLabel("2");
        amountText.setBounds(58, -5, 50, 50);
        amountText.setFont(poppinsBold.deriveFont(16f));
        amountText.setForeground(Color.decode("#8D6E63"));
        amountButton.add(amountText);

        JButton addAmount = new JButton("+");
        addAmount.setBounds(80, 7, 28, 28);
        addAmount.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addAmount.setBackground(Color.decode("#F6DEB9"));
        addAmount.setForeground(Color.decode("#8D6E63"));
        addAmount.setFocusPainted(false);
        amountButton.add(addAmount);

        JLabel priceText = new JLabel("₱1,100");
        priceText.setFont(poppinsBold.deriveFont(16f));
        priceText.setForeground(Color.decode("#8D6E63"));
        priceText.setBounds(592, 0, 100, 50);

        product1.add(priceText);

        JLabel subTotalText = new JLabel("₱2,200");
        subTotalText.setForeground(Color.decode("#8D6E63"));
        subTotalText.setFont(poppinsBold.deriveFont(16f));
        subTotalText.setBounds(705, 0, 100, 50);

        product1.add(subTotalText);

        JButton continueButton = new JButton("Continue") {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create(); // <- clone for safety
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // To remove
                                                                                                         // jagged edges

                // Painting rounded button
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

                // set clip to avoid overflow when painting text/icon, arun inig press, walay
                // makit-an nga blue nga mu lapas sa button
                g2.setClip(new java.awt.geom.RoundRectangle2D.Float(0, 0, 114, 29, 30, 30));

                super.paintComponent(g2); // Now it paints cleanly inside
                g2.dispose();
            }

        };

        continueButton.setForeground(Color.decode("#F6DEB9"));
        continueButton.setBackground(Color.decode("#8D6E63"));
        continueButton.setFont(poppinsRegular.deriveFont(16f));
        continueButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        continueButton.setFocusPainted(false);
        continueButton.setBorderPainted(false);
        continueButton.setOpaque(false);
        continueButton.setBounds(373, 500, 112, 29);

        panel.add(continueButton);

        JPanel totalPayment = new JPanel();
        totalPayment.setBounds(950, 500, 187, 29);
        totalPayment.setBackground(Color.decode("#8D6E63"));

        JLabel totalLabel = new JLabel("Total: ");
        totalLabel.setBounds(0, 0, 30, 30);
        totalLabel.setFont(poppinsBold.deriveFont(16f));
        totalLabel.setForeground(Color.decode("#F6DEB9"));

        JLabel amount = new JLabel("P 2,200");
        amount.setBounds(40, 0, 30, 30);
        amount.setFont(poppinsBold.deriveFont(16f));
        amount.setForeground(Color.decode("#F6DEB9"));

        totalPayment.add(totalLabel);
        totalPayment.add(amount);

        panel.add(totalPayment);

        frame.add(panel);

        frame.setVisible(true);

    }

    public void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);

        graphics.setClip(0, 0, 1535, 863);
        graphics.setColor(Color.decode("#D3CACA"));
        graphics.setFont(new Font("Arial", Font.PLAIN, 20));

        graphics.drawRect(565, 133, 400, 0);
        graphics.drawRect(565, 133, 400, 0);
        graphics.drawRect(565, 134, 400, 0);
        graphics.drawRect(565, 135, 400, 0);
        graphics.drawRect(565, 136, 400, 0);
        graphics.drawRect(565, 137, 400, 0);
        graphics.drawRect(565, 137, 400, 0);

        graphics.setColor(Color.decode("#D5DDDE"));

        graphics.fillOval(935, 115, 40, 40);

        graphics.fillOval(742, 115, 40, 40);

        graphics.setColor(Color.decode("#7EDDE7"));

        graphics.fillOval(550, 115, 40, 40);

        graphics.setColor(Color.decode("#FFFFFF"));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cart lp = new Cart();
            lp.cart();
        });

    }

}