

public class Main {
    public static void main(String[] args) {

        MatrixCollection matrixCollection = new MatrixCollection();
        matrixCollection.add(1, 0, 0);
        matrixCollection.add(1, 0, 1);
        matrixCollection.add(1, 0, 2);
        matrixCollection.add(1, 0, 3);

        matrixCollection.add(2, 1, 0);
        matrixCollection.add(2, 1, 1);
        matrixCollection.add(2, 1, 2);
        matrixCollection.add(2, 1, 3);

        matrixCollection.add(3, 2, 0);
        matrixCollection.add(3, 2, 1);
        matrixCollection.add(3, 2, 2);
        matrixCollection.add(3, 2, 3);

        matrixCollection.add(4, 3, 0);
        matrixCollection.add(4, 3, 1);
        matrixCollection.add(4, 3, 2);
        matrixCollection.add(4, 3, 3);

        System.out.print(matrixCollection);

        System.out.println("\nВывод");
        for (int i : matrixCollection) {
            System.out.print(i + " ");
        }

        System.out.println("\nВывод");
        for (int i : matrixCollection) {
            System.out.print(i + " ");
        }


    }
}