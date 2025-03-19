package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixEtudiantGui extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ChoixEtudiantGui() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		setBackground(new Color(192, 63, 99));
		setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3.setBounds(524, 160, 46, 14);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_2.setBounds(524, 253, 46, 14);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton.setBounds(524, 319, 46, 14);
		add(rdbtnNewRadioButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 805, 44);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("C’est l’heure de choisir ta voie ");
		lblNewLabel.setForeground(new Color(255, 128, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 406, 805, 55);
		add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblEcoleSuprieurDingnieurs = new JLabel("Ecole Supérieure d’Ingénieurs en Génie Electrique ");
		lblEcoleSuprieurDingnieurs.setForeground(new Color(255, 128, 192));
		lblEcoleSuprieurDingnieurs.setFont(new Font("Tahoma", Font.ITALIC, 25));
		panel_1.add(lblEcoleSuprieurDingnieurs);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ChoixEtudiantGui.class.getResource("/data/logo_esigelec.png")));
		panel_1.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_1.setBounds(524, 207, 46, 14);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		rdbtnNewRadioButton_4.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_4.setBounds(524, 219, 46, 14);
		add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("");
		rdbtnNewRadioButton_3_1.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_1.setBounds(524, 190, 46, 14);
		add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_3_2 = new JRadioButton("");
		rdbtnNewRadioButton_3_2.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_2.setBounds(716, 126, 55, 14);
		add(rdbtnNewRadioButton_3_2);
		
		JRadioButton rdbtnNewRadioButton_3_3 = new JRadioButton("");
		rdbtnNewRadioButton_3_3.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_3.setBounds(524, 287, 46, 14);
		add(rdbtnNewRadioButton_3_3);
		
		JRadioButton rdbtnNewRadioButton_3_4 = new JRadioButton("");
		rdbtnNewRadioButton_3_4.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_4.setBounds(524, 270, 46, 14);
		add(rdbtnNewRadioButton_3_4);
		
		JRadioButton rdbtnNewRadioButton_3_5 = new JRadioButton("");
		rdbtnNewRadioButton_3_5.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_5.setBounds(524, 143, 46, 14);
		add(rdbtnNewRadioButton_3_5);
		
		JRadioButton rdbtnNewRadioButton_3_6 = new JRadioButton("");
		rdbtnNewRadioButton_3_6.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_6.setBounds(524, 177, 46, 14);
		add(rdbtnNewRadioButton_3_6);
		
		JRadioButton rdbtnNewRadioButton_3_7 = new JRadioButton("");
		rdbtnNewRadioButton_3_7.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_7.setBounds(668, 126, 55, 14);
		add(rdbtnNewRadioButton_3_7);
		
		JRadioButton rdbtnNewRadioButton_3_8 = new JRadioButton("");
		rdbtnNewRadioButton_3_8.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_8.setBounds(620, 126, 46, 14);
		add(rdbtnNewRadioButton_3_8);
		
		JRadioButton rdbtnNewRadioButton_3_9 = new JRadioButton("");
		rdbtnNewRadioButton_3_9.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_9.setBounds(524, 126, 46, 14);
		add(rdbtnNewRadioButton_3_9);
		
		JRadioButton rdbtnNewRadioButton_3_10 = new JRadioButton("");
		rdbtnNewRadioButton_3_10.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10.setBounds(572, 126, 46, 14);
		add(rdbtnNewRadioButton_3_10);
		
		JRadioButton rdbtnNewRadioButton_3_11 = new JRadioButton("");
		rdbtnNewRadioButton_3_11.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_11.setBounds(524, 236, 46, 14);
		add(rdbtnNewRadioButton_3_11);
		
		JRadioButton rdbtnNewRadioButton_3_12 = new JRadioButton("");
		rdbtnNewRadioButton_3_12.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_12.setBounds(524, 270, 46, 14);
		add(rdbtnNewRadioButton_3_12);
		
		JRadioButton rdbtnNewRadioButton_3_13 = new JRadioButton("");
		rdbtnNewRadioButton_3_13.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_13.setBounds(524, 302, 46, 14);
		add(rdbtnNewRadioButton_3_13);
		
		JRadioButton rdbtnNewRadioButton_3_14 = new JRadioButton("");
		rdbtnNewRadioButton_3_14.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_14.setBounds(524, 126, 46, 14);
		add(rdbtnNewRadioButton_3_14);
		
		JRadioButton rdbtnNewRadioButton_3_15 = new JRadioButton("");
		rdbtnNewRadioButton_3_15.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_15.setBounds(524, 143, 46, 14);
		add(rdbtnNewRadioButton_3_15);
		
		JRadioButton rdbtnNewRadioButton_3_16 = new JRadioButton("");
		rdbtnNewRadioButton_3_16.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_16.setBounds(524, 143, 46, 14);
		add(rdbtnNewRadioButton_3_16);
		
		JRadioButton rdbtnNewRadioButton_3_17 = new JRadioButton("");
		rdbtnNewRadioButton_3_17.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_17.setBounds(620, 168, 46, 0);
		add(rdbtnNewRadioButton_3_17);
		
		JRadioButton rdbtnNewRadioButton_3_18 = new JRadioButton("");
		rdbtnNewRadioButton_3_18.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_18.setBounds(524, 224, 46, 14);
		add(rdbtnNewRadioButton_3_18);
		
		JRadioButton rdbtnNewRadioButton_3_19 = new JRadioButton("");
		rdbtnNewRadioButton_3_19.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_19.setBounds(524, 143, 46, 14);
		add(rdbtnNewRadioButton_3_19);
		
		JRadioButton rdbtnNewRadioButton_3_10_1 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_1.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_1.setBounds(572, 143, 46, 14);
		add(rdbtnNewRadioButton_3_10_1);
		
		JRadioButton rdbtnNewRadioButton_3_10_2 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_2.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_2.setBounds(572, 160, 46, 14);
		add(rdbtnNewRadioButton_3_10_2);
		
		JRadioButton rdbtnNewRadioButton_3_10_3 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_3.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_3.setBounds(572, 143, 46, 14);
		add(rdbtnNewRadioButton_3_10_3);
		
		JRadioButton rdbtnNewRadioButton_3_10_4 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_4.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_4.setBounds(572, 177, 46, 14);
		add(rdbtnNewRadioButton_3_10_4);
		
		JRadioButton rdbtnNewRadioButton_3_10_5 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_5.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_5.setBounds(572, 190, 46, 14);
		add(rdbtnNewRadioButton_3_10_5);
		
		JRadioButton rdbtnNewRadioButton_3_10_6 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_6.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_6.setBounds(572, 207, 46, 14);
		add(rdbtnNewRadioButton_3_10_6);
		
		JRadioButton rdbtnNewRadioButton_3_10_7 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_7.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_7.setBounds(572, 219, 46, 14);
		add(rdbtnNewRadioButton_3_10_7);
		
		JRadioButton rdbtnNewRadioButton_3_10_8 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_8.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_8.setBounds(572, 236, 46, 14);
		add(rdbtnNewRadioButton_3_10_8);
		
		JRadioButton rdbtnNewRadioButton_3_10_9 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_9.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_9.setBounds(572, 253, 46, 14);
		add(rdbtnNewRadioButton_3_10_9);
		
		JRadioButton rdbtnNewRadioButton_3_10_10 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_10.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_10.setBounds(572, 270, 46, 14);
		add(rdbtnNewRadioButton_3_10_10);
		
		JRadioButton rdbtnNewRadioButton_3_10_11 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_11.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_11.setBounds(572, 287, 46, 14);
		add(rdbtnNewRadioButton_3_10_11);
		
		JRadioButton rdbtnNewRadioButton_3_10_12 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_12.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_12.setBounds(572, 302, 46, 14);
		add(rdbtnNewRadioButton_3_10_12);
		
		JRadioButton rdbtnNewRadioButton_3_10_13 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_13.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_13.setBounds(572, 319, 46, 14);
		add(rdbtnNewRadioButton_3_10_13);
		
		JRadioButton rdbtnNewRadioButton_3_10_14 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_14.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_14.setBounds(620, 319, 46, 14);
		add(rdbtnNewRadioButton_3_10_14);
		
		JRadioButton rdbtnNewRadioButton_3_10_15 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_15.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_15.setBounds(668, 319, 46, 14);
		add(rdbtnNewRadioButton_3_10_15);
		
		JRadioButton rdbtnNewRadioButton_3_10_16 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_16.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_16.setBounds(716, 319, 55, 14);
		add(rdbtnNewRadioButton_3_10_16);
		
		JRadioButton rdbtnNewRadioButton_3_10_17 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_17.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_17.setBounds(716, 302, 55, 14);
		add(rdbtnNewRadioButton_3_10_17);
		
		JRadioButton rdbtnNewRadioButton_3_10_18 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_18.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_18.setBounds(716, 270, 55, 14);
		add(rdbtnNewRadioButton_3_10_18);
		
		JRadioButton rdbtnNewRadioButton_3_10_19 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_19.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_19.setBounds(716, 287, 55, 14);
		add(rdbtnNewRadioButton_3_10_19);
		
		JRadioButton rdbtnNewRadioButton_3_10_20 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_20.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_20.setBounds(716, 143, 55, 14);
		add(rdbtnNewRadioButton_3_10_20);
		
		JRadioButton rdbtnNewRadioButton_3_10_21 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_21.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_21.setBounds(620, 143, 46, 14);
		add(rdbtnNewRadioButton_3_10_21);
		
		JRadioButton rdbtnNewRadioButton_3_10_22 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_22.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_22.setBounds(620, 160, 46, 14);
		add(rdbtnNewRadioButton_3_10_22);
		
		JRadioButton rdbtnNewRadioButton_3_10_23 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_23.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_23.setBounds(620, 177, 46, 14);
		add(rdbtnNewRadioButton_3_10_23);
		
		JRadioButton rdbtnNewRadioButton_3_10_24 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_24.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_24.setBounds(620, 190, 46, 14);
		add(rdbtnNewRadioButton_3_10_24);
		
		JRadioButton rdbtnNewRadioButton_3_10_25 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_25.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_25.setBounds(620, 207, 46, 14);
		add(rdbtnNewRadioButton_3_10_25);
		
		JRadioButton rdbtnNewRadioButton_3_10_26 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_26.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_26.setBounds(620, 219, 46, 14);
		add(rdbtnNewRadioButton_3_10_26);
		
		JRadioButton rdbtnNewRadioButton_3_10_27 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_27.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_27.setBounds(620, 236, 46, 14);
		add(rdbtnNewRadioButton_3_10_27);
		
		JRadioButton rdbtnNewRadioButton_3_10_28 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_28.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_28.setBounds(620, 253, 46, 14);
		add(rdbtnNewRadioButton_3_10_28);
		
		JRadioButton rdbtnNewRadioButton_3_10_29 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_29.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_29.setBounds(620, 270, 46, 14);
		add(rdbtnNewRadioButton_3_10_29);
		
		JRadioButton rdbtnNewRadioButton_3_10_30 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_30.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_30.setBounds(620, 287, 46, 14);
		add(rdbtnNewRadioButton_3_10_30);
		
		JRadioButton rdbtnNewRadioButton_3_10_31 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_31.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_31.setBounds(620, 302, 46, 14);
		add(rdbtnNewRadioButton_3_10_31);
		
		JRadioButton rdbtnNewRadioButton_3_10_32 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_32.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_32.setBounds(668, 143, 46, 14);
		add(rdbtnNewRadioButton_3_10_32);
		
		JRadioButton rdbtnNewRadioButton_3_10_33 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_33.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_33.setBounds(668, 160, 46, 14);
		add(rdbtnNewRadioButton_3_10_33);
		
		JRadioButton rdbtnNewRadioButton_3_10_34 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_34.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_34.setBounds(668, 177, 46, 14);
		add(rdbtnNewRadioButton_3_10_34);
		
		JRadioButton rdbtnNewRadioButton_3_10_35 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_35.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_35.setBounds(668, 190, 46, 14);
		add(rdbtnNewRadioButton_3_10_35);
		
		JRadioButton rdbtnNewRadioButton_3_10_36 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_36.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_36.setBounds(668, 207, 46, 14);
		add(rdbtnNewRadioButton_3_10_36);
		
		JRadioButton rdbtnNewRadioButton_3_10_37 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_37.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_37.setBounds(668, 219, 46, 14);
		add(rdbtnNewRadioButton_3_10_37);
		
		JRadioButton rdbtnNewRadioButton_3_10_38 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_38.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_38.setBounds(668, 236, 46, 14);
		add(rdbtnNewRadioButton_3_10_38);
		
		JRadioButton rdbtnNewRadioButton_3_10_39 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_39.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_39.setBounds(668, 253, 46, 14);
		add(rdbtnNewRadioButton_3_10_39);
		
		JRadioButton rdbtnNewRadioButton_3_10_40 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_40.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_40.setBounds(668, 270, 46, 14);
		add(rdbtnNewRadioButton_3_10_40);
		
		JRadioButton rdbtnNewRadioButton_3_10_41 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_41.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_41.setBounds(668, 287, 46, 14);
		add(rdbtnNewRadioButton_3_10_41);
		
		JRadioButton rdbtnNewRadioButton_3_10_42 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_42.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_42.setBounds(668, 302, 46, 14);
		add(rdbtnNewRadioButton_3_10_42);
		
		JRadioButton rdbtnNewRadioButton_3_10_43 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_43.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_43.setBounds(716, 160, 55, 14);
		add(rdbtnNewRadioButton_3_10_43);
		
		JRadioButton rdbtnNewRadioButton_3_10_44 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_44.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_44.setBounds(716, 177, 55, 14);
		add(rdbtnNewRadioButton_3_10_44);
		
		JRadioButton rdbtnNewRadioButton_3_10_45 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_45.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_45.setBounds(716, 190, 55, 14);
		add(rdbtnNewRadioButton_3_10_45);
		
		JRadioButton rdbtnNewRadioButton_3_10_46 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_46.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_46.setBounds(716, 207, 55, 14);
		add(rdbtnNewRadioButton_3_10_46);
		
		JRadioButton rdbtnNewRadioButton_3_10_47 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_47.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_47.setBounds(716, 219, 55, 14);
		add(rdbtnNewRadioButton_3_10_47);
		
		JRadioButton rdbtnNewRadioButton_3_10_48 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_48.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_48.setBounds(716, 236, 55, 14);
		add(rdbtnNewRadioButton_3_10_48);
		
		JRadioButton rdbtnNewRadioButton_3_10_49 = new JRadioButton("");
		rdbtnNewRadioButton_3_10_49.setBackground(new Color(255, 128, 255));
		rdbtnNewRadioButton_3_10_49.setBounds(716, 253, 55, 14);
		add(rdbtnNewRadioButton_3_10_49);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setSize(new Dimension(5, 5));
		table.setCellSelectionEnabled(true);
		table.setBackground(new Color(255, 128, 192));
		table.setFont(new Font("Tahoma", Font.ITALIC, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Dominantes ", "Ch1", "Ch2", "Ch3", "Ch4", "Ch5"},
				{"BigData pour la Transformation Num\u00E9rique BDTN", null, null, null, null, null},
				{"D\u00E9veloppement  logiciel : Test et Qualit\u00E9 DLTQ ", null, null, null, null, null},
				{"Ing\u00E9nierie des Systemes Num\u00E9riques ISN", null, null, null, null, null},
				{"IA et Big Data IABD ", null, null, null, null, null},
				{"Cybers\u00E9curit\u00E9 des R\u00E9seaux et de l\u2019ioT CERT", null, null, null, null, null},
				{"Ing\u00E9nieur d\u2019Affaires Informatique et R\u00E9seaux IA-IR", null, null, null, null, null},
				{"Energie et D\u00E9veloppement Durable EDD ", null, null, null, null, null},
				{"Digitalisation, Automatisation, Robotique et Intelligence Artificielle pour l\u2019industrie DARIA", null, null, null, null, null},
				{"G\u00E9nie Electrique et Transport GET", null, null, null, null, null},
				{"Ing\u00E9nieurs d\u2019Affaires : Distribution Energie et R\u00E9seaux  IA-DES", null, null, null, null, null},
				{"M\u00E9catronique et Sustemes Embarqu\u00E9s  MSE ", null, null, null, null, null},
				{"Ing\u00E9nierie des Syst\u00E8mes Embarqu\u00E9s Mobiles Autonomes et Connect\u00E9s ISEMAC ", null, null, null, null, null},
				{"Electronique des Syst\u00E8mes pour l\u2019Automobile et l\u2019A\u00E9ronautique ESAA", null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(447);
		table.getColumnModel().getColumn(1).setPreferredWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(25);
		table.getColumnModel().getColumn(3).setPreferredWidth(27);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.getColumnModel().getColumn(5).setPreferredWidth(31);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(56, 109, 715, 224);
		add(table);
		
		JButton btnNewButton = new JButton("Valider ");
		btnNewButton.setBackground(new Color(192, 63, 99));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(383, 358, 139, 37);
		add(btnNewButton);
		
		JLabel label = new JLabel("New label");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
}
		});
		label.setIcon(new ImageIcon(ChoixEtudiantGui.class.getResource("/data/login_icon.png")));
		label.setBounds(0, 55, 60, 36);
		add(label);

	}
}
