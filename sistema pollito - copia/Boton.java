import javax.swing.*;
/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends JButton
{
    
    /**
     * Constructor for objects of class Boton
     */
    public Boton(String txt, int px, int py)
    {
        setText(txt);
        setSize(130, 45);
        setLocation(px, py);
    }
}
