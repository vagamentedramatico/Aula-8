package TrabalhoAutonomo;

    public abstract class pecaXadrez {
        private Posicao pos;
        private boolean white;

        public pecaXadrez(int pos_x, int pos_y, boolean white) {
            this.pos = new Posicao(pos_x, pos_y);
            this.white = white;
        }

        public Posicao getPos() {
            return pos;
        }

        public boolean isWhite() {
            return white;
        }

        public abstract Posicao[] movimentosPissiveis();

        @Override
        public String toString() {
            String retorno = "Esta peça tem os seguintes movimentos: ";
            for (Posicao posicao : movimentosPissiveis()) {
                retorno += posicao + ",";}
            return retorno;
        }
    }



