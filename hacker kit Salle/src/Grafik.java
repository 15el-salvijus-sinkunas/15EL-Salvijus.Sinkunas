import javax.swing.*;
import java.awt.*;

public class Grafik extends JFrame {
	
	private int width = 100;
	private int height = 100;
	private int d = 50;
	
	public Grafik(){
		setSize(700, 800); //x, y
		setLocation(300, 300);
		setDefaultCloseOperation(3);
		setResizable(false);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Grafik();
	
	}
    
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 800);
		g.setColor(Color.blue);
		g.drawRect(70, 100, width, height);
		g.setColor(Color.green);
		g.fillRect(160, 200, width, height);
		g.setColor(Color.red);
		g.drawOval(30, 250, d, d);
		g.setColor(Color.PINK);
		g.fillOval(400, 520, d, d);
		
	}
}
