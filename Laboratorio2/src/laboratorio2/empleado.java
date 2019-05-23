
package laboratorio2;

/**
 *
 * @author javie
 */
public class empleado {
    //datos del empleado
    private String nombre;
    private int edad;
    private int n_hijos;
    private int tipo_e;
    private double sueldo;
    public empleado(){
        nombre ="";
        edad=0;
        n_hijos=0;
        tipo_e=0;
        sueldo=0;
    }
    
    public empleado(String n, int e,int h, int t, double s){
        nombre =n;
        edad=e;
        n_hijos=h;
        tipo_e=t;
        sueldo = s;
        
    }

    empleado(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setnombre(String n){
        nombre =n;
    }
    
    public String getnombre() {
        return nombre;
    }
    
    public void setedad(int n){
        edad =n;
    }
    
    public int getedad() {
        return edad;
    }
    
      public void setn_hijos(int n){
        n_hijos =n;
    }
    
    public int getn_hijos() {
        return n_hijos;
    }
    
    public void settipo_e(int n){
        tipo_e =n;
    }
    
    public int gettipo_e() {
        return tipo_e;
    }
    public void setsueldo(double s){
        sueldo =s;
    }
    
    public double getsueldo() {
        return sueldo;
    }
}
