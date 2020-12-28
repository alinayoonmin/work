import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;

public class Work {
	Color lastColor;
	DrawPanel drawPanel = new DrawPanel();
	JButton colorButtonRed = new JButton("Red");
	JButton colorButtonGreen = new JButton("Green");
	JFrame frame = new JFrame("Work with Oval");
	int x = 170;
	int y = 80;
	int wg = 100;
	int hg = 100;
	int i = 0;
	
	public static void main(String[] args) {
		Work gui = new Work();
		gui.go();
	}
	public void go() {

		JLabel label = new JLabel("Setting Size: ");
		JLabel colorLabel = new JLabel("Choise Color: ");
		JLabel horizontalLabel = new JLabel("Horizontal move: ");
		JLabel verticalLabel = new JLabel("Vertical move: ");
		
		JPanel colorButtonPanel = new JPanel();
		JPanel settingButtonPanel = new JPanel();
		JPanel sizePanel = new JPanel();
		JPanel horizontalOrientationPanel = new JPanel();
		JPanel verticalOrientationPanel = new JPanel();
		JPanel dopPanel1 = new JPanel();
		
		JButton colorButtonGreen = new JButton("Green");
		JButton colorButtonBlue = new JButton("Blue");
		JButton colorButtonRandom = new JButton("Random");
		
		JButton raiseButton = new JButton(" Large ");
		JButton minButton = new JButton(" Min");
		
		JButton leftButton = new JButton("Left");
		JButton rightButton = new JButton("Right");
		JButton downButton = new JButton("Down");
		JButton upButton = new JButton("Up");
		
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, settingButtonPanel);				
		
		settingButtonPanel.add(colorButtonPanel);
		settingButtonPanel.add(sizePanel);
		settingButtonPanel.add(horizontalOrientationPanel);
		settingButtonPanel.add(verticalOrientationPanel);
		settingButtonPanel.setLayout(new BoxLayout(settingButtonPanel, BoxLayout.Y_AXIS));
		
		sizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		sizePanel.add(label);
		sizePanel.add(raiseButton);
		raiseButton.addActionListener(new RaiseButtonListener());
		sizePanel.add(minButton);
		minButton.addActionListener(new MinButtonListener());
		
		colorButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		colorButtonPanel.add(colorLabel);
		colorButtonPanel.add(dopPanel1);

		dopPanel1.add(colorButtonRed);
		colorButtonRed.addActionListener(new RedButtonListener());
		dopPanel1.add(colorButtonGreen);
		colorButtonGreen.addActionListener(new GreenButtonListener());
		dopPanel1.add(colorButtonBlue);
		colorButtonBlue.addActionListener(new BlueButtonListener());
		dopPanel1.add(colorButtonRandom);
		colorButtonRandom.addActionListener(new RandomButtonListener());
		
		horizontalOrientationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		horizontalOrientationPanel.add(horizontalLabel);
		horizontalOrientationPanel.add(leftButton);
		leftButton.addActionListener(new LeftButtonListener());
		horizontalOrientationPanel.add(rightButton);
		rightButton.addActionListener(new RightButtonListener());
		
		verticalOrientationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		verticalOrientationPanel.add(verticalLabel);
		verticalOrientationPanel.add(upButton);
		upButton.addActionListener(new UpButtonListener());
		verticalOrientationPanel.add(downButton);
		downButton.addActionListener(new DownButtonListener());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(470, 450);
		frame.setVisible(true);
		
	}
	
	class DrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			if(i == 0) {
			g.setColor(Color.black);
			g.fillOval(x, y, wg, hg);
			}else if(i == 1) {
				lastColor = Color.red;
				g.setColor(Color.red);
				g.fillOval(x, y, wg, hg);
			}else if(i == 2) {
				lastColor = Color.green;
				g.setColor(Color.green);
				g.fillOval(x, y, wg, hg);
			}else if(i == 3) {
				lastColor = Color.blue;
				g.setColor(Color.blue);
				g.fillOval(x, y, wg, hg);
			}else if(i == 4) {
				int red = (int) (Math.random() * 255);
				int green = (int) (Math.random() * 255);
				int blue = (int) (Math.random() * 255);
				
				Color randomColor = new Color(red, green, blue);
				
				g.setColor(randomColor);
				g.fillOval(x, y, wg, hg);
				lastColor = randomColor;
			}else if(i == 5) {
				g.setColor(lastColor);
				g.fillOval(x, y, wg, hg);
			}else if(i == 6) {
				g.setColor(lastColor);
				g.fillOval(x, y, wg, hg);
			}else if(i == 7) {
				g.setColor(lastColor);
				g.fillOval(x, y, wg, hg);
			}else if(i == 8) {
				g.setColor(lastColor);
				g.fillOval(x, y, wg, hg);
			}
			else if(i == 9) {
				g.setColor(lastColor);
				g.fillOval(x, y, wg, hg);
			}else if(i == 10) {
				g.setColor(lastColor);
				g.fillOval(x, y, wg, hg);
			}
		}
	}
	
	class RedButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			i = 1;
			frame.repaint();
		}
	}
	
	class GreenButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			i = 2;
			frame.repaint();
		}
	}
	
	class BlueButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			i = 3;
			frame.repaint();
		}
	}
	
	class RandomButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			i = 4;
			frame.repaint();
		}
	}

	class LeftButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(x > 0) {
				i = 5;
				x--;
				frame.repaint();
			}else {System.out.println("Левее некуда!");}
		}
	}
	
	class RightButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(x < 280) {
				i = 6;
				x++;
				frame.repaint();
			}else {System.out.println("Правее некуда!");}
		}
	}
	
	class UpButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(y > 0) {
				i = 7;
				y--;
				frame.repaint();
			}else {System.out.println("Выше некуда!");}
		}
	}
	
	class DownButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(y < 85) {
				i = 8;
				y++;
				frame.repaint();
			}else {System.out.println("Ниже некуда!");}
		}
	}
	
	class RaiseButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(wg < 170 && hg < 170) {
				i = 9;
				wg++;
				hg++;
				frame.repaint();
			}else {System.out.println("Круг не может быть больше!");}
		}
	}
	
	class MinButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(wg > 50 && hg > 50) {
				i = 10;
				wg--;
				hg--;
				frame.repaint();
			}else {System.out.println("Круг не может быть меньше!");}
		}
	}
}
