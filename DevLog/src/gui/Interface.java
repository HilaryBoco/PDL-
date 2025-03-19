package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import dao.AdminDao;
import dao.EtudiantDao;
import model.Admin;
import model.Student;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.border.EmptyBorder;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frmChoixDominantes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel_1;
	private int connection;
	private JButton btnDeconnexionAdmin;
	private JButton btnDeconnexionEtudiant;
	private JButton btnConnexion;
	private JButton btnDeconnAcceuilAdmin;
	private JButton btnDominateFrAcc;
	private JButton btnEtapeFrAcc;
	private JButton btnEtudiantFrAcc;
	private AdminGui_ adminGui_;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmChoixDominantes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChoixDominantes = new JFrame();
		frmChoixDominantes.getContentPane().setForeground(new Color(255, 255, 255));
		frmChoixDominantes.getContentPane().setBackground(new Color(255, 255, 255));
		frmChoixDominantes.setBackground(new Color(192, 63, 99));
		frmChoixDominantes.setResizable(false);
		frmChoixDominantes.setTitle("Choix Dominantes");
		frmChoixDominantes.setBounds(100, 100, 1001, 634);
		frmChoixDominantes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChoixDominantes.setLocationRelativeTo(null);
		frmChoixDominantes.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		
		frmChoixDominantes.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		frmChoixDominantes.setVisible(true);
		
		AuthentificationGui authen = new AuthentificationGui();
		
		AcceuilEtudiantGui acceuilEtu = new AcceuilEtudiantGui();
		
		AcceuilAdminGui acceuilAdmin = new AcceuilAdminGui();
		panel.add(authen);
		adminGui_  = new AdminGui_("");
		
		
		btnDeconnexionAdmin = adminGui_.getBtnDeconnexion();
		btnDeconnexionAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.remove(adminGui_);
				panel.removeAll();
				panel.add(authen);
				panel.repaint();
			}
		});	
		
		
		btnDeconnexionEtudiant = acceuilEtu.getBtnDeconnexionEtudiant();
		btnDeconnexionEtudiant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.remove(acceuilEtu);
				panel.removeAll();
				panel.add(authen);
				panel.repaint();
			}
		});		
		
		btnConnexion = authen.getBtnConnexion();
		
		btnConnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				connection = authen.getBalise();	
				
				if(connection == 1) {
					panel.remove(authen);
					panel.removeAll();
					panel.add(acceuilAdmin);
					panel.revalidate();		
					panel.repaint();
				}else {
					if(connection == 2) {
						panel.remove(authen);
						panel.removeAll();
						panel.add(acceuilEtu);
						panel.revalidate();
					}
				}
			}
		});
		
		
		btnDominateFrAcc = acceuilAdmin.getBtnDominante();
		btnDominateFrAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGui_ = new AdminGui_("dominante");
				panel.removeAll();
				panel.add(adminGui_);
				panel.revalidate();
			}
		});
		
		btnEtudiantFrAcc = acceuilAdmin.getBtnEtudiant();
		btnEtudiantFrAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGui_ = new AdminGui_("etudiant");
				panel.removeAll();
				panel.add(adminGui_);
				panel.revalidate();
			}
		});
		
		btnEtapeFrAcc = acceuilAdmin.getBtnEtape();
		btnEtapeFrAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminGui_ = new AdminGui_("etape");
				panel.removeAll();
				panel.add(adminGui_);
				panel.revalidate();
			}
		});
		
		
	}
}