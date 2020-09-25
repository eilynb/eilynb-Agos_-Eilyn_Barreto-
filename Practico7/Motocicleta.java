package Clase7.Vehículos;

public class Motocicleta extends Vehiculo{
    private int velocidad;
    private String cilindrada;

    public Motocicleta(){
        this.velocidad=190;
        this.cilindrada="1.6 cilindros";
    }
    public Motocicleta(int cantRuedas, String unColor,int unaVelocidad, String cantCilindros){
        super(cantRuedas,unColor);
        this.velocidad=unaVelocidad;
        this.cilindrada=cantCilindros;
    }
    public void setMaximaVelocidad(Integer unaVelocidad){
        this.velocidad=unaVelocidad;
    }
    public int getMaximaVelocidad(){
        return this.velocidad;
    }
    public void setCilindrada(String cantCilindros){
        this.cilindrada=cantCilindros;
    }
    public String getCilindrada(){
        return this.cilindrada;
    }
    public String toString (){
        String retorno = "La moto "+super.toString()+". Tiene "+this.getCilindrada()+
                " cilindros y alcanza una velocidad de "+this.getMaximaVelocidad();
        return retorno;
    }

}
