package eventhandling;

 

import java.awt.*;  
import java.awt.event.*;  
class handing{  
 
public static void main(String args[])
{  
Frame f=new Frame("\tRegistration Page");
TextField tf,tf1,tf2;  
Label l,l1,l2;
l =new  Label  ("first textbox");
l1=new Label ("second textbox");
l2=new Label ("third textbox");
l.setBounds(35,60,170,20);
l1.setBounds(15,100,170,20);
l2.setBounds(30,140,170,20);
tf=new TextField(); 
tf.setBounds(100,60,170,20);
tf1=new TextField();  
tf1.setBounds(100,100,170,20);
tf2=new TextField();  
tf2.setBounds(100,140,170,20);
Button b=new Button("Submit");  
b.setBounds(140,180,80,30);    
b.addActionListener(new ActionListener()
        {
public void actionPerformed(ActionEvent e)
{  
tf.setText("Textbox1");  
tf1.setText("Textbox2");
tf2.setText("Textbox3");
}  }); 
f.add(b);
f.add(tf);  
f.add(tf1); 
f.add(tf2);
f.add(l);
f.add(l1);
f.add(l2);
f.setSize(600,600);  
f.setLayout(null);  
f.setVisible(true);  
}  
} 