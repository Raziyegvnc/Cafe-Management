import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {
    JFrame menuFrame;//R
    JLabel menuBaseLabel;
    ImageIcon resim;
    JPanel panel;
    JPanel receiptPanel;
    JButton total;
    JButton receipt;
    JButton reset;
    JLabel menuName;
    JLabel receiptName;

    public Menu() {
        menuFrame = new JFrame("MAIN PAGE");
        menuFrame.setLayout(null);
        menuFrame.setSize(1920, 1080);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //IMAGE
        resim = new ImageIcon(getClass().getResource("Images/chill-jazz-coffee-thumbnai.jpg"));
        menuBaseLabel = new JLabel(resim);
        menuBaseLabel.setBounds(0, 0, 1600, 950);

        //MENU PANEL
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 1000, 700);
        panel.setBackground(new Color(155, 60, 8, 171));
        menuBaseLabel.add(panel);

        //RECEIPT PANEL
        receiptPanel = new JPanel();
        receiptPanel.setLayout(null);
        receiptPanel.setBounds(1050, 10, 450, 764);
        receiptPanel.setBackground(new Color(155, 60, 8, 252));
        menuBaseLabel.add(receiptPanel);

        //TOTAL BUTTON
        total = new JButton("TOTAL");
        total.setBounds(310, 720, 150, 40);
        total.setFont(new Font("Dubai", Font.BOLD, 22));
        total.setForeground(Color.WHITE);
        total.setBackground(new Color(155, 60, 8, 252));
        menuBaseLabel.add(total);

        //RECEIPT BUTTON
        receipt = new JButton("RECEIPT");
        receipt.setBounds(550, 720, 150, 40);
        receipt.setFont(new Font("Dubai", Font.BOLD, 22));
        receipt.setForeground(Color.WHITE);
        receipt.setBackground(new Color(155, 60, 8, 252));
        menuBaseLabel.add(receipt);

        //RESET BUTTON
        reset = new JButton("RESET");
        reset.setBounds(800, 720, 150, 40);
        reset.setFont(new Font("Dubai", Font.BOLD, 22));
        reset.setForeground(Color.WHITE);
        reset.setBackground(new Color(155, 60, 8, 252));
        menuBaseLabel.add(reset);

        //GERİ BUTONU
        JButton backButton = new JButton("BACK");
        backButton.setBounds(50, 720, 150, 40);
        backButton.setFont(new Font("Dubai", Font.BOLD, 22));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(155, 60, 8, 252));
        menuBaseLabel.add(backButton);

        //MENU NAME
        menuName = new JLabel("- - - - - - - - - - -  M  E  N  U  - - - - - - - - - - - - -");
        menuName.setBounds(300, -10, 500, 100);
        menuName.setFont(new Font("Niagara Solid", Font.BOLD, 35));
        menuName.setForeground(Color.WHITE);
        panel.add(menuName);

        //RECEIPT NAME
        receiptName = new JLabel("- - - - - A M E T H Y S T   C A F E - - - - - -");
        receiptName.setBounds(50, -15, 600, 100);
        receiptName.setFont(new Font("Niagara Solid", Font.BOLD, 35));
        receiptName.setForeground(Color.BLACK);
        receiptPanel.add(receiptName);

        //IMAGES 1
        String imgPath = "/Images/image1.png";
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imgPath));
        Image image = imageIcon.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel image1 = new JLabel(new ImageIcon(image));
        image1.setBounds(30, 70, 180, 150);
        panel.add(image1);

        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner = new JSpinner(spinnerModel);
        spinner.setBounds(170, 160, 70, 30);
        panel.add(spinner);

        JLabel labe1 = new JLabel("DOPPIO");
        labe1.setForeground(new Color(255, 255, 255));
        labe1.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe1.setBounds(170, -100, 200, 400);
        panel.add(labe1);

        JLabel imagePrice1 = new JLabel("PRICE : ");
        imagePrice1.setForeground(Color.WHITE);
        imagePrice1.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice1.setBounds(170, -60, 200, 400);
        panel.add(imagePrice1);

        double priceInt1 = 5.95;
        JLabel price1Lab = new JLabel(String.valueOf(priceInt1) + " $");
        price1Lab.setForeground(Color.WHITE);
        price1Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price1Lab.setBounds(250, -260, 400, 800);
        panel.add(price1Lab);

        //IMAGE 2
        String imgPath2 = "/Images/image2.png";
        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource(imgPath2));
        Image image2 = imageIcon2.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen2 = new JLabel(new ImageIcon(image2));
        imagen2.setBounds(30, 240, 180, 150);
        panel.add(imagen2);

        SpinnerModel spinnerModel2 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner2 = new JSpinner(spinnerModel2);
        spinner2.setBounds(170, 330, 70, 30);
        panel.add(spinner2);

        JLabel labe2 = new JLabel("MOCHA");
        labe2.setForeground(new Color(255, 255, 255));
        labe2.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe2.setBounds(170, 70, 200, 400);
        panel.add(labe2);

        JLabel imagePrice2 = new JLabel("PRICE : ");
        imagePrice2.setForeground(Color.WHITE);
        imagePrice2.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice2.setBounds(170, 110, 200, 400);
        panel.add(imagePrice2);

        double priceInt2 = 8.95;
        JLabel price2Lab = new JLabel(String.valueOf(priceInt2) + " $");
        price2Lab.setForeground(Color.WHITE);
        price2Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price2Lab.setBounds(250, -90, 400, 800);
        panel.add(price2Lab);

        //IMAGE 3
        String imgPath3 = "/Images/image3.png";
        ImageIcon imageIcon3 = new ImageIcon(getClass().getResource(imgPath3));
        Image image3 = imageIcon3.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen3 = new JLabel(new ImageIcon(image3));
        imagen3.setBounds(30, 410, 180, 150);
        panel.add(imagen3);

        SpinnerModel spinnerModel3 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner3 = new JSpinner(spinnerModel3);
        spinner3.setBounds(170, 500, 70, 30);
        panel.add(spinner3);

        JLabel labe3 = new JLabel("MACCHIATO");
        labe3.setForeground(new Color(255, 255, 255));
        labe3.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe3.setBounds(170, 240, 550, 400);
        panel.add(labe3);

        JLabel imagePrice3 = new JLabel("PRICE : ");
        imagePrice3.setForeground(Color.WHITE);
        imagePrice3.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice3.setBounds(170, 280, 200, 400);
        panel.add(imagePrice3);

        double priceInt3 = 9.99;
        JLabel price3Lab = new JLabel(String.valueOf(priceInt3) + " $");
        price3Lab.setForeground(Color.WHITE);
        price3Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price3Lab.setBounds(250, 80, 400, 800);
        panel.add(price3Lab);

        //IMAGE 4
        String imgPath4 = "/Images/image4.png";
        ImageIcon imageIcon4 = new ImageIcon(getClass().getResource(imgPath4));
        Image image4 = imageIcon4.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen4 = new JLabel(new ImageIcon(image4));
        imagen4.setBounds(330, 70, 180, 150);
        panel.add(imagen4);

        SpinnerModel spinnerModel4 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner4 = new JSpinner(spinnerModel4);
        spinner4.setBounds(470, 160, 70, 30);
        panel.add(spinner4);

        JLabel labe4 = new JLabel("CAPPUCCINO");
        labe4.setForeground(new Color(255, 255, 255));
        labe4.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe4.setBounds(470, -100, 550, 400);
        panel.add(labe4);

        JLabel imagePrice4 = new JLabel("PRICE : ");
        imagePrice4.setForeground(Color.WHITE);
        imagePrice4.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice4.setBounds(470, -60, 350, 400);
        panel.add(imagePrice4);

        double priceInt4 = 5.99;
        JLabel price4Lab = new JLabel(String.valueOf(priceInt4) + " $");
        price4Lab.setForeground(Color.WHITE);
        price4Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price4Lab.setBounds(550, -260, 400, 800);
        panel.add(price4Lab);

        //IMAGE 5
        String imgPath5 = "/Images/image5.png";
        ImageIcon imageIcon5 = new ImageIcon(getClass().getResource(imgPath5));
        Image image5 = imageIcon5.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen5 = new JLabel(new ImageIcon(image5));
        imagen5.setBounds(330, 240, 180, 150);
        panel.add(imagen5);

        SpinnerModel spinnerModel5 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner5 = new JSpinner(spinnerModel5);
        spinner5.setBounds(470, 330, 70, 30);
        panel.add(spinner5);

        JLabel labe5 = new JLabel("FRAPPE");
        labe5.setForeground(Color.WHITE);
        labe5.setFont(new Font(" Elephant", Font.BOLD, 20));
        labe5.setBounds(470, 70, 250, 400);
        panel.add(labe5);

        JLabel imagePrice5 = new JLabel("PRICE : ");
        imagePrice5.setForeground(Color.WHITE);
        imagePrice5.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice5.setBounds(470, 110, 200, 400);
        panel.add(imagePrice5);

        double priceInt5 = 5.5;
        JLabel price5Lab = new JLabel(String.valueOf(priceInt5) + " $");
        price5Lab.setForeground(Color.WHITE);
        price5Lab.setFont(new Font("Engravers MT ", Font.BOLD, 20));
        price5Lab.setBounds(550, -90, 400, 800);
        panel.add(price5Lab);

        //IMAGE 6
        String imgPath6 = "/Images/image6.png";
        ImageIcon imageIcon6 = new ImageIcon(getClass().getResource(imgPath6));
        Image image6 = imageIcon6.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen6 = new JLabel(new ImageIcon(image6));
        imagen6.setBounds(330, 450, 180, 150);
        panel.add(imagen6);

        SpinnerModel spinnerModel6 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner6 = new JSpinner(spinnerModel6);
        spinner6.setBounds(470, 500, 70, 30);
        panel.add(spinner6);

        JLabel labe6 = new JLabel("IRISH ");
        labe6.setForeground(new Color(255, 255, 255));
        labe6.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe6.setBounds(470, 240, 280, 400);
        panel.add(labe6);

        JLabel imagePrice6 = new JLabel("PRICE : ");
        imagePrice6.setForeground(Color.WHITE);
        imagePrice6.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice6.setBounds(470, 280, 200, 400);
        panel.add(imagePrice6);

        int priceInt6 = 10;
        JLabel price6Lab = new JLabel(String.valueOf(priceInt6) + " $");
        price6Lab.setForeground(Color.WHITE);
        price6Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price6Lab.setBounds(550, 80, 400, 800);
        panel.add(price6Lab);

        //IMAGE 7
        String imgPath7 = "/Images/image7.png";
        ImageIcon imageIcon7 = new ImageIcon(getClass().getResource(imgPath7));
        Image image7 = imageIcon7.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen7 = new JLabel(new ImageIcon(image7));
        imagen7.setBounds(630, 70, 180, 150);
        panel.add(imagen7);

        SpinnerModel spinnerModel7 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner7 = new JSpinner(spinnerModel7);
        spinner7.setBounds(770, 160, 70, 30);
        panel.add(spinner7);

        JLabel labe7 = new JLabel("AMERICANO");
        labe7.setForeground(new Color(255, 255, 255));
        labe7.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe7.setBounds(770, -100, 570, 400);
        panel.add(labe7);

        JLabel imagePrice7 = new JLabel("PRICE : ");
        imagePrice7.setForeground(Color.WHITE);
        imagePrice7.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice7.setBounds(770, -60, 200, 400);
        panel.add(imagePrice7);

        double priceInt7 = 7.55;
        JLabel price7Lab = new JLabel(String.valueOf(priceInt7) + " $");
        price7Lab.setForeground(Color.WHITE);
        price7Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price7Lab.setBounds(850, -260, 400, 800);
        panel.add(price7Lab);

        //IMAGE 8
        String imgPath8 = "/Images/image8.png";
        ImageIcon imageIcon8 = new ImageIcon(getClass().getResource(imgPath8));
        Image image8 = imageIcon8.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen8 = new JLabel(new ImageIcon(image8));
        imagen8.setBounds(630, 240, 180, 150);
        panel.add(imagen8);

        SpinnerModel spinnerModel8 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner8 = new JSpinner(spinnerModel8);
        spinner8.setBounds(770, 330, 70, 30);
        panel.add(spinner8);

        JLabel labe8 = new JLabel("LATTE");
        labe8.setForeground(Color.WHITE);
        labe8.setFont(new Font(" Algerian", Font.BOLD, 20));
        labe8.setBounds(770, 70, 200, 400);
        panel.add(labe8);

        JLabel imagePrice8 = new JLabel("PRICE : ");
        imagePrice8.setForeground(Color.WHITE);
        imagePrice8.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice8.setBounds(770, 110, 200, 400);
        panel.add(imagePrice8);

        double priceInt8 = 5.80;
        JLabel price8Lab = new JLabel(String.valueOf(priceInt8) + " $");
        price8Lab.setForeground(Color.WHITE);
        price8Lab.setFont(new Font("Engravers MT ", Font.BOLD, 20));
        price8Lab.setBounds(850, -90, 400, 800);
        panel.add(price8Lab);

        //IMAGE 9
        String imgPath9 = "/Images/image9.png";
        ImageIcon imageIcon9 = new ImageIcon(getClass().getResource(imgPath9));
        Image image9 = imageIcon9.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel imagen9 = new JLabel(new ImageIcon(image9));
        imagen9.setBounds(630, 410, 180, 150);
        panel.add(imagen9);

        SpinnerModel spinnerModel9 = new SpinnerNumberModel(0, 0, 25, 1);
        JSpinner spinner9 = new JSpinner(spinnerModel9);
        spinner9.setBounds(770, 500, 70, 30);
        panel.add(spinner9);

        JLabel labe9 = new JLabel("EXPRESSO");
        labe9.setForeground(new Color(255, 255, 255));
        labe9.setFont(new Font("Elephant ", Font.BOLD, 20));
        labe9.setBounds(770, 240, 300, 400);
        panel.add(labe9);

        JLabel imagePrice9 = new JLabel("PRICE : ");
        imagePrice9.setForeground(Color.WHITE);
        imagePrice9.setFont(new Font("Algerian", Font.BOLD, 20));
        imagePrice9.setBounds(770, 280, 200, 400);
        panel.add(imagePrice9);

        double priceInt9 = 9.99;
        JLabel price9Lab = new JLabel(String.valueOf(priceInt9) + " $");
        price9Lab.setForeground(Color.WHITE);
        price9Lab.setFont(new Font("Engravers MT", Font.BOLD, 20));
        price9Lab.setBounds(850, 80, 400, 800);
        panel.add(price9Lab);

        //RECEIPT TASARIMI
        JLabel receiptNo = new JLabel("RECEIPT NO : ");
        receiptNo.setForeground(Color.BLACK);
        receiptNo.setFont(new Font("Niagara Solid", Font.BOLD, 25));
        receiptNo.setBounds(20, 60, 200, 50);
        receiptPanel.add(receiptNo);

        JLabel receiptNonunki = new JLabel("200315075 ");
        receiptNonunki.setForeground(Color.WHITE);
        receiptNonunki.setFont(new Font("Niagara Solid", Font.PLAIN, 23));
        receiptNonunki.setBounds(105, 61, 200, 50);
        receiptPanel.add(receiptNonunki);

        JLabel date = new JLabel("DATE : ");
        date.setForeground(Color.BLACK);
        date.setFont(new Font("Niagara Solid", Font.BOLD, 25));
        date.setBounds(200, 60, 200, 50);
        receiptPanel.add(date);

        JLabel actualDateLabel = new JLabel();
        actualDateLabel.setForeground(Color.WHITE);
        actualDateLabel.setFont(new Font("Niagara Solid", Font.PLAIN, 27));
        actualDateLabel.setBounds(245, 60, 100, 50); // Panel içindeki konum ve boyut ayarlandı
        receiptPanel.add(actualDateLabel);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String currentDate = sdf.format(new Date());
        actualDateLabel.setText(currentDate);

        JLabel time = new JLabel("TIME : ");
        time.setForeground(Color.BLACK);
        time.setFont(new Font("Niagara Solid", Font.BOLD, 25));
        time.setBounds(350, 60, 200, 50);
        receiptPanel.add(time);

        JLabel actualTimeLabel = new JLabel();
        actualTimeLabel.setForeground(Color.WHITE);
        actualTimeLabel.setFont(new Font("Niagara Solid", Font.PLAIN, 27));
        actualTimeLabel.setBounds(400, 60, 150, 50);
        receiptPanel.add(actualTimeLabel);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String currentTime = timeFormat.format(new Date());
        actualTimeLabel.setText(currentTime);

        JPanel listOf = new JPanel();
        listOf.setLayout(null);
        listOf.setBounds(15, 130, 418, 30);
        listOf.setBackground(new Color(245, 112, 8, 144));
        receiptPanel.add(listOf);

        //Panellerin Başlıkları
        JLabel listName = new JLabel(" List Of Items");
        listName.setBounds(2, 4, 200, 30);
        listName.setForeground(Color.WHITE);
        listName.setFont(new Font("Dubai", Font.BOLD, 20));
        listOf.add(listName);

        JLabel quantity = new JLabel(" Quantity");
        quantity.setBounds(175, 4, 200, 30);
        quantity.setForeground(Color.WHITE);
        quantity.setFont(new Font("Dubai", Font.BOLD, 20));
        listOf.add(quantity);

        JLabel amount = new JLabel(" Amount");
        amount.setBounds(320, 4, 200, 30);
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("Dubai", Font.BOLD, 20));
        listOf.add(amount);

        //Seçilen ürünlerin yazılacağı paneller
        JPanel chosenList = new JPanel();
        chosenList.setLayout(new BoxLayout(chosenList, BoxLayout.Y_AXIS));
        chosenList.setBounds(15, 172, 180, 400);
        chosenList.setBackground(new Color(255, 255, 255, 255));
        receiptPanel.add(chosenList);

        JPanel quantityList = new JPanel();
        quantityList.setLayout(new BoxLayout(quantityList, BoxLayout.Y_AXIS));
        quantityList.setBounds(185, 172, 140, 400);
        quantityList.setBackground(new Color(255, 255, 255, 255));
        receiptPanel.add(quantityList);

        JPanel amountList = new JPanel();
        amountList.setLayout(new BoxLayout(amountList, BoxLayout.Y_AXIS));
        amountList.setBounds(325, 172, 110, 400);
        amountList.setBackground(new Color(255, 255, 255, 255));
        receiptPanel.add(amountList);

        //Panellere yazılacak şeyler
        JLabel firstLabel = new JLabel("     " + labe1.getText());//Bu labe1 değişkenini başka bir label a eşitledik yoksa diğer labe1 değerini değiştirdiği için bozuyor.
        JLabel firstLabel2 = new JLabel();
        JLabel firstLabel3 = new JLabel();

        JLabel secondLabel = new JLabel("     " + labe2.getText());
        JLabel secondLabel2 = new JLabel();
        JLabel secondLabel3 = new JLabel();

        JLabel thirdLabel = new JLabel("     " + labe3.getText());
        JLabel thirdLabel2 = new JLabel();
        JLabel thirdLabel3 = new JLabel();

        JLabel fourthLabel = new JLabel("     " + labe4.getText());
        JLabel fourthLabel2 = new JLabel();
        JLabel fourthLabel3 = new JLabel();

        JLabel fifthLabel = new JLabel("     " + labe5.getText());
        JLabel fifthLabel2 = new JLabel();
        JLabel fifthLabel3 = new JLabel();

        JLabel sixthLabel = new JLabel("     " + labe6.getText());
        JLabel sixthLabel2 = new JLabel();
        JLabel sixthLabel3 = new JLabel();

        JLabel seventhLabel = new JLabel("     " + labe7.getText());
        JLabel seventhLabel2 = new JLabel();
        JLabel seventhLabel3 = new JLabel();

        JLabel eighthLabel = new JLabel("     " + labe8.getText());
        JLabel eighthLabel2 = new JLabel();
        JLabel eighthLabel3 = new JLabel();

        JLabel ninthLabel = new JLabel("     " + labe9.getText());
        JLabel ninthLabel2 = new JLabel();
        JLabel ninthLabel3 = new JLabel();

        JPanel fiyatlar = new JPanel();
        fiyatlar.setLayout(null);
        fiyatlar.setBackground(new Color(208, 96, 8, 255));
        fiyatlar.setBounds(165, 584, 270, 150);
        receiptPanel.add(fiyatlar);

        JLabel totalAmount = new JLabel("TOTAL Amount: ");
        totalAmount.setBounds(3, 20, 200, 10);
        totalAmount.setForeground(Color.BLACK);
        totalAmount.setFont(new Font("Algerian", Font.BOLD, 15));
        fiyatlar.add(totalAmount);

        JLabel kdv = new JLabel("VAT Breakdown: ");
        kdv.setBounds(3, 70, 200, 10);
        kdv.setForeground(Color.BLACK);
        kdv.setFont(new Font("Algerian", Font.BOLD, 15));
        fiyatlar.add(kdv);

        JLabel netAmount = new JLabel("NET Amount: ");
        netAmount.setBounds(3, 120, 200, 10);
        netAmount.setForeground(Color.WHITE);
        netAmount.setFont(new Font("Algerian", Font.BOLD, 15));
        fiyatlar.add(netAmount);

        //RECEIPT BUTONU
        receipt.addActionListener(e -> {

            int spinnerValue = (Integer) spinner.getValue();
            double amountValue = spinnerValue * priceInt1;
            String formatted = String.format("%2f", amountValue);//Sadece noktadan sonraki iki basamağı alıyor

            int spinnerValue2 = (Integer) spinner2.getValue();
            double amountValue2 = spinnerValue2 * priceInt2;
            String formatted2 = String.format("%2f", amountValue2);

            int spinnerValue3 = (Integer) spinner3.getValue();
            double amountValue3 = spinnerValue3 * priceInt3;
            String formatted3 = String.format("%2f", amountValue3);

            int spinnerValue4 = (Integer) spinner4.getValue();
            double amountValue4 = spinnerValue4 * priceInt4;
            String formatted4 = String.format("%2f", amountValue4);

            int spinnerValue5 = (Integer) spinner5.getValue();
            double amountValue5 = spinnerValue5 * priceInt5;
            String formatted5 = String.format("%2f", amountValue5);

            int spinnerValue6 = (Integer) spinner6.getValue();
            double amountValue6 = spinnerValue6 * priceInt6;
            String formatted6 = String.format("%2f", amountValue6);

            int spinnerValue7 = (Integer) spinner7.getValue();
            double amountValue7 = spinnerValue7 * priceInt7;
            String formatted7 = String.format("%2f", amountValue7);

            int spinnerValue8 = (Integer) spinner8.getValue();
            double amountValue8 = spinnerValue8 * priceInt8;
            String formatted8 = String.format("%2f", amountValue8);

            int spinnerValue9 = (Integer) spinner9.getValue();
            double amountValue9 = spinnerValue9 * priceInt9;
            String formatted9 = String.format("%2f", amountValue9);

            JLabel[] labels = {firstLabel, secondLabel, thirdLabel, fourthLabel, fifthLabel, sixthLabel, seventhLabel, eighthLabel, ninthLabel};
            JLabel[] quantityLabels = {firstLabel2, secondLabel2, thirdLabel2, fourthLabel2, fifthLabel2, sixthLabel2, seventhLabel2, eighthLabel2, ninthLabel2};
            JLabel[] amountLabels = {firstLabel3, secondLabel3, thirdLabel3, fourthLabel3, fifthLabel3, sixthLabel3, seventhLabel3, eighthLabel3, ninthLabel3};
            JSpinner[] spinners = {spinner, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9};
            double[] replace = {priceInt1, priceInt2, priceInt3, priceInt4, priceInt5, priceInt6, priceInt7, priceInt8, priceInt9};

            double totalin = 0.0;

            quantityLabels[0].setText("         " + spinnerValue);
            quantityLabels[1].setText("         " + spinnerValue2);
            quantityLabels[2].setText("         " + spinnerValue3);
            quantityLabels[3].setText("         " + spinnerValue4);
            quantityLabels[4].setText("         " + spinnerValue5);
            quantityLabels[5].setText("         " + spinnerValue6);
            quantityLabels[6].setText("         " + spinnerValue7);
            quantityLabels[7].setText("         " + spinnerValue8);
            quantityLabels[8].setText("         " + spinnerValue9);

            amountLabels[0].setText("       " + formatted + " $");
            amountLabels[1].setText("       " + formatted2 + " $");
            amountLabels[2].setText("       " + formatted3 + " $");
            amountLabels[3].setText("       " + formatted4 + " $");
            amountLabels[4].setText("       " + formatted5 + " $");
            amountLabels[5].setText("       " + formatted6 + " $");
            amountLabels[6].setText("       " + formatted7 + " $");
            amountLabels[7].setText("       " + formatted8 + " $");
            amountLabels[8].setText("       " + formatted9 + " $");

            for (int i = 0; i < amountLabels.length; i++) {
                amountLabels[i].setForeground(new Color(0, 0, 0));
                amountLabels[i].setMaximumSize(new Dimension(100, 30));
                amountLabels[i].setPreferredSize(new Dimension(100, 30));
                amountLabels[i].setFont(new Font("Dubai", Font.ITALIC, 15));

                quantityLabels[i].setForeground(new Color(0, 0, 0));
                quantityLabels[i].setMaximumSize(new Dimension(100, 30));
                quantityLabels[i].setPreferredSize(new Dimension(100, 30));
                quantityLabels[i].setFont(new Font("Dubai", Font.ITALIC, 15));

                labels[i].setForeground(new Color(0, 0, 0));
                labels[i].setFont(new Font("Dubai", Font.ITALIC, 15));
                labels[i].setMaximumSize(new Dimension(100, 30));
                labels[i].setPreferredSize(new Dimension(120, 30));
            }

            int spinnersValues = 0;

            for (int i = 0; i < spinners.length; i++) {
                spinnersValues = (Integer) spinners[i].getValue();
                double amountsValues = spinnersValues * replace[i];
                totalin += amountsValues;

                if (spinnersValues > 0) {
                    chosenList.add(labels[i]);
                    quantityList.add(quantityLabels[i]);
                    amountList.add(amountLabels[i]);
                } else {
                    chosenList.remove(labels[i]);
                    quantityList.remove(quantityLabels[i]);
                    amountList.remove(amountLabels[i]);
                }
            }
            chosenList.revalidate();
            chosenList.repaint();
            quantityList.revalidate();
            quantityList.repaint();
            amountList.revalidate();
            amountList.repaint();
        });
        JLabel totalAmount1 = new JLabel();
        JLabel totalAmount2 = new JLabel();
        JLabel totalAmount3 = new JLabel();

        //TOTAL BUTTON
        total.addActionListener(e -> {
            double toplam = priceInt1 * Integer.parseInt(spinner.getValue().toString())
                    + priceInt2 * Integer.parseInt(spinner2.getValue().toString())
                    + priceInt3 * Integer.parseInt(spinner3.getValue().toString())
                    + priceInt4 * Integer.parseInt(spinner4.getValue().toString())
                    + priceInt5 * Integer.parseInt(spinner5.getValue().toString())
                    + priceInt6 * Integer.parseInt(spinner6.getValue().toString())
                    + priceInt7 * Integer.parseInt(spinner7.getValue().toString())
                    + priceInt8 * Integer.parseInt(spinner8.getValue().toString())
                    + priceInt9 * Integer.parseInt(spinner9.getValue().toString());

            if (toplam == 0) {
                JOptionPane.showMessageDialog(null, "You have not chosen anything.", "WARNING", JOptionPane.WARNING_MESSAGE);
                fiyatlar.removeAll();
            } else {
                totalAmount1.setText(String.valueOf(toplam) + " $");
                totalAmount1.setForeground(new Color(0, 0, 0, 255));
                totalAmount1.setMaximumSize(new Dimension(100, 30));
                totalAmount1.setFont(new Font("Dubai", Font.ITALIC, 20));
                totalAmount1.setBounds(160, 3, 120, 40);
                totalAmount1.setBackground(new Color(208, 96, 8, 255));
                fiyatlar.add(totalAmount1);
                totalAmount1.setOpaque(true);
                totalAmount1.repaint();

                double kdvFiyat = 4.96;

                totalAmount2.setText(String.valueOf(kdvFiyat) + " $");
                totalAmount2.setForeground(new Color(0, 0, 0, 255));
                totalAmount2.setMaximumSize(new Dimension(100, 30));
                totalAmount2.setFont(new Font("Dubai", Font.ITALIC, 20));
                totalAmount2.setBounds(160, 55, 90, 40);
                totalAmount2.setBackground(new Color(208, 96, 8, 255));
                fiyatlar.add(totalAmount2);
                totalAmount2.setOpaque(true);
                totalAmount2.repaint();

                totalAmount3.setText(String.valueOf(kdvFiyat + toplam) + " $");
                totalAmount3.setForeground(new Color(0, 0, 0, 255));
                totalAmount3.setMaximumSize(new Dimension(100, 30));
                totalAmount3.setFont(new Font("Dubai", Font.ITALIC, 20));
                totalAmount3.setBounds(160, 105, 120, 40);
                totalAmount3.setBackground(new Color(208, 96, 8, 255));
                fiyatlar.add(totalAmount3);
                totalAmount3.setOpaque(true);
                totalAmount3.repaint();
            }
        });

        //RESET BUTTON
        reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                spinner.setValue(0);
                spinner2.setValue(0);
                spinner3.setValue(0);
                spinner4.setValue(0);
                spinner5.setValue(0);
                spinner6.setValue(0);
                spinner7.setValue(0);
                spinner8.setValue(0);
                spinner9.setValue(0);

                totalAmount1.setText("");
                totalAmount2.setText("");
                totalAmount3.setText("");
            }
        });

        //BACK BUTONUNUN İŞLEMLERİ
        backButton.addActionListener(e -> {

            LoginFrame loginFrame = null;
            try {
                loginFrame = new LoginFrame();
            } catch (FontFormatException ex) {
                throw new RuntimeException(ex);
            }
            loginFrame.loginFrame.setVisible(true);
            menuFrame.setVisible(false);
        });

        //MENU PANELİNDE GÖZÜKECEK EKSTRA
        JLabel exstra = new JLabel("HAVE A GOOD MEAL ");
        exstra.setForeground(new Color(0, 0, 0));
        exstra.setBounds(310, 580, 500, 100);
        exstra.setFont(new Font("Niagara Solid", Font.BOLD, 80));
        panel.add(exstra);

        String amblem = "Images/cafe-icon-png-0.jpg";
        ImageIcon ambIcon = new ImageIcon(getClass().getResource(amblem));
        Image amb = ambIcon.getImage().getScaledInstance(100, 125, Image.SCALE_SMOOTH);
        JLabel amblemResmi = new JLabel(new ImageIcon(amb));
        amblemResmi.setBounds(1, 570, 150, 160);
        receiptPanel.add(amblemResmi);


        menuFrame.add(menuBaseLabel);
        menuFrame.setVisible(true);
    }

}
