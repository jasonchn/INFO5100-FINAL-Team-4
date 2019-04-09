package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SearchDealerUI extends JFrame{
	
	protected JLabel nameLabel, zipCodeLabel;
	protected JTextField nameText, zipCodeText;
	protected JButton search;
	
	public SearchDealerUI() {
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}
	
	private void createComponents() {
		nameLabel = new JLabel("Dealer Name", JLabel.RIGHT);
		zipCodeLabel = new JLabel("Zip code", JLabel.RIGHT);
		nameText = new JTextField(10);
		zipCodeText = new JTextField(10);
		search = new JButton("Search");
	}
	public void addComponents() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());

		// TODO Auto-generated method stub
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(3, 2));
		TitledBorder border = new TitledBorder("Dealers in Seattle, WA");
	    border.setTitleJustification(TitledBorder.CENTER);
	    border.setTitlePosition(TitledBorder.TOP);
	 
	    jpanel.setBorder(border);
	    
		jpanel.add(nameLabel);
		jpanel.add(nameText);
		jpanel.add(zipCodeLabel);
		jpanel.add(zipCodeText);
		jpanel.add(search);
		con.add(jpanel, "Center");
		
		

	}
	public void addListeners() {
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String name = nameText.getText();
				String zipcode = zipCodeText.getText();
				System.out.println(name +"  "+zipcode);
			}
		});
	}
	
	
	private void makeItVisible() {
		this.setSize(300, 300);
		this.setVisible(true);
		//this.pack();

	}
	
	public static void main(String[] args)  {
		SearchDealerUI s= new SearchDealerUI();
		
		
	}
}
