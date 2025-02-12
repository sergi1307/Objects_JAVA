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

                p1.setX(5);
                p1.setY(0);

                p2.setX(10);
                p2.setY(10);

                p3.setX(-3);
                p3.setY(7);

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
                Persona per1 = new Persona();
                Persona per2 = new Persona();

                per1.setDni("20866142J");
                per1.setNombre("Sergi");
                per1.setApellidos("Molina Barberá");
                per1.setEdad(18);

                per2.setNombre("Inés");
                per2.setEdad(20);

                per1.mostrar();
                per2.mostrar();

                System.out.println("Persona 1 es mayor de edad: " + per1.esMayorEdad());
                System.out.println("Persona 1 es jubilado: " + per1.esJubilado());
                System.out.println("Persona 2 es mayor de edad: " + per2.esMayorEdad());
                System.out.println("Persona 2 es jubilado: " + per2.esJubilado());

            } else if (opc == 3) {
                Rectangulo rec1 = new Rectangulo();
                Rectangulo rec2 = new Rectangulo();

                rec1.setX1(0);
                rec1.setY1(0);
                rec1.setX2(5);
                rec2.setY2(5);

                rec2.setX1(7);
                rec2.setY1(9);
                rec2.setX2(-3);
                rec2.setY2(7);

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
