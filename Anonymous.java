import java.awt.event.*;
import java.awt.*;
public class Anonymous{
       public static void main(String ar[]){
          new Thread ( new Runnable(){
              public void run(){
                   System.out.println("Anonymous");
            }
  
                }).start();
                 Button b=new Button("");
				//b.addActionListener(this);
				 b.addActionListener(new ActionListener(){
					 public void actionPerformed(ActionEvent ae){
						 System.out.println("");
					 }
				 });				
        }

    }