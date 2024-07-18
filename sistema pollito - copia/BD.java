public class BD
{
    public static Cuarto[] cuarto= new Cuarto[100];
    public static int ic= 0;
     public static Economico[] economico= new Economico[100];
    public static int im= 0;
    
    
    public static Personal[] personal= new Personal[100];
    public static int ie= 0;
    
    //REGISTRAR Y MOSTRAR cuarto
    public static void registrarCuarto(Cuarto cn)
    {
            cuarto[ic]= cn;
            ic++;
    }
    
     public static Cuarto mostrarUltCuarto()
    {
        return cuarto[ic-1];
    }
    
    public static Cuarto cuartoPos(int pos)
    {
        return cuarto[pos];
    }
    public static void registrarEconomico(Economico mn)
    {
            economico[im]= mn;
            im++;
    }
    
     public static Economico mostrarUltEconomico()
    {
        return economico[im-1];
    }
    
    public static Economico economicoPos(int pos)
    {
        return economico[pos];
    }
    
    //REGISTRAR Y MOSTRAR MEDICAMENTO
    
    
    
    //REGISTRAR Y MOSTRAR PERSONAL
    
    public static void registrarPersonal(Personal pn)
    {
            personal[ie]= pn;
            ie++;
    }
    
     public static Personal mostrarUltPersonal()
    {
        return personal[ie-1];
    }
    
    public static Personal personalPos(int pos)
    {
        return personal[pos];
    }
}