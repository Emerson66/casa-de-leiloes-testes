package br.com.buritiscript.Casadeleiloes.model;


import org.junit.jupiter.api.Test;
//O metodo assertEquals() é estatico, portanto, podemos importalode maneira estatica
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
    public void deveEntenderLancesSemUmaOrdemEspecifica(){
//      Cenario: 3 lances sem ordem especifica
        var maria = new Usuario("Maria");
        var jose = new Usuario("José");
        var joao = new Usuario("João");
        var leilao = new Leilao("Maquina de Lavar");
        leilao.propoe(new Lance(maria, 3000.0));
        leilao.propoe(new Lance(joao, 5000.0));
        leilao.propoe(new Lance(jose, 2000.0));
        double maiorEsperado = 5000.0;
        double menorEsperado = 2000.0;
//      Executando a ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
//      exibindo a saída
        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
    }

    @Test
    public void deveEntenderLancesEmOrdemDecrescente(){
//      Cenario: 3 lances em ordem decrescente
        var joao = new Usuario("João");
        var maria = new Usuario("Maria");
        var jose = new Usuario("José");
        var leilao = new Leilao("Carrinho de mão novo");
        leilao.propoe(new Lance(joao, 100.0));
        leilao.propoe(new Lance(maria, 90.0));
        leilao.propoe(new Lance(jose, 80.0));
        double maiorEsperado = 100.0;
        double menorEsperado = 80.0;
//      Executando ação
        var leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
//      Exibindo a saida
        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.0001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.0001);
    }

    @Test
    public void deveEntenderApenasUmLance(){
//      Cenario: 1 lance
        var joao = new Usuario("João");
        var leilao = new Leilao("Fusca Azul");
        leilao.propoe(new Lance(joao, 2700.0));
        double maiorEsperado = 2700.0;
        double menorEsperado = 2700.0;
//      Executando ação
        var leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
//      Testando
        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.0001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.0001);
    }
}