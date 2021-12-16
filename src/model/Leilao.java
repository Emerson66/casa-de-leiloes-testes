package model;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

    private String item;
    private List<Lance> lances = new ArrayList<>();

    public Leilao(String item) {
        this.item = item;
    }
    @Deprecated
    public Leilao() {
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void propoe(Lance lance) {
        lances.add(lance);
    }
}
