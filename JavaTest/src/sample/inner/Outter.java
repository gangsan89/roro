package sample.inner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Outter extends JFrame {
	private String name;
	private JButton okBtn=new JButton("ok");
	private JButton cancleBtn= new JButton("취소");
	private JButton num7= new JButton("7");
	private JButton num8= new JButton("8");
	
	
	
	
	//ActionListener l = new ActionListener();
	ActionListener numBtnHandle = new ActionListener() {
		int x;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//e.getSource().equals(num7)
		}
	};
	
	public void init() {
		//StaticInner m()  ,  a  
		
		
		
		okBtn.addActionListener(new ActionListenerHandle());
		cancleBtn.addActionListener(new ActionListenerHandle());
		num7.addActionListener(new ActionListener() {
			int y;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		num8.addActionListener(new ActionListener() {
			int z;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		num7.addActionListener(numBtnHandle);
		num8.addActionListener(numBtnHandle);
	}
	
	public  class  ActionListenerHandle implements ActionListener{
		int a;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			name= e.getActionCommand();
		}
		
	}
	public static  class  StaticInner{
		public static int  a;
		public void m() {
			System.out.println("StaticInner :: m()");
		}
	}
	public class   Inner{
		public int b;
	}
}










