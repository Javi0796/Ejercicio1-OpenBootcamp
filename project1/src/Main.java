public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int parametro1=5, parametro2=7, parametro3=18;
        int resultado = Suma(parametro1, parametro2, parametro3);
        System.out.println("El resultado es "+ resultado);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuerta();
        System.out.println("miCoche tiene "+ miCoche.puerta +" puertas.");
    }

    public static int Suma(int a, int b, int c){
        return a + b + c;
    }
}



class Coche {
    public int puerta = 4;

    public void IncrementarPuerta(){
        this.puerta ++;

    }
}

