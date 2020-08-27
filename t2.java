import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class t2 implements ActionListener {

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t2 window = new t2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public t2() {
		initialize();
	}

	public static String[] COLUMNNAMES = { "NA", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	/**
	 * Initialize the contents of the frame.
	 */
	public static JComboBox comboBox;
	public static JComboBox comboBox_1;
	public static JComboBox comboBox_2;
	public static JComboBox comboBox_3;
	public static JComboBox comboBox_4;
	public static JComboBox comboBox_5;
	public static JComboBox comboBox_6;
	public static JComboBox comboBox_7;
	public static JComboBox comboBox_8;
	public static JComboBox comboBox_9;
	public static JComboBox comboBox_10;
	public static JComboBox comboBox_11;
	public static JComboBox comboBox_12;
	public static JComboBox comboBox_13;
	public static JComboBox comboBox_14;
	public static JComboBox comboBox_15;
	public static JComboBox comboBox_16;
	public static JComboBox comboBox_17;
	public static JComboBox comboBox_18;
	public static JComboBox comboBox_19;
	public static JComboBox comboBox_20;
	public static JComboBox comboBox_21;
	public static JComboBox comboBox_22;
	public static JComboBox comboBox_23;
	public static JComboBox comboBox_24;
	public static JComboBox comboBox_25;
	public static JComboBox comboBox_26;
	public static JComboBox comboBox_27;
	public static JComboBox comboBox_28;
	public static JComboBox comboBox_29;
	public static JComboBox comboBox_30;
	public static JComboBox comboBox_31;
	public static JComboBox comboBox_32;
	public static JComboBox comboBox_33;
	public static JComboBox comboBox_34;
	public static JComboBox comboBox_35;
	public static JComboBox comboBox_36;
	public static JComboBox comboBox_37;
	public static JComboBox comboBox_38;
	public static JComboBox comboBox_39;
	public static JComboBox comboBox_40;
	public static JComboBox comboBox_41;
	public static JComboBox comboBox_42;
	public static JComboBox comboBox_43;
	public static JComboBox comboBox_44;
	public static JComboBox comboBox_45;
	public static JComboBox comboBox_46;
	public static JComboBox comboBox_47;
	public static JComboBox comboBox_48;
	public static JComboBox comboBox_49;
	public static JComboBox comboBox_50;
	public static JComboBox comboBox_51;
	public static JComboBox comboBox_52;
	public static JComboBox comboBox_53;
	public static JComboBox comboBox_54;
	public static JComboBox comboBox_55;
	public static JComboBox comboBox_56;
	public static JComboBox comboBox_57;
	public static JComboBox comboBox_58;
	public static JComboBox comboBox_59;
	public static JComboBox comboBox_60;
	public static JComboBox comboBox_61;
	public static JComboBox comboBox_62;
	public static JComboBox comboBox_63;
	public static JComboBox comboBox_64;
	public static JComboBox comboBox_65;
	public static JComboBox comboBox_66;
	public static JComboBox comboBox_67;
	public static JComboBox comboBox_68;
	public static JComboBox comboBox_69;
	public static JComboBox comboBox_70;
	public static JComboBox comboBox_71;
	public static JComboBox comboBox_72;
	public static JComboBox comboBox_73;
	public static JComboBox comboBox_74;
	public static JComboBox comboBox_75;
	public static JComboBox comboBox_76;
	public static JComboBox comboBox_77;
	public static JComboBox comboBox_78;
	public static JComboBox comboBox_79;
	public static JComboBox comboBox_80;

	public void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.text);
		frame.setTitle("SUDUKO SOLVER");
		frame.getContentPane().setBackground(new Color(0, 153, 153));
		frame.setBounds(100, 100, 565, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox = new JComboBox<String>(COLUMNNAMES);
		comboBox.setBounds(10, 10, 50, 35);
		frame.getContentPane().add(comboBox);

		comboBox_1 = new JComboBox<String>(COLUMNNAMES);
		comboBox_1.setBounds(10, 55, 50, 35);
		frame.getContentPane().add(comboBox_1);

		comboBox_2 = new JComboBox<String>(COLUMNNAMES);
		comboBox_2.setBounds(10, 100, 50, 35);
		frame.getContentPane().add(comboBox_2);

		comboBox_3 = new JComboBox<String>(COLUMNNAMES);
		comboBox_3.setBounds(10, 145, 50, 35);
		frame.getContentPane().add(comboBox_3);

		comboBox_4 = new JComboBox<String>(COLUMNNAMES);
		comboBox_4.setBounds(10, 190, 50, 35);
		frame.getContentPane().add(comboBox_4);

		comboBox_5 = new JComboBox<String>(COLUMNNAMES);
		comboBox_5.setBounds(10, 235, 50, 35);
		frame.getContentPane().add(comboBox_5);

		comboBox_6 = new JComboBox<String>(COLUMNNAMES);
		comboBox_6.setBounds(10, 280, 50, 35);
		frame.getContentPane().add(comboBox_6);

		comboBox_7 = new JComboBox<String>(COLUMNNAMES);
		comboBox_7.setBounds(10, 325, 50, 35);
		frame.getContentPane().add(comboBox_7);

		comboBox_8 = new JComboBox<String>(COLUMNNAMES);
		comboBox_8.setBounds(10, 370, 50, 35);
		frame.getContentPane().add(comboBox_8);

		comboBox_9 = new JComboBox<String>(COLUMNNAMES);
		comboBox_9.setBounds(70, 10, 50, 35);
		frame.getContentPane().add(comboBox_9);

		comboBox_10 = new JComboBox<String>(COLUMNNAMES);
		comboBox_10.setBounds(70, 55, 50, 35);
		frame.getContentPane().add(comboBox_10);

		comboBox_11 = new JComboBox<String>(COLUMNNAMES);
		comboBox_11.setBounds(70, 100, 50, 35);
		frame.getContentPane().add(comboBox_11);

		comboBox_12 = new JComboBox<String>(COLUMNNAMES);
		comboBox_12.setBounds(70, 145, 50, 35);
		frame.getContentPane().add(comboBox_12);

		comboBox_13 = new JComboBox<String>(COLUMNNAMES);
		comboBox_13.setBounds(70, 190, 50, 35);
		frame.getContentPane().add(comboBox_13);

		comboBox_14 = new JComboBox<String>(COLUMNNAMES);
		comboBox_14.setBounds(70, 235, 50, 35);
		frame.getContentPane().add(comboBox_14);

		comboBox_15 = new JComboBox<String>(COLUMNNAMES);
		comboBox_15.setBounds(70, 280, 50, 35);
		frame.getContentPane().add(comboBox_15);

		comboBox_16 = new JComboBox<String>(COLUMNNAMES);
		comboBox_16.setBounds(70, 325, 50, 35);
		frame.getContentPane().add(comboBox_16);

		comboBox_17 = new JComboBox<String>(COLUMNNAMES);
		comboBox_17.setBounds(70, 370, 50, 35);
		frame.getContentPane().add(comboBox_17);

		comboBox_18 = new JComboBox<String>(COLUMNNAMES);
		comboBox_18.setBounds(130, 10, 50, 35);
		frame.getContentPane().add(comboBox_18);

		comboBox_19 = new JComboBox<String>(COLUMNNAMES);
		comboBox_19.setBounds(130, 55, 50, 35);
		frame.getContentPane().add(comboBox_19);

		comboBox_20 = new JComboBox<String>(COLUMNNAMES);
		comboBox_20.setBounds(130, 100, 50, 35);
		frame.getContentPane().add(comboBox_20);

		comboBox_21 = new JComboBox<String>(COLUMNNAMES);
		comboBox_21.setBounds(130, 145, 50, 35);
		frame.getContentPane().add(comboBox_21);

		comboBox_22 = new JComboBox<String>(COLUMNNAMES);
		comboBox_22.setBounds(130, 190, 50, 35);
		frame.getContentPane().add(comboBox_22);

		comboBox_23 = new JComboBox<String>(COLUMNNAMES);
		comboBox_23.setBounds(130, 235, 50, 35);
		frame.getContentPane().add(comboBox_23);

		comboBox_24 = new JComboBox<String>(COLUMNNAMES);
		comboBox_24.setBounds(130, 280, 50, 35);
		frame.getContentPane().add(comboBox_24);

		comboBox_25 = new JComboBox<String>(COLUMNNAMES);
		comboBox_25.setBounds(130, 325, 50, 35);
		frame.getContentPane().add(comboBox_25);

		comboBox_26 = new JComboBox<String>(COLUMNNAMES);
		comboBox_26.setBounds(130, 370, 50, 35);
		frame.getContentPane().add(comboBox_26);

		comboBox_27 = new JComboBox<String>(COLUMNNAMES);
		comboBox_27.setBounds(190, 10, 50, 35);
		frame.getContentPane().add(comboBox_27);

		comboBox_28 = new JComboBox<String>(COLUMNNAMES);
		comboBox_28.setBounds(190, 55, 50, 35);
		frame.getContentPane().add(comboBox_28);

		comboBox_29 = new JComboBox<String>(COLUMNNAMES);
		comboBox_29.setBounds(190, 100, 50, 35);
		frame.getContentPane().add(comboBox_29);

		comboBox_30 = new JComboBox<String>(COLUMNNAMES);
		comboBox_30.setBounds(190, 145, 50, 35);
		frame.getContentPane().add(comboBox_30);

		comboBox_31 = new JComboBox<String>(COLUMNNAMES);
		comboBox_31.setBounds(190, 190, 50, 35);
		frame.getContentPane().add(comboBox_31);

		comboBox_32 = new JComboBox<String>(COLUMNNAMES);
		comboBox_32.setBounds(190, 235, 50, 35);
		frame.getContentPane().add(comboBox_32);

		comboBox_33 = new JComboBox<String>(COLUMNNAMES);
		comboBox_33.setBounds(190, 280, 50, 35);
		frame.getContentPane().add(comboBox_33);

		comboBox_34 = new JComboBox<String>(COLUMNNAMES);
		comboBox_34.setBounds(190, 325, 50, 35);
		frame.getContentPane().add(comboBox_34);

		comboBox_35 = new JComboBox<String>(COLUMNNAMES);
		comboBox_35.setBounds(190, 370, 50, 35);
		frame.getContentPane().add(comboBox_35);

		comboBox_36 = new JComboBox<String>(COLUMNNAMES);
		comboBox_36.setBounds(250, 10, 50, 35);
		frame.getContentPane().add(comboBox_36);

		comboBox_37 = new JComboBox<String>(COLUMNNAMES);
		comboBox_37.setBounds(250, 55, 50, 35);
		frame.getContentPane().add(comboBox_37);

		comboBox_38 = new JComboBox<String>(COLUMNNAMES);
		comboBox_38.setBounds(250, 100, 50, 35);
		frame.getContentPane().add(comboBox_38);

		comboBox_39 = new JComboBox<String>(COLUMNNAMES);
		comboBox_39.setBounds(250, 145, 50, 35);
		frame.getContentPane().add(comboBox_39);

		comboBox_40 = new JComboBox<String>(COLUMNNAMES);
		comboBox_40.setBounds(250, 190, 50, 35);
		frame.getContentPane().add(comboBox_40);

		comboBox_41 = new JComboBox<String>(COLUMNNAMES);
		comboBox_41.setBounds(250, 235, 50, 35);
		frame.getContentPane().add(comboBox_41);

		comboBox_42 = new JComboBox<String>(COLUMNNAMES);
		comboBox_42.setBounds(250, 280, 50, 35);
		frame.getContentPane().add(comboBox_42);

		comboBox_43 = new JComboBox<String>(COLUMNNAMES);
		comboBox_43.setBounds(250, 325, 50, 35);
		frame.getContentPane().add(comboBox_43);

		comboBox_44 = new JComboBox<String>(COLUMNNAMES);
		comboBox_44.setBounds(250, 370, 50, 35);
		frame.getContentPane().add(comboBox_44);

		comboBox_45 = new JComboBox<String>(COLUMNNAMES);
		comboBox_45.setBounds(310, 10, 50, 35);
		frame.getContentPane().add(comboBox_45);

		comboBox_46 = new JComboBox<String>(COLUMNNAMES);
		comboBox_46.setBounds(310, 55, 50, 35);
		frame.getContentPane().add(comboBox_46);

		comboBox_47 = new JComboBox<String>(COLUMNNAMES);
		comboBox_47.setBounds(310, 100, 50, 35);
		frame.getContentPane().add(comboBox_47);

		comboBox_48 = new JComboBox<String>(COLUMNNAMES);
		comboBox_48.setBounds(310, 145, 50, 35);
		frame.getContentPane().add(comboBox_48);

		comboBox_49 = new JComboBox<String>(COLUMNNAMES);
		comboBox_49.setBounds(310, 190, 50, 35);
		frame.getContentPane().add(comboBox_49);

		comboBox_50 = new JComboBox<String>(COLUMNNAMES);
		comboBox_50.setBounds(310, 235, 50, 35);
		frame.getContentPane().add(comboBox_50);

		comboBox_51 = new JComboBox<String>(COLUMNNAMES);
		comboBox_51.setBounds(310, 280, 50, 35);
		frame.getContentPane().add(comboBox_51);

		comboBox_52 = new JComboBox<String>(COLUMNNAMES);
		comboBox_52.setBounds(310, 325, 50, 35);
		frame.getContentPane().add(comboBox_52);

		comboBox_53 = new JComboBox<String>(COLUMNNAMES);
		comboBox_53.setBounds(310, 370, 50, 35);
		frame.getContentPane().add(comboBox_53);

		comboBox_54 = new JComboBox<String>(COLUMNNAMES);
		comboBox_54.setBounds(370, 10, 50, 35);
		frame.getContentPane().add(comboBox_54);

		comboBox_55 = new JComboBox<String>(COLUMNNAMES);
		comboBox_55.setBounds(370, 55, 50, 35);
		frame.getContentPane().add(comboBox_55);

		comboBox_56 = new JComboBox<String>(COLUMNNAMES);
		comboBox_56.setBounds(370, 100, 50, 35);
		frame.getContentPane().add(comboBox_56);

		comboBox_57 = new JComboBox<String>(COLUMNNAMES);
		comboBox_57.setBounds(370, 145, 50, 35);
		frame.getContentPane().add(comboBox_57);

		comboBox_58 = new JComboBox<String>(COLUMNNAMES);
		comboBox_58.setBounds(370, 190, 50, 35);
		frame.getContentPane().add(comboBox_58);

		comboBox_59 = new JComboBox<String>(COLUMNNAMES);
		comboBox_59.setBounds(370, 235, 50, 35);
		frame.getContentPane().add(comboBox_59);

		comboBox_60 = new JComboBox<String>(COLUMNNAMES);
		comboBox_60.setBounds(370, 280, 50, 35);
		frame.getContentPane().add(comboBox_60);

		comboBox_61 = new JComboBox<String>(COLUMNNAMES);
		comboBox_61.setBounds(370, 325, 50, 35);
		frame.getContentPane().add(comboBox_61);

		comboBox_62 = new JComboBox<String>(COLUMNNAMES);
		comboBox_62.setBounds(370, 370, 50, 35);
		frame.getContentPane().add(comboBox_62);

		comboBox_63 = new JComboBox<String>(COLUMNNAMES);
		comboBox_63.setBounds(430, 10, 50, 35);
		frame.getContentPane().add(comboBox_63);

		comboBox_64 = new JComboBox<String>(COLUMNNAMES);
		comboBox_64.setBounds(430, 55, 50, 35);
		frame.getContentPane().add(comboBox_64);

		comboBox_65 = new JComboBox<String>(COLUMNNAMES);
		comboBox_65.setBounds(430, 100, 50, 35);
		frame.getContentPane().add(comboBox_65);

		comboBox_66 = new JComboBox<String>(COLUMNNAMES);
		comboBox_66.setBounds(430, 145, 50, 35);
		frame.getContentPane().add(comboBox_66);

		comboBox_67 = new JComboBox<String>(COLUMNNAMES);
		comboBox_67.setBounds(430, 190, 50, 35);
		frame.getContentPane().add(comboBox_67);

		comboBox_68 = new JComboBox<String>(COLUMNNAMES);
		comboBox_68.setBounds(430, 235, 50, 35);
		frame.getContentPane().add(comboBox_68);

		comboBox_69 = new JComboBox<String>(COLUMNNAMES);
		comboBox_69.setBounds(430, 280, 50, 35);
		frame.getContentPane().add(comboBox_69);

		comboBox_70 = new JComboBox<String>(COLUMNNAMES);
		comboBox_70.setBounds(430, 325, 50, 35);
		frame.getContentPane().add(comboBox_70);

		comboBox_71 = new JComboBox<String>(COLUMNNAMES);
		comboBox_71.setBounds(430, 370, 50, 35);
		frame.getContentPane().add(comboBox_71);

		comboBox_72 = new JComboBox<String>(COLUMNNAMES);
		comboBox_72.setBounds(490, 10, 50, 35);
		frame.getContentPane().add(comboBox_72);

		comboBox_73 = new JComboBox<String>(COLUMNNAMES);
		comboBox_73.setBounds(490, 55, 50, 35);
		frame.getContentPane().add(comboBox_73);

		comboBox_74 = new JComboBox<String>(COLUMNNAMES);
		comboBox_74.setBounds(490, 100, 50, 35);
		frame.getContentPane().add(comboBox_74);

		comboBox_75 = new JComboBox<String>(COLUMNNAMES);
		comboBox_75.setBounds(490, 145, 50, 35);
		frame.getContentPane().add(comboBox_75);

		comboBox_76 = new JComboBox<String>(COLUMNNAMES);
		comboBox_76.setBounds(490, 190, 50, 35);
		frame.getContentPane().add(comboBox_76);

		comboBox_77 = new JComboBox<String>(COLUMNNAMES);
		comboBox_77.setBounds(490, 235, 50, 35);
		frame.getContentPane().add(comboBox_77);

		comboBox_78 = new JComboBox<String>(COLUMNNAMES);
		comboBox_78.setBounds(490, 280, 50, 35);
		frame.getContentPane().add(comboBox_78);

		comboBox_79 = new JComboBox<String>(COLUMNNAMES);
		comboBox_79.setBounds(490, 325, 50, 35);
		frame.getContentPane().add(comboBox_79);

		comboBox_80 = new JComboBox<String>(COLUMNNAMES);
		comboBox_80.setBounds(490, 370, 50, 35);
		frame.getContentPane().add(comboBox_80);

		JButton btnNewButton = new JButton("SOLVE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 30));
		btnNewButton.setBounds(190, 415, 170, 40);
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);
	}

	public void actionPerformed(ActionEvent a) {
		String s = a.getActionCommand();
		if (s.equals("SOLVE")) {
			mysoluchn();
		}
	}

	public static void mysoluchn() {
		int[][] mysuduko = solve();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t1 window = new t1(mysuduko);
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		frame.dispose();

	}

	public static int[][] solve() {
		String a = (String) comboBox.getSelectedItem();
		int n = 0;
		if (!(a.equals("NA"))) {
			n = Integer.parseInt(a);
		}

		String a1 = (String) comboBox_1.getSelectedItem();
		int n1 = 0;
		if (!(a1.equals("NA"))) {
			n1 = Integer.parseInt(a1);
		}
		String a2 = (String) comboBox_2.getSelectedItem();
		int n2 = 0;
		if (!(a2.equals("NA"))) {
			n2 = Integer.parseInt(a2);
		}
		String a3 = (String) comboBox_3.getSelectedItem();
		int n3 = 0;
		if (!(a3.equals("NA"))) {
			n3 = Integer.parseInt(a3);
		}
		String a4 = (String) comboBox_4.getSelectedItem();
		int n4 = 0;
		if (!(a4.equals("NA"))) {
			n4 = Integer.parseInt(a4);
		}
		String a5 = (String) comboBox_5.getSelectedItem();
		int n5 = 0;
		if (!(a5.equals("NA"))) {
			n5 = Integer.parseInt(a5);
		}
		String a6 = (String) comboBox_6.getSelectedItem();
		int n6 = 0;
		if (!(a6.equals("NA"))) {
			n6 = Integer.parseInt(a6);
		}
		String a7 = (String) comboBox_7.getSelectedItem();
		int n7 = 0;
		if (!(a7.equals("NA"))) {
			n7 = Integer.parseInt(a7);
		}
		String a8 = (String) comboBox_8.getSelectedItem();
		int n8 = 0;
		if (!(a8.equals("NA"))) {
			n8 = Integer.parseInt(a8);
		}
		String a9 = (String) comboBox_9.getSelectedItem();
		int n9 = 0;
		if (!(a9.equals("NA"))) {
			n9 = Integer.parseInt(a9);
		}
		String a10 = (String) comboBox_10.getSelectedItem();
		int n10 = 0;
		if (!(a10.equals("NA"))) {
			n10 = Integer.parseInt(a10);
		}
		String a11 = (String) comboBox_11.getSelectedItem();
		int n11 = 0;
		if (!(a11.equals("NA"))) {
			n11 = Integer.parseInt(a11);
		}
		String a12 = (String) comboBox_12.getSelectedItem();
		int n12 = 0;
		if (!(a12.equals("NA"))) {
			n12 = Integer.parseInt(a12);
		}
		String a13 = (String) comboBox_13.getSelectedItem();
		int n13 = 0;
		if (!(a13.equals("NA"))) {
			n13 = Integer.parseInt(a13);
		}
		String a14 = (String) comboBox_14.getSelectedItem();
		int n14 = 0;
		if (!(a14.equals("NA"))) {
			n14 = Integer.parseInt(a14);
		}
		String a15 = (String) comboBox_15.getSelectedItem();
		int n15 = 0;
		if (!(a15.equals("NA"))) {
			n15 = Integer.parseInt(a15);
		}
		String a16 = (String) comboBox_16.getSelectedItem();
		int n16 = 0;
		if (!(a16.equals("NA"))) {
			n16 = Integer.parseInt(a16);
		}
		String a17 = (String) comboBox_17.getSelectedItem();
		int n17 = 0;
		if (!(a17.equals("NA"))) {
			n17 = Integer.parseInt(a17);
		}
		String a18 = (String) comboBox_18.getSelectedItem();
		int n18 = 0;
		if (!(a18.equals("NA"))) {
			n18 = Integer.parseInt(a18);
		}
		String a19 = (String) comboBox_19.getSelectedItem();
		int n19 = 0;
		if (!(a19.equals("NA"))) {
			n19 = Integer.parseInt(a19);
		}
		String a20 = (String) comboBox_20.getSelectedItem();
		int n20 = 0;
		if (!(a20.equals("NA"))) {
			n20 = Integer.parseInt(a20);
		}
		String a21 = (String) comboBox_21.getSelectedItem();
		int n21 = 0;
		if (!(a21.equals("NA"))) {
			n21 = Integer.parseInt(a21);
		}
		String a22 = (String) comboBox_22.getSelectedItem();
		int n22 = 0;
		if (!(a22.equals("NA"))) {
			n22 = Integer.parseInt(a22);
		}
		String a23 = (String) comboBox_23.getSelectedItem();
		int n23 = 0;
		if (!(a23.equals("NA"))) {
			n23 = Integer.parseInt(a23);
		}
		String a24 = (String) comboBox_24.getSelectedItem();
		int n24 = 0;
		if (!(a24.equals("NA"))) {
			n24 = Integer.parseInt(a24);
		}
		String a25 = (String) comboBox_25.getSelectedItem();
		int n25 = 0;
		if (!(a25.equals("NA"))) {
			n25 = Integer.parseInt(a25);
		}
		String a26 = (String) comboBox_26.getSelectedItem();
		int n26 = 0;
		if (!(a26.equals("NA"))) {
			n26 = Integer.parseInt(a26);
		}
		String a27 = (String) comboBox_27.getSelectedItem();
		int n27 = 0;
		if (!(a27.equals("NA"))) {
			n27 = Integer.parseInt(a27);
		}
		String a28 = (String) comboBox_28.getSelectedItem();
		int n28 = 0;
		if (!(a28.equals("NA"))) {
			n28 = Integer.parseInt(a28);
		}
		String a29 = (String) comboBox_29.getSelectedItem();
		int n29 = 0;
		if (!(a29.equals("NA"))) {
			n29 = Integer.parseInt(a29);
		}
		String a30 = (String) comboBox_30.getSelectedItem();
		int n30 = 0;
		if (!(a30.equals("NA"))) {
			n30 = Integer.parseInt(a30);
		}
		String a31 = (String) comboBox_31.getSelectedItem();
		int n31 = 0;
		if (!(a31.equals("NA"))) {
			n31 = Integer.parseInt(a31);
		}
		String a32 = (String) comboBox_32.getSelectedItem();
		int n32 = 0;
		if (!(a32.equals("NA"))) {
			n32 = Integer.parseInt(a32);
		}
		String a33 = (String) comboBox_33.getSelectedItem();
		int n33 = 0;
		if (!(a33.equals("NA"))) {
			n33 = Integer.parseInt(a33);
		}
		String a34 = (String) comboBox_34.getSelectedItem();
		int n34 = 0;
		if (!(a34.equals("NA"))) {
			n34 = Integer.parseInt(a34);
		}
		String a35 = (String) comboBox_35.getSelectedItem();
		int n35 = 0;
		if (!(a35.equals("NA"))) {
			n35 = Integer.parseInt(a35);
		}
		String a36 = (String) comboBox_36.getSelectedItem();
		int n36 = 0;
		if (!(a36.equals("NA"))) {
			n36 = Integer.parseInt(a36);
		}
		String a37 = (String) comboBox_37.getSelectedItem();
		int n37 = 0;
		if (!(a37.equals("NA"))) {
			n37 = Integer.parseInt(a37);
		}
		String a38 = (String) comboBox_38.getSelectedItem();
		int n38 = 0;
		if (!(a38.equals("NA"))) {
			n38 = Integer.parseInt(a38);
		}
		String a39 = (String) comboBox_39.getSelectedItem();
		int n39 = 0;
		if (!(a39.equals("NA"))) {
			n39 = Integer.parseInt(a39);
		}
		String a40 = (String) comboBox_40.getSelectedItem();
		int n40 = 0;
		if (!(a40.equals("NA"))) {
			n40 = Integer.parseInt(a40);
		}
		String a41 = (String) comboBox_41.getSelectedItem();
		int n41 = 0;
		if (!(a41.equals("NA"))) {
			n41 = Integer.parseInt(a41);
		}
		String a42 = (String) comboBox_42.getSelectedItem();
		int n42 = 0;
		if (!(a42.equals("NA"))) {
			n42 = Integer.parseInt(a42);
		}
		String a43 = (String) comboBox_43.getSelectedItem();
		int n43 = 0;
		if (!(a43.equals("NA"))) {
			n43 = Integer.parseInt(a43);
		}
		String a44 = (String) comboBox_44.getSelectedItem();
		int n44 = 0;
		if (!(a44.equals("NA"))) {
			n44 = Integer.parseInt(a44);
		}
		String a45 = (String) comboBox_45.getSelectedItem();
		int n45 = 0;
		if (!(a45.equals("NA"))) {
			n45 = Integer.parseInt(a45);
		}
		String a46 = (String) comboBox_46.getSelectedItem();
		int n46 = 0;
		if (!(a46.equals("NA"))) {
			n46 = Integer.parseInt(a46);
		}
		String a47 = (String) comboBox_47.getSelectedItem();
		int n47 = 0;
		if (!(a47.equals("NA"))) {
			n47 = Integer.parseInt(a47);
		}
		String a48 = (String) comboBox_48.getSelectedItem();
		int n48 = 0;
		if (!(a48.equals("NA"))) {
			n48 = Integer.parseInt(a48);
		}
		String a49 = (String) comboBox_49.getSelectedItem();
		int n49 = 0;
		if (!(a49.equals("NA"))) {
			n49 = Integer.parseInt(a49);
		}
		String a50 = (String) comboBox_50.getSelectedItem();
		int n50 = 0;
		if (!(a50.equals("NA"))) {
			n50 = Integer.parseInt(a50);
		}
		String a51 = (String) comboBox_51.getSelectedItem();
		int n51 = 0;
		if (!(a51.equals("NA"))) {
			n51 = Integer.parseInt(a51);
		}
		String a52 = (String) comboBox_52.getSelectedItem();
		int n52 = 0;
		if (!(a52.equals("NA"))) {
			n52 = Integer.parseInt(a52);
		}
		String a53 = (String) comboBox_53.getSelectedItem();
		int n53 = 0;
		if (!(a53.equals("NA"))) {
			n53 = Integer.parseInt(a53);
		}
		String a54 = (String) comboBox_54.getSelectedItem();
		int n54 = 0;
		if (!(a54.equals("NA"))) {
			n54 = Integer.parseInt(a54);
		}
		String a55 = (String) comboBox_55.getSelectedItem();
		int n55 = 0;
		if (!(a55.equals("NA"))) {
			n55 = Integer.parseInt(a55);
		}
		String a56 = (String) comboBox_56.getSelectedItem();
		int n56 = 0;
		if (!(a56.equals("NA"))) {
			n56 = Integer.parseInt(a56);
		}
		String a57 = (String) comboBox_57.getSelectedItem();
		int n57 = 0;
		if (!(a57.equals("NA"))) {
			n57 = Integer.parseInt(a57);
		}
		String a58 = (String) comboBox_58.getSelectedItem();
		int n58 = 0;
		if (!(a58.equals("NA"))) {
			n58 = Integer.parseInt(a58);
		}
		String a59 = (String) comboBox_59.getSelectedItem();
		int n59 = 0;
		if (!(a59.equals("NA"))) {
			n59 = Integer.parseInt(a59);
		}
		String a60 = (String) comboBox_60.getSelectedItem();
		int n60 = 0;
		if (!(a60.equals("NA"))) {
			n60 = Integer.parseInt(a60);
		}
		String a61 = (String) comboBox_61.getSelectedItem();
		int n61 = 0;
		if (!(a61.equals("NA"))) {
			n61 = Integer.parseInt(a61);
		}
		String a62 = (String) comboBox_62.getSelectedItem();
		int n62 = 0;
		if (!(a62.equals("NA"))) {
			n62 = Integer.parseInt(a62);
		}
		String a63 = (String) comboBox_63.getSelectedItem();
		int n63 = 0;
		if (!(a63.equals("NA"))) {
			n63 = Integer.parseInt(a63);
		}
		String a64 = (String) comboBox_64.getSelectedItem();
		int n64 = 0;
		if (!(a64.equals("NA"))) {
			n64 = Integer.parseInt(a64);
		}
		String a65 = (String) comboBox_65.getSelectedItem();
		int n65 = 0;
		if (!(a65.equals("NA"))) {
			n65 = Integer.parseInt(a65);
		}
		String a66 = (String) comboBox_66.getSelectedItem();
		int n66 = 0;
		if (!(a66.equals("NA"))) {
			n66 = Integer.parseInt(a66);
		}
		String a67 = (String) comboBox_67.getSelectedItem();
		int n67 = 0;
		if (!(a67.equals("NA"))) {
			n67 = Integer.parseInt(a67);
		}
		String a68 = (String) comboBox_68.getSelectedItem();
		int n68 = 0;
		if (!(a68.equals("NA"))) {
			n68 = Integer.parseInt(a68);
		}
		String a69 = (String) comboBox_69.getSelectedItem();
		int n69 = 0;
		if (!(a69.equals("NA"))) {
			n69 = Integer.parseInt(a69);
		}
		String a70 = (String) comboBox_70.getSelectedItem();
		int n70 = 0;
		if (!(a70.equals("NA"))) {
			n70 = Integer.parseInt(a70);
		}
		String a71 = (String) comboBox_71.getSelectedItem();
		int n71 = 0;
		if (!(a71.equals("NA"))) {
			n71 = Integer.parseInt(a71);
		}
		String a72 = (String) comboBox_72.getSelectedItem();
		int n72 = 0;
		if (!(a72.equals("NA"))) {
			n72 = Integer.parseInt(a72);
		}
		String a73 = (String) comboBox_73.getSelectedItem();
		int n73 = 0;
		if (!(a73.equals("NA"))) {
			n73 = Integer.parseInt(a73);
		}
		String a74 = (String) comboBox_74.getSelectedItem();
		int n74 = 0;
		if (!(a74.equals("NA"))) {
			n74 = Integer.parseInt(a74);
		}
		String a75 = (String) comboBox_75.getSelectedItem();
		int n75 = 0;
		if (!(a75.equals("NA"))) {
			n75 = Integer.parseInt(a75);
		}
		String a76 = (String) comboBox_76.getSelectedItem();
		int n76 = 0;
		if (!(a76.equals("NA"))) {
			n76 = Integer.parseInt(a76);
		}
		String a77 = (String) comboBox_77.getSelectedItem();
		int n77 = 0;
		if (!(a77.equals("NA"))) {
			n77 = Integer.parseInt(a77);
		}
		String a78 = (String) comboBox_78.getSelectedItem();
		int n78 = 0;
		if (!(a78.equals("NA"))) {
			n78 = Integer.parseInt(a78);
		}
		String a79 = (String) comboBox_79.getSelectedItem();
		int n79 = 0;
		if (!(a79.equals("NA"))) {
			n79 = Integer.parseInt(a79);
		}
		String a80 = (String) comboBox_80.getSelectedItem();
		int n80 = 0;
		if (!(a80.equals("NA"))) {
			n80 = Integer.parseInt(a80);
		}
		int[][] mysuduko = { { n, n9, n18, n27, n36, n45, n54, n63, n72 },
				{ n1, n10, n19, n28, n37, n46, n55, n64, n73 }, { n2, n11, n20, n29, n38, n47, n56, n65, n74 },
				{ n3, n12, n21, n30, n39, n48, n57, n66, n75 }, { n4, n13, n22, n31, n40, n49, n58, n67, n76 },
				{ n5, n14, n23, n32, n41, n50, n59, n68, n77 }, { n6, n15, n24, n33, n42, n51, n60, n69, n78 },
				{ n7, n16, n25, n34, n43, n52, n61, n70, n79 }, { n8, n17, n26, n35, n44, n53, n62, n71, n80 } };
		return mysuduko;
	}
}

class t1 {
	public JFrame frame2;

//	public static void main(String[] args) {
//
//	}

	public t1(int[][] mysuduko) {
		initialize2();
		maker(mysuduko);
	}

	public static JLabel lblNewLabel;
	public static JLabel label;
	public static JLabel label_1;
	public static JLabel label_2;
	public static JLabel label_3;
	public static JLabel label_4;
	public static JLabel label_5;
	public static JLabel label_6;
	public static JLabel label_7;
	public static JLabel label_8;
	public static JLabel label_9;
	public static JLabel label_10;
	public static JLabel label_11;
	public static JLabel label_12;
	public static JLabel label_13;
	public static JLabel label_14;
	public static JLabel label_15;
	public static JLabel label_16;
	public static JLabel label_17;
	public static JLabel label_18;
	public static JLabel label_19;
	public static JLabel label_20;
	public static JLabel label_21;
	public static JLabel label_22;
	public static JLabel label_23;
	public static JLabel label_24;
	public static JLabel label_25;
	public static JLabel label_26;
	public static JLabel label_27;
	public static JLabel label_28;
	public static JLabel label_29;
	public static JLabel label_30;
	public static JLabel label_31;
	public static JLabel label_32;
	public static JLabel label_33;
	public static JLabel label_34;
	public static JLabel label_35;
	public static JLabel label_36;
	public static JLabel label_37;
	public static JLabel label_38;
	public static JLabel label_39;
	public static JLabel label_40;
	public static JLabel label_41;
	public static JLabel label_42;
	public static JLabel label_43;
	public static JLabel label_44;
	public static JLabel label_45;
	public static JLabel label_46;
	public static JLabel label_47;
	public static JLabel label_48;
	public static JLabel label_49;
	public static JLabel label_50;
	public static JLabel label_51;
	public static JLabel label_52;
	public static JLabel label_53;
	public static JLabel label_54;
	public static JLabel label_55;
	public static JLabel label_56;
	public static JLabel label_57;
	public static JLabel label_58;
	public static JLabel label_59;
	public static JLabel label_60;
	public static JLabel label_61;
	public static JLabel label_62;
	public static JLabel label_63;
	public static JLabel label_64;
	public static JLabel label_65;
	public static JLabel label_66;
	public static JLabel label_67;
	public static JLabel label_68;
	public static JLabel label_69;
	public static JLabel label_70;
	public static JLabel label_71;
	public static JLabel label_72;
	public static JLabel label_73;
	public static JLabel label_74;
	public static JLabel label_75;
	public static JLabel label_76;
	public static JLabel label_77;
	public static JLabel label_78;
	public static JLabel label_79;

	public void initialize2() {
		frame2 = new JFrame();
		frame2.setBackground(SystemColor.text);
		frame2.setTitle("SUDUKO SOLUTION");
		frame2.getContentPane().setBackground(new Color(255, 255, 204));
		frame2.setBounds(100, 100, 615, 500);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		lblNewLabel = new JLabel("SOL");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 10, 56, 40);
		frame2.getContentPane().add(lblNewLabel);

		label = new JLabel("SOL");
		label.setFont(new Font("Verdana", Font.BOLD, 24));
		label.setBounds(10, 60, 56, 40);
		frame2.getContentPane().add(label);

		label_1 = new JLabel("SOL");
		label_1.setFont(new Font("Verdana", Font.BOLD, 24));
		label_1.setBounds(10, 110, 56, 40);
		frame2.getContentPane().add(label_1);

		label_2 = new JLabel("SOL");
		label_2.setFont(new Font("Verdana", Font.BOLD, 24));
		label_2.setBounds(10, 160, 56, 40);
		frame2.getContentPane().add(label_2);

		label_3 = new JLabel("SOL");
		label_3.setFont(new Font("Verdana", Font.BOLD, 24));
		label_3.setBounds(10, 210, 56, 40);
		frame2.getContentPane().add(label_3);

		label_4 = new JLabel("SOL");
		label_4.setFont(new Font("Verdana", Font.BOLD, 24));
		label_4.setBounds(10, 260, 56, 40);
		frame2.getContentPane().add(label_4);

		label_5 = new JLabel("SOL");
		label_5.setFont(new Font("Verdana", Font.BOLD, 24));
		label_5.setBounds(10, 310, 56, 40);
		frame2.getContentPane().add(label_5);

		label_6 = new JLabel("SOL");
		label_6.setFont(new Font("Verdana", Font.BOLD, 24));
		label_6.setBounds(10, 360, 56, 40);
		frame2.getContentPane().add(label_6);

		label_7 = new JLabel("SOL");
		label_7.setFont(new Font("Verdana", Font.BOLD, 24));
		label_7.setBounds(10, 410, 56, 40);
		frame2.getContentPane().add(label_7);

		label_8 = new JLabel("SOL");
		label_8.setFont(new Font("Verdana", Font.BOLD, 24));
		label_8.setBounds(76, 10, 56, 40);
		frame2.getContentPane().add(label_8);

		label_9 = new JLabel("SOL");
		label_9.setFont(new Font("Verdana", Font.BOLD, 24));
		label_9.setBounds(76, 60, 56, 40);
		frame2.getContentPane().add(label_9);

		label_10 = new JLabel("SOL");
		label_10.setFont(new Font("Verdana", Font.BOLD, 24));
		label_10.setBounds(76, 110, 56, 40);
		frame2.getContentPane().add(label_10);

		label_11 = new JLabel("SOL");
		label_11.setFont(new Font("Verdana", Font.BOLD, 24));
		label_11.setBounds(76, 160, 56, 40);
		frame2.getContentPane().add(label_11);

		label_12 = new JLabel("SOL");
		label_12.setFont(new Font("Verdana", Font.BOLD, 24));
		label_12.setBounds(76, 210, 56, 40);
		frame2.getContentPane().add(label_12);

		label_13 = new JLabel("SOL");
		label_13.setFont(new Font("Verdana", Font.BOLD, 24));
		label_13.setBounds(76, 260, 56, 40);
		frame2.getContentPane().add(label_13);

		label_14 = new JLabel("SOL");
		label_14.setFont(new Font("Verdana", Font.BOLD, 24));
		label_14.setBounds(142, 160, 56, 40);
		frame2.getContentPane().add(label_14);

		label_15 = new JLabel("SOL");
		label_15.setFont(new Font("Verdana", Font.BOLD, 24));
		label_15.setBounds(142, 210, 56, 40);
		frame2.getContentPane().add(label_15);

		label_16 = new JLabel("SOL");
		label_16.setFont(new Font("Verdana", Font.BOLD, 24));
		label_16.setBounds(142, 260, 56, 40);
		frame2.getContentPane().add(label_16);

		label_17 = new JLabel("SOL");
		label_17.setFont(new Font("Verdana", Font.BOLD, 24));
		label_17.setBounds(76, 310, 56, 40);
		frame2.getContentPane().add(label_17);

		label_18 = new JLabel("SOL");
		label_18.setFont(new Font("Verdana", Font.BOLD, 24));
		label_18.setBounds(76, 360, 56, 40);
		frame2.getContentPane().add(label_18);

		label_19 = new JLabel("SOL");
		label_19.setFont(new Font("Verdana", Font.BOLD, 24));
		label_19.setBounds(76, 410, 56, 40);
		frame2.getContentPane().add(label_19);

		label_20 = new JLabel("SOL");
		label_20.setFont(new Font("Verdana", Font.BOLD, 24));
		label_20.setBounds(142, 310, 56, 40);
		frame2.getContentPane().add(label_20);

		label_21 = new JLabel("SOL");
		label_21.setFont(new Font("Verdana", Font.BOLD, 24));
		label_21.setBounds(142, 360, 56, 40);
		frame2.getContentPane().add(label_21);

		label_22 = new JLabel("SOL");
		label_22.setFont(new Font("Verdana", Font.BOLD, 24));
		label_22.setBounds(142, 410, 56, 40);
		frame2.getContentPane().add(label_22);

		label_23 = new JLabel("SOL");
		label_23.setFont(new Font("Verdana", Font.BOLD, 24));
		label_23.setBounds(142, 10, 56, 40);
		frame2.getContentPane().add(label_23);

		label_24 = new JLabel("SOL");
		label_24.setFont(new Font("Verdana", Font.BOLD, 24));
		label_24.setBounds(142, 60, 56, 40);
		frame2.getContentPane().add(label_24);

		label_25 = new JLabel("SOL");
		label_25.setFont(new Font("Verdana", Font.BOLD, 24));
		label_25.setBounds(142, 110, 56, 40);
		frame2.getContentPane().add(label_25);

		label_26 = new JLabel("SOL");
		label_26.setFont(new Font("Verdana", Font.BOLD, 24));
		label_26.setBounds(208, 10, 56, 40);
		frame2.getContentPane().add(label_26);

		label_27 = new JLabel("SOL");
		label_27.setFont(new Font("Verdana", Font.BOLD, 24));
		label_27.setBounds(208, 60, 56, 40);
		frame2.getContentPane().add(label_27);

		label_28 = new JLabel("SOL");
		label_28.setFont(new Font("Verdana", Font.BOLD, 24));
		label_28.setBounds(208, 110, 56, 40);
		frame2.getContentPane().add(label_28);

		label_29 = new JLabel("SOL");
		label_29.setFont(new Font("Verdana", Font.BOLD, 24));
		label_29.setBounds(208, 160, 56, 40);
		frame2.getContentPane().add(label_29);

		label_30 = new JLabel("SOL");
		label_30.setFont(new Font("Verdana", Font.BOLD, 24));
		label_30.setBounds(208, 210, 56, 40);
		frame2.getContentPane().add(label_30);

		label_31 = new JLabel("SOL");
		label_31.setFont(new Font("Verdana", Font.BOLD, 24));
		label_31.setBounds(208, 260, 56, 40);
		frame2.getContentPane().add(label_31);

		label_32 = new JLabel("SOL");
		label_32.setFont(new Font("Verdana", Font.BOLD, 24));
		label_32.setBounds(274, 160, 56, 40);
		frame2.getContentPane().add(label_32);

		label_33 = new JLabel("SOL");
		label_33.setFont(new Font("Verdana", Font.BOLD, 24));
		label_33.setBounds(274, 210, 56, 40);
		frame2.getContentPane().add(label_33);

		label_34 = new JLabel("SOL");
		label_34.setFont(new Font("Verdana", Font.BOLD, 24));
		label_34.setBounds(274, 260, 56, 40);
		frame2.getContentPane().add(label_34);

		label_35 = new JLabel("SOL");
		label_35.setFont(new Font("Verdana", Font.BOLD, 24));
		label_35.setBounds(208, 310, 56, 40);
		frame2.getContentPane().add(label_35);

		label_36 = new JLabel("SOL");
		label_36.setFont(new Font("Verdana", Font.BOLD, 24));
		label_36.setBounds(208, 360, 56, 40);
		frame2.getContentPane().add(label_36);

		label_37 = new JLabel("SOL");
		label_37.setFont(new Font("Verdana", Font.BOLD, 24));
		label_37.setBounds(208, 410, 56, 40);
		frame2.getContentPane().add(label_37);

		label_38 = new JLabel("SOL");
		label_38.setFont(new Font("Verdana", Font.BOLD, 24));
		label_38.setBounds(274, 310, 56, 40);
		frame2.getContentPane().add(label_38);

		label_39 = new JLabel("SOL");
		label_39.setFont(new Font("Verdana", Font.BOLD, 24));
		label_39.setBounds(274, 360, 56, 40);
		frame2.getContentPane().add(label_39);

		label_40 = new JLabel("SOL");
		label_40.setFont(new Font("Verdana", Font.BOLD, 24));
		label_40.setBounds(274, 410, 56, 40);
		frame2.getContentPane().add(label_40);

		label_41 = new JLabel("SOL");
		label_41.setFont(new Font("Verdana", Font.BOLD, 24));
		label_41.setBounds(274, 10, 56, 40);
		frame2.getContentPane().add(label_41);

		label_42 = new JLabel("SOL");
		label_42.setFont(new Font("Verdana", Font.BOLD, 24));
		label_42.setBounds(274, 60, 56, 40);
		frame2.getContentPane().add(label_42);

		label_43 = new JLabel("SOL");
		label_43.setFont(new Font("Verdana", Font.BOLD, 24));
		label_43.setBounds(274, 110, 56, 40);
		frame2.getContentPane().add(label_43);

		label_44 = new JLabel("SOL");
		label_44.setFont(new Font("Verdana", Font.BOLD, 24));
		label_44.setBounds(340, 10, 56, 40);
		frame2.getContentPane().add(label_44);

		label_45 = new JLabel("SOL");
		label_45.setFont(new Font("Verdana", Font.BOLD, 24));
		label_45.setBounds(340, 60, 56, 40);
		frame2.getContentPane().add(label_45);

		label_46 = new JLabel("SOL");
		label_46.setFont(new Font("Verdana", Font.BOLD, 24));
		label_46.setBounds(340, 110, 56, 40);
		frame2.getContentPane().add(label_46);

		label_47 = new JLabel("SOL");
		label_47.setFont(new Font("Verdana", Font.BOLD, 24));
		label_47.setBounds(340, 160, 56, 40);
		frame2.getContentPane().add(label_47);

		label_48 = new JLabel("SOL");
		label_48.setFont(new Font("Verdana", Font.BOLD, 24));
		label_48.setBounds(340, 210, 56, 40);
		frame2.getContentPane().add(label_48);

		label_49 = new JLabel("SOL");
		label_49.setFont(new Font("Verdana", Font.BOLD, 24));
		label_49.setBounds(340, 260, 56, 40);
		frame2.getContentPane().add(label_49);

		label_50 = new JLabel("SOL");
		label_50.setFont(new Font("Verdana", Font.BOLD, 24));
		label_50.setBounds(406, 160, 56, 40);
		frame2.getContentPane().add(label_50);

		label_51 = new JLabel("SOL");
		label_51.setFont(new Font("Verdana", Font.BOLD, 24));
		label_51.setBounds(406, 210, 56, 40);
		frame2.getContentPane().add(label_51);

		label_52 = new JLabel("SOL");
		label_52.setFont(new Font("Verdana", Font.BOLD, 24));
		label_52.setBounds(406, 260, 56, 40);
		frame2.getContentPane().add(label_52);

		label_53 = new JLabel("SOL");
		label_53.setFont(new Font("Verdana", Font.BOLD, 24));
		label_53.setBounds(340, 310, 56, 40);
		frame2.getContentPane().add(label_53);

		label_54 = new JLabel("SOL");
		label_54.setFont(new Font("Verdana", Font.BOLD, 24));
		label_54.setBounds(340, 360, 56, 40);
		frame2.getContentPane().add(label_54);

		label_55 = new JLabel("SOL");
		label_55.setFont(new Font("Verdana", Font.BOLD, 24));
		label_55.setBounds(340, 410, 56, 40);
		frame2.getContentPane().add(label_55);

		label_56 = new JLabel("SOL");
		label_56.setFont(new Font("Verdana", Font.BOLD, 24));
		label_56.setBounds(406, 310, 56, 40);
		frame2.getContentPane().add(label_56);

		label_57 = new JLabel("SOL");
		label_57.setFont(new Font("Verdana", Font.BOLD, 24));
		label_57.setBounds(406, 360, 56, 40);
		frame2.getContentPane().add(label_57);

		label_58 = new JLabel("SOL");
		label_58.setFont(new Font("Verdana", Font.BOLD, 24));
		label_58.setBounds(406, 410, 56, 40);
		frame2.getContentPane().add(label_58);

		label_59 = new JLabel("SOL");
		label_59.setFont(new Font("Verdana", Font.BOLD, 24));
		label_59.setBounds(406, 10, 56, 40);
		frame2.getContentPane().add(label_59);

		label_60 = new JLabel("SOL");
		label_60.setFont(new Font("Verdana", Font.BOLD, 24));
		label_60.setBounds(406, 60, 56, 40);
		frame2.getContentPane().add(label_60);

		label_61 = new JLabel("SOL");
		label_61.setFont(new Font("Verdana", Font.BOLD, 24));
		label_61.setBounds(406, 110, 56, 40);
		frame2.getContentPane().add(label_61);

		label_62 = new JLabel("SOL");
		label_62.setFont(new Font("Verdana", Font.BOLD, 24));
		label_62.setBounds(472, 10, 56, 40);
		frame2.getContentPane().add(label_62);

		label_63 = new JLabel("SOL");
		label_63.setFont(new Font("Verdana", Font.BOLD, 24));
		label_63.setBounds(472, 60, 56, 40);
		frame2.getContentPane().add(label_63);

		label_64 = new JLabel("SOL");
		label_64.setFont(new Font("Verdana", Font.BOLD, 24));
		label_64.setBounds(472, 110, 56, 40);
		frame2.getContentPane().add(label_64);

		label_65 = new JLabel("SOL");
		label_65.setFont(new Font("Verdana", Font.BOLD, 24));
		label_65.setBounds(472, 160, 56, 40);
		frame2.getContentPane().add(label_65);

		label_66 = new JLabel("SOL");
		label_66.setFont(new Font("Verdana", Font.BOLD, 24));
		label_66.setBounds(472, 210, 56, 40);
		frame2.getContentPane().add(label_66);

		label_67 = new JLabel("SOL");
		label_67.setFont(new Font("Verdana", Font.BOLD, 24));
		label_67.setBounds(472, 260, 56, 40);
		frame2.getContentPane().add(label_67);

		label_68 = new JLabel("SOL");
		label_68.setFont(new Font("Verdana", Font.BOLD, 24));
		label_68.setBounds(538, 160, 56, 40);
		frame2.getContentPane().add(label_68);

		label_69 = new JLabel("SOL");
		label_69.setFont(new Font("Verdana", Font.BOLD, 24));
		label_69.setBounds(538, 210, 56, 40);
		frame2.getContentPane().add(label_69);

		label_70 = new JLabel("SOL");
		label_70.setFont(new Font("Verdana", Font.BOLD, 24));
		label_70.setBounds(538, 260, 56, 40);
		frame2.getContentPane().add(label_70);

		label_71 = new JLabel("SOL");
		label_71.setFont(new Font("Verdana", Font.BOLD, 24));
		label_71.setBounds(472, 310, 56, 40);
		frame2.getContentPane().add(label_71);

		label_72 = new JLabel("SOL");
		label_72.setFont(new Font("Verdana", Font.BOLD, 24));
		label_72.setBounds(472, 360, 56, 40);
		frame2.getContentPane().add(label_72);

		label_73 = new JLabel("SOL");
		label_73.setFont(new Font("Verdana", Font.BOLD, 24));
		label_73.setBounds(472, 410, 56, 40);
		frame2.getContentPane().add(label_73);

		label_74 = new JLabel("SOL");
		label_74.setFont(new Font("Verdana", Font.BOLD, 24));
		label_74.setBounds(538, 310, 56, 40);
		frame2.getContentPane().add(label_74);

		label_75 = new JLabel("SOL");
		label_75.setFont(new Font("Verdana", Font.BOLD, 24));
		label_75.setBounds(538, 360, 56, 40);
		frame2.getContentPane().add(label_75);

		label_76 = new JLabel("SOL");
		label_76.setFont(new Font("Verdana", Font.BOLD, 24));
		label_76.setBounds(538, 410, 56, 40);
		frame2.getContentPane().add(label_76);

		label_77 = new JLabel("SOL");
		label_77.setFont(new Font("Verdana", Font.BOLD, 24));
		label_77.setBounds(538, 10, 56, 40);
		frame2.getContentPane().add(label_77);

		label_78 = new JLabel("SOL");
		label_78.setFont(new Font("Verdana", Font.BOLD, 24));
		label_78.setBounds(538, 60, 56, 40);
		frame2.getContentPane().add(label_78);

		label_79 = new JLabel("SOL");
		label_79.setFont(new Font("Verdana", Font.BOLD, 24));
		label_79.setBounds(538, 110, 56, 40);
		frame2.getContentPane().add(label_79);
	}

	public static void maker(int[][] boarded) {
		int[][] answer = mysolver.mainsolver(boarded);
		lblNewLabel.setText(Integer.toString(answer[0][0]));
		label.setText(Integer.toString(answer[1][0]));
		label_1.setText(Integer.toString(answer[2][0]));
		label_2.setText(Integer.toString(answer[3][0]));
		label_3.setText(Integer.toString(answer[4][0]));
		label_4.setText(Integer.toString(answer[5][0]));
		label_5.setText(Integer.toString(answer[6][0]));
		label_6.setText(Integer.toString(answer[7][0]));
		label_7.setText(Integer.toString(answer[8][0]));
		label_8.setText(Integer.toString(answer[0][1]));
		label_9.setText(Integer.toString(answer[1][1]));
		label_10.setText(Integer.toString(answer[2][1]));
		label_11.setText(Integer.toString(answer[3][1]));
		label_12.setText(Integer.toString(answer[4][1]));
		label_13.setText(Integer.toString(answer[5][1]));
		label_14.setText(Integer.toString(answer[3][2]));
		label_15.setText(Integer.toString(answer[4][2]));
		label_16.setText(Integer.toString(answer[5][2]));
		label_17.setText(Integer.toString(answer[6][1]));
		label_18.setText(Integer.toString(answer[7][1]));
		label_19.setText(Integer.toString(answer[8][1]));
		label_20.setText(Integer.toString(answer[6][2]));
		label_21.setText(Integer.toString(answer[7][2]));
		label_22.setText(Integer.toString(answer[8][2]));
		label_23.setText(Integer.toString(answer[0][2]));
		label_24.setText(Integer.toString(answer[1][2]));
		label_25.setText(Integer.toString(answer[2][2]));
		label_26.setText(Integer.toString(answer[0][3]));
		label_27.setText(Integer.toString(answer[1][3]));
		label_28.setText(Integer.toString(answer[2][3]));
		label_29.setText(Integer.toString(answer[3][3]));
		label_30.setText(Integer.toString(answer[4][3]));
		label_31.setText(Integer.toString(answer[5][3]));
		label_32.setText(Integer.toString(answer[3][4]));
		label_33.setText(Integer.toString(answer[4][4]));
		label_34.setText(Integer.toString(answer[5][4]));
		label_35.setText(Integer.toString(answer[6][3]));
		label_36.setText(Integer.toString(answer[7][3]));
		label_37.setText(Integer.toString(answer[8][3]));
		label_38.setText(Integer.toString(answer[6][4]));
		label_39.setText(Integer.toString(answer[7][4]));
		label_40.setText(Integer.toString(answer[8][4]));
		label_41.setText(Integer.toString(answer[0][4]));
		label_42.setText(Integer.toString(answer[1][4]));
		label_43.setText(Integer.toString(answer[2][4]));
		label_44.setText(Integer.toString(answer[0][5]));
		label_45.setText(Integer.toString(answer[1][5]));
		label_46.setText(Integer.toString(answer[2][5]));
		label_47.setText(Integer.toString(answer[3][5]));
		label_48.setText(Integer.toString(answer[4][5]));
		label_49.setText(Integer.toString(answer[5][5]));
		label_50.setText(Integer.toString(answer[3][6]));
		label_51.setText(Integer.toString(answer[4][6]));
		label_52.setText(Integer.toString(answer[5][6]));
		label_53.setText(Integer.toString(answer[6][5]));
		label_54.setText(Integer.toString(answer[7][5]));
		label_55.setText(Integer.toString(answer[8][5]));
		label_56.setText(Integer.toString(answer[6][6]));
		label_57.setText(Integer.toString(answer[7][6]));
		label_58.setText(Integer.toString(answer[8][6]));
		label_59.setText(Integer.toString(answer[0][6]));
		label_60.setText(Integer.toString(answer[1][6]));
		label_61.setText(Integer.toString(answer[2][6]));
		label_62.setText(Integer.toString(answer[0][7]));
		label_63.setText(Integer.toString(answer[1][7]));
		label_64.setText(Integer.toString(answer[2][7]));
		label_65.setText(Integer.toString(answer[3][7]));
		label_66.setText(Integer.toString(answer[4][7]));
		label_67.setText(Integer.toString(answer[5][7]));
		label_68.setText(Integer.toString(answer[3][8]));
		label_69.setText(Integer.toString(answer[4][8]));
		label_70.setText(Integer.toString(answer[5][8]));
		label_71.setText(Integer.toString(answer[6][7]));
		label_72.setText(Integer.toString(answer[7][7]));
		label_73.setText(Integer.toString(answer[8][7]));
		label_74.setText(Integer.toString(answer[6][8]));
		label_75.setText(Integer.toString(answer[7][8]));
		label_76.setText(Integer.toString(answer[8][8]));
		label_77.setText(Integer.toString(answer[0][8]));
		label_78.setText(Integer.toString(answer[1][8]));
		label_79.setText(Integer.toString(answer[2][8]));
	}
}

class mysolver {
	public static int[][] mainsolver(int[][] boarded) {
		int[][] board = boarded;
		int n = 9;
		boolean[][] fixedcells = new boolean[n][n];
		setfixedcells(board, fixedcells, n);
		boolean ans = mysolver(board, fixedcells, 0, 0, n);
		if (ans) {
			return (board);
		} else {
			int[][] np = { { -1, -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
					{ -1, -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
					{ -1, -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
					{ -1, -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
					{ -1, -1, -1, -1, -1, -1, -1, -1, -1 } };
			return np;
		}
	}

	public static boolean mysolver(int[][] board, boolean[][] fixedcells, int row, int col, int n) {
		if (row == n) {
			return true;
		}
		if (col == n) {
			return mysolver(board, fixedcells, row + 1, 0, n);
		}
		if (fixedcells[row][col]) {
			return mysolver(board, fixedcells, row, col + 1, n);
		}
		for (int setnum = 1; setnum <= n; setnum++) {
			boolean check = canplace(board, row, col, n, setnum);
			if (check) {
				board[row][col] = setnum;
				boolean solverest = mysolver(board, fixedcells, row, col + 1, n);
				if (solverest) {
					return true;
				} else {
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	public static boolean canplace(int[][] board, int row, int col, int n, int setnum) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == setnum) {
				return false;
			}
			if (board[row][i] == setnum) {
				return false;
			}
		}

		// check number present in cells
		int sqrtN = (int) Math.sqrt(board.length);
		int startRow = (row / sqrtN) * sqrtN;
		int startCol = (col / sqrtN) * sqrtN;
		for (int i = startRow; i < startRow + sqrtN; i++) {
			for (int j = startCol; j < startCol + sqrtN; j++) {
				if (board[i][j] == setnum) {
					return false;
				}
			}
		}

		return true;
	}

	public static void setfixedcells(int[][] board, boolean[][] fixedcells, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] != 0) {
					fixedcells[i][j] = true;
				}
			}
		}
	}
}