import java.awt.*;
import java.awt.event.*;
//odd and even number button event handling

class GUI extends Frame implements ActionListener
{
 Button b;
 TextField t1,t2;
 public GUI()
 {
     setSize(400,500);
     t1= new TextField();
     t1.setBounds(100,100,50,30);
     t2=new TextField();
    t2.setBounds(100,200,50,30);
    b=new Button("click");
     b.setBounds(100,300,70,30);
     add(t1);
     add(t2);
     add(b);
     t2.setEditable(false);
     setLayout(null);
     setVisible(true);
     b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
     int num=Integer.parseInt(t1.getText());
if(num%2==0)
{
    t2.setText("even");
}
else{
    t2.setText("odd");
}
}
public static void main(String[]args)
{
 new GUI();
}
}