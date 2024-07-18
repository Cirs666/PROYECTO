import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentanaPersonal extends JFrame implements ActionListener
{
    private Texto titulo= new Texto("Registro Personal:", 10, 10, 150, 30);
    private Texto txtNombre= new Texto("Ci:", 20, 40, 180, 20);
    private Texto txtEspecialidad= new Texto("Apellidos:", 20, 70, 180, 20);
    private Texto txtArea= new Texto("nombre:", 20, 100, 180, 20);
    private Texto txtCarnet= new Texto("CONTRASEÑA:", 20, 130, 180, 20);
    private Texto txtPeso= new Texto("Telefono:", 20, 160, 180, 20);
    private Texto txtTamanho= new Texto("area: ", 20, 190, 180, 20);
    private Caja tbNombre= new Caja(150, 40);
    private Caja tbEspecialidad= new Caja(150, 70);
    private Caja tbArea= new Caja(150, 100);
    private Caja tbCarnet= new Caja(150, 130);
    private Caja tbPeso= new Caja(150, 160);
    private Caja tbTamanho= new Caja(150, 190);
    private Boton btnAceptar= new Boton("ACEPTAR", 20, 230);
    private Boton btnCancelar= new Boton("CANCELAR", 150, 230);
    
    private Texto txtPosicion = new Texto("Posición:", 20, 290, 100, 20);
    private Caja tbPosicion = new Caja(150, 290);
    private Boton btnVisualizar = new Boton("VISUALIZAR", 20, 320);
    
    public VentanaPersonal  ()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtNombre);
        add(txtEspecialidad);
        add(txtArea);
        add(txtCarnet);
        add(txtPeso);
        add(txtTamanho);
        add(tbNombre);
        add(tbEspecialidad);
        add(tbArea);
        add(tbCarnet);
        add(tbPeso);
        add(tbTamanho);
        add(btnAceptar);
        add(btnCancelar);
        
        add(txtPosicion);
        add(tbPosicion);
        add(btnVisualizar);
        
        btnCancelar.addActionListener(this);
        btnAceptar.addActionListener(this);
        btnVisualizar.addActionListener(this);
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(300, 420);
        setVisible(true);
    }
    
    public void registroUsuario(){
        String us = tbNombre.getText();
        String r = tbEspecialidad.getText();
        String n = tbArea.getText();
        String pass = tbCarnet.getText();
        String p = tbPeso.getText();
        String th = tbTamanho.getText();

        Personal rp = new Personal(us, r, n, p, th, pass); // Ajusta el constructor de Animal según corresponda
        DBA.setPersonal(rp);
        setTitle("GUARDADO");

        // Limpiar los campos después del registro
        tbNombre.setText("");
        tbEspecialidad.setText("");
        tbArea.setText("");
        tbCarnet.setText("");
        tbPeso.setText("");
        tbTamanho.setText("");
        setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            registroUsuario();
            Entrada en= new Entrada();
        }
        
        if (e.getSource() == btnVisualizar) {
            try {
                int pos = Integer.parseInt(tbPosicion.getText());
                Personal p = DBA.getPersonalPos(pos);
                if (p != null) {
                    tbNombre.setText(p.getNombre());
                    tbEspecialidad.setText(p.getEspecialidad());
                    tbArea.setText(p.getArea());
                    tbCarnet.setText(String.valueOf(p.getCi()));
                    tbPeso.setText(p.getTelefono());
                    tbTamanho.setText(p.getDireccion());
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error en el formato de número: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al visualizar el registro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
        
            // Cerrar la ventana actual
            window.dispose();
        }
    }
    
    public static void main(String[] args) {
        new VentanaPersonal();
    }
}
