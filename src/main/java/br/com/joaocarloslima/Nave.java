package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

        String path = "images/ships/playerShip1_blue.png";
        ImageView img = new ImageView(App.class.getResource(path).toExternalForm());

        // Deixa a imagem invisível para sumir com a nave duplicada do canto superior esquerdo
        img.setVisible(false);
        setImagem(img);
    }

    public Tiro atirar(int poder) {
        return new Tiro(getX(), getY(), 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        super.mover();
        if (getX() < 0) {
            setX(0);
        }
        if (getX() > 590) { // Limite exato de x max = 640 - 50[cite: 10]
            setX(590);
        }
    }
}