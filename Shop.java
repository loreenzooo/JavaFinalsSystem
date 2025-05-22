import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Shop extends JPanel {

    Font poppinsRegular;
    Font poppinsBold;
    Font poppinsMedium;

    public Shop() {
        try {
            poppinsRegular = Font.createFont(Font.TRUETYPE_FONT,
                    new File("fonts/Poppins/Poppins-Regular.ttf")).deriveFont(12f);
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT,
                    new File("fonts/Poppins/Poppins-Bold.ttf")).deriveFont(48f);
            poppinsMedium = Font.createFont(Font.TRUETYPE_FONT,
                    new File("fonts/Poppins/Poppins-Medium.ttf")).deriveFont(24f);
        } catch (Exception exception) {
            exception.printStackTrace();
            poppinsRegular = new Font("Arial", Font.PLAIN, 18);
            poppinsBold = new Font("Arial", Font.BOLD, 22);
        }

        this.setBackground(Color.decode("#F6DEB9"));
        this.setBounds(0, 0, 1535, 853);
        this.setLayout(null);
    }

    public void shop() {
        JFrame frame = new JFrame("Shop");
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Shop basePanel = new Shop();
        frame.add(basePanel);

        JPanel shopHeadSection = new JPanel();
        shopHeadSection.setBackground(Color.decode("#D0A495"));
        shopHeadSection.setBounds(0, 0, 1537, 134);
        shopHeadSection.setLayout(null);
        basePanel.add(shopHeadSection);

        JLabel title = new JLabel("BARK & MEOW SHOP");
        title.setForeground(Color.decode("#F6DEB9"));
        title.setFont(poppinsBold.deriveFont(32f));
        title.setBounds(31, 43, 328, 48);
        shopHeadSection.add(title);

        // Basket icon
        ImageIcon basket = new ImageIcon("icons/shopping-bag.png");
        Image getBasketImage = basket.getImage();

        BufferedImage bufferedImage = new BufferedImage(
                getBasketImage.getWidth(null),
                getBasketImage.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bufferedImage.createGraphics();
        bGr.drawImage(getBasketImage, 0, 0, null);
        bGr.dispose();

        int width = 60, height = 60;
        BufferedImage resizeBasketImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizeBasketImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage(bufferedImage, 0, 0, width, height, null);
        g2d.dispose();

        ImageIcon resizedBasketImage = new ImageIcon(resizeBasketImage);
        JLabel resizedBasketIconLabel = new JLabel(resizedBasketImage);
        resizedBasketIconLabel.setBounds(370, 30, width, height);
        shopHeadSection.add(resizedBasketIconLabel);

        // Search TextField
        JTextField searchForProducts = new JTextField(" Search for products");
        searchForProducts.setBounds(651, 42, 664, 49);
        searchForProducts.setForeground(Color.decode("#E1E1E1"));
        searchForProducts.setFont(poppinsRegular.deriveFont(24f));
        searchForProducts.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        shopHeadSection.add(searchForProducts);

        searchForProducts.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchForProducts.getText().equals(" Search for products")) {
                    searchForProducts.setText("");
                    searchForProducts.setForeground(Color.decode("#333333"));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchForProducts.getText().isEmpty()) {
                    searchForProducts.setText(" Search for products");
                    searchForProducts.setForeground(Color.decode("#999999"));
                }
            }
        });

        // Load search icon properly
        try {
            BufferedImage icon = ImageIO.read(new File("icons/search.png")); // Make sure this is correct
            Image scaled = icon.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            ImageIcon resizedSearchImage = new ImageIcon(scaled);
        
            JButton searchButton = new JButton(resizedSearchImage);
            searchButton.setBounds(1270, 52, 30, 30);
            searchButton.setContentAreaFilled(false);
            searchButton.setBorderPainted(false);

            searchButton.addActionListener(e -> {
                if (searchForProducts.getText().trim().isEmpty()
                        || searchForProducts.getText().equals(" Search for products")) {
                    JOptionPane.showMessageDialog(
                            frame,
                            "Please input a text in search bar.",
                            "Search Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        
            shopHeadSection.add(searchButton);
        } catch (Exception e) {
            e.printStackTrace();
        }

       

       

        // Rightmost cart image
        ImageIcon cartImage = new ImageIcon("icons/shopping-bag.png");
        Image getCartImage = cartImage.getImage();
        BufferedImage bufferedCartImage = new BufferedImage(
                getCartImage.getWidth(null),
                getCartImage.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D Shop_bGr = bufferedCartImage.createGraphics();
        Shop_bGr.drawImage(getCartImage, 0, 0, null);
        Shop_bGr.dispose();

        BufferedImage resizeCartImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D Shop_g2d = resizeCartImage.createGraphics();
        Shop_g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        Shop_g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Shop_g2d.drawImage(bufferedCartImage, 0, 0, width, height, null);
        Shop_g2d.dispose();

        ImageIcon resizedCartImage = new ImageIcon(resizeCartImage);
        JLabel resizedCartImageInLabel = new JLabel(resizedCartImage);
        resizedCartImageInLabel.setBounds(1450, 37, width, height);
        shopHeadSection.add(resizedCartImageInLabel);

        // Sorting Panel
        JPanel sortingPanel = new JPanel();
        sortingPanel.setBounds(125, 176, 1269, 67);
        sortingPanel.setLayout(null);
        sortingPanel.setBackground(Color.decode("#CACACA"));
        basePanel.add(sortingPanel);

        JLabel sortBy = new JLabel("Sort By");
        sortBy.setFont(poppinsRegular.deriveFont(20f));
        sortBy.setBounds(85, 3, 146, 67);
        sortingPanel.add(sortBy);

        JButton searchDogFoods = new JButton("Dog Foods");
        searchDogFoods.setBounds(200, 14, 150, 40);
        searchDogFoods.setFont(poppinsRegular.deriveFont(20f));
        searchDogFoods.setForeground(Color.decode("#E1E1E1"));
        searchDogFoods.setBackground(Color.decode("#FFFFFF"));
        searchDogFoods.setFocusPainted(false);
        searchDogFoods.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sortingPanel.add(searchDogFoods);

        JButton searchCatFoods = new JButton("Cat Foods");
        searchCatFoods.setBounds(360, 14, 150, 40);
        searchCatFoods.setFont(poppinsRegular.deriveFont(20f));
        searchCatFoods.setForeground(Color.decode("#E1E1E1"));
        searchCatFoods.setBackground(Color.decode("#FFFFFF"));
        searchCatFoods.setFocusPainted(false);
        searchCatFoods.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sortingPanel.add(searchCatFoods);

        String[] others = { "A to Z", "Z to A", "Price Ascending", "Price Descending" };
        JComboBox<String> otherChoices = new JComboBox<>(others);
        otherChoices.setForeground(Color.decode("#E1E1E1"));
        otherChoices.setBackground(Color.decode("#FFFFFF"));
        otherChoices.setBounds(517, 14, 250, 40);
        sortingPanel.add(otherChoices);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Shop sp = new Shop();
            sp.shop();
        });
    }
}
