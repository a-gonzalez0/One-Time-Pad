import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletNLO extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppletNLO()
	{
		super();
		setLayout(null);
	}
	
	public void add(Component c, int x, int y, int w, int h)
	{
		add(c);
		
		c.setBounds(x, y, w, h);
	}
	
	public void add(TextField tf, int x, int y, int w, int h, ActionListener al)
	{
		add(tf, x, y, w, h);
		tf.addActionListener(al);
	}
	
	public void add(Button bn, int x, int y, int w, int h, ActionListener al)
	{
		add(bn, x, y, w, h);
		bn.addActionListener(al);
	}
}
