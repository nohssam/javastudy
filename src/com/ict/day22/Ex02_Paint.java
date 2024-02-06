package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame{
	JPanel jp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	String[] items = {"5","10","15","20","25","30"};
	JComboBox<String> jcom ;
	// 좌표와 넓이
	int x=-5, y=-5, wh=5 ;
	Color color;
	
	// 내부 클래스
	CanvasTest ct = new CanvasTest();
	
	// 생성자 
	public Ex02_Paint() {
		super("미니그림판");
		
		jp = new JPanel();
		jb1 = new JButton(" ");
		jb1.setBackground(Color.RED);
		jb2 = new JButton(" ");
		jb2.setBackground(Color.GREEN);
		jb3 = new JButton(" ");
		jb3.setBackground(Color.BLUE);
		jb4 = new JButton(" ");
		jb4.setBackground(Color.CYAN);
		jb5 = new JButton(" ");
		jb5.setBackground(Color.MAGENTA);
		jb6 = new JButton(" ");
		jb6.setBackground(Color.YELLOW);
		
		jb7 = new JButton("clear");
		
		jcom = new JComboBox<String>(items);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jcom);
		
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		// 화면 크기 구함
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// 위치를 지정 (화면 중간에 창을 보이게 하자)
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.BLUE;
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.CYAN;
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.MAGENTA;
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.YELLOW;
			}
		});
		jb7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ct.removeNotify();
				ct.addNotify();
				x = -5 ;
				y = -5 ;
				wh = 5 ;
				// 크기지정
				jcom.setSelectedIndex(0);
			}
		});
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					switch ((String)e.getItem()) {
						case "5": wh = 5 ; break;
						case "10": wh = 10 ; break;
						case "15": wh = 15 ; break;
						case "20": wh = 20 ; break;
						case "25": wh = 25 ; break;
						case "30": wh = 30 ; break;

					}
				}
			}
		});
	
		ct.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				ct.repaint();
			}
		});
		
	}
	
	// 내부클래스
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
				g.setColor(color);
				g.fillOval(x, y, wh, wh);
		}
		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}
	public static void main(String[] args) {
		new Ex02_Paint();
	}
}







