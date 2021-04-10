public class Zadanie4 {
    public static void main(String[] args) {
        int[] grades = new int[5];
        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;
        grades[3] = 1;
        grades[4] = 2;

        System.out.println("the last three grades: "+grades[2]+""+grades[3]+""+grades[4]);
        grades[1] = 5;

        int tmp = grades[1];
        grades[1] = grades[3];
        grades[3] = tmp;
        tmp = grades[2];
        grades[2] = grades[4];
        grades[4] = tmp;
        tmp = grades[3];
        grades[3] = grades[4];
        grades[4] = tmp;

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

    }
}
