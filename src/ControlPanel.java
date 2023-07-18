import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControlPanel extends JFrame {
    JFrame signs = new JFrame("Image Background Example");
    ImageIcon carIcon ;
    JLabel labs;
    JButton but;

    //JFrame myFrame = new JFrame("ORNEK");


    JPanel panels = new JPanel();
    JTextField temail = new JTextField(30);
    JTextField tpassword = new JTextField(30);
    JLabel lb1 = new JLabel("E mail: ");
    JLabel lb2 = new JLabel("Your Password: ");
    JButton sign = new JButton("SIGN UP");//Kayıt olma tuşu
    JPanel panel = new JPanel();
    //{
//        @Override
//        protected void paintComponent(Graphics g){
//            super.paintComponent(g);
//            Image image = new ImageIcon("/mellow-lane-thumb.jpg").getImage();
//            g.drawImage(image , 0,0,null);
//        }
//    };
    JTextField t1 = new JTextField(15);
    JTextField t2 = new JTextField(15);
    JLabel email = new JLabel("Email: ");
    JLabel password = new JLabel("Password:");
    JButton send = new JButton("LOG İN");
    Image img = Toolkit.getDefaultToolkit().getImage("mellow-lane-thumb.jpg");
    public void SwingDemo() throws IOException {
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, null);
            }
        });
        pack();
        setVisible(true);}
    public ControlPanel() {
        // FlowLayout flow = new FlowLayout();
        // panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
       // JLabel lab = new JLabel();
        panel.setSize(1920,1080);
       // panel.setBackground(new Color(37, 95, 110));

carIcon = new ImageIcon(this.getClass().getResource("/mellow-lane-thumb.jpg"));
labs = new JLabel(carIcon);
labs.setSize(658,450);
but = new JButton("Hi");
but.setBounds(50,50,160,50);
labs.add(but);

//            JPanel panel = new JPanel() {
//                @Override
//                protected void paintComponent(Graphics g) {
//                    // Resmi arka plan olarak çiz
//                    Image backgroundImage = new ImageIcon("mellow-lane-thumb.jpg").getImage();
//                    g.drawImage(backgroundImage, 0, 0, null);
//                }
//            };

//        myFrame.add(panel);
//        myFrame.setVisible(true);


//        String i4 = "/mellow-lane-thumb.jpg";
//        ImageIcon con4 = new ImageIcon(getClass().getResource(i4));
//        Image image4 = con4.getImage().getScaledInstance(800, 600, Image.SCALE_FAST);
//        JLabel lab4 = new JLabel(new ImageIcon(image4));
//        lab4.setBounds(0, 0, 1920, 1080);
//        panel.add(lab4);
      //  panel.setComponentZOrder(lab4, 0);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.anchor = GridBagConstraints.CENTER; // Bileşenleri ortalamak için
        constraints.fill = GridBagConstraints.HORIZONTAL; // Bileşenlerin yatayda genişlemesini sağlamak için

        panel.add(email, constraints);

        constraints.gridy = 1;
        panel.add(t1, constraints);

        constraints.gridy = 2;
        panel.add(password, constraints);

        constraints.gridy = 3;
        panel.add(t2, constraints);

        constraints.gridy = 4;
        panel.add(sign, constraints);

        constraints.gridy = 5;
        panel.add(send, constraints);

//        panel.add(email);
//        panel.add(t1);
//        panel.add(password);
//        panel.add(t2);
//        panel.add(sign);
//        panel.add(send);
//        panel.add(Box.createVerticalGlue());

        ButtonListener listener = new ButtonListener(t1,t2,this);
        send.addActionListener(listener);
        sign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panels.setBackground(new Color(70,100,100));
                panels.add(lb1);
                panels.add(temail);
                panels.add(lb2);
                panels.add(tpassword);
                panels.setBackground(new Color(70,100,100));
                panels.add(lb1);
                panels.add(temail);
                panels.add(lb2);
                panels.add(tpassword);
                signs.setSize(1920,1080);
                signs.getContentPane().add(panels);
                signs.setLocationRelativeTo(null);
                signs.setVisible(true);

                System.out.println("Email : " + temail.getText());
                System.out.println("Password : " + tpassword.getText());
            }
        });
        add(labs);
    }
    public void closeWindow(){
        setVisible(false);
}
        //public void SignPanel(){

        }
// iki frameede backgroundda renk yerine resim ata