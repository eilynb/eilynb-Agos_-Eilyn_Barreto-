package Clase7.Vehículos;

public class Vehiculo {
    protected int rueda;
    protected String color;

    public Vehiculo (){
        this.rueda=4;
        this.color="Negro";
    }
    public Vehiculo (int cantRuedas, String unColor){
        this.rueda=cantRuedas;
        this.color=unColor;
    }

    public void setRueda(Integer cantRuedas){
        this.rueda=cantRuedas;
    }
    public int getRueda(){
        return this.rueda;
    }
    public void setColor(String unColor){
        this.color=unColor;
    }
    public String getColor(){
        return this.color;
    }
    public String toString (){
        return "es de color "+this.getColor()+" y tiene "+this.rueda+" ruedas";
    }
}
