/*
 * String quote "\"Fortune favors the brave,\"said Virgil.";
 * \n is newline
 * \t is tab
 * \b is backspace
 * \r is carriage return
 * \f is formfeed
 * \\ is backslash
 * \' is single-quote
 * \" is double-quote
 */

public class Escape {
    public static void main(String[] args){
        String quote = "\"Fortune favors the brave.\" said Virgil.";
        String header = "\n\tNew York 3-DAY FORECAST:\n";
        header += "\n\tDay\t\tHigh\tLow\tConditions\n";
        header += "\t---\t\t----\t---\t-----------\n";

        String forecast = "\tSunday\t\t68F\t48F\tSunny\n";
        forecast += "\tMonday\t\t69F\t57F\tSunny\n;";
        forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";

        System.out.println(header + forecast);
    }
}
