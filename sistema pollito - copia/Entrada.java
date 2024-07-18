import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Write a description of class Ventana here.
 * 
 * @author (cirs) 
 * @version (a version number or a date)
 */
public class Entrada extends JFrame implements ActionListener
{
    Texto titulo= new Texto("Iniciar sesión", 10, 10, 100, 10);
    Texto txtUsuario= new Texto("Nombre Usuario", 45, 40,200, 45);
    Texto textPass= new Texto("Contraseña", 75, 70, 150, 95);
    Caja tbUsuario= new Caja(150, 50);
    Caja tbPass= new Caja(150, 100);
    Boton btnAceptar= new Boton("ENTRAR", 20, 220);
    Boton btnCancelar= new Boton("CANCELAR", 350, 220);
    Boton btnCrear= new Boton("REGUISTAR", 190, 220);
    //Boton btnPedido= new Boton("PEDIDO", 240, 220);
    /**
     * Constructor for objects of class Ventana
     */
    public Entrada()
    {
        
        //AÑADIR OBJETOS
        add(titulo);
        add(txtUsuario);
        add(tbUsuario);
        add(tbPass);
        add(textPass);
        add(btnAceptar);
        add(btnCancelar);
        add(btnCrear);
        //add(btnPedido);
        
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnCrear.addActionListener(this);
        //btnPedido.addActionListener(this);
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(530, 330);
        setVisible(true);
    }
    
    public static void main()
    {
        Entrada login= new Entrada();
    }
    
    public void ingresar()
    {
        Personal us= new Personal(tbUsuario.getText(),tbPass.getText());
        if (DBA.existePersonal(us)) {
                frmLogin= new Login();//Esta ref al Sistema
                dispose();
            } else {
                setTitle("ERROR");
            }
    }
    
    public static Login frmLogin;
    public static VentanaPersonal frmCrear;
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== btnAceptar){
            ingresar();
        }
        
        if (e.getSource()== btnCrear){
            setVisible(false);
            frmCrear= new VentanaPersonal();
        }
        
        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
            // Cerrar la ventana actual
            window.dispose();
        }
    }
}