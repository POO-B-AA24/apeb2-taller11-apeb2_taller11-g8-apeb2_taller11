
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);
        ArrayList<Personaje> listaPeronajes = new ArrayList<Personaje>();
        Personaje guerrero = new Guerrero(0, "as", 0, 0);
        Personaje arquero = new Arquero(0, habilidadesDistancia, 0, 0);
        Personaje mago = new Mago(hechizos, 0, 0, 0);
        listaPeronajes.add(guerrero);
        listaPeronajes.add(arquero);
        listaPeronajes.add(mago);
        System.out.println("C");
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Menu ArbolBinario");
            System.out.println("[1] Crear ArbolBinario");
            System.out.println("[2] Buscar N Mayor del ArbolBinario");
            System.out.println("[3] Buscar N Menor del ArbolBinario");
            System.out.println("[4] Mostrar Arbol Binario");
            System.out.println("[5] Salir");
            System.out.println("------------------------------------");
            int elec = siu.nextInt();
            switch (elec) {
                case 1:                    
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta vuelva a ingresar.");
                    break;
            }
            if (elec == 5) {
                break;
            }
        }
    }

}

abstract class Personaje{
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
    public abstract void ataque();
    public abstract void defensa();
}
class Guerrero extends Personaje{
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
    
    public void ataque(){
    }
    public void defensa(){
    }
}
class Mago extends Personaje{
    private ArrayList <String> hechizos;
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
    
    public void ataque(){
    }
    public void defensa(){
    }
}
class Arquero extends Personaje{
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
    
    public void ataque(){
    }
    public void defensa(){
    }
}