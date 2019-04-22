package control;

import java.awt.FlowLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보2 {

	public static void main(String[] args) {
		
		Random random = new Random();

		
		JFrame f = new JFrame("가위 바위 보 게임");
		f.setSize(300,150);
		FlowLayout flow = new FlowLayout();
		
		JButton b4 = new JButton("");
		b4.setFont(new Font("굴림", Font.PLAIN, 25));
		
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int com = random.nextInt(3);
				System.out.println(com);
				if(com == 0) {
					String result = "비겼습니다.";
					b4.setText(result);
				}
				else if(com == 1) {
					String result = "컴퓨터가 이겼습니다.";
					b4.setText(result);
				}
				else if(com == 2) {
					String result = "사용자가 이겼습니다.";
					b4.setText(result);
				}
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		JButton b2 = new JButton("바위");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int com = random.nextInt(3);
				System.out.println(com);
				if(com == 0) {
					String result = "사용자가 이겼습니다.";
					b4.setText(result);
				}
				else if(com == 1) {
					String result = "비겼습니다.";
					b4.setText(result);
				}
				else if(com == 2) {
					String result = "컴퓨터가 이겼습니다.";
					b4.setText(result);
				}
				
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		JButton b3 = new JButton("보");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int com = random.nextInt(3);
				System.out.println(com);
				if(com == 0) {
					String result = "컴퓨터가 이겼습니다.";
					b4.setText(result);
				}
				else if(com == 1) {
					String result = "사용자가 이겼습니다.";
					b4.setText(result);
				}
				else if(com == 2) {
					String result = "비겼습니다.";
					b4.setText(result);
				}
				
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 30));
		
		
		
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		
		f.setVisible(true);

		
		
		
	}

}
