package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        String path = "image/ships/playerShip1_blue.png";
        setImagem(new ImageView(App.class.getResource(path).toString()));

    }

    public Tiro atirar(int poder) {
        return new Tiro(getX(), getY(), getDirecao.CIMA, poder);
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



