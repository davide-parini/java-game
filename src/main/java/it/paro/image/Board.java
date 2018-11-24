package it.paro.image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.apache.commons.io.IOUtils;

public class Board extends JPanel {

	private static final long serialVersionUID = 1L;

	private Image image;

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
		int w = image.getWidth(this);
		int h = image.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}

	private void loadImage() throws IOException {
		ImageIcon ii = new ImageIcon(
				IOUtils.resourceToByteArray("images/sunflowers.jpeg", this.getClass().getClassLoader()));
		image = ii.getImage();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}

}
