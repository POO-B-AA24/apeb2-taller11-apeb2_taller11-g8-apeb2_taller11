package TrabajoGrupal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Personaje> listaPersonajes = new ArrayList<>();

        System.out.println("-------------------------------------------------------");
        System.out.println("                     MENU DE INICIO                    ");
        System.out.println("             BIENVENIDO A DUELO DE LEYENDAS            ");
        System.out.println("                           -                           ");
        System.out.println("            By: JuanP Landi and Emilio Pena            ");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("SELECCIONE UNA OPCION PARA CONTINUAR!!");
        System.out.println("--------------------------------------");
        System.out.println("1. JUGAR");
        System.out.println("2. DESCRIPCION DEL JUEGO");
        System.out.println("3. DEDICATORIA");
        System.out.println("4. SALIR");

        int c = 0;
        while (c < 2) {
            System.out.print("Ingrese su opción: ");
            int inicio = scanner.nextInt();
            switch (inicio) {
                case 1:
                    System.out.println("-----------------------------------------------");
                    System.out.println("        LOBBY DE CREACION DE PERSONAJE         ");
                    System.out.println("-----------------------------------------------");
                    System.out.println("INGRESE TIPO DE COMBATIENTE DE SU PERSONAJE ");
                    System.out.println("1. GUERRERO");
                    System.out.println("2. ARQUERO");
                    System.out.println("3. MAGO");

                    int opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("-------------------------------------------------");
                            int fuerza = (int) (Math.random() * 101);
                            System.out.println("LA FUERZA DEL GUERRERO ES: " + fuerza);
                            ArrayList<String> habilidadesCuerpoList = new ArrayList<>();
                            System.out.println("-------------------------------------------------");
                            System.out.println("SELECCIONE HASTA 3 HABILIDADES CUERPO A CUERPO:");
                            System.out.println("1. PUÑETAZO (10 DE DAÑO)");
                            System.out.println("2. PATADA (15 DE DAÑO)");
                            System.out.println("3. PATADA VOLADORA (20 DE DAÑO)");
                            System.out.println("4. HACHAZO (25 DE DAÑO)");
                            System.out.println("5. CABEZAZO (30 DE DAÑO)");
                            int habilidadesSeleccionadas = 0;
                            while (habilidadesSeleccionadas < 3) {
                                System.out.print("INGRESE LA OPCIÓN DE HABILIDAD (0 PARA TERMINAR): ");
                                int habilidadOpcion = scanner.nextInt();
                                if (habilidadOpcion == 0) {
                                    if (habilidadesCuerpoList.isEmpty()) {
                                        System.out.println("DEBE SELECCIONAR AL MENOS UNA HABILIDAD.");
                                    } else {
                                        break;
                                    }
                                } else {
                                    switch (habilidadOpcion) {
                                        case 1:
                                            habilidadesCuerpoList.add("PUNETAZO");
                                            habilidadesSeleccionadas++;
                                            break;
                                        case 2:
                                            habilidadesCuerpoList.add("PATADA");
                                            habilidadesSeleccionadas++;
                                            break;
                                        case 3:
                                            habilidadesCuerpoList.add("PATADA VOLADORA");
                                            habilidadesSeleccionadas++;
                                            break;
                                        case 4:
                                            habilidadesCuerpoList.add("HACHAZO");
                                            habilidadesSeleccionadas++;
                                            break;
                                        case 5:
                                            habilidadesCuerpoList.add("CABEZAZO");
                                            habilidadesSeleccionadas++;
                                            break;
                                        default:
                                            System.out.println("OPCION INCORRECTA");
                                    }
                                }
                            }

                            Personaje guerrero = new Guerrero(fuerza, habilidadesCuerpoList, 100, 1);
                            listaPersonajes.add(guerrero);
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------");
                            int precision = (int) (Math.random() * 101);
                            System.out.println("LA FUERZA DEL ARQUERO ES: " + precision);
                            ArrayList<String> habilidadesDistanciaList = new ArrayList<>();
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("SELECCIONE HASTA 3 HABILIDADES DE DISTANCIA:");
                            System.out.println("1. DISPARO ATURDIDOR");
                            System.out.println("2. DISPARO A DOS OBJETIVOS");
                            System.out.println("3. DISPARO CERTERO (AUMENTA LA PRECISIÓN AL 100%)");
                            System.out.println("4. TRAMPA DE OSO");
                            System.out.println("5. DISPARO ELEMENTAL (HACE EL DOBLE DE DAÑO AL 200% Y LANZA FLECHAS DE HIELO, FUEGO Y TIERRA)");
                            int seleccion = 0;
                            while (seleccion < 3) {
                                System.out.print("INGRESE LA OPCIÓN DE HABILIDAD (0 PARA TERMINAR): ");
                                int habilidadOpcion = scanner.nextInt();
                                if (habilidadOpcion == 0) {
                                    if (habilidadesDistanciaList.isEmpty()) {
                                        System.out.println("DEBE SELECCIONAR AL MENOS UNA HABILIDAD.");
                                    } else {
                                        break;
                                    }
                                } else {
                                    switch (habilidadOpcion) {
                                        case 1:
                                            habilidadesDistanciaList.add("DISPARO ATURDIDOR");
                                            seleccion++;
                                            break;
                                        case 2:
                                            habilidadesDistanciaList.add("DISPARO A DOS OBJETIVOS");
                                            seleccion++;
                                            break;
                                        case 3:
                                            habilidadesDistanciaList.add("DISPARO CERTERO");
                                            seleccion++;
                                            break;
                                        case 4:
                                            habilidadesDistanciaList.add("TRAMPA DE OSO");
                                            seleccion++;
                                            break;
                                        case 5:
                                            habilidadesDistanciaList.add("DISPARO ELEMENTAL");
                                            seleccion++;
                                            break;
                                        default:
                                            System.out.println("OPCION INCORRECTA");
                                    }
                                }
                            }
                            Personaje arquero = new Arquero(precision, habilidadesDistanciaList, 100, 1);
                            listaPersonajes.add(arquero);
                            break;

                        case 3:
                            System.out.println("-------------------------------------------------");
                            int poderMagico = (int) (Math.random() * 101);
                            System.out.println("LA FUERZA DEL MAGO ES: " + poderMagico);
                            System.out.println("----------------------------------------------------");
                            System.out.println("SELECCIONE UNO DE LOS TIPOS DE MAGOS:");
                            System.out.println("1. MAGO DE HIELO");
                            System.out.println("2. MAGO DE FUEGO");
                            System.out.println("3. MAGO ELÉCTRICO");
                            int tipoMago = scanner.nextInt();

                            while (poderMagico < 1 || poderMagico > 100) {
                                System.out.print("PODER MÁGICO INVÁLIDO. INGRESE UN VALOR ENTRE 1 Y 100: ");
                                poderMagico = scanner.nextInt();
                            }

                            ArrayList<String> hechizosList = new ArrayList<>();

                            switch (tipoMago) {
                                case 1: // Mago de Hielo
                                    hechizosList.add("ESCARCHA (15 DE DAÑO)");
                                    hechizosList.add("TORMENTA DE HIELO (30 DE DAÑO)");
                                    hechizosList.add("BOLA DE HIELO (25 DE DAÑO)");
                                    break;
                                case 2: // Mago de Fuego
                                    hechizosList.add("BOLA DE FUEGO (30 DE DAÑO)");
                                    hechizosList.add("INFERNO (40 DE DAÑO)");
                                    hechizosList.add("LANZALLAMAS (35 DE DAÑO)");
                                    break;
                                case 3: // Mago Eléctrico
                                    hechizosList.add("DESCARGA ELÉCTRICA (20 DE DAÑO)");
                                    hechizosList.add("RAYO ELÉCTRICO (25 DE DAÑO)");
                                    hechizosList.add("TORMENTA ELÉCTRICA (35 DE DAÑO)");
                                    break;
                                default:
                                    System.out.println("OPCION INCORRECTA.");
                                    return;
                            }
                            Personaje mago = new Mago(hechizosList, poderMagico, 100, 1);
                            listaPersonajes.add(mago);
                            break;

                        default:
                            System.out.println("OPCION INCORRECTA.");
                            break;
                    }

                    System.out.println("\nPERSONAJES CREADOS:");
                    for (Personaje personaje : listaPersonajes) {
                        System.out.println(personaje.getClass().getSimpleName() + ": " + personaje.getPuntoVida() + " PUNTOS DE VIDA, NIVEL " + personaje.getNivelExpe()+ " DANIO: " +personaje.ataque() + "\n");
                    }
                    if (listaPersonajes.size() >= 2) {
                        Personaje personaje1 = listaPersonajes.get(0);
                        Personaje personaje2 = listaPersonajes.get(1);

                        int danoPersonaje1 = personaje1.ataque();
                        int danoPersonaje2 = personaje2.ataque();

                        if (danoPersonaje1 > danoPersonaje2) {
                            System.out.println("El " + personaje1.getClass().getSimpleName() + " ha ganado la pelea.");
                        } else if (danoPersonaje2 > danoPersonaje1) {
                            System.out.println("El " + personaje2.getClass().getSimpleName() + " ha ganado la pelea.");
                        } else {
                            System.out.println("Empate. Ambos personajes han hecho el mismo daño.");
                        }
                    } else {
                        System.out.println("No hay suficientes personajes en la lista.");
                    }
                    break;

                case 2:
                    System.out.println("\nBIENVENIDO AL JUEGO DE DUELO DE LEYENDAS.");
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("DUELO DE LEYENDAS ES UN EMOCIONANTE JUEGO DE ROL 1V1 DONDE PUEDES ELEGIR ENTRE TRES TIPOS DE PERSONAJES: GUERREROS, MAGOS Y ARQUEROS.");
                    System.out.println("CADA TIPO DE PERSONAJE TIENE HABILIDADES ÚNICAS QUE PUEDES UTILIZAR PARA DERROTAR A TU OPONENTE.\n");
                    break;

                case 3:
                    System.out.println("\nDEDICATORIA:");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("EL JUEGO DE DUELO DE LEYENDAS ESTA DEDICADO A TODOS LOS AMANTES DE LOS JUEGOS DE BATALLA Y FANTASIA.");
                    System.out.println("Y A NUESTRO PROFESOR EL ING. DANIEL IRENE.\n");
                    break;

                case 4:
                    System.out.println("\nGRACIAS POR JUGAR <DUELO DE LEYENDAS> HASTA LA PROXIMA!\n");
                    return;

                default:
                    System.out.println("OPCION INCORRECTA.");
                    break;
            }
            c++;
        }
    }
}

abstract class Personaje {

    protected double puntoVida;
    protected int nivelExpe;

    public Personaje(double puntoVida, int nivelExpe) {
        this.puntoVida = puntoVida;
        this.nivelExpe = nivelExpe;
    }

    public void setPuntoVida(double puntoVida) {
        this.puntoVida = puntoVida;
    }

    public void setNivelExpe(int nivelExpe) {
        this.nivelExpe = nivelExpe;
    }

    public double getPuntoVida() {
        return puntoVida;
    }

    public int getNivelExpe() {
        return nivelExpe;
    }

    public abstract void defensa();

    public abstract int ataque();

}

class Guerrero extends Personaje {

    private int fuerza;
    private ArrayList<String> habilidadesCuerpo;

    public Guerrero(int fuerza, ArrayList<String> habilidadesCuerpo, double puntoVida, int nivelExpe) {
        super(puntoVida, nivelExpe);
        this.fuerza = fuerza;
        this.habilidadesCuerpo = habilidadesCuerpo;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setHabilidadesCuerpo(ArrayList<String> habilidadesCuerpo) {
        this.habilidadesCuerpo = habilidadesCuerpo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public ArrayList<String> getHabilidadesCuerpo() {
        return habilidadesCuerpo;
    }

    public void defensa() {
    }

    @Override
    public int ataque() {
        // Devuelve el daño promedio de las habilidades del guerrero
        int danoPromedio = 0;
        for (String habilidad : habilidadesCuerpo) {
            danoPromedio += getDano(habilidad);
        }
        return (danoPromedio / habilidadesCuerpo.size()) + getFuerza();
    }

    public int getDano(String habilidad) {
        int danoBase = 0;
        switch (habilidad) {
            case "Punietazo":
                danoBase = 10;
                break;
            case "Patada":
                danoBase = 15;
                break;
            case "Patada Voladora":
                danoBase = 20;
                break;
            case "Hachazo":
                danoBase = 25;
                break;
            case "Cabezazo":
                danoBase = 30;
                break;
            default:

        }
        return danoBase + fuerza;
    }

}

class Mago extends Personaje {

    private ArrayList<String> hechizos;
    private int poderMagico;

    public Mago(ArrayList<String> hechizos, int poderMagico, double puntoVida, int nivelExpe) {
        super(puntoVida, nivelExpe);
        this.hechizos = hechizos;
        this.poderMagico = poderMagico;
    }

    public ArrayList<String> getHechizos() {
        return hechizos;
    }

    public void setHechizos(ArrayList<String> hechizos) {
        this.hechizos = hechizos;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public void defensa() {
    }

    @Override
    public int ataque() {
        // Devuelve el daño promedio de los hechizos del mago
        int danoPromedio = 0;
        for (String hechizo : hechizos) {
            danoPromedio += getDano(hechizo);
        }
        return (danoPromedio / hechizos.size())+getPoderMagico();
    }

    public int getDano(String hechizo) {
        int danoBase = 0;
        switch (hechizo) {
            case "Escarcha":
                danoBase = 15;
                break;
            case "Tormenta de Hielo":
                danoBase = 30;
                break;
            case "Bola de Hielo":
                danoBase = 25;
                break;
            case "Bola de Fuego":
                danoBase = 30;
                break;
            case "Inferno":
                danoBase = 40;
                break;
            case "Lanzallamas":
                danoBase = 35;
                break;
            case "Descarga Electrica":
                danoBase = 20;
                break;
            case "Rayo Electrico":
                danoBase = 25;
                break;
            case "Tormenta Electrica":
                danoBase = 35;
                break;
            default:

        }
        return danoBase + poderMagico;
    }
}

class Arquero extends Personaje {

    private double precision;
    private ArrayList<String> habilidadesDistancia;

    public Arquero(double precision, ArrayList<String> habilidadesDistancia, double puntoVida, int nivelExpe) {
        super(puntoVida, nivelExpe);
        this.precision = precision;
        this.habilidadesDistancia = habilidadesDistancia;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public ArrayList<String> getHabilidadesDistancia() {
        return habilidadesDistancia;
    }

    public void setHabilidadesDistancia(ArrayList<String> habilidadesDistancia) {
        this.habilidadesDistancia = habilidadesDistancia;
    }

    public void defensa() {
    }

    @Override
    public int ataque() {
        // Devuelve el daño promedio de las habilidades del arquero
        int danoPromedio = 0;
        for (String habilidad : habilidadesDistancia) {
            danoPromedio += getDano(habilidad);
        }
        return danoPromedio / habilidadesDistancia.size();
    }

    public int getDano(String habilidad) {
        int danoBase = 0;
        switch (habilidad) {
            case "Disparo aturdidor":
                danoBase = 10;
                break;
            case "Disparo a dos objetivos":
                danoBase = 15;
                break;
            case "Disparo certero":
                danoBase = 20;
                precision = 100; // Aumenta la precisión al 100%
                break;
            case "Trampa de oso":
                danoBase = 25;
                break;
            case "Disparo elemental":
                danoBase = 40; // Hace el doble de daño al 200%
                break;
            default:

        }
        return (int) ((int) (danoBase * (precision / 100.0))+getPrecision());
    }

}
