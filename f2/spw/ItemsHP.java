import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;

public class ItemsHP extends Sprite{
	public static final int Y_TO_FADE = 400;
	public static final int Y_TO_DIE = 600;
	
	private int step = 12;
	private boolean alive = true;
	
	public ItemsHP(int x, int y) {
		super(x, y, 5, 10);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}

	public void proceed(){
		y += step;
		if(y > Y_TO_DIE){
			alive = false;
		}
	}
	
	public boolean isAlive(){
		return alive;
	}

	void itemsCrash(){
		alive = false;
	}
}