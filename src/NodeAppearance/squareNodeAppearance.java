package NodeAppearance;

import java.awt.Color;

public class squareNodeAppearance extends NodeAppearance{
	private int width;
	private Color color;

	public squareNodeAppearance(int width, Color color) {
		super(color);
		this.width = width;
	}
	@Override
	public Color getColor() {
		return color;
	}
	public int getWidth() {
		return width;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof squareNodeAppearance s && s.getColor().equals(getColor()) && s.getWidth() == getWidth();
	}
}
