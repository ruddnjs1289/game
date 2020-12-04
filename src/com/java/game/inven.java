package com.java.game;

import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import dao.inventoryDao;
import model.inventory;

public class inven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inven frm=new inven();
		ArrayList<inventory> it =new ArrayList<inventory>();
		it=inventoryDao.mCheck();

	}
	
	public inven() {
		JFrame frm= new JFrame();
		frm.setTitle("인벤토리");
		frm.setSize(350,350);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		
		JCheckBox chk1=new JCheckBox("a");
		chk1.setBounds(50,50,50,50);
		frm.getContentPane().add(chk1);	
		
		frm.setVisible(true);
	}

}
