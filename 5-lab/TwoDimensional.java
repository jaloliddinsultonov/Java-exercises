public class TwoDimensional {
    public static void main(String[] args){

        int maks=0;
        int[][] array = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 3, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 5, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 6, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 8, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 9 }

        };
        int [][] matrix = new int[10][10];
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                matrix[i][j] = array[i][j];
                if(i == j) maks += array[i][j];
                System.out.println(array[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println("Sum=" + maks);

    }
}
