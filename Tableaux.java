/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab){
        int imax;
        for (int i = 0; i < tab.length-1; i++){
            imax = i;
            for (int j = i + 1; j < tab.length; j++){
                if (tab[j] > tab[imax])
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void trierDecroissantSSS(String[] tab){
        int imax;
        for (int i = 0; i < tab.length -1; i++){
            imax = 1;
            for (int j = i + 1; j < tab.length; j++){
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imax]))
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void print(int[] tab){
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }

    public  static int max(int[] tab){
        int a = tab[0];

        for (int i = 0; i < tab.length; i++){
            if (a < tab[i])
                a = tab[i];
        }
        return a;
    }

    public static int min(int[] tab){
        int a = tab[0];

        for (int i = 0; i < tab.length; i++){
            if (a > tab[i])
                a = tab[i];
        }
        return a;
    }

    public static double moyenne(int[] tab){
        double a = 0;

        for (int i = 0; i < tab.length; i++){
            a += tab[i];
        }
        return a/tab.length;
    }

    public static int fouilleSeq(int[] tab, int a){
        boolean b = false;
        int i = 0;

        while ( i < tab.length && !b){
            if (a == tab[i])
                b = true;
            else
                i++;
        }
        if (b)
            return i;
        else
            return -1;
    }

    public static void print(String[] tab){
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }

    public  static int max(String[] tab){
        int a = Integer.parseInt(tab[0]);

        for (int i = 0; i < tab.length; i++){
            if (a < Integer.parseInt(tab[i]))
                a = Integer.parseInt(tab[i]);
        }
        return a;
    }

    public static int min(String[] tab){
        int a = Integer.parseInt(tab[0]);

        for (int i = 0; i < tab.length; i++){
            if (a > Integer.parseInt(tab[i]))
                a = Integer.parseInt(tab[i]);
        }
        return a;
    }

    public static double moyenne(String[] tab){
        double a = 0;

        for (int i = 0; i < tab.length; i++){
            a += Integer.parseInt(tab[i]);
        }
        return a/tab.length;
    }

    public static int fouilleSeq(String[] tab, int a){
        boolean b = false;
        int i = 0;

        while ( i < tab.length && !b){
            if (a == Integer.parseInt(tab[i]))
                b = true;
            else
                i++;
        }
        if (b)
            return i;
        else
            return -1;
    }


}
