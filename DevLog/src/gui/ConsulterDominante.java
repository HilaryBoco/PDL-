package gui;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import dao.DominanteDao;
import model.*;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagLayout;

public class ConsulterDominante extends JPanel {

	private static final long serialVersionUID = 1L;
	

	/**
	 * Create the panel.
	 */
	public ConsulterDominante() {
		
		DominanteDao conDom = new DominanteDao();
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		add(panel);
		panel.setLayout(null);
		
		/* Zone id */
		JPanel panelId = new JPanel();
		panelId.setBounds(0, 0, 99, 453);
		panel.add(panelId);
		panelId.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelId.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteID = new JLabel(" ID"); 
		enteteID.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelId.add(enteteID);
		
		/* Zone nom long */
		JPanel panelNomLong = new JPanel();
		panelNomLong.setBounds(99, 0, 349, 453);
		panelNomLong.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelNomLong);
		panelNomLong.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteNomLong = new JLabel(" Nom Long"); 
		enteteNomLong.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelNomLong.add(enteteNomLong);
		
		
		/* Zone Sigle */
		JPanel panelSigle = new JPanel();
		panelSigle.setBounds(448, 0, 165, 453);
		panel.add(panelSigle);
		panelSigle.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSigle.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteSigle = new JLabel(" Sigle"); 
		enteteSigle.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSigle.add(enteteSigle);
		
		
		/* Zone place Max */
		JPanel panelPlaceApprentis = new JPanel();
		panelPlaceApprentis.setBounds(723, 0, 115, 453);
		panel.add(panelPlaceApprentis);
		panelPlaceApprentis.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlaceApprentis.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetePlaceMax = new JLabel("Pl. Apprentis");
		entetePlaceMax.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlaceApprentis.add(entetePlaceMax);
		
		/* Zone placeApprentis */
		JPanel panelPlaceMax = new JPanel();
		panelPlaceMax.setBounds(613, 0, 110, 453);
		panelPlaceMax.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelPlaceMax);
		panelPlaceMax.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetePlaceApprentis = new JLabel("Pl. Apprentis");
		entetePlaceApprentis.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlaceMax.add(entetePlaceApprentis);
		
		
		
		JButton[] listDominanteID = new JButton[conDom.getAll().size()];
		JLabel[] listDominanteNomLong = new JLabel[conDom.getAll().size()];
		JLabel[] listDominanteSigle = new JLabel[conDom.getAll().size()];
		JLabel[] listDominantePlaceMax = new JLabel[conDom.getAll().size()];
		JLabel[] listDominantePlacesApprentis = new JLabel[conDom.getAll().size()];
		

		for(int i = 0; i < conDom.getAll().size(); i++) {
			
			
			Dominante dom = conDom.getAll().get(i);
			/* On ajoute l'id */
			JButton domButtonID = new JButton();
			domButtonID.setText(" " + dom.getId());
			listDominanteID[i] = domButtonID;
			panelId.add(listDominanteID[i]);
			
			/*+ " " + dom.getNomLong() + " " + dom.getSigle() + " " + dom.getPlaceMax() + 
					" " + dom.getPlacesApprentis() + " ");
					*/
			
			/* On ajoute le nom Long */
			JLabel domLabelNomLong = new JLabel();
			domLabelNomLong.setText(" " + dom.getNomLong());
			listDominanteNomLong[i] = domLabelNomLong;
			panelNomLong.add(listDominanteNomLong[i]);
			
			/* On ajoute le sigle */
			JLabel domLabelSigle = new JLabel();
			domLabelSigle.setText(" " + dom.getSigle());
			listDominanteSigle[i] = domLabelSigle;
			panelSigle.add(listDominanteSigle[i]);
			
			/* On ajoute le nombre de place maximum */
			JLabel domLabelPlaceMax = new JLabel();
			domLabelPlaceMax.setText(" " + dom.getPlaceMax());
			listDominantePlaceMax[i] = domLabelPlaceMax;
			panelPlaceMax.add(listDominantePlaceMax[i]);
			
			/* On ajoute le nombre de place apprentis */
			JLabel domLabelPlaceApprentis = new JLabel();
			domLabelPlaceApprentis.setText(" " + dom.getPlacesApprentis());
			listDominantePlacesApprentis[i] = domLabelPlaceApprentis;
			panelPlaceApprentis.add(listDominantePlacesApprentis[i]);
			
		}
		
	}
}
