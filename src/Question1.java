public class Question1 {
    public static void matrixDiff(int[][] matrixA,int[][] matrixB){
        System.out.println("A matrisinde olup B matrisinde olmayan elemanlar:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean contains = false;

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (matrixA[i][j] == matrixB[k][l]) {
                            contains = true;
                        }
                    }
                }

                if (!contains) {
                    System.out.println(matrixA[i][j]);
                }
            }
        }
    }
}
