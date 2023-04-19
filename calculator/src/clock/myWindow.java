package clock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class myWindow extends JFrame {
	
	private JLabel heading;
	private JLabel clockLabel;
	
	private Font font=new Font("",Font.BOLD,35);
	
	
	
	myWindow(){
		super.setTitle("My clock");
		super.setSize(400,400);
		super.setLocation(300, 50);
		super.setVisible(true);
		this.startclock();
		this.createGUI();
		
	}



	public void createGUI() {
		// TODO Auto-generated method stub
		
		heading=new JLabel("My clock");
		
		clockLabel=new JLabel("clock");
		
		heading.setFont(font);
		clockLabel.setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockLabel);
		
	}
	
	public void startclock() {
		Timer timer=new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				String dateTime=new Date().toString();
				
//				@SuppressWarnings("deprecation")
//				String dateTime=new Date().toLocaleString();
//				clockLabel.setText(dateTime);
				
				Date d=new Date();
				SimpleDateFormat sfd=new SimpleDateFormat("hh:mm:ss a");
				String dateTime=sfd.format(d);
				clockLabel.setText(dateTime);
			}
		});
		
		timer.start();
//		timer.setRepeats(false);
	}

}
