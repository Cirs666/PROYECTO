/**
 *Animal class object.
 * 
 * @author (cirs) 
 * @version (V 0.01)
 */
public class Cuarto
{
    public String ap, ci, ca, fe;
    public double to, num;
    public char suc;
    
    /**
     * Constructor-1 for objects of class Animal
     */
    public Cuarto()
    {
        this.ap= "";
        this.ci= "";
        this.ca= "";
        this.fe= "";
        this.to= 0;
        this.num= 0;
        this.suc= ' ';
    }
    
    /**
     * Constructor-2 for objects of class cuarto
     * 
     * @param  <tipo> de tipo String
     * @param  <nombre> de tipo String
     * @param  <genero> de tipo char
    */
    public Cuarto(String ap, String ci, String ca, String fe, double to, double num, char suc)
    {
        this.ap= ap;
        this.ci= ci;
        this.ca= ca;
        this.fe= fe;
        this.to= to;
        this.num= num;
        this.suc= suc;
        
    }

    /**
     * Metod setInfoBasica para la informacion basica del Animal
     * 
     * @param  <nombre> tipo String, <tipo> tipo String, <genero> tipo char
     * @return  void 
     */
    public void setInfoBasica(String ca, String ap, char suc)
    {
        this.ca= ca;
        this.ap= ap;
        this.suc= suc;
    }
    
    /**
     * Metodo setTipo
     * 
     * @param  <tipo> de tipo String
     * @return  void 
     */
    public void setAp(String ap)
    {
        this.ap= ap;
    }

    /**
     * Metodo setRaza
     * 
     * @param  <raza> tipo String
     * @return  void 
     */
    public void setCi(String ci)
    {
        this.ci= ci;
    }
    
    /**
     * Metodo setNombre
     * 
     * @param  <nombre> tipo String
     * @return  void 
     */
    public void setCa(String ca)
    {
        this.ca= ca;
    }
    
    /**
     * Metodo setColor
     * 
     * @param  <color> tipo String
     * @return  void 
     */
    public void setFe(String fe)
    {
        this.fe= fe;
    }
    
    /**
     * Metodo setPeso
     * 
     * @param  <peso> tipo double
     * @return  void 
     */
    public void setTo(double to)
    {
        this.to= to;
    }
    
    /**
     * Metodo setTamanho
     * 
     * @param  <tamanho> tipo double
     * @return  void 
     */
    public void setNum(double num)
    {
        this.num= num;
    }
    
    /**
     * Metodo setGenero
     * 
     * @param <genero> tipo char
     * @return void
    */
    public void setSuc(char suc)
    {
        this.suc= suc;
    }
    
    /**
     * Metodo getTipo
     * 
     * @return  String
     */
    public String getAp()
    {
        return this.ap;
    }
    
    /**
     * Metodo getRaza
     * 
     * @return  String
     */
    public String getCi()
    {
        return this.ci;
    }
    
    /**
     * Metodo getNombre
     * 
     * @return  String
     */
    public String getCa()
    {
        return this.ca;
    }
    
    /**
     * Metodo getColor
     * 
     * @return  String
     */
    public String getFe()
    {
        return this.fe;
    }
    
    /**
     * Metodo getPeso
     * 
     * @return  double
     */
    public double getTo()
    {
        return this.to;
    }
    
    /**
     * Metodo getTamanho
     * 
     * @return  double
     */
    public double getNum()
    {
        return this.num;
    }
    
    /**
     * Metodo getGenero
     * 
     * @return  char
     */
    public char getSuc()
    {
        return this.suc;
    }
    
}