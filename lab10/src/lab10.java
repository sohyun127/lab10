import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener{
JPanel p1, p2, p3;
JButton[] buttons1;
JButton[] buttons2;
JTextField tField;


public MyFrame(){
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500, 400);
setTitle("MyCaculator");

p1=new JPanel();
p2=new JPanel();
p3=new JPanel();

p2.setLayout(new GridLayout(1, 3, 10, 10));
p3.setLayout(new GridLayout(4, 6, 10, 10));
tField = new JTextField(20);
tField.setEnabled(false);
tField.setHorizontalAlignment(JTextField.RIGHT);

String[] labels1 = {"Backspace","CE","C"};
String[] labels2 = {"7","8","9","/","sqrt",
		"4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};


buttons1 = new JButton[3];
for (int index=0; index<3; index++) {
buttons1[index] = new JButton(labels1[index]);
buttons1[index].setForeground(Color.red);
p2.add(buttons1[index]);
}

buttons2 = new JButton[20];
for (int index=0; index<20; index++) {
buttons2[index] = new JButton(labels2[index]);
buttons2[index].addActionListener(this);
p3.add(buttons2[index]);
}
buttons2[3].setForeground(Color.red);
buttons2[8].setForeground(Color.red);
buttons2[13].setForeground(Color.red);
buttons2[18].setForeground(Color.red);
buttons2[19].setForeground(Color.red);


add(tField, BorderLayout.NORTH);



p1.add(p2, BorderLayout.CENTER);
p1.add(p3, BorderLayout.SOUTH);
 

add(p1);
setVisible(true);

}


@Override
public void actionPerformed(ActionEvent e) {
	
String actionCommand = e.getActionCommand();
tField.setText(tField.getText()+actionCommand);
	
}
}
public class lab10 {
public static void main(String[] args){
MyFrame f=new MyFrame();
}
}