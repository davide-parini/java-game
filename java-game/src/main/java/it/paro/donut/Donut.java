package it.paro.donut;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Donut extends JFrame {

	private static final long serialVersionUID = 1L;

	public Donut() {
		super();
		initUI();
	}

	private void initUI() {
		add(new Board());
		setSize(330, 330);
		setTitle("Donut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Donut donut = new Donut();
			donut.setVisible(true);
		});
	}

}
