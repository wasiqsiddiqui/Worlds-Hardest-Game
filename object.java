import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import static java.lang.System.*;

public class object extends JPanel {

	public Rectangle character;

	public int charW = 24;

	public int charH= 36;

	public boolean right = false;

	public boolean left = false;

public object(){

	character = new Rectangle(180, 180, charW, charH);

	addKeyListener(new KeyAdapter() {

		public void keyPressed(KeyEvent e){

			if(e.getKeyCode() == KeyEvent.VK_D){

				right = true;

				character.x += 1;

						}

			if(e.getKeyCode() == KeyEvent.VK_A){

					left= true;

					character.x -= 1;

						}



			}

			public void keyReleased(KeyEvent e){

				if(e.getKeyCode() == KeyEvent.VK_D){

					right = false;

							}

				if(e.getKeyCode() == KeyEvent.VK_A){
					left = false;

						}





}

public void paintComponent(Graphics g){

super.paintComponent(g);

g.setColor(Color.white);

g.fillRect(character.x, character.y, character.width, character.height);

if(right){

	character.x +=1;

		}

if(left){

	character.x -=1;

		}

	repaint();


									}



	}

}

}



