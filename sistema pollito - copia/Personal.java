/**
 *  Personal class object.
 * 
 * @author (ese.joel) 
 * @version (a version number or a date)
 */
public class Personal
{
    public String nombre, especialidad, area, telefono, direccion, ci;
    /**
     * Constructor-1 for objects of class Personal
     */
    public Personal()
    {
        this.nombre= "";
        this.especialidad= "";
        this.area= "";
        this.ci= "";
        this.telefono= "";
        this.direccion= "";
    }
    
    /**
     * Constructor-2 for objects of class Personal
     * 
     * @param  <nombre> de tipo String
     * @param  <especialidad> de tipo String
     * @param  <area> de tipo String
     * @param  <ci> de tipo int
     * @param  <telefono> de tipo String
     * @param  <direccion> de tipo String
    */
    public Personal(String nombre, String especialidad, String area, String telefono, String direccion, String ci)
    {
        this.nombre= nombre; /// ci usuario
        this.especialidad= especialidad;
        this.area= area;
        this.ci = ci; //contraseña
        this.telefono= telefono;
        this.direccion= direccion;
    }
    
    public Personal(String nombre, String ci)
    {
        this.nombre= nombre;
        this.ci= ci;
    }
    
    /**
     * Metodo setInfobasica
     * 
     * @param  <nombre> de tipo String
     * @param  <especialidad> de tipo String
     * @param  <telefono> de tipo String
     * @return  void 
     */
    public void setInfobasica(String nombre, String esecialidad, String telefono)
    {
        this.nombre= nombre;
        this.especialidad= especialidad;
        this.telefono= telefono;
    }
    
    /**
     * Metodo setNombre
     * 
     * @param  <nombre> de tipo String
     * @return  void 
     */
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    /**
     * Metodo setEspecialidad
     * 
     * @param  <especialidad> de tipo String
     * @return  void 
     */
    public void setEspecialidad(String especialidad)
    {
        this.especialidad= especialidad;
    }
    
    /**
     * Metodo setArea
     * 
     * @param  <area> de tipo String
     * @return  void 
     */
    public void setArea(String area)
    {
        this.area= area;
    }
    
    /**
     * Metodo setCi
     * 
     * @param  <String> de tipo int
     * @return  void 
     */
    public void setCi(String ci)
    {
        this.ci= ci;
    }
    
    /**
     * Metodo setTelefono
     * 
     * @param  <telefono> de tipo String
     * @return  void 
     */
    public void setTelefono(String telefono)
    {
        this.telefono= telefono;
    }
    
    /**
     * Metodo setDireccion
     * 
     * @param  <direccion> de tipo String
     * @return  void 
     */
    public void setDireccion(String direccion)
    {
        this.direccion= direccion;
    }
    
    //GETTERS
    
    /**
     * Metodo getNombre
     * 
     * @return  String
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Metodo getEspecialidad
     * 
     * @return  String
     */
    public String getEspecialidad()
    {
        return this.especialidad;
    }
    
    /**
     * Metodo getArea
     * 
     * @return  String
     */
    public String getArea()
    {
        return this.area;
    }
    
    /**
     * Metodo getCi
     * 
     * @return  String
     */
    public String getCi()
    {
        return this.ci;
    }
    
    /**
     * Metodo getTelefono
     * 
     * @return  String
     */
    public String getTelefono()
    {
        return this.telefono;
    }
    
    /**
     * Metodo getDireccion
     * 
     * @return  String
     */
    public String getDireccion()
    {
        return this.direccion;
    }
}