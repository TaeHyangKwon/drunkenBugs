package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import bug.*;

/*
public class Map extends JFrame {

	public Map() {
		setTitle("���� ã�� �������� ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(null);
		
		JButton repeat=new JButton("�ݺ�");
		JButton exit=new JButton("����");
		
		JTextArea ta_map=new JTextArea(20,23);
		JScrollPane scrollPane=new JScrollPane(ta_map);
		
		JTextArea ta_map_size=new JTextArea(1,2);
		JTextArea ta_start_pos=new JTextArea(1,2);
		JTextArea ta_count=new JTextArea(1,4);
		JTextArea ta_time=new JTextArea(1,4);
		
		JLabel la_size=new JLabel("��ũ��");
		la_size.setBounds(60,10,70,20);
		c.add(la_size);
	
		String s_map_size=ta_map_size.getText();
		//int map_size=Integer.parseInt(s_map_size);
		
		ta_map_size.setBounds(110, 10,25,20);
		c.add(ta_map_size);
		c.add(scrollPane);
		
		JLabel la_pos=new JLabel("���� ��ġ(1.�����ڸ� 2.������ 3.���)");
		la_pos.setBounds(170,10,300,20);
		c.add(la_pos);
		
		String s_start_pos=ta_start_pos.getText();
		//int start_pos=Integer.parseInt(s_start_pos);
		
		ta_start_pos.setBounds(410, 10,25,20);
		c.add(ta_start_pos);
		
		ta_map.setBounds(20, 40,450,350);
		c.add(ta_map);
		
		JLabel la_count=new JLabel("�̵� Ƚ��");
		la_count.setBounds(100,405,60,20);
		c.add(la_count);
		
		ta_count.setBounds(170, 405,35,20);
		c.add(ta_count);
		
		JLabel la_time=new JLabel("�ҿ� �ð�");
		la_time.setBounds(280, 405,60,20);
		c.add(la_time);
		
		ta_time.setBounds(350, 405,35,20);
		c.add(ta_time);
		
		repeat.setBounds(170, 430,60,30);
		c.add(repeat);
		
		exit.setBounds(250, 430,60,30);
		c.add(exit);
		
		setSize(500,500);
		setResizable(false);
		setVisible(true);	
	

		ActionListener listener_repeat=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Bug();
			}
		};
		repeat.addActionListener(listener_repeat);
				
		ActionListener listener_exit=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);//����
			}
		};
		exit.addActionListener(listener_exit);
	}
}
*/