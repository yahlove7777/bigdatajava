package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기3 {
	private static JTextField text1;
	private static JTextField text2;
	private static JTextField text3;

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(new Color(135, 206, 235));
		f.setSize(500, 400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("<<나의 계산기>>");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("숫자1>>");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(lblNewLabel);
		
		text1 = new JTextField();
		text1.setBackground(Color.BLUE);
		text1.setForeground(Color.ORANGE);
		text1.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel label = new JLabel("숫자2>>");
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(label);
		
		text2 = new JTextField();
		text2.setForeground(Color.ORANGE);
		text2.setFont(new Font("굴림", Font.PLAIN, 33));
		text2.setColumns(10);
		text2.setBackground(Color.BLUE);
		f.getContentPane().add(text2);
		
		JButton button1 = new JButton("계산");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = text1.getText();
				String data2 = text2.getText();
				String data5 = text3.getText();
				
				int data3 = Integer.parseInt(data1);
				int data4 = Integer.parseInt(data2);
				
				int imsi = 0;
				
				switch(data5){
				case "+":
					imsi = data3 + data4;
					break;
				case "-":
					imsi = data3 - data4;
					break;
				case "*":
					imsi = data3 * data4;
					break;
				case "/":
					imsi = data3 / data4;
					break;
				default:
					System.out.println("연산 할 수 없는 기호입니다.");
					break;
				}
				System.out.println("두 수의 연산 결과는 : " + imsi);
				
			}
		});
		
		JLabel label_1 = new JLabel("연산자>>");
		label_1.setForeground(new Color(0, 0, 255));
		label_1.setFont(new Font("굴림", Font.PLAIN, 33));
		f.getContentPane().add(label_1);
		
		text3 = new JTextField();
		text3.setForeground(new Color(0, 0, 255));
		text3.setFont(new Font("굴림", Font.PLAIN, 33));
		text3.setColumns(10);
		text3.setBackground(Color.ORANGE);
		f.getContentPane().add(text3);
		button1.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(button1);
		
		
		
		f.setVisible(true);
	}

}
