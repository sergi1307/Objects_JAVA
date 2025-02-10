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
                Punto p1 = new Punto(5, 0);
                Punto p2 = new Punto(10, 10);
                Punto p3 = new Punto(-3, 7);

                System.out.println("Las coordenadas del punto 1 són:");
                p1.mostrar();
                System.out.println("Las coordenadas del punto 2 són:");
                p2.mostrar();
                System.out.println("Las coordenadas del punto 3 són:");
                p3.mostrar();

                p1.desplaza(6, true);
                p1.desplaza(4, false);

                p2.desplaza(10, true);
                p2.desplaza(8, false);

                p3.desplaza(-3, true);
                p3.desplaza(9, false);

                System.out.println("Coordenadas actualizadas: ");
                System.out.println("Las coordenadas del punto 1 són:");
                p1.mostrar();
                System.out.println("Las coordenadas del punto 2 són:");
                p2.mostrar();
                System.out.println("Las coordenadas del punto 3 són:");
                p3.mostrar();

            } else if (opc == 2) {
                Persona per1 = new Persona("20866142J", "Sergi", "Molina Barberá", 18);
                Persona per2 = new Persona("Inés", 20);

                per1.mostrar();
                per2.mostrar();

                System.out.println("Persona 1 es mayor de edad: " + per1.esMayorEdad());
                System.out.println("Persona 1 es jubilado: " + per1.esJubilado());
                System.out.println("Persona 2 es mayor de edad: " + per1.esMayorEdad());
                System.out.println("Persona 2 es jubilado: " + per1.esJubilado());

            } else if (opc == 3) {
                Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
                Rectangulo rec2 = new Rectangulo(7, 9, -3, 7);

                rec1.mostrar();
                rec2.mostrar();

                System.out.println("Perímetro del rectángulo 1: " + rec1.perimetro());
                System.out.println("Área del rectángulo 1: " + rec1.area());

                System.out.println("Perímetro del rectángulo 2: " + rec2.perimetro());
                System.out.println("Área del rectángulo 2: " + rec2.area());

            } else if (opc != -1) {
                System.out.println("Valor introducido no correcto.");
            }
        } while (opc != -1);

    }
}
