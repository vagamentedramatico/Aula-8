package TrabalhoAutonomo;

public class Cavalo extends pecaXadrez {

    public Cavalo(int pos_x, int pos_y, boolean white) {
        super(pos_x, pos_y, white);
    }

    @Override
    public Posicao[] movimentosPissiveis() {

        int x = getPos().getX();
        int y = getPos().getY();

        return new Posicao[]{
                new Posicao(x - 1, y - 2),
                new Posicao(x - 2, y - 1),
                new Posicao(x + 1, y - 2),
                new Posicao(x + 2, y - 1),
                new Posicao(x - 1, y + 2),
                new Posicao(x - 2, y + 1),
                new Posicao(x + 1, y + 2),
                new Posicao(x + 2, y + 1)
        };
    }

}

