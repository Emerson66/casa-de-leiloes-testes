package test;

import model.Avaliador;
import model.Lance;
import model.Leilao;
import model.Usuario;

class AvaliadorTest {

    public static void main(String[] args) {
//      cenario: 3 lances em ordem crescente
        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");
        Usuario jose = new Usuario("José");

        Leilao leilao = new Leilao("DVD da Karol com K");

        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(maria, 300.0));
        leilao.propoe(new Lance(jose, 400.0));

//      executando a ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

//      exibindo a saída
        System.out.println(leiloeiro.getMaiorDeTodos());
        System.out.println(leiloeiro.getMenorDeTodos());
    }
}