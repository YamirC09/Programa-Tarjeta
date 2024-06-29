import Compra.Compra;
import Compra.TarjetaCredito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el limite de tu tarjeta");
        double limite = teclado.nextDouble();
        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int salir = 1;
        while(salir != 0){
            System.out.println("Escriba la descripcion de la compra: ");
            String descripcion = teclado.next();

            System.out.println("Escriba el valor de la compra: ");
            double valor = Double.valueOf(teclado.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = teclado.nextInt();
            }
            else{
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
        }
        System.out.println("#########################");
        System.out.println("COMPRAS REALIZADAS");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compra compra : tarjeta.getListaDeCompras()){
            System.out.println(compra.getDescripion() + " - " + compra.getValor());
        }
        System.out.println("#########################");
        System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
