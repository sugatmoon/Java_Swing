import javax.swing.*;
public class javaConstructor {
       JFrame j;
       javaConstructor(){
           j = new JFrame();
           JButton b = new JButton("Sugat");
           b.setBounds(130,100,100,40);
           j.add(b);
           j.setSize(400,500);
           j.setLayout(null);
           j.setVisible(true);
       }

    public static void main(String[] args) {
        new javaConstructor();
    }
    }
