import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //2- Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.
        //Para acabar, escribir 'salir'. Al final, mostrar todos los elementos
        //introducidos por el usuario.
        Scanner teclado = new Scanner(System.in);
        ArrayList <String> listaSJ = new ArrayList<>();
        String itemsSJ="";
        System.out.println("Dime elementos típicos de Sant Jordi");
        listaSJ.add(teclado.nextLine());
        while (!itemsSJ.equals("SALIR")) {
        System.out.println("Añade otro  elementos o escribe SALIR");
        String respuesta=teclado.nextLine();
        if (respuesta.equals("SALIR")){
        itemsSJ="SALIR";
        System.out.println("\n------\nGracias, esta es tu lista:");
        for (String listaSJfinal: listaSJ){
            System.out.println(listaSJfinal);
        } 
        } else {
        listaSJ.add(respuesta);    
        }        
        }
    }
}
