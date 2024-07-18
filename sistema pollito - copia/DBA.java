
public class DBA
{
    // cuarto
    public static void setCuarto(Cuarto c)
    {
        // Asumiendo que 'BD.registrarCuarto' acepta un objeto 'Cuarto'
        BD.registrarCuarto(c);
    }
    
    public static void getUltCuarto()
    {
        Cuarto uc = BD.mostrarUltCuarto();
        getCuarto(uc);
    }
    
    public static Cuarto getCuartoPos(int pos) {
        if (pos <= BD.ic) {
                return BD.cuartoPos(pos - 1);
        } else {
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }
    }
    
    public static void getCuarto(Cuarto c)
    {
        System.out.println("\n===============================");
        System.out.println("Apellidos: "+c.ap);
        System.out.println("ci: "+c.ci);
        System.out.println("cantidad: "+c.ca);
        System.out.println("fecha: "+c.fe);
        System.out.println("total: "+c.to);
        System.out.println("numero de venta: "+c.num);
        System.out.println("Sucursal: "+c.suc);
    }
    
    // ECONOMICO
    public static void setEconomico(Economico m)
    {
        // Asumiendo que 'BD.registrarCuarto' acepta un objeto 'Cuarto'
        BD.registrarEconomico(m);
    }
    
    public static void getUltEconomico()
    {
        Economico um = BD.mostrarUltEconomico();
        setEconomico(um);
    }
    
    public static Economico getEconomicoPos(int pos) {
        if (pos <= BD.im) {
                return BD.economicoPos(pos - 1);
        } else {
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }
    }
    
    public static void getEconomico(Economico m)
    {
        System.out.println("\n===============================");
        System.out.println("Apellidos: "+m.ap);
        System.out.println("ci: "+m.ci);
        System.out.println("cantidad: "+m.ca);
        System.out.println("fecha: "+m.fe);
        System.out.println("total: "+m.to);
        System.out.println("numero de venta: "+m.num);
        System.out.println("Sucursal: "+m.suc);
    }
    
    
    //PERSONAL
    
    public static void setPersonal(Personal p)
    {
        BD.registrarPersonal(p);
    }
    
    public static void getUltPersonal()
    {
        Personal up = BD.mostrarUltPersonal();
        getPersonal(up);
    }
    
    public static Personal getPersonalPos(int pos) {
        if (pos <= BD.ie) {
                return BD.personalPos(pos - 1);
        } else {
            System.out.println("ERROR: Registro no encontrado.");
            return null;
        }
    }
    
    public static boolean existePersonal(Personal p){
        boolean res= false;

        for(int i=0; i<BD.ie; i++){
            if(p.getNombre().equals(BD.personal[i].getNombre()) && p.getCi().equals(BD.personal[i].getCi()))
                res= true;
        }
        return res;
    }
    
    public static void getPersonal(Personal p)
    {
        System.out.println("\n===============================");
        System.out.println("Nombre: "+p.nombre);
        System.out.println("Especialidad: "+p.especialidad);
        System.out.println("Area: "+p.area);
        System.out.println("Telefono: "+p.telefono);
        System.out.println("Direccion: "+p.direccion);
        System.out.println("CI: "+p.ci);
    }
}
