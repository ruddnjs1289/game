package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.java.ex.DrawFrame;
import com.java.game.Study01;

import gui.LoginFrame;

public class main extends JFrame {
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	
	}
	public main() {
		JFrame frm =new JFrame();
		frm.setTitle("슬라임 조져버리기");
		frm.setSize(350,350);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		frm.setVisible(true);
		
		JButton btn1= new JButton("시작"); 
		JButton btn2= new JButton("뽑기"); //뽑기
		JButton btn3= new JButton("내정보"); //내정보 
		
		JLabel lbl1= new JLabel("환영합니다.");
		frm.getContentPane().add(lbl1);
		lbl1.setBounds(50,50,100,50);
		JLabel lbl2=new JLabel("로그인 아이디 들어올 자 리"+" "+"님");
		frm.getContentPane().add(lbl2);
		lbl2.setBounds(50,80,300,100);
	
		
		
		btn1.setBounds(30, 170, 122, 30);
		frm.getContentPane().add(btn1);
		btn2.setBounds(182, 170, 122, 30);
		frm.getContentPane().add(btn2);
		btn3.setBounds(100,250,122,30);
		frm.getContentPane().add(btn3);
		setVisible(true);
		
		//게임화면가기
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Study01 a = new Study01();
				a.setVisible(true);
				
			}
		});
		
		//뽑기창
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DrawFrame frame =new DrawFrame();
				frame.setVisible(true);
				
			}
		});

	}

}
