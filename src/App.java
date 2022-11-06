
public class App {
    public static void main(String[] args) throws Exception {
        int resultado;
        resultado= suma(10, 15, 8);
        System.out.println("Resultado de la suma: " + resultado);

        Coche miCoche = new Coche();
        System.out.println("Puertas iniciales: " + miCoche.puertas);
        miCoche.incrementarPuertas(4);
        System.out.println("Total puertas: " + miCoche.puertas);
    }


    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static class Coche{
        public int puertas=0;
       
        public void incrementarPuertas(int puertasNuevas){
            puertas += puertasNuevas;
        }
    }
}