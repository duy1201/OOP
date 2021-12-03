public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * this is constructor.
     *
     * @param startX     int
     * @param endX       int
     * @param startY     int
     * @param endY       int
     * @param movedPiece Piece
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this(startX, endX, startY, endY, movedPiece);
        this.killedPiece = killedPiece;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    @Override
    public String toString() {
        char[] board = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        return movedPiece.getColor() + "-" + movedPiece.getSymbol() + board[endX - 1] + endY;
    }
}
