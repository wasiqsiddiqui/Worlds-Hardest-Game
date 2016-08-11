import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import static java.lang.System.*;

public class floorframe extends JFrame {
{
player theplayer;
theplayer = new player();
getContentPane().add(theplayer);
theplayer.setFocusable(true);
theplayer.requestFocusInWindow();
new Timer(1-1000, theplayer).start();
}

}

