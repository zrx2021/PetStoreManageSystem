package pet.store.manage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Gui2 extends JFrame {

	private JPanel contentPane;

	private static Gui2 frame = new Gui2();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
					Toolkit kit = Toolkit.getDefaultToolkit();

					Dimension screen = kit.getScreenSize();

					int w = screen.width / 2;
					int h = screen.height / 2;

					frame.setLocation(w - frame.getSize().width / 2, h - frame.getSize().height / 2);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gui2() {
		setTitle(Gui.getName() + "商店管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("您好！店长！\n欢迎使用" + Gui.name + "商店管理系统！");
		lblNewLabel.setBounds(5, 5, 424, 120);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(26, 131, 383, 120);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btnNewButton_0 = new JButton("库存管理");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Gui3.main(null);
			}
		});
		panel.add(btnNewButton_0);

		JButton btnNewButton_1 = new JButton("销售记录");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Gui4.main(null);
			}
		});
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("退出程序");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel.add(btnNewButton_2);
	}
}
