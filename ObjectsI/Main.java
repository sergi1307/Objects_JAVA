package ObjectsI;

public class Main {
    public static void main(String[] args) {

        int opc;

        do {
            System.out.println("1 - Clase Punto");
            System.out.println("2 - Clase Persona");
            System.out.println("3 - Clase Rectángulo");
            System.out.println("-1 - Salir");

            opc = Leer.leerEntero("Introduzca que quiere hacer: ");

            if (opc == 1) {
                Punto p1 = new Punto();
                Punto p2 = new Punto();
                Punto p3 = new Punto();

                p1.x = 5;
                p1.y = 0;

                p2.x = 10;
                p2.y = 10;

                p3.x = -3;
                p3.y = 7;

                System.out.println("Las coordenadas del punto 1 són: " + p1.x + " " + p1.y + ".");
                System.out.println("Las coordenadas del punto 2 són: " + p2.x + " " + p2.y + ".");
                System.out.println("Las coordenadas del punto 3 són: " + p3.x + " " + p3.y + ".");

                p1.x *= 2;
                p1.y += 6;

                p2.x -= 3;
                p2.y *= 4;

                p3.x += 4;
                p3.y -= 3;

                System.out.println("Coordenadas actualizadas: ");
                System.out.println("Las coordenadas del punto 1 són: " + p1.x + " " + p1.y + ".");
                System.out.println("Las coordenadas del punto 2 són: " + p2.x + " " + p2.y + ".");
                System.out.println("Las coordenadas del punto 3 són: " + p3.x + " " + p3.y + ".");
            }
        } while (opc != -1);

    }
}
