import javax.swing.*;
public class SwingApp{
 SwingApp(){
    JFrame f = new JFrame();

    JLabel Firstname = new JLabel("First Name");
    Firstname.setBounds(50,50,100,20);

    JLabel Lastname = new JLabel("Last Name");
    Lastname.setBounds(50,100,100,20);

    JTextField Firstnametf = new JTextField();
    Firstnametf.setBounds(150,50,100,20);

    JTextField Lastnametf = new JTextField();
    Lastnametf.setBounds(150,100,100,20);

    JButton submit = new JButton("Submit");
    submit.setBounds(50,150,100,20);

    
    JButton reset = new JButton("Reset");
    reset.setBounds(200,150,100,20);

    f.add(Firstname);
    f.add(Lastname);
    f.add(Firstnametf);
    f.add(Lastnametf);
    f.add(submit);
    f.add(reset);

    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);

 }  
 public static void main(String[] args){
 SwingApp s = new SwingApp();
 }
}