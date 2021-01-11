package TrabalhoAutonomo;

public class Posicao {
    private int x;
    private int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private char convertPosToCharY(int y) {
        char[] abc = {'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        return abc[y];
    }

    private char convertPosToCharX(int x) {
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        return abc[x];
    }

    @Override
    public String toString() {
        return "(" + convertPosToCharX(getX()) + ","
                + (8 - getY()) + ")";
    }
}