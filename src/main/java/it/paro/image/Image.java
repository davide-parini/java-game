package it.paro.image;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Image extends JFrame {

	private static final long serialVersionUID = 1L;

	public Image() {
		super();
		initUI();
	}

	private void initUI() {
		add(new Board());
		setResizable(false);
		pack();
		setTitle("Image");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Image image = new Image();
			image.setVisible(true);
		});
	}

}
