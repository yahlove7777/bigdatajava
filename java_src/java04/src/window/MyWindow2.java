package window;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow2 {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("입력값 받는 프로그램");
		FlowLayout flow = new FlowLayout(); 		//물흐르듯이 배치
		JButton b = new JButton("프로그램언어"); 		//버튼
		b.setBackground(Color.ORANGE);
		b.setForeground(Color.PINK);
		b.setFont(new Font("굴림", Font.PLAIN, 16));
		JLabel l = new JLabel("당신의 주요 프로그램 언어를 입력하세요");		//입력받는 화면
		l.setFont(new Font("굴림", Font.PLAIN, 15));
		l.setForeground(Color.BLUE);
		JTextField t = new JTextField(20);		//글자들
		JLabel l2 = new JLabel("당신의 사용하는 개발 툴을 입력하세요");
		l2.setFont(new Font("굴림", Font.PLAIN, 15));
		JTextField t2 = new JTextField(20);
		t2.setFont(new Font("굴림", Font.PLAIN, 18));
		t.setFont(new Font("굴림", Font.PLAIN, 18));
		f.setSize(364,305);
		
		
		
		//버튼 액션
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요!");
				String data = t.getText();
				System.out.println("당신의 주요 과목은 : " + data);
			}
		});
		
		
		
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l);
		f.getContentPane().add(t);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b);
		
		JButton b2 = new JButton("개발 툴");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러졌군요!");
				String data2 = t2.getText();
				System.out.println("당신이 사용하는 개발 툴은 : " + data2);
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 16));
		f.getContentPane().add(b2);

		f.setVisible(true);
	}

}
