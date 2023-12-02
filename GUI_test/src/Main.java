import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon img = new ImageIcon("C:\\Users\\User\\Downloads\\1.png");
        Border border = BorderFactory.createLineBorder(Color.yellow, 3);

        JFrame frame = new JFrame();

        JLabel label = new JLabel();
        label.setText("Bro, are you a genius?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.white);   //setting font color
        label.setFont(new Font("MV Boli", Font.BOLD, 25));   //setting font style
        label.setIconTextGap(50);//setting gap of text to image
        label.setBackground(new Color(45,28,99)); //setting label color
        label.setOpaque(true); //display background color of the text
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setBounds(250, 0, 500, 500); //set x, y position within frame and dimension
        label.setIcon(img);


        frame.setTitle("First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
//        frame.setSize(420, 420);
//        frame.setResizable(false);
        frame.setVisible(true);
//        frame.setLayout(null); // disabling default settings
        frame.setIconImage(img.getImage()); //changing image icon at the corner
//        frame.getContentPane().setBackground(new Color(0, 0, 45)); //setting background color
        frame.add(label);

        frame.pack();  //can be used only after adding all the features








    }
}