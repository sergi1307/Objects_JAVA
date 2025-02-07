package ObjectsII;

public class Main {
    public static void main(String[] args) {
        Concursante c1 = new Concursante();
        Concursante c2 = new Concursante();
        Concursante c3 = new Concursante();

        c1.nombre.nombre = "Jesús";
        c1.nombre.primerApellido = "Álvarez";
        c1.nombre.segundoApellido = "Olmo";
        c1.nombreArtistico = "ElJesu";
        c1.domicilio.calle = "Carrer Sequial";
        c1.domicilio.codigoPostal = 46410;
        c1.domicilio.numero = 5;
        c1.domicilio.puerta = 2;
        c1.domicilio.piso = 1;
        c1.domicilio.poblacion = "Sueca";
        c1.domicilio.provincia = "Valencia";
        c1.anioNacimiento = 1980;
        c1.concurso.fecha.anio = 2025;
        c1.concurso.fecha.mes = 7;
        c1.concurso.fecha.dia = 26;

        c2.nombre.nombre = "Sergi";
        c2.nombre.primerApellido = "Molina";
        c2.nombre.segundoApellido = "Barberà";
        c2.nombreArtistico = "Rayitoser13";
        c2.domicilio.calle = "Carrer Major";
        c2.domicilio.codigoPostal = 46410;
        c2.domicilio.numero = 21;
        c2.domicilio.puerta = 1;
        c2.domicilio.piso = 0;
        c2.domicilio.poblacion = "Sueca";
        c2.domicilio.provincia = "Valencia";
        c2.anioNacimiento = 2006;
        c2.concurso.fecha.anio = 2025;
        c2.concurso.fecha.mes = 8;
        c2.concurso.fecha.dia = 31;

        c3.nombre.nombre = "Inés";
        c3.nombre.primerApellido = "Álvarez";
        c3.nombre.segundoApellido = "Calle";
        c3.nombreArtistico = "La_Suki";
        c3.domicilio.calle = "Carrer Cullera";
        c3.domicilio.codigoPostal = 46410;
        c3.domicilio.numero = 8;
        c3.domicilio.puerta = 6;
        c3.domicilio.piso = 3;
        c3.domicilio.poblacion = "Sueca";
        c3.domicilio.provincia = "Valencia";
        c3.anioNacimiento = 2004;
        c3.concurso.fecha.anio = 2025;
        c3.concurso.fecha.mes = 9;
        c3.concurso.fecha.dia = 30;
    }
}