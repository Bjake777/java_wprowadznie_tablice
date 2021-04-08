public class Zadanie1 {
    public static void main(String[] args) {
        char[] name = new char[5];
        char[] surname = new char[11];
        int age = 22;

        name[0] = 'K';
        name[1] = 'a';
        name[2] = 'r';
        name[3] = 'o';
        name[4] = 'l';

        surname[0] = 'M';
        surname[1] = 'i';
        surname[2] = 'c';
        surname[3] = 'h';
        surname[4] = 'n';
        surname[5] = 'i';
        surname[6] = 'e';
        surname[7] = 'w';
        surname[8] = 'i';
        surname[9] = 'c';
        surname[10] = 'z';
         
        System.out.println("---------------------------");
        System.out.print(
            "Imie: "+
            name[0]+""+
            name[1]+""+
            name[2]+""+
            name[3]+""+
            name[4]
        );
        System.out.println();
        System.out.print(
            "nazwisko: "+
            surname[0]+""+
            surname[1]+""+
            surname[2]+""+
            surname[3]+""+
            surname[4]+""+
            surname[5]+""+
            surname[6]+""+
            surname[7]+""+
            surname[8]+""+
            surname[9]+""+
            surname[10]
        );
        System.out.println();
        System.out.println("age"+age);
        System.out.println("---------------------------");
    }
}