package it.paro.animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.apache.commons.io.IOUtils;

public class Board extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private final int B_WIDTH = 350;
	private final int B_HEIGHT = 350;
	private final int INITIAL_X = -40;
	private final int INITIAL_Y = -40;
	private final int DELAY = 20;

	private Image star;
	private Timer timer;
	private int x, y;

	public Board() {
		super();
		initBoard();
	}

	private void initBoard() {
		try {
			loadImage();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		x = INITIAL_X;
		y = INITIAL_Y;
		timer = new Timer(DELAY, this);
		timer.start();
	}

	private void loadImage() throws IOException {
		ImageIcon ii = new ImageIcon(IOUtils.resourceToByteArray("images/star.png", this.getClass().getClassLoader()));
		star = ii.getImage();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(star, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x += 1;
		y += 1;
		if (y > B_HEIGHT) {
			y = INITIAL_Y;
			x = INITIAL_X;
		}
		repaint();
	}

}
