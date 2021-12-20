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

        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(),0.0001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(),0.0001);
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescenteComOutrosValores(){
//      Cenario: 3 lances
        var maria = new Usuario("Maria");
        var jose = new Usuario("José");
        var joao = new Usuario("João");

        var leilao = new Leilao("Maquina de Lavar");

        leilao.propoe(new Lance(maria, 6000.0));
        leilao.propoe(new Lance(joao, 1000.0));
        leilao.propoe(new Lance(jose, 5000.0));

        double maiorEsperado = 6000.0;
        double menorEsperado = 1000.0;

//      Executando a ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

//      exibindo a saída
        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
    }
}