package test;

import model.Avaliador;
import model.Lance;
import model.Leilao;
import model.Usuario;

class AvaliadorTest {

    public static void main(String[] args) {
        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");
        Usuario jose = new Usuario("José");

        Leilao leilao = new Leilao("DVD da Karol com K");

        leilao.propoe(new Lance(joao, 300.0));
        leilao.propoe(new Lance(maria, 400.0));
        leilao.propoe(new Lance(jose, 250.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

//  imprime 400
        System.out.println(leiloeiro.getMaiorDeTodos());
//  imprime 250
        System.out.println(leiloeiro.getMenorDeTodos());
    }
}