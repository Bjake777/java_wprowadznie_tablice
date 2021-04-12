public class Zadanie2MA {
    public static void main(String[] args) {
        char[][] product  = new char[3][];
        product[0] = new char[4];
        product[1] = new char[2];
        product[2] = new char[5];

        product[0][0] = 'b';
        product[0][1] = 'u';
        product[0][2] = 't';
        product[0][3] = 'y';

        product[1][0] = 52;
        product[1][1] = 50;

        product[2][0] = '2';
        product[2][1] = '3';
        product[2][2] = '.';
        product[2][3] = '4';
        product[2][4] = '2';

       System.out.println("---------------------------------------------------");
       for (int i = 0; i < product.length; i++) {
           for (int j = 0; j < product[i].length; j++) {
               System.out.print(product[i][j]);
           }
           System.out.println();
       }
       System.out.println("---------------------------------------------------");

    }

}
