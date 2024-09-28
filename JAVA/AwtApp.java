import java.awt.*;
public class  AwtApp extends Frame{
 AwtApp(){
   

    Label Firstname = new Label("First Name");
    Firstname.setBounds(50,50,100,20);

    Label Lastname = new Label("Last Name");
    Lastname.setBounds(50,100,100,20);

    TextField Firstnametf = new TextField();
    Firstnametf.setBounds(150,50,100,20);

    TextField Lastnametf = new TextField();
    Lastnametf.setBounds(150,100,100,20);

    Button submit = new Button("Submit");
    submit.setBounds(50,150,100,20);

    
    Button reset = new Button("Reset");
    reset.setBounds(200,150,100,20);

    add(Firstname);
    add(Lastname);
    add(Firstnametf);
    add(Lastnametf);
    add(submit);
    add(reset);

    setSize(500,500);
    setLayout(null);
    setVisible(true);

 }  
 public static void main(String[] args){
   AwtApp a = new AwtApp();
 }
}