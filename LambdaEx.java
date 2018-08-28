import java.awt.*;
import java.awt.event.*;
public class LambdaEx{
	public static void main(String ar[]){
		new Thread(new Runnable(){
			public void run(){
				System.out.println("Thread before 8");
			}
		}).start();
		new Thread(()->System.out.println("Since 8")).start();
		Button b=new Button("B");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.out.println("Abc");
			}
		});
		b.addActionListener((d)->{System.out.println("Abc");});
	}
}