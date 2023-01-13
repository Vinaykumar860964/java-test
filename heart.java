package heart;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author   :Bot;
 * @date     :21/06/2015 [18:11];
 * @function :Draw heart with java;
 */
public class Heart extends Applet {


   @Override
   public void paint(Graphics g) {  
       
        Graphics2D g2 = (Graphics2D)g;  
        
        //Loop for animation 'heart' :p ;
        for(int i =  0;i < 400;i++){
        g2.setColor(Color.red);
        g2.fillOval(200 + i, 0 + i, 60,350);
      
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Heart.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
         for(int i =  0;i < 400;i++){
        g2.setColor(Color.red);
        g2.fillOval(600 + i,400 - i , 60,350);
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Heart.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }   
    }  
    public static void main(String[] args) {
        // TODO code application logic here;
        //Creating window and your components;
        JFrame win = new JFrame();
        win.setVisible(true);
        win.setSize(1366,766);
        win.getContentPane().setBackground(new Color(255,255,0));
        win.getContentPane().add(new Heart());
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}