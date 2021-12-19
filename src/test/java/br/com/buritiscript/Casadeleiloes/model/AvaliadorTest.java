package br.com.buritiscript.Casadeleiloes.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AvaliadorTest {

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
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
        double maiorEsperado = 400.0;
        double menorEsperado = 250.0;

        assertEquals(leiloeiro.getMaiorDeTodos(), maiorEsperado, 0.0001);
        assertEquals(leiloeiro.getMenorDeTodos(), menorEsperado, 0.0001);
    }
}