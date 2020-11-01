
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - Irune Arratibel
 *  
 */
public class Fila
{
    //Atributos
    //Constantes
    //Variables
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;
    private Fila fila2;
    
    //Metodos
    /**
     * Constructor1  
     */
    public Fila(String id){
      this.id = id;
      fecha = new Fecha(1,1,2020);
      ingresos = 0.0;
      gastos = 0.0;
    }

    /**
     * Constructor2  
     */
    public Fila(String id, Fecha fecha, double ingresos, double gastos){
     this.id = id;
     this.fecha = fecha;
     this.ingresos = ingresos;
     this.gastos = gastos;
    }
    
    //GETTERS
    /**
     * accesor para el id de la fila
     */
    public String getId(){
        return this.id;

    }
    
    /**
     * accesor para la fecha
     */
    public Fecha getFecha(){
        return this.fecha;

    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        return this.ingresos;

    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        return this.gastos;

    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        return this.ingresos - this.gastos;

    }
    
    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */
    public Fila duplicar() {
       return fila2 = new Fila(getId(),fecha.obtenerCopia(),getBeneficio(),getGastos() );

    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString() {
        if(getBeneficio() >= 0){ 
            System.out.printf("\n%8s  %15s  %15.2f€  %15.2f€ %15.2f€",id,fecha.toString(),ingresos,gastos,getBeneficio());
        }
        else{
            System.out.printf("\n%8s  %15s  %15.2f€  %15.2f€ %15.2f€ **",id,fecha.toString(),ingresos,gastos,getBeneficio());
        }
        return "";
    }
}
