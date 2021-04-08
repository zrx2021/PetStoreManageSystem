package pet.store.manage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class Gui3 extends JFrame {

	private static Gui3 frame = new Gui3();

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

	private JPanel contentPane;
	private DefaultTableModel model = null;
	private static DefaultTableModel model2;
	private JTable table = null;
	private JTextField TF;
	private JTextField TF_1;
	private JTextField TF_2;
	private JTextField TF_3;
	private JTextField TF_4;
	private JRadioButton RB = new JRadioButton("狗");
	private JRadioButton RB_1 = new JRadioButton("猫");
	private JRadioButton RB_2 = new JRadioButton("雄性");
	private JRadioButton RB_3 = new JRadioButton("雌性");
	private JCheckBox CheckBox = new JCheckBox("添加后清空");

	private int num = 0;
	private int findcount;

	public Gui3() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				Gui2.main(null);
			}
		});
		setTitle("商店库存管理");

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[][] datas = {};
		String[] names = { "序号", "品种", "颜色", "年龄", "性别", "进货价格", "出售价格" };
		model = new DefaultTableModel(datas, names);
		model2 = new DefaultTableModel(datas, names);
		table = new JTable(model);
		table.setRowHeight(25);
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 148, 650, 300);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 210, 128);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(329, 10, 330, 128);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		TF = new JTextField();
		TF.setBounds(62, 21, 100, 30);
		panel_1.add(TF);
		TF.setFont(new Font("宋体", Font.PLAIN, 20));
		TF.setColumns(10);

		TF_1 = new JTextField();
		TF_1.setBounds(254, 21, 65, 30);
		panel_1.add(TF_1);
		TF_1.setFont(new Font("宋体", Font.PLAIN, 20));
		TF_1.setColumns(10);

		TF_2 = new JTextField();
		TF_2.setBounds(98, 77, 65, 30);
		panel_1.add(TF_2);
		TF_2.setFont(new Font("宋体", Font.PLAIN, 20));
		TF_2.setColumns(5);

		TF_3 = new JTextField();
		TF_3.setBounds(254, 77, 65, 30);
		panel_1.add(TF_3);
		TF_3.setFont(new Font("宋体", Font.PLAIN, 20));
		TF_3.setColumns(5);

		TF_4 = new JTextField();
		TF_4.setFont(new Font("宋体", Font.PLAIN, 20));
		TF_4.setColumns(5);
		TF_4.setBounds(670, 330, 50, 30);
		contentPane.add(TF_4);

		RB.setBounds(66, 17, 45, 33);
		RB.setFont(new Font("宋体", Font.PLAIN, 20));
		panel.add(RB);

		RB_1.setBounds(135, 17, 45, 33);
		RB_1.setFont(new Font("宋体", Font.PLAIN, 20));
		panel.add(RB_1);

		RB_2.setBounds(68, 82, 65, 33);
		RB_2.setFont(new Font("宋体", Font.PLAIN, 20));
		panel.add(RB_2);

		RB_3.setBounds(135, 82, 65, 33);
		RB_3.setFont(new Font("宋体", Font.PLAIN, 20));
		panel.add(RB_3);

		ButtonGroup BG = new ButtonGroup();
		BG.add(RB);
		BG.add(RB_1);

		ButtonGroup BG_1 = new ButtonGroup();
		BG_1.add(RB_3);
		BG_1.add(RB_2);

		JLabel Label = new JLabel("品种");
		Label.setBounds(20, 21, 40, 24);
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setFont(new Font("宋体", Font.PLAIN, 20));
		panel.add(Label);

		JLabel Label_1 = new JLabel("性别");
		Label_1.setBounds(20, 86, 40, 24);
		Label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		panel.add(Label_1);

		JLabel Label_2 = new JLabel("颜色");
		Label_2.setBounds(12, 24, 40, 24);
		panel_1.add(Label_2);
		Label_2.setFont(new Font("宋体", Font.PLAIN, 20));

		JLabel Label_3 = new JLabel("年龄");
		Label_3.setBounds(204, 24, 40, 24);
		panel_1.add(Label_3);
		Label_3.setFont(new Font("宋体", Font.PLAIN, 20));

		JLabel Label_4 = new JLabel("进货价格");
		Label_4.setBounds(12, 80, 80, 24);
		panel_1.add(Label_4);
		Label_4.setFont(new Font("宋体", Font.PLAIN, 20));

		JLabel Label_5 = new JLabel("出售价格");
		Label_5.setBounds(168, 80, 80, 24);
		panel_1.add(Label_5);
		Label_5.setFont(new Font("宋体", Font.PLAIN, 20));

		JLabel Label_6 = new JLabel("定位到序号");
		Label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		Label_6.setBounds(670, 296, 104, 24);
		contentPane.add(Label_6);

		JLabel Label_7 = new JLabel("程序就绪");
		Label_7.setHorizontalAlignment(SwingConstants.CENTER);
		Label_7.setFont(new Font("宋体", Font.PLAIN, 20));
		Label_7.setBounds(670, 384, 104, 64);
		contentPane.add(Label_7);

		JButton Button_1 = new JButton("添加");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int flag;
				flag = 0;
				if (BG.getSelection() == null || BG_1.getSelection() == null) {
					flag = 1;
				}
				if (TF == null || TF_1 == null || TF_2 == null || TF_3 == null) {
					flag = 1;
				} else if (TF.getText().equals("") || TF_1.getText().equals("") || TF_2.getText().equals("")
						|| TF_3.getText().equals("")) {
					flag = 1;
				}
				if (flag == 1)
					Label_7.setText("输入为空！");
				else {
					String cnum = String.valueOf(num++);
					double in, sell;
					int age;
					try {
						in = Double.valueOf(TF_2.getText());
						sell = Double.valueOf(TF_3.getText());
						age = Integer.valueOf(TF_1.getText());
						String[] newrow = { cnum, getSpecie(), TF.getText(), String.valueOf(age), getSex(),
								String.valueOf(in), String.valueOf(sell) };
						model.addRow(newrow);
						Label_7.setText("添加成功！");
						if (CheckBox.isSelected()) {
							TF.setText(null);
							TF_1.setText(null);
							TF_2.setText(null);
							TF_3.setText(null);
							TF_4.setText(null);
							BG.clearSelection();
							BG_1.clearSelection();
						}
					} catch (NumberFormatException e1) {
						Label_7.setText("数字错误！");
					}

				}
			}
		});
		Button_1.setFont(new Font("宋体", Font.BOLD, 20));
		Button_1.setBounds(670, 10, 104, 64);
		contentPane.add(Button_1);

		JButton Button_2 = new JButton("查找");
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findcount = 0;
				String temp[] = new String[4];
				for (int i = 0; i < table.getRowCount(); i++) {
					temp[0] = String.valueOf(model.getValueAt(i, 1));
					temp[1] = String.valueOf(model.getValueAt(i, 2));
					temp[2] = String.valueOf(model.getValueAt(i, 3));
					temp[3] = String.valueOf(model.getValueAt(i, 4));
					if (getSpecie().equals(temp[0]) && TF.getText().equals(temp[1]) && TF_1.getText().equals(temp[2])
							&& getSex().equals(temp[3])) {
						table.addRowSelectionInterval(i, i);
						findcount++;
					}
				}
				if (findcount == 0)
					Label_7.setText("无此纪录！");
				else
					Label_7.setText("找到" + findcount + "个！");
			}
		});
		Button_2.setFont(new Font("宋体", Font.BOLD, 20));
		Button_2.setBounds(670, 73, 104, 64);
		contentPane.add(Button_2);

		JButton Button_3 = new JButton("出售所选");
		Button_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int success = 0;
				try {
					for (int i = 0; i <= num; i++) {
						int index = table.getSelectedRow();
						String str[] = new String[7];
						for (int j = 0; j < 7; j++) {
							str[j] = String.valueOf(model.getValueAt(index, j));
						}
						model.removeRow(index);
						model2.addRow(str);
						success++;
					}
				} catch (ArrayIndexOutOfBoundsException e1) {
					if (success == 0)
						Label_7.setText("无出售项！");
				}
				if (success > 0)
					Label_7.setText("售出了" + success + "个!");
			}
		});
		Button_3.setFont(new Font("宋体", Font.BOLD, 15));
		Button_3.setBounds(670, 148, 104, 64);
		contentPane.add(Button_3);

		JButton Button_4 = new JButton("返回");
		Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Gui2.main(null);
			}
		});
		Button_4.setFont(new Font("宋体", Font.BOLD, 20));
		Button_4.setBounds(670, 222, 104, 64);
		contentPane.add(Button_4);

		JButton Button = new JButton("清空");
		Button.setFont(new Font("宋体", Font.BOLD, 20));
		Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				TF.setText(null);
				TF_1.setText(null);
				TF_2.setText(null);
				TF_3.setText(null);
				TF_4.setText(null);
				BG.clearSelection();
				BG_1.clearSelection();
				table.clearSelection();
			}
		});
		Button.setBounds(230, 12, 90, 64);
		contentPane.add(Button);

		JButton Button_5 = new JButton("跳");
		Button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = -1;
				for (int i = 0; i < table.getRowCount(); i++) {
					if (String.valueOf(model.getValueAt(i, 0)).equals(TF_4.getText())) {
						index = i;
					}
				}
				try {
					table.setRowSelectionInterval(index, index);
					scrollPane.getViewport().setViewPosition(new Point(0, table.getRowHeight() * index));
					Label_7.setText("定位成功！");
				} catch (IllegalArgumentException e1) {
					Label_7.setText("无此序号！");
				}

			}
		});
		Button_5.setFont(new Font("宋体", Font.PLAIN, 10));
		Button_5.setBounds(730, 330, 44, 30);
		contentPane.add(Button_5);

		CheckBox.setFont(CheckBox.getFont().deriveFont(CheckBox.getFont().getStyle() | Font.BOLD));
		CheckBox.setBounds(226, 96, 97, 23);
		contentPane.add(CheckBox);

	}

	public String getSpecie() {
		if (RB.isSelected())
			return RB.getText();
		else
			return RB_1.getText();
	}

	public String getSex() {
		if (RB_2.isSelected())
			return RB_2.getText();
		else
			return RB_3.getText();
	}

	public static DefaultTableModel getModel2() {
		return model2;
	}

	public void setModel2(DefaultTableModel model2) {
		Gui3.model2 = model2;
	}

}
