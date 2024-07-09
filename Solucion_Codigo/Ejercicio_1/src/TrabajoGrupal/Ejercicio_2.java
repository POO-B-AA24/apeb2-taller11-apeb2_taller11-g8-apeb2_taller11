import java.util.ArrayList;
import java.util.List;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Menu menu1 = new MenuCarta("Plato 1", 10.0, 2.0, 1.5, 10.0);
        Menu menu2 = new MenuDia("Plato 2", 12.0, 3.0, 2.0);
        Menu menu3 = new MenuNinos("Plato 3", 8.0, 1.0, 1.5);
        Menu menu4 = new MenuEconomico("Plato 4", 15.0, 20.0);

        Factura factura = new Factura("Juan Pablo Landi");
        factura.agregarMenu(menu1);
        factura.agregarMenu(menu2);
        factura.agregarMenu(menu3);
        factura.agregarMenu(menu4);
        factura.calcularTotal();

        System.out.println(factura);
    }
}
abstract class Menu {
    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }
    public abstract void calcularValorMenu();

    @Override
    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\nValor del Menú: %.2f",
                nombrePlato, valorInicial, valorMenu);
    }
}
class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;
    public MenuCarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
        calcularValorMenu();
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida + (valorInicial * porcentajeServicio / 100);
    }
    @Override
    public String toString() {
        return String.format("%s\nValor Guarnición: %.2f\nValor Bebida: %.2f\nPorcentaje Servicio: %.2f%%",
                super.toString(), valorGuarnicion, valorBebida, porcentajeServicio);
    }
}
class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }
    @Override
    public String toString() {
        return String.format("%s\nValor Postre: %.2f\nValor Bebida: %.2f",
                super.toString(), valorPostre, valorBebida);
    }
}
class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
        calcularValorMenu();
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }
    @Override
    public String toString() {
        return String.format("%s\nValor Helado: %.2f\nValor Pastel: %.2f",
                super.toString(), valorHelado, valorPastel);
    }
}
class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularValorMenu();
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial * porcentajeDescuento / 100);
    }
    @Override
    public String toString() {
        return String.format("%s\nPorcentaje Descuento: %.2f%%",
                super.toString(), porcentajeDescuento);
    }
}
class Factura {
    private String nombreCliente;
    private List<Menu> menus;
    private double subtotal;
    private double iva;
    private double total;
    public Factura(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.menus = new ArrayList<>();
    }
    public void agregarMenu(Menu menu) {
        menus.add(menu);
    }
    public void calcularTotal() {
        subtotal = 0;
        for (Menu menu : menus) {
            subtotal += menu.valorMenu;
        }
        iva = subtotal * 0.12;
        total = subtotal + iva;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        for (Menu menu : menus) {
            sb.append(menu.toString()).append("\n\n");
        }
        sb.append(String.format("Subtotal: %.2f\nIVA: %.2f\nTotal: %.2f", subtotal, iva, total));
        return sb.toString();
    }
}