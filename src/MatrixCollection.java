import java.util.Iterator;

public class MatrixCollection implements Iterable<Integer> {

    private final int ROW = 4;
    private final int COL = 4;

    private final int[][] matrix = new int[ROW][COL];

    public void add(int value, int row, int col) {
        this.matrix[row][col] = value;
    }

    public int get(int row, int col) {
        return this.matrix[row][col];
    }

    public void remove(int row, int col) {
        this.matrix[row][col] = 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    private class MatrixIterator implements Iterator<Integer> {
        int row = 0;
        int col = 0;

        @Override
        public boolean hasNext() {
            return row != ROW;
        }

        @Override
        public Integer next() {
            int element = matrix[row][col];
            col++;

            if(col == COL){
                col = 0;
                row++;
            };

            return element;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
