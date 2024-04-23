import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*3- CRUD: recepción internacional... y universal!

Te han encargado organizar la recepción oficial para el primer
contacto extraterrestre, en la montaña de Montserrat.
Solo unos pocos en el mundo pueden asistir. ¿A quién enviarías? 
De momento la lista sólo puede ser de cinco elegid@s.

Pero dos de ellos, en los puestos 2 y 3, se asustan y se dan de baja,
y entra entonces el personaje X (darle nombre) en el puesto 2.

La persona que está en el último puesto, se pone enferma y te recomienda
que pongas en su lugar al personaje Y (darle nombre). Ojo con saber qué
índice es el último

En el último momento, se añade el personaje Z (darle nombre) al
puesto vacante (puesto 3).

Ves mostrando a cada paso cómo va quedando la lista actualizada:
los medios están muy interesados en seguir la noticia al minuto!
*/
ArrayList <String> elegidos = new ArrayList<>();
System.out.println("Te hemos encomendado la tarea de elegir a las 5 personas\nque desees para tener contacto con extraterrestes\n");
Scanner teclado = new Scanner(System.in);
System.out.println("¿Cuales son los nombres de los elegidos?");
for (int i=0; i<5; i++) {
    
    elegidos.add(teclado.nextLine());
}
System.out.println("\nVaya, parece que "+ elegidos.get(1)+ " y " + elegidos.get(2) + " no pueden ir...");
elegidos.set(1, "null");
elegidos.set(2, "null");
System.out.println(elegidos);
System.out.println("Pero tenemos una persona en reserva para ir en su lugar, indica su nombre:");
elegidos.set(1, teclado.nextLine());
System.out.println(elegidos);
System.out.println("\nNos han notificado que "+ elegidos.get(4)+ " se ha puesto enferm@...");
System.out.println("Elige a otra persona para ir:");
elegidos.set(4, teclado.nextLine());
System.out.println(elegidos);
System.out.println("\nA falta de 2 días hemos encontrado un nuevo integrante, indica su nombre");
elegidos.set(2, teclado.nextLine());
System.out.println("\n---------\nESTOS SON LOS ELEGIDOS FINALES");
        for (String elegidosFinales: elegidos){
            System.out.println(elegidosFinales);
        }
    }
}
