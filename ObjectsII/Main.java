package ObjectsII;

import ObjectsIII.Leer;

public class Main {
    public static void main(String[] args) {

        int opc;

        do {
            System.out.println("1 - Concursantes.");
            System.out.println("2 - Alumnos.");
            System.out.println("0 - Salir");

            opc = Leer.leerEntero("Introduzca que quiere hacer: ");

            if (opc == 1) {
                Concursante c1 = new Concursante();
                Concursante c2 = new Concursante();
                Concursante c3 = new Concursante();

                System.out.println("Datos persona 1: ");
                c1.nombre.nombre = Leer.leerTexto("Nombre: ");
                c1.nombre.primerApellido = Leer.leerTexto("Primer Apellido: ");
                c1.nombre.segundoApellido = Leer.leerTexto("Segundo Apellido: ");
                c1.nombreArtistico = Leer.leerTexto("Nombre Artístico: ");
                c1.domicilio.calle = Leer.leerTexto("Nombre de la calle: ");
                c1.domicilio.codigoPostal = Leer.leerEntero("Código postal: ");
                c1.domicilio.numero = Leer.leerEntero("Número de vivienda: ");
                c1.domicilio.puerta = Leer.leerEntero("Número de la puerta: ");
                c1.domicilio.piso = Leer.leerEntero("Piso (0 CASA): ");
                c1.domicilio.poblacion = Leer.leerTexto("Población");
                c1.domicilio.provincia = Leer.leerTexto("Provincia: ");
                c1.anioNacimiento = Leer.leerEntero("Año nacimiento: ");
                c1.concurso.titulo = Leer.leerTexto("Título del concurso: ");
                c1.concurso.fecha.anio = Leer.leerEntero("Año del concurso: ");
                c1.concurso.fecha.mes = Leer.leerEntero("Mes del concurso: ");
                c1.concurso.fecha.dia = Leer.leerEntero("Día del concurso: ");
                c1.concurso.tiempo.horas = Leer.leerEntero("Horas del concurso: ");
                c1.concurso.tiempo.minutos = Leer.leerEntero("Minutos del concurso: ");
                c1.concurso.tiempo.segundos = Leer.leerEntero("Segundos del concurso: ");
                c1.concurso.tiempo.centesimas = Leer.leerEntero("Centésimas del concurso: ");

                System.out.println("Datos persona 2: ");
                c2.nombre.nombre = Leer.leerTexto("Nombre: ");
                c2.nombre.primerApellido = Leer.leerTexto("Primer Apellido: ");
                c2.nombre.segundoApellido = Leer.leerTexto("Segundo Apellido: ");
                c2.nombreArtistico = Leer.leerTexto("Nombre Artístico: ");
                c2.domicilio.calle = Leer.leerTexto("Nombre de la calle: ");
                c2.domicilio.codigoPostal = Leer.leerEntero("Código postal: ");
                c2.domicilio.numero = Leer.leerEntero("Número de vivienda: ");
                c2.domicilio.puerta = Leer.leerEntero("Número de la puerta: ");
                c2.domicilio.piso = Leer.leerEntero("Piso (0 CASA): ");
                c2.domicilio.poblacion = Leer.leerTexto("Población: ");
                c2.domicilio.provincia = Leer.leerTexto("Provincia: ");
                c2.anioNacimiento = Leer.leerEntero("Año nacimiento: ");
                c2.concurso.titulo = Leer.leerTexto("Título del concurso: ");
                c2.concurso.fecha.anio = Leer.leerEntero("Año del concurso: ");
                c2.concurso.fecha.mes = Leer.leerEntero("Mes del concurso: ");
                c2.concurso.fecha.dia = Leer.leerEntero("Día del concurso: ");
                c1.concurso.tiempo.horas = Leer.leerEntero("Horas del concurso: ");
                c1.concurso.tiempo.minutos = Leer.leerEntero("Minutos del concurso: ");
                c1.concurso.tiempo.segundos = Leer.leerEntero("Segundos del concurso: ");
                c1.concurso.tiempo.centesimas = Leer.leerEntero("Centésimas del concurso: ");

                System.out.println("Datos persona 3: ");
                c3.nombre.nombre = Leer.leerTexto("Nombre: ");
                c3.nombre.primerApellido = Leer.leerTexto("Primer Apellido: ");
                c3.nombre.segundoApellido = Leer.leerTexto("Segundo Apellido: ");
                c3.nombreArtistico = Leer.leerTexto("Nombre Artístico: ");
                c3.domicilio.calle = Leer.leerTexto("Nombre de la calle: ");
                c3.domicilio.codigoPostal = Leer.leerEntero("Código postal: ");
                c3.domicilio.numero = Leer.leerEntero("Número de vivienda: ");
                c3.domicilio.puerta = Leer.leerEntero("Número de la puerta: ");
                c3.domicilio.piso = Leer.leerEntero("Piso (0 CASA): ");
                c3.domicilio.poblacion = Leer.leerTexto("Población: ");
                c3.domicilio.provincia = Leer.leerTexto("Provincia: ");
                c3.anioNacimiento = Leer.leerEntero("Año nacimiento: ");
                c3.concurso.titulo = Leer.leerTexto("Título del concurso: ");
                c3.concurso.fecha.anio = Leer.leerEntero("Año del concurso: ");
                c3.concurso.fecha.mes = Leer.leerEntero("Mes del concurso: ");
                c3.concurso.fecha.dia = Leer.leerEntero("Día del concurso: ");
                c3.concurso.tiempo.horas = Leer.leerEntero("Horas del concurso: ");
                c3.concurso.tiempo.minutos = Leer.leerEntero("Minutos del concurso: ");
                c3.concurso.tiempo.segundos = Leer.leerEntero("Segundos del concurso: ");
                c3.concurso.tiempo.centesimas = Leer.leerEntero("Centésimas del concurso: ");

                System.out.println(c1.nombre.nombre + " " + c1.nombre.primerApellido + c1.nombre.segundoApellido + " (" + c1.nombreArtistico + "). Vive en: "
                        + c1.domicilio.calle + " en el número: " + c1.domicilio.numero + " número de puerta: " + c1.domicilio.puerta + " del piso: " + c1.domicilio.piso +
                        ", en la población: " + c1.domicilio.poblacion + " con código postal: " + c1.domicilio.codigoPostal + " en la província: " + c1.domicilio.provincia + ". Nació en el " +
                        c1.anioNacimiento + ". Se ha inscrito al concurso: " + c1.concurso.titulo + " que se realizará el: " + c1.concurso.fecha.dia + " de " + c1.concurso.fecha.mes + " del: " +
                        c1.concurso.fecha.anio + ". La duración es de: " + c1.concurso.tiempo.horas + ":" + c1.concurso.tiempo.minutos + ":" + c1.concurso.tiempo.segundos + ":" + c1.concurso.tiempo.centesimas + ".");

                System.out.println(c2.nombre.nombre + " " + c2.nombre.primerApellido + c2.nombre.segundoApellido + " (" + c2.nombreArtistico + "). Vive en: "
                        + c2.domicilio.calle + " en el número: " + c2.domicilio.numero + " número de puerta: " + c2.domicilio.puerta + " del piso: " + c2.domicilio.piso +
                        ", en la población: " + c2.domicilio.poblacion + " con código postal: " + c2.domicilio.codigoPostal + " en la província: " + c2.domicilio.provincia + ". Nació en el " +
                        c2.anioNacimiento + ". Se ha inscrito al concurso: " + c2.concurso.titulo + " que se realizará el: " + c2.concurso.fecha.dia + " de " + c2.concurso.fecha.mes + " del: " +
                        c2.concurso.fecha.anio + ". La duración es de: " + c2.concurso.tiempo.horas + ":" + c2.concurso.tiempo.minutos + ":" + c2.concurso.tiempo.segundos + ":" + c2.concurso.tiempo.centesimas + ".");

                System.out.println(c3.nombre.nombre + " " + c3.nombre.primerApellido + c3.nombre.segundoApellido + " (" + c3.nombreArtistico + "). Vive en: "
                        + c3.domicilio.calle + " en el número: " + c3.domicilio.numero + " número de puerta: " + c3.domicilio.puerta + " del piso: " + c3.domicilio.piso +
                        ", en la población: " + c3.domicilio.poblacion + " con código postal: " + c3.domicilio.codigoPostal + " en la província: " + c3.domicilio.provincia + ". Nació en el " +
                        c3.anioNacimiento + ". Se ha inscrito al concurso: " + c3.concurso.titulo + " que se realizará el: " + c3.concurso.fecha.dia + " de " + c3.concurso.fecha.mes + " del: " +
                        c3.concurso.fecha.anio + ". La duración es de: " + c3.concurso.tiempo.horas + ":" + c3.concurso.tiempo.minutos + ":" + c3.concurso.tiempo.segundos + ":" + c3.concurso.tiempo.centesimas + ".");
            }
        } while (opc != 0);
    }
}