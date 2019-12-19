public class Constants {
    public static void main(String[] args){
        final int TOUCHDOWN = 6; //final ~ constant
        final int CONVERSION = 2;
        final int PAT = 1;
        final int FIELD_GOAL = 3;

        int td, pat, fg, total;
        td = 4 * TOUCHDOWN;
        pat = 3 * PAT;
        fg = 2 * FIELD_GOAL;
        total = (td + pat + fg);

        System.out.println("Score: " + total);
    }
}
