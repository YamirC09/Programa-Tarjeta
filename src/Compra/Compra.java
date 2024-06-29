package Compra;

public class Compra implements Comparable<Compra>{
    private double valor;
    private String descripion;

    public Compra(double valor, String descripion) {
        this.valor = valor;
        this.descripion = descripion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripion() {
        return descripion;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripion='" + descripion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
