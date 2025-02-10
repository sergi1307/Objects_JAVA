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
                Rectangulo rec1 = new Rectangulo();
                Rectangulo rec2 = new Rectangulo();
                int perimetro1, perimetro2, ancho1, ancho2, altura1, altura2, area1, area2;

                rec1.x1 = 0;
                rec1.y1 = 0;
                rec1.x2 = 5;
                rec1.y2 = 5;

                rec2.x1 = 7;
                rec2.y1 = 9;
                rec2.x2 = -3;
                rec2.y2 = 7;

                perimetro1 = rec1.x1 + rec1.y1 + rec1.x2 + rec1.y2;
                perimetro2 = rec2.x1 + rec2.y1 + rec2.x2 + rec2.y2;

                ancho1 = Math.abs(rec1.x1 - rec1.x2);
                ancho2 = Math.abs(rec2.x1 - rec2.x2);

                altura1 = Math.abs(rec1.y1 - rec1.y2);
                altura2 = Math.abs(rec2.y1 - rec2.y2);

                area1 = ancho1 * altura1;
                area2 = ancho2 * altura2;

                System.out.println("Rectángulo 1: Coordenadas ("+rec1.x1+","+rec1.x2+")("+rec1.y1+","+rec1.y2+"). Perímetro: " + perimetro1 +". Area: " + area1 +".");
                System.out.println("Rectángulo 2: Coordenadas ("+rec2.x1+","+rec2.x2+")("+rec2.y1+","+rec2.y2+"). Perímetro: " + perimetro2 +". Area: " + area2 +".");

                rec1.x1 += 3;
                rec1.y1 -= 4;
                rec1.x2 *= 3;
                rec1.y2 -= 2;

                rec2.x1 += 8;
                rec2.y1 -= 6;
                rec2.x2 *= -1;
                rec2.y2 += 3;

                perimetro1 = rec1.x1 + rec1.y1 + rec1.x2 + rec1.y2;
                perimetro2 = rec2.x1 + rec2.y1 + rec2.x2 + rec2.y2;

                ancho1 = Math.abs(rec1.x1 - rec1.x2);
                ancho2 = Math.abs(rec2.x1 - rec2.x2);

                altura1 = Math.abs(rec1.y1 - rec1.y2);
                altura2 = Math.abs(rec2.y1 - rec2.y2);

                area1 = ancho1 * altura1;
                area2 = ancho2 * altura2;

                System.out.println("Datos actualizados: ");
                System.out.println("Rectángulo 1: Coordenadas ("+rec1.x1+","+rec1.x2+")("+rec1.y1+","+rec1.y2+"). Perímetro: " + perimetro1 +". Area: " + area1 +".");
                System.out.println("Rectángulo 2: Coordenadas ("+rec2.x1+","+rec2.x2+")("+rec2.y1+","+rec2.y2+"). Perímetro: " + perimetro2 +". Area: " + area2 +".");
            } else if (opc != -1) {
                System.out.println("Valor introducido no correcto.");
            }
        } while (opc != -1);

    }
}
