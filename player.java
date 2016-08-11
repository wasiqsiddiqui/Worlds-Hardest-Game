import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import static java.lang.System.*;

public class player extends JPanel implements ActionListener, KeyListener {

Random r = new Random();
Scanner kb = new Scanner(System.in);
Worlds_Hardest_Game theplayer, obstacle, wall1, wall2, wall3, wall4, wall5, wall6, spot;

public player(){

super();
addKeyListener(this);
setPreferredSize(new Dimension(1200,1000));

theplayer = new Worlds_Hardest_Game(Color.red, 3, 450, 100,100);//player
obstacle = new Worlds_Hardest_Game(Color.green, 500, 100, 200, 100);//obstacle

wall1= new Worlds_Hardest_Game(Color.blue, 0, 0, 1200, 250);//wall1
wall2= new Worlds_Hardest_Game(Color.blue,0,750,1200,250);//wall2
wall3= new Worlds_Hardest_Game(Color.blue,0,0,300,400);//wall3
wall4= new Worlds_Hardest_Game(Color.blue,0,600,300,400);//wall4
wall5= new Worlds_Hardest_Game(Color.blue,900,600,300,400);//wall5
wall6= new Worlds_Hardest_Game(Color.blue,900,0,300,400);//wall6
spot= new Worlds_Hardest_Game(Color.green, 700, 200, 200, 100); //advance spot
}

public void paintComponent(Graphics g){

super.paintComponent(g);
g.setColor(new Color(175,191,255));
g.fillRect(0,0, 1200, 1000);//background
g.setColor(new Color(0,0,128));
g.fillRect(0,0,1200,250);     //wall1
g.fillRect(0,750,1200,250); //wall2
g.fillRect(0,0,300,400);  //wall3
g.fillRect(0,600,300,400); //wall 4
g.fillRect(900,600,300,400); // wall 5
g.fillRect(900,0,300,400); //wall 6


obstacle.drawWorlds_Hardest_Game(g);
wall1.drawWorlds_Hardest_Game(g);
wall2.drawWorlds_Hardest_Game(g);
wall3.drawWorlds_Hardest_Game(g);
wall4.drawWorlds_Hardest_Game(g);
wall5.drawWorlds_Hardest_Game(g);
wall6.drawWorlds_Hardest_Game(g);
theplayer.drawWorlds_Hardest_Game(g);
finish.drawWorlds_Hardest_Game(g);
}


public void cycleLights(){
	
}

public void actionPerformed(ActionEvent e){
cycleLights();
repaint();
}


public void keyReleased(KeyEvent e){
	System.out.println(e);
}

public void keyTyped(KeyEvent e){
	System.out.println(e);
}

public void keyPressed(KeyEvent e){
	if (e.getKeyCode() == KeyEvent.VK_UP){
		if(! collide(theplayer, obstacle, wall1, wall2, wall3, wall4, wall5, wall6))
		  theplayer.setY(theplayer.getY()-10);
	}

    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    	if(! collide(theplayer, obstacle, wall1, wall2, wall3, wall4, wall5, wall6))
    		theplayer.setY(theplayer.getY()+10);
    }

    if (e.getKeyCode() == KeyEvent.VK_LEFT){
    	if(! collide(theplayer, obstacle, wall1, wall2, wall3, wall4, wall5, wall6))
    	theplayer.setX(theplayer.getX()-10);
    }

    if (e.getKeyCode() == KeyEvent.VK_RIGHT){
    	if(! collide(theplayer, obstacle, wall1, wall2, wall3, wall4, wall5, wall6))
    	theplayer.setX(theplayer.getX()+10);
    }
    System.out.println(e);
}

public boolean collide(Worlds_Hardest_Game p, Worlds_Hardest_Game o, Worlds_Hardest_Game w1,Worlds_Hardest_Game w2,Worlds_Hardest_Game w3,Worlds_Hardest_Game w4,Worlds_Hardest_Game w5,Worlds_Hardest_Game w6)  //collision statement{
	if ((p.getX()>=100) && p.getX() >= o.getX() +o.getW() && (p.getY() >= o.getY()+ o.getH()) || (p.getX()<= o.getX()+o.getW()) && (p.getX()+p.getH() >= o.getY())){
		System.exit(0);
	}
	else{
	return true;
	}
}
	}
