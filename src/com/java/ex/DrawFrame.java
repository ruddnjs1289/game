package com.java.ex;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import com.java.game.Study01;

import dao.inventoryDao;
import model.Member;
import model.inventory;

public class DrawFrame extends JFrame {
	 public static Random random =new Random();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawFrame frame = new DrawFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public DrawFrame() {
		JFrame frm=new JFrame();
		frm.setTitle("뽑기");
		frm.setSize(350,300);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		frm.setVisible(true);
		
		JButton btn1=new JButton("1회 뽑기");
		JButton btn2=new JButton("10회 뽑기");
		JButton btn3=new JButton("저장");
		
		btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
        btn3.setBounds(100,220,122,30);
        
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        frm.getContentPane().add(btn3);
		
		System.out.println(frm.getContentPane().getSize());
		
		JLabel[] a=new JLabel[23];
		
		JLabel lblresult=new JLabel("뽑기 결과물");
		lblresult.setBounds(120,75, 200, 100);
		frm.getContentPane().add(lblresult);
		
		btn1.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent e) {
			      int randomNum;
			      float temp = 0;
			          
			      for(int i = 1; i<= 1; i++) {
			    	  
			         temp = (float) (Math.random()*(100-1));
			         if(0 <= temp && temp <=2.5 ) {
			            lblresult.setText("<html>[스페셜라벨]<br>매지컬 테일러</html>");
			            
			          
			         }
			         else if(2.6 <= temp && temp <= 5.5) {
			        	lblresult.setText("<html>[스페셜라벨]<br>테일러의 보물</html>");
			        	
			          
			         }
			         else if(5.6 <= temp && temp <= 8.2) {
			        	 lblresult.setText("<html>[스페셜라벨]<br>테일러의 구두</html>");
			        	 
			          
			         }
			         else if(8.3 <= temp && temp <= 11.4) {
			        	 lblresult.setText("<html>[스페셜라벨]<br>대단한 테일러</html>");
			        	
			           
			         }
			         else if(11.5 <= temp && temp <= 15.0) {
			        	 lblresult.setText("<html>[스페셜라벨]<br>매지컬 테일러</html>");
			        	 
			           
			         }
			         else if(11.6 <= temp && temp <= 20.0) {
			        	 lblresult.setText("오후의 산책");
			        	 
			         }
			         else if(20.1 <= temp && temp <= 22.2) {
			        	 lblresult.setText("아이 무서워");
			        	 
			         }
			         else if(22.3 <= temp && temp <= 27.3) {
			        	 lblresult.setText("팔랑 유령 러플");
			        	
			         }
			         else if(27.4 <= temp && temp <= 32.5) {
			        	 lblresult.setText("팔랑 유령 신발");
			        	
			         }
			         else if(32.6 <= temp && temp <= 36.6) {
			        	 lblresult.setText("제일 무서워");
			        	 
			         }
			         else if(36.7 <= temp && temp <= 38.3) {
			        	 lblresult.setText("할로윈 레이븐 페르소나");
			        	 ;
			         }
			         else if(38.4 <= temp && temp <= 41.4) {
			        	 lblresult.setText("할로윈 팬텀 슈트");
			        	
			         }
			         else if(41.5 <= temp && temp <= 46.5) {
			        	 lblresult.setText("할로윈 팬텀");
			        
			         }
			         else if(46.6 <= temp && temp <= 50.6) {
			        	 lblresult.setText("좀비 곰돌이");
			        	 
			         }
			         else if(50.7 <= temp && temp <= 54.7) {
			        	 lblresult.setText("외눈 안대");
			        	 
			         }
			         else if(54.8 <= temp && temp <= 58.2) {
			        	 lblresult.setText("얼어붙는 눈빛");
			        	
			         }
			         else if(58.3 <= temp && temp <= 63.4) {
			        	 lblresult.setText("고쓰 페도라");
			        	
			         }
			         else if(63.5 <= temp && temp <= 68.6) {
			        	 lblresult.setText("오늘의 햇살 망토");
			        	
			         }
			         else if(68.7 <= temp && temp <= 73.7) {
			        	 lblresult.setText("하트패치 니트 팬츠");
			        	 
			         }
			         else if(73.8 <= temp && temp <= 78.8) {
			        	 
			        	 lblresult.setText("아기새 티셔츠");
			        	 
			         }
			         else if(78.9 <= temp && temp <= 84) {
			        	
			        	 lblresult.setText("[30일] 미라 말풍선 반지");
			        	 
			         }
			         else if(84.1 <= temp && temp <= 89.1) {
			        	 
			        	 lblresult.setText("[30일]미라 명찰 반지");
			        	 
			         }
			         else if(89.2 <= temp && temp <= 94.2) {
			        	 
			        	 lblresult.setText("박쥐의 주인 이펙트 교환권");
			        	 
			         }
			         else if(94.3 <= temp && temp <= 100) {
			        	
			        	 lblresult.setText("스카우터");
			        	 
			         }
			        
			        
			      }
			       
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float temp=0;
				String str="★매지컬 테일러★,★테일러의 보물★,★대단한 테일러★,★테일러의 구두★,★대단한 테일러★ ,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23";
				String[] item =str.split(",");
				for(int i=0; i<23; i++) {
					a[i]=new JLabel();
				}
				for(int i=0; i<23; i++) {
					/*System.out.print(item[i]+" ");*/
				}
				 for(int i=0; i<100000; i++)
			      {
			         int n =random.nextInt(22)+1;
			         String m = item[0];
			         item[0]=item[n];
			         item[n]=m;
			      }

				   for(int i=0; i<=10;i++) {
					   temp = (float) (Math.random()*(100-1));
				         if(0 <= temp && temp <=2.5 ) {
				        	 item[i]=item[0];
				         }
				         else if(2.6 <= temp && temp <= 5.5) {
				        	 item[i]=item[1];
				           
				         }
				         else if(5.6 <= temp && temp <= 8.2) {
				        	 item[i]=item[2];
				            
				         }
				         else if(8.3 <= temp && temp <= 11.4) {
				        	 item[i]=item[3];
				            
				         }
				         else if(11.5 <= temp && temp <= 15.0) {
				        	 item[i]=item[4];
				            
				         }
				         else if(11.6 <= temp && temp <= 20.0) {
				        	 item[i]=item[5];
			
				         }
				         else if(20.1 <= temp && temp <= 22.2) {
				        	 item[i]=item[6];
				         }
				         else if(22.3 <= temp && temp <= 27.3) {
				        	 item[i]=item[7];
				         }
				         else if(27.4 <= temp && temp <= 32.5) {
				        	 item[i]=item[8];
				         }
				         else if(32.6 <= temp && temp <= 36.6) {
				        	 item[i]=item[9];
				         }
				         else if(36.7 <= temp && temp <= 38.3) {
				        	 item[i]=item[10];
				         }
				         else if(38.4 <= temp && temp <= 41.4) {
				        	 item[i]=item[11];
				         }
				         else if(41.5 <= temp && temp <= 46.5) {
				        	 item[i]=item[12];
				         }
				         else if(46.6 <= temp && temp <= 50.6) {
				        	 lblresult.setText(item[13]);
				         }
				         else if(50.7 <= temp && temp <= 54.7) {
				        	 item[i]=item[13];
				         }
				         else if(54.8 <= temp && temp <= 58.2) {
				        	 item[i]=item[14];
				         }
				         else if(58.3 <= temp && temp <= 63.4) {
				        	 item[i]=item[15];
				         }
				         else if(63.5 <= temp && temp <= 68.6) {
				        	 item[i]=item[16];
				         }
				         else if(68.7 <= temp && temp <= 73.7) {
				        	 item[i]=item[17];
				         }
				         else if(73.8 <= temp && temp <= 78.8) {
				        	 item[i]=item[18];
				         }
				         else if(78.9 <= temp && temp <= 84) {
				        	 item[i]=item[19];
				         }
				         else if(84.1 <= temp && temp <= 89.1) {
				        	 item[i]=item[20];
				         }
				         else if(89.2 <= temp && temp <= 94.2) {
				        	 item[i]=item[21];
				         }
				         else if(94.3 <= temp && temp <= 100) {
				        	 item[i]=item[22];
				         }
					   
					   System.out.println(item[i]+" ");
					  
					 
				   }
				  
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inventory inventory =new inventory();
				inventory.setWeapon(lblresult.getText());
				inventoryDao dao=inventoryDao.getinstance();
				int result =dao.save(inventory);
				
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "저장성공");
					
				}else {
					JOptionPane.showMessageDialog(null, "저장실패");
					
				}	
				
				
			
				
			}
		});
	}

}
