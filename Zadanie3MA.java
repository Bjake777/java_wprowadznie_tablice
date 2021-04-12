public class Zadanie3MA {
    public static void main(String[] args) {
        char[][] crossword = new char[3][];
        crossword[0] = new char[4];
        crossword[1] = new char[3];
        crossword[2] = new char[6];

        crossword[0][0] = 'w';
        crossword[0][1] = 'i';
        crossword[0][2] = 'l';
        crossword[0][3] = 'k';

        crossword[1][0] = 'k';
        crossword[1][1] = 'o';
        crossword[1][2] = 't';

        crossword[2][0] = 'ż';
        crossword[2][1] = 'y';
        crossword[2][2] = 'r';
        crossword[2][3] = 'a';
        crossword[2][4] = 'f';
        crossword[2][5] = 'a';
        
        System.out.println("-----------------------------");
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                System.out.print(crossword[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
    
}
