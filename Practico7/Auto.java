package Clase7.Vehículos;

public class Auto extends Vehiculo{
    private int maximaVelocidad;
    private String cilindrada;

    public Auto(){
        this.maximaVelocidad=160;
        this.cilindrada="1.6 cilindros";
    }
    public Auto(int cantRuedas, String unColor,int unaVelocidad, String cantCilindros){
        super(cantRuedas, unColor);
        this.maximaVelocidad=unaVelocidad;
        this.cilindrada=cantCilindros;
    }
    public void setMaximaVelocidad(Integer unaVelocidad){
        this.maximaVelocidad=unaVelocidad;
    }
    public int getMaximaVelocidad(){
        return this.maximaVelocidad;
    }
    public void setCilindrada(String cantCilindros){
        this.cilindrada=cantCilindros;
    }
    public String getCilindrada(){
        return this.cilindrada;
    }
    public String toString (){
        String retorno = "El auto "+super.toString()+". Tiene una cilindrada de "+this.getCilindrada()+
                " y alcanza una velocidad máxima de "+this.getMaximaVelocidad();
        return retorno;
    }

}
