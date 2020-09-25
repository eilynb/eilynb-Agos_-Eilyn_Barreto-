package Clase7.Vehículos;

public class SemiRemolque extends Vehiculo {
    private int cantidadEjes;

    public SemiRemolque (){
        cantidadEjes=2;
    }
    public SemiRemolque (int cantRuedas,String unColor,int cantEjes){
        super(cantRuedas,unColor);
        this.cantidadEjes=cantEjes;
    }
    public void setCantidadEjes(Integer cantEjes){
        this.cantidadEjes=cantEjes;
    }
    public int getCantidadEjes(){
        return this.cantidadEjes;
    }
    public String toString () {
        return "El Semi remolque " + super.toString() + ". Y tiene " + this.getCantidadEjes()+" eje.";
    }
}
