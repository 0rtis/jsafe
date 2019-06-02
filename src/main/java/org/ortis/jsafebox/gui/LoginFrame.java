/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ortis.jsafebox.gui;

import org.ortis.jsafebox.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author ortis
 */
public class LoginFrame extends javax.swing.JFrame implements MouseListener
{


	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel browseLabel;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPanel mainPanel;
	private javax.swing.JLabel newLabel;
	private javax.swing.JLabel openLabel;
	private javax.swing.JComboBox<String> walletPathComboBox;
	// End of variables declaration//GEN-END:variables


	/**
	 * Creates new form LoginFrame
	 */
	public LoginFrame()
	{
		initComponents();


		final Settings settings = Settings.getSettings();

		final JTextField field = (JTextField) walletPathComboBox.getEditor().getEditorComponent();
		field.setText("Select a safe or create a new one");
		walletPathComboBox.removeAllItems();
		for(final String path : settings.getSafeFilePaths())
			walletPathComboBox.addItem(path);
		walletPathComboBox.setFont(settings.getFontTheme().getFieldFont());

		settings.applyFirstButtonStyle(this.openLabel);
		openLabel.setFont(settings.getFontTheme().getLoginOpenFont());
		this.openLabel.addMouseListener(this);

		setIconImages(settings.getFrameIcons());


		setSize(Toolkit.getDefaultToolkit().getScreenSize().width * 1 / 3, Toolkit.getDefaultToolkit().getScreenSize().height * 1 / 3);
		setResizable(false);
		setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - getSize().width / 2,
				Toolkit.getDefaultToolkit().getScreenSize().height / 2 - getSize().height / 2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try
		{
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch(ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch(InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch(IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch(javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new LoginFrame().setVisible(true);
			}
		});
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		mainPanel = new javax.swing.JPanel();
		walletPathComboBox = new javax.swing.JComboBox<>();
		browseLabel = new javax.swing.JLabel();
		newLabel = new javax.swing.JLabel();
		openLabel = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		walletPathComboBox.setEditable(true);
		walletPathComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		walletPathComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

		browseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/browse-folder-32.png"))); // NOI18N

		newLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new-32.png"))); // NOI18N

		openLabel.setBackground(new java.awt.Color(255, 102, 0));
		openLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
		openLabel.setForeground(new java.awt.Color(255, 255, 255));
		openLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		openLabel.setText("Open");
		openLabel.setOpaque(true);

		jPasswordField1.setText("jPasswordField1");

		javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setHorizontalGroup(
				mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						mainPanelLayout.createSequentialGroup().addGap(102, 102, 102).addGroup(mainPanelLayout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.TRAILING).addComponent(walletPathComboBox, 0, 397, Short.MAX_VALUE).addComponent(
								jPasswordField1).addComponent(openLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(browseLabel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(newLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
		mainPanelLayout.setVerticalGroup(
				mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						mainPanelLayout.createSequentialGroup().addContainerGap(186, Short.MAX_VALUE).addGroup(mainPanelLayout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING).addComponent(walletPathComboBox, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(browseLabel,
								javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(newLabel, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(openLabel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(25, 25, 25)));

		getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents


	@Override
	public void mouseClicked(final MouseEvent mouseEvent)
	{
		final Object source = mouseEvent.getSource();
		if(source == null)
			return;

		if(source == this.openLabel)
		{
		}
	}

	@Override
	public void mousePressed(final MouseEvent mouseEvent)
	{

	}

	@Override
	public void mouseReleased(final MouseEvent mouseEvent)
	{

	}

	@Override
	public void mouseEntered(final MouseEvent mouseEvent)
	{

	}

	@Override
	public void mouseExited(final MouseEvent mouseEvent)
	{

	}
}
