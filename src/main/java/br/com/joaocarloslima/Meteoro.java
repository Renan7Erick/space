package br.com.joaocarloslima;

import java.util.Random;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {
    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        Random random = new Random();
        this.tamanho = random.nextInt(8) + 1;
        this.poder = this.tamanho;

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        setImagem(new ImageView(App.class.getResource(path).toExternalForm()));
    }

    public void tomarTiro(Tiro tiro) {
        this.poder -= tiro.getPoder();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}