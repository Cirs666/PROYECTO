
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Write a description of class Ventana here.
 * 
 * @author (cirs) 
 * @version (a version number or a date)
 */
public class Ventanaeconomico extends JFrame implements ActionListener
{
    private Texto titulo= new Texto("Registro ECONOMICO :", 10, 10, 150, 30);
    private Texto txtAp= new Texto("apellido:", 20, 40, 180, 20);
    private Texto txtCi= new Texto("ci:", 20, 70, 180, 20);
    private Texto txtCa= new Texto("cantidad:", 20, 100, 180, 20);
    private Texto txtFe= new Texto("fecha:", 20, 130, 180, 20);
    private Texto txtTo= new Texto("total:", 20, 160, 180, 20);
    private Texto txtNum= new Texto("numero  de venta:", 20, 190, 180, 20);
    private Texto txtSuc= new Texto("sucursal :", 20, 220, 180, 20);
    private Caja tbAp= new Caja(150, 40);
    private Caja tbCi= new Caja(150, 70);
    private Caja tbCa= new Caja(150, 100);
    private Caja tbFe= new Caja(150, 130);
    private Caja tbTo= new Caja(150, 160);
    private Caja tbNum= new Caja(150, 190);
    private Caja tbSuc= new Caja(150, 220);
    private Boton btnAceptar= new Boton("ACEPTAR", 20, 270);
    private Boton btnCancelar= new Boton("CANCELAR", 150, 270);
    
    private Texto txtPosicion = new Texto("Posición:", 20, 320, 100, 20);
    private Caja tbPosicion = new Caja(150, 320);
    private Boton btnVisualizar = new Boton("mostrar pedido", 20, 350);
    
    public Ventanaeconomico()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtAp);
        add(txtCi);
        add(txtCa);
        add(txtFe);
        
        add(txtTo);
        add(txtNum);
        add(txtSuc);
        add(tbAp);
        add(tbCi);
        add(tbCa);
        add(tbFe);
        
        add(tbTo);
        add(tbNum);
        add(tbSuc);
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
        setSize(300, 450);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String Ap = tbAp.getText();
            String Ci = tbCi.getText();
            String Ca = tbCa.getText();
            String Fe = tbFe.getText();
            double To = Double.parseDouble(tbTo.getText());
            double Num = Double.parseDouble(tbNum.getText());
            char Suc = tbSuc.getText().charAt(0);

            Economico ra = new Economico(Ap, Ci, Ca,Fe, To, Num, Suc); // Ajusta el constructor de economico según corresponda
            DBA.setEconomico(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbAp.setText("");
            tbCi.setText("");
            tbCa.setText("");
            tbFe.setText("");
            tbTo.setText("");
            tbNum.setText("");
            tbSuc.setText("");
        }
        
        if (e.getSource() == btnVisualizar) {
            try {
                int pos = Integer.parseInt(tbPosicion.getText());
                Economico m = DBA.getEconomicoPos(pos);
                if (e != null) {
                    tbAp.setText(m.getAp());
                    tbCi.setText(m.getCi());
                    tbCa.setText(m.getCa());
                    tbFe.setText(m.getFe());
                    tbTo.setText(String.valueOf(m.getTo()));
                    tbNum.setText(String.valueOf(m.getNum()));
                    tbSuc.setText(String.valueOf(m.getSuc()));
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
        new Ventanaeconomico();
    }
}