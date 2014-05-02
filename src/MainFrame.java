import javax.swing.JFrame;


public class MainFrame extends JFrame implements Runnable
{

	public MainFrame()
	{
		setTitle("A Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		
		add(new DrawingSurface());
		
	}
	
	@Override
	public void run()
	{
		setVisible(true);
	}

}
