package pet.store.manage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {
	private static JTextField textField;
	static String name;

	public static void main(String[] args) {
		JFrame frame = new JFrame("�����̵����ϵͳ");

		frame.getContentPane().setLayout(new FlowLayout());

		JLabel lblNewLabel = new JLabel("��Ϊ���ĳ����̵�ȡ������");

		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(25);
		textField.setFont(new Font("����", Font.PLAIN, 20));

		frame.getContentPane().add(textField);

		JButton button = new JButton("ȷ��");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				name = textField.getText();
				Gui2.main(null);
			}
		});

		button.setFont(new Font("����", Font.PLAIN, 20));

		Toolkit kit = Toolkit.getDefaultToolkit();

		Dimension screen = kit.getScreenSize();

		int w = screen.width / 2;
		int h = screen.height / 2;

		frame.getContentPane().add(button);
		frame.setSize(300, 150);
		frame.setLocation(w - frame.getSize().width / 2, h - frame.getSize().height / 2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Gui.name = name;
	}

}