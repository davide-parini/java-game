package it.paro.animation;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Animation extends JFrame {

	private static final long serialVersionUID = 1L;

	public Animation() {
		super();
		initUI();
	}

	private void initUI() {
		add(new Board());
		setResizable(false);
		pack();
		setTitle("Animation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Animation image = new Animation();
			image.setVisible(true);
		});
	}

}
