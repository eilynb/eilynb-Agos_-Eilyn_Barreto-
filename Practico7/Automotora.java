package Clase7.Vehículos;

public class Automotora {

    public static void main (String args[]){
        Vehiculo auto1= new Auto(3,"Morado",220,"2.4");
        System.out.println(auto1);

        Vehiculo moto1= new Motocicleta();
        System.out.println(moto1);

        Vehiculo moto2= new Motocicleta(5,"Azul",150,"1.8");
        System.out.println(moto2);

        Vehiculo semiR1= new SemiRemolque();
        System.out.println(semiR1);

        Vehiculo semiR2= new SemiRemolque(6,"Amarillo",1);
        System.out.println(semiR2);



    }

}
