public class Rook extends Piece {

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x == getCoordinatesX() && y == getCoordinatesY()) {
            return false;
        }
        if (board.validate(x, y)) {
            if (getCoordinatesX() == x) {
                if (getCoordinatesY() < y) {
                    for (int i = getCoordinatesY() + 1; i < y; i++) {
                        if (board.getAt(x, i) != null) {
                            return false;
                        }
                    }
                    if (board.getAt(x, y) == null
                            || board.getAt(x, y).getColor() != getColor()) {
                        return true;
                    }
                } else {
                    for (int i = getCoordinatesY() - 1; i > y; i--) {
                        if (board.getAt(x, i) != null) {
                            return false;
                        }
                    }
                    if (board.getAt(x, y) == null
                            || board.getAt(x, y).getColor() != getColor()) {
                        return true;
                    }

                }
            } else if (getCoordinatesY() == y) {
                if (getCoordinatesX() < x) {
                    for (int i = getCoordinatesX() + 1; i < x; i++) {
                        if (board.getAt(i, y) != null) {
                            return false;
                        }
                    }
                    if (board.getAt(x, y) == null
                            || board.getAt(x, y).getColor() != getColor()) {
                        return true;
                    }
                } else {
                    for (int i = getCoordinatesX() - 1; i > x; i--) {
                        if (board.getAt(i, y) != null) {
                            return false;
                        }
                    }
                    if (board.getAt(x, y) == null
                            || board.getAt(x, y).getColor() != getColor()) {
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
