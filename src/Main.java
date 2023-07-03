// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
     * @param args
     */
    public static void main(String[] args) {
        double precioConIva = getPrecio(10);
        System.out.println(precioConIva);
    }
    static double getPrecio(double precio) {
        return precio * 1.21;
    }
}