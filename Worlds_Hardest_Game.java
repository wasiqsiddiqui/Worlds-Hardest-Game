/**
 * Worlds_Hardest_Game.java  04/23/15
 *
 * @author - Wasiq Siddiqui
 *
 * 
 *
 * 
 *
 */

import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static java.lang.System.*;


public class Worlds_Hardest_Game extends JPanel{
int purple;
private int xLoc = 500, wide =50, high =50;
private int yLoc;
private Color onColor, displayColor;
public Worlds_Hardest_Game(){
}

public Worlds_Hardest_Game(Color c,  int y){
yLoc = y;
onColor = displayColor = c;
}

public Worlds_Hardest_Game(Color c,  int x,  int y){
this(c, y);
xLoc = x;
}

public Worlds_Hardest_Game(Color c,  int x,  int y, int w, int h){
this(c, y);
xLoc = x;
wide = w;
high = h;
}

public void switchState(){

if(displayColor == Color.black){
  displayColor = onColor;
}
else{
  displayColor = Color.black;
  }
}

public Color getCurrentC(){
return displayColor;
}

public Color getOriginal(){
return onColor;
}

public void setX(int x){
xLoc = x;
}

public void setY(int y){
yLoc = y;
}

public void moveX(int x){
xLoc = xLoc + x;
}

public void setOColor(Color c){
onColor = c;
}

public int getW(){
return wide;
}

public int getH(){
return high;
}

public int getX(){
return xLoc;
}

public int getY(){
return yLoc;
}

public void drawWorlds_Hardest_Game(Graphics g){
g.setColor(displayColor);
g.fillRect(xLoc, yLoc, wide, high);
}
}
