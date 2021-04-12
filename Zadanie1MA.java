public class Zadanie1MA {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 2;
        array[2][0] = 3;


        array[1][1] = array[0][1] * array[1][0];
        array[1][2] = array[0][2] * array[1][0];
        
        array[2][1] = array[0][1] * array[2][0];
        array[2][2] = array[2][0] * array[0][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        
    }
    
}
