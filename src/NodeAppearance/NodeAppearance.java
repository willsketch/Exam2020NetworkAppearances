package NodeAppearance;

import java.awt.Color;

public abstract class NodeAppearance {
	
	private Color color;
	public abstract Color getColor();
	
	public NodeAppearance(Color color) {
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof NodeAppearance na && na.getColor().equals(this.color);
	}
}
