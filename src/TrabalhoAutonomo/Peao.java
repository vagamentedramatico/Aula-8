package TrabalhoAutonomo;

public class Peao extends pecaXadrez {
    public Peao(int pos_x, int post_y, boolean white) {
        super(pos_x, post_y, white);
    }

    @Override
    public Posicao[] movimentosPissiveis() {
        if (isWhite()) {
            if (getPos().getY() == 0) {
                return new Posicao[0];
            } else if (getPos().getY() == 6) {
                return new Posicao[]{
                    new Posicao(getPos().getX(), 5),
                    new Posicao(getPos().getY(), 4)
                };
            } else {
                if(getPos().getY() == 7) {
                    return new Posicao[0];
                } else if(getPos().getY() == 1){
                    return new Posicao[]{
                            new Posicao(getPos().getX(), 2),
                            new Posicao(getPos().getY(), 3)
                };
            } else {
                return new Posicao[]{
                    new Posicao(getPos().getX(), getPos().getY() + 1)
                    };
                }
            }
        }
        return new Posicao[0];
    }

}

