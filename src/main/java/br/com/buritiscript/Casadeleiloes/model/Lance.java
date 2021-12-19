package br.com.buritiscript.Casadeleiloes.model;

public class Lance {
    private Usuario usuario;
    private double valor;

    public Lance(Usuario usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}