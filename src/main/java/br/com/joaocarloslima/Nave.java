package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        String path = "images/ships/playerShip1_blue.png";
        setImagem(new ImageView(App.class.getResource(path).toExternalForm()));

    }

    public Tiro atirar(int poder) {

        return new Tiro(getX() + 20, getY(), 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        super.mover();
        if (getX() < 0) {
            setX(0);
        }
        if (getX() > 590) {
            setX(590);
        }
    }


}



