import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class student extends Frame
{
  Label tf = new Label();
  student() 
  {
    Frame f = new Frame(); 
    Label l1 = new Label("Name  :");
    Label l2 = new Label("Roll no  :");
    Label l3 = new Label("Course  :");
    Label l4 = new Label("Gender  :");
    Label l5 = new Label("Class  :");
    Label l6 = new Label("Address  :");
    
    Button b = new Button("SUBMIT");
    
    TextField t1 = new TextField(); 
    TextField t2 = new TextField();
    TextField t5 = new TextField();
    TextField t6 = new TextField();
    tf.setBounds(200, 320, 150, 30);
    l1.setBounds(20, 80, 80, 30);  
    t1.setBounds(100, 80, 200, 30);
    l2.setBounds(20, 120, 80, 30);  
    t2.setBounds(100, 120, 200, 30); 
    l3.setBounds(20, 160, 80, 30); 
    l4.setBounds(20, 200, 80, 30); 
    l5.setBounds(20, 240, 80, 30); 
    l6.setBounds(20, 280, 80, 30); 
    t5.setBounds(100, 240, 200, 30);
    t6.setBounds(100, 280, 200, 30);
    
    CheckboxGroup genderGroup = new CheckboxGroup();
    Checkbox rb1 = new Checkbox("Male", false, genderGroup);
    Checkbox rb2 = new Checkbox("Female", false, genderGroup);
    rb1.setBounds(100, 200, 80, 30);
    rb2.setBounds(200, 200, 80, 30);
    
    Checkbox cb1= new Checkbox("JAVA");
    Checkbox cb2= new Checkbox("PYTHON");
    Checkbox cb3= new Checkbox("HTML");
    Checkbox cb4= new Checkbox("CSS");   
    cb1.setBounds(100, 160, 80, 30);
    cb2.setBounds(200, 160, 80, 30);
    cb3.setBounds(300, 160, 80, 30);
    cb4.setBounds(400, 160, 80, 30);
    
    
        Font font = new Font("Arial", Font.PLAIN, 17);

        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);
        l6.setFont(font);

        t1.setFont(font);
        t2.setFont(font);
        t5.setFont(font);
        t6.setFont(font);
    
      f.add(l1);  
      f.add(t1);
      f.add(l2);
      f.add(l3);
      f.add(l4);
      f.add(l5);
      f.add(l6);
      f.add(t2);
      f.add(t5);
      f.add(t6);
      //f.add(tf);
      f.add(cb1);
      f.add(cb2);
      f.add(cb3);
      f.add(cb4);
      f.add(rb1);
      f.add(rb2);
      b.setBounds(100, 320, 80, 30);  
      b.setBackground(Color.green);
      f.add(b);
      f.setBackground(Color.pink);
      
      b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySuccessMessage();
            }
        });    
 /*        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){  
      tf.setText("Submitted successfully!");  
}
        }); */
      f.setSize(500,400);
      f.setTitle("STUDENT");
      f.setLayout(null); 
      f.setVisible(true);
      } 
      
      
  private void displaySuccessMessage() {
        JOptionPane.showMessageDialog(this, "Submitted successfully!");
  }  
  public static void main(String args[]) { 
  student s = new student();
  }
}
