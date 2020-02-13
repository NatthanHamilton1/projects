package FlappyBird;
/**
 * @author Natthan_Hamilton
 * @version 1.0
 * @date 2/11/2020, 12:50 pm
 * 
 */
import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		FlappyBird.flappyBird.repaint(g);
	}
	
}