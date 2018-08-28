//<applet code="MyApplet" width="600" height="500"></applet>
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MyApplet extends Applet implements ActionListener{
     Label l;
	 TextField tf;
	 Button r,g;
	 public void init(){
	     setLayout(new BorderLayout());
	     //setBackground(Color.gray);
		 Color c=new Color(150,50,100);
		 
		 
	     l=new Label("Selection");
	     tf=new TextField();
         tf.setEditable(false);
         r=new Button("Red");
         g=new Button("Green");
		 tf.setForeground(c);
		 setBackground(c);
		 tf.setBackground(Color.yellow);
		 Font f=new Font("Arial",Font.BOLD,15);
		 tf.setFont(f);
		 g.setFont(f);
		 l.setFont(f);
         // l.setBounds(10,10,80,30);
         // tf.setBounds(120,10,80,30);
         // r.setBounds(10,100,80,30);
         // g.setBounds(120,100,80,30);
		 //r.addActionListener(this);
		 g.addActionListener(this);
         add(l,BorderLayout.NORTH);
         add(tf,BorderLayout.SOUTH);
         add(r,BorderLayout.EAST);
         add(g,BorderLayout.WEST);	 
	 }
	 public void actionPerformed(ActionEvent ae){
		 String a=ae.getActionCommand();
		 tf.setText(a);
		 Object ob=ae.getSource();
		 if(ob==r)
			 setBackground(Color.red);
		 else if (ob==g)
			 setBackground(Color.GREEN);
		 
	 }
}

