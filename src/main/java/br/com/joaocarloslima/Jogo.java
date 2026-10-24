package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {

    protected List<Asset> assets;
    protected Nave nave;
    private int pontos;
    private int nivel;

    public Jogo() {
        this.assets = new ArrayList<>();
        this.nave = new Nave(280, 400, 10, Direcao.DIREITA);
        this.pontos = 0;
        this.nivel = 1;
    }

    public Tiro atirar() {

        Tiro tiro = nave.atirar(getNivel());
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {

        Random random = new Random();
        int x = random.nextInt(590);
        Meteoro meteoro = new Meteoro(x, 0, 2, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public void pontuar() {
        this.pontos++;

        int novoNivel = (this.pontos / 10) + 1;
        if (novoNivel > 4) {
            this.nivel = 4;
        } else {
            this.nivel = novoNivel;
        }
    }

    public Nave getNave() {
        return nave;
    }


    public int getPontos() {
        return pontos;
    }


    public int getNivel() {
        return nivel;
    }


}
