import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
public class OtherClass {
    public void run() {
        JFrame frame = new JFrame();
        JPanel menu = new JPanel();
        JPanel price = new JPanel();
        JPanel buttons = new JPanel();

        JLabel spin1in = new JLabel("Filter Coffee");
        Font ne = new Font("Calibre", Font.BOLD, 17);
        spin1in.setFont(ne);
        spin1in.setBounds(10, -220, 400, 800);
        menu.add(spin1in);

        JLabel spin2in = new JLabel("Price: ");
        spin2in.setFont(ne);
        spin2in.setBounds(10, -190, 400, 800);
        menu.add(spin2in);

        JLabel spin3in = new JLabel("Expresso");
        spin3in.setFont(ne);
        spin3in.setBounds(270, -220, 400, 800);
        menu.add(spin3in);

        JLabel spin4in = new JLabel("Price: ");
        spin4in.setFont(ne);
        spin4in.setBounds(270, -190, 400, 800);
        menu.add(spin4in);

        JLabel spin5in = new JLabel("Green Tea");
        spin5in.setFont(ne);
        spin5in.setBounds(530, -220, 400, 800);
        menu.add(spin5in);

        JLabel spin6in = new JLabel("Price: ");
        spin6in.setFont(ne);
        spin6in.setBounds(530, -190, 400, 800);
        menu.add(spin6in);

        JLabel spin7in = new JLabel("Latte");
        spin7in.setFont(ne);
        spin7in.setBounds(10, 10, 400, 800);
        menu.add(spin7in);

        JLabel spin8in = new JLabel("Price: ");
        spin8in.setFont(ne);
        spin8in.setBounds(10, 40, 400, 800);
        menu.add(spin8in);

        JLabel spin9in = new JLabel("Water");
        spin9in.setFont(ne);
        spin9in.setBounds(270, 10, 400, 800);
        menu.add(spin9in);

        JLabel spin10in = new JLabel("Price: ");
        spin10in.setFont(ne);
        spin10in.setBounds(270, 37, 400, 800);
        menu.add(spin10in);

        JLabel spin11in = new JLabel("Mocha");
        spin11in.setFont(ne);
        spin11in.setBounds(530, 10, 400, 800);
        menu.add(spin11in);

        JLabel spin12in = new JLabel("Price: ");
        spin12in.setFont(ne);
        spin12in.setBounds(530, 37, 400, 800);
        menu.add(spin12in);

        JLabel spin13in = new JLabel("Cheesecake");
        spin13in.setFont(ne);
        spin13in.setBounds(10, 240, 400, 800);
        menu.add(spin13in);

        JLabel spin14in = new JLabel("Price: ");
        spin14in.setFont(ne);
        spin14in.setBounds(10, 270, 400, 800);
        menu.add(spin14in);

        JLabel spin15in = new JLabel("Brownie");
        spin15in.setFont(ne);
        spin15in.setBounds(270, 240, 400, 800);
        menu.add(spin15in);

        JLabel spin16in = new JLabel("Price: ");
        spin16in.setFont(ne);
        spin16in.setBounds(270, 270, 400, 800);
        menu.add(spin16in);

        JLabel spin17in = new JLabel("Straw Cake");
        spin17in.setFont(ne);
        spin17in.setBounds(530, 240, 400, 800);
        menu.add(spin17in);

        JLabel spin18in = new JLabel("Price: ");
        spin18in.setFont(ne);
        spin18in.setBounds(530, 270, 400, 800);
        menu.add(spin18in);

        int prico = 5;
        JLabel pricee = new JLabel(String.valueOf(prico) + " TL");
        pricee.setFont(ne);
        pricee.setBounds(60, -190, 400, 800);
        menu.add(pricee);

        int prico2 = 10;
        JLabel pricee2 = new JLabel(String.valueOf(prico2) + " TL");
        pricee2.setFont(ne);
        pricee2.setBounds(320, -190, 400, 800);
        menu.add(pricee2);

        int prico3 = 15;
        JLabel pricee3 = new JLabel(String.valueOf(prico3) + " TL");
        pricee3.setFont(ne);
        pricee3.setBounds(580, -190, 400, 800);
        menu.add(pricee3);

        int prico4 = 20;
        JLabel pricee4 = new JLabel(String.valueOf(prico4) + " TL");
        pricee4.setFont(ne);
        pricee4.setBounds(60, 40, 400, 800);
        menu.add(pricee4);

        int prico5 = 10;
        JLabel pricee5 = new JLabel(String.valueOf(prico5) + " TL");
        pricee5.setFont(ne);
        pricee5.setBounds(320, 37, 400, 800);
        menu.add(pricee5);

        int prico6 = 15;
        JLabel pricee6 = new JLabel(String.valueOf(prico6) + " TL");
        pricee6.setFont(ne);
        pricee6.setBounds(580, 37, 400, 800);
        menu.add(pricee6);

        int prico7 = 20;
        JLabel pricee7 = new JLabel(String.valueOf(prico7) + " TL");
        pricee7.setFont(ne);
        pricee7.setBounds(60, 270, 400, 800);
        menu.add(pricee7);

        int prico8 = 10;
        JLabel pricee8 = new JLabel(String.valueOf(prico8) + " TL");
        pricee8.setFont(ne);
        pricee8.setBounds(320, 270, 400, 800);
        menu.add(pricee8);

        int prico9 = 15;
        JLabel pricee9 = new JLabel(String.valueOf(prico9) + " TL");
        pricee9.setFont(ne);
        pricee9.setBounds(580, 270, 400, 800);
        menu.add(pricee9);

        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);//Bu kod ile spinnerın alt ve üst değerlerini belirleriz
        SpinnerModel spinnerModel2 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel3 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel4 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel5 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel6 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel7 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel8 = new SpinnerNumberModel(0, 0, 100, 1);
        SpinnerModel spinnerModel9 = new SpinnerNumberModel(0, 0, 100, 1);

        JSpinner spinner = new JSpinner(spinnerModel);//Adet sayısını arttırıp azaltan oklu buton
        JSpinner spinner2 = new JSpinner(spinnerModel2);
        JSpinner spinner3 = new JSpinner(spinnerModel3);
        JSpinner spinner4 = new JSpinner(spinnerModel4);
        JSpinner spinner5 = new JSpinner(spinnerModel5);
        JSpinner spinner6 = new JSpinner(spinnerModel6);
        JSpinner spinner7 = new JSpinner(spinnerModel7);
        JSpinner spinner8 = new JSpinner(spinnerModel8);
        JSpinner spinner9 = new JSpinner(spinnerModel9);

        spinner.setBounds(120, 170, 70, 30);
        menu.add(spinner);
        spinner2.setBounds(380, 170, 70, 30);
        menu.add(spinner2);
        spinner3.setBounds(640, 170, 70, 30);
        menu.add(spinner3);
        spinner4.setBounds(120, 400, 70, 30);
        menu.add(spinner4);
        spinner5.setBounds(380, 400, 70, 30);
        menu.add(spinner5);
        spinner6.setBounds(640, 400, 70, 30);
        menu.add(spinner6);
        spinner7.setBounds(120, 630, 70, 30);
        menu.add(spinner7);
        spinner8.setBounds(380, 630, 70, 30);
        menu.add(spinner8);
        spinner9.setBounds(640, 630, 70, 30);
        menu.add(spinner9);

        String imgPath = "/Fitler-Coffee.jpg";
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imgPath));
        Image image = imageIcon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab1 = new JLabel(new ImageIcon(image));
        imageLab1.setBounds(10, 20, 180, 150);
        menu.add(imageLab1);

        String imgPath2 = "/expresso.png";
        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource(imgPath2));
        Image image2 = imageIcon2.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab2 = new JLabel(new ImageIcon(image2));
        imageLab2.setBounds(270, 20, 180, 150);
        menu.add(imageLab2);

        String imgPath3 = "/green tea.jpg";
        ImageIcon imageIcon3 = new ImageIcon(getClass().getResource(imgPath3));
        Image image3 = imageIcon3.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab3 = new JLabel(new ImageIcon(image3));
        imageLab3.setBounds(530, 20, 180, 150);
        menu.add(imageLab3);

        String imgPath4 = "/latte.jpg";
        ImageIcon imageIcon4 = new ImageIcon(getClass().getResource(imgPath4));
        Image image4 = imageIcon4.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab4 = new JLabel(new ImageIcon(image4));
        imageLab4.setBounds(10, 250, 180, 150);
        menu.add(imageLab4);

        String imgPath5 = "/water.jpg";
        ImageIcon imageIcon5 = new ImageIcon(getClass().getResource(imgPath5));
        Image image5 = imageIcon5.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab5 = new JLabel(new ImageIcon(image5));
        imageLab5.setBounds(270, 250, 180, 150);
        menu.add(imageLab5);

        String imgPath6 = "/mocha.jpg";
        ImageIcon imageIcon6 = new ImageIcon(getClass().getResource(imgPath6));
        Image image6 = imageIcon6.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab6 = new JLabel(new ImageIcon(image6));
        imageLab6.setBounds(530, 250, 180, 150);
        menu.add(imageLab6);

        String imgPath7 = "/cheesecake.jpg";
        ImageIcon imageIcon7 = new ImageIcon(getClass().getResource(imgPath7));
        Image image7 = imageIcon7.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab7 = new JLabel(new ImageIcon(image7));
        imageLab7.setBounds(10, 480, 180, 150);
        menu.add(imageLab7);

        String imgPath8 = "/brownie.jpg";
        ImageIcon imageIcon8 = new ImageIcon(getClass().getResource(imgPath8));
        Image image8 = imageIcon8.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab8 = new JLabel(new ImageIcon(image8));
        imageLab8.setBounds(270, 480, 180, 150);
        menu.add(imageLab8);

        String imgPath9 = "/straw cake.jpg";
        ImageIcon imageIcon9 = new ImageIcon(getClass().getResource(imgPath9));
        Image image9 = imageIcon9.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel imageLab9 = new JLabel(new ImageIcon(image9));
        imageLab9.setBounds(530, 480, 180, 150);
        menu.add(imageLab9);

        JLabel label = new JLabel("---------------------------------------------Amethyst Cafe-------------------------------------------------");
        JLabel pricen = new JLabel("Price");
        JLabel fiyatlar = new JLabel();


        //FlowLayout flows = new FlowLayout(FlowLayout.RIGHT,15,15);
        Font font2 = new Font("Calibre", Font.ITALIC, 15);
        Font font = new Font("Calibre", Font.BOLD, 20);
        label.setFont(font);
        pricen.setFont(font);
        fiyatlar.setFont(font2);
        price.add(fiyatlar);

        JButton total = new JButton("Total");
        JButton receipt = new JButton("Receipt");
        JButton reset = new JButton("Reset");
        JButton exit = new JButton("Exit");
        buttons.add(total);
        buttons.add(receipt);
        buttons.add(reset);
        buttons.add(exit);
        buttons.setBackground(new Color(37, 95, 110));

        //reset butonu ,0 lama işlemi

        Color originalTotalBackground = total.getBackground();
        Color originalReceiptBackground = receipt.getBackground();
        Color originalResetBackground = reset.getBackground();

        total.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                total.setOpaque(true);
                total.setBackground(Color.GREEN);
                receipt.setOpaque(false);
                reset.setOpaque(false);

            }
        });
        receipt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                receipt.setOpaque(true);
                receipt.setBackground(Color.YELLOW);
                total.setOpaque(false);
                reset.setOpaque(false);
            }
        });
        reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reset.setBackground(Color.BLUE);
                Timer timer = new Timer(100, evt -> {//Tıklandığı an yanıp sönmesini sağladık
                    reset.setBackground(originalResetBackground);
                });
//                frame.getContentPane().removeAll();   // Bu kodlar resete tıklayınca sadece bomboş frame kalmasını sağlıyor
//                frame.getContentPane().revalidate();
//                frame.getContentPane().repaint();
//
//                JButton buton = new JButton("Hi");
//                buton.setBounds(50,50,50,50);
//                frame.setLayout(null);
//                frame.add(buton);

                timer.setRepeats(false);
                timer.start();
                spinner.setValue(0);
                spinner2.setValue(0);
                spinner3.setValue(0);
                spinner4.setValue(0);
                spinner5.setValue(0);
                spinner6.setValue(0);
                spinner7.setValue(0);
                spinner8.setValue(0);
                spinner9.setValue(0);
            }
        });

        total.addActionListener(e -> {
            int toplam = prico * Integer.parseInt(spinner.getValue().toString()) + prico2 * Integer.parseInt(spinner2.getValue().toString()) + prico3 * Integer.parseInt(spinner3.getValue().toString()) + prico4 * Integer.parseInt(spinner4.getValue().toString()) + prico5 * Integer.parseInt(spinner5.getValue().toString()) + prico6 * Integer.parseInt(spinner6.getValue().toString()) + prico7 * Integer.parseInt(spinner7.getValue().toString()) + prico8 * Integer.parseInt(spinner8.getValue().toString()) + prico9 * Integer.parseInt(spinner9.getValue().toString());
            JOptionPane.showMessageDialog(null, "The things you add cost " + toplam + "TL", "PRICE: ", JOptionPane.INFORMATION_MESSAGE);
            total.setOpaque(false);
            total.setBackground(originalTotalBackground);
            receipt.setOpaque(false);
            reset.setOpaque(false);
        });

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                frame.setVisible(false);
            }
        });

        receipt.addActionListener(e -> {
            int subtotal = prico * Integer.parseInt(spinner.getValue().toString()) + prico2 * Integer.parseInt(spinner2.getValue().toString()) + prico3 * Integer.parseInt(spinner3.getValue().toString()) + prico4 * Integer.parseInt(spinner4.getValue().toString()) + prico5 * Integer.parseInt(spinner5.getValue().toString()) + prico6 * Integer.parseInt(spinner6.getValue().toString()) + prico7 * Integer.parseInt(spinner7.getValue().toString()) + prico8 * Integer.parseInt(spinner8.getValue().toString()) + prico9 * Integer.parseInt(spinner9.getValue().toString());
            int tax = 15;
            int totals = subtotal + tax;
        });

        //Butona tıklayınca renk değişimi
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(new Color(112, 180, 206, 255));
        contentPanel.add(buttons, BorderLayout.PAGE_END);
        frame.setContentPane(contentPanel);

        price.add(label);
        price.add(pricen);
        label.setBounds(-10, -330, 770, 700);
        pricen.setBounds(520, 100, 100, 110);
        price.setBounds(880, 10, 630, 720);
        price.setBackground(new Color(37, 95, 110));
        frame.add(price);
        price.setLayout(null);






        //Her price değeri için bir baseLabel oluşturalım(9).Daha sonra labellarda int fiyat * spinnerdeki değer (Object olarak çeviriyor biz bunu inte-
        //çevirmemiz gerekiyor bu sayede ürünün fiyatıyla çarpıp oluşan değeri tekrar stringe çevirip labela yazarız.





        menu.setBounds(10, 10, 850, 720);
        menu.setBackground(new Color(37, 95, 110));
        frame.add(menu, BorderLayout.WEST);
        menu.setLayout(null);//Layoutları kapatıp üzerine gelcek şeylerin konumunu bounds ile kendimiz ayarlıyoruz

        //frame.setLayout(new BorderLayout());
//
//        String images = "Röe_gård_café_2.jpg";
//        ImageIcon icon = new ImageIcon(images);
//        Image imm = icon.getImage();
//        JPanel backgroundPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.drawImage(imm, 0, 0, null);
//            }
//        };
//        frame.setContentPane(backgroundPanel);
//        backgroundPanel.revalidate();



        frame.setSize(1920, 820);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("CAFE MANAGEMENT");
        //frame.setLayout(flows);
        frame.setLayout(new BorderLayout());
        frame.add(buttons, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

