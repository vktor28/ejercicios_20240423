import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //1- Rellenar ArrayList y mostrar resultado:
        //Crear un arraylist mediante un bucle con los
        //números del 20 al 50. Mostrar después todo el
        //contenido del arraylist final.
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        for(int i=20; i<51; i++){
            listaNumeros.add(i);
        }
        System.out.println(listaNumeros);


    }
}
