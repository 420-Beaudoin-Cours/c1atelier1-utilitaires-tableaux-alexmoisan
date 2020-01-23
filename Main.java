import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {2, 3, 5, 1, 7, 4};
        String[] tab = {"2", "3", "5", "1", "7", "4"};
        int a = 1;

        //Tableaux.trierCroissantSSS(tableau);
        //Tableaux.trierDecroissantSSS(tableau);
        //Tableaux.print(tableau);
        //System.out.println(Tableaux.max(tableau));
        System.out.println(Tableaux.fouilleSeq(tab, a));

    }
}
