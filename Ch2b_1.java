public class Ch2b_1 {

    final int CONSTANT = 0;
    static int svar = 10;
    public int pvar1 = 20;

    public static void main(String[] args) {
        CONSTANT = 5;

        System.out.println(svar);
        svar = 15;
        System.out.println(svar);

        System.out.println(pvar1);
        pvar1 = 25;
        System.out.println(pvar1);

        public int pvar2 = 30;
        System.out.println(pvar2);
        pvar2 = 35;
        System.out.println(pvar2);
    }
}
