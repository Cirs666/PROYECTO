import javax.swing.*;
import java.awt.event.*;
////menu pedido proximo modificar
/**
 * Write a description of class Ventana here.
 * 
 * @author (CIRS) 
 * @version (a version number or a date)
 */
public class Login extends JFrame implements ActionListener
{
    Texto titulo= new Texto("MENU PEDIDO", 10, 10, 100, 10);
    Caja tbPass= new Caja(150, 60);
    Boton btnCuarto= new Boton("Cuarto De Pollo", 20, 170);
    Boton btnEconomico= new Boton("ECONOMICO", 190, 170);
    //Boton btnporciones= new Boton("PORCIONES", 350, 170);
    
    //Boton btnPersonal= new Boton("PERSONAL", 540, 60);
        
    /**
     * Constructor for objects of class Ventana
     */
    public Login()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(btnCuarto);
        add(btnEconomico);
        
        //ACTION BUTTONS
        btnCuarto.addActionListener(this);
        btnEconomico.addActionListener(this);
                
        //CONFIG FRAME
        setLayout(null);
        setTitle("MENU");
        setSize(400, 300);
        setVisible(true);
    }
    
    public static Ventanacuarto frmVentanaCuarto;
    public static Ventanaeconomico frmVentanaEconomico;
    
    public static VentanaPersonal frmVentanaPersonal;
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== btnCuarto){
            frmVentanaCuarto= new Ventanacuarto();
        }
         if (e.getSource()== btnEconomico){
            frmVentanaEconomico= new Ventanaeconomico();
        }
        
    }
    
}
