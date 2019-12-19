import java.sql.SQLOutput;
import java.util.Scanner;

public class Roman_Numeral {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a number to be converted to Roman Numeral: ");
        String number = scan.nextLine(); //3999 = MMMCMXCIX
        System.out.println("The number " + number + ", in roman numeral is: " +  roman_Conversion(Integer.parseInt(number)));

    }

    public static String roman_Conversion(int number){
        String result = ""; //Store the concatenation
        String result_ones = "";
        String result_tenths = "";
        String result_Fifieth = "";
        String result_hundreths = "";
        String result_Five_Hundreths = "";
        String result_thousandths = "";
        int ones; //Store the ones
        int tenths; //Store the tenths
        int hundredths; //Store the hundreths place
        int thousandths = 0; //Store the thousandths place

        ones = (number%10); //Get the ones place
        tenths = (((number/10)%10) * 10); //Get the tenths place
        hundredths = (((number/100)%10) * 100); //Get the hundredths place
        thousandths = (((number/1000)%10) * 1000); //Get the thousandths place

        if(ones <= 9){
            switch (ones){
                case 1:
                    result_ones = "I";
                    break;
                case 2:
                    result_ones = "II";
                    break;
                case 3:
                    result_ones = "III";
                    break;
                case 4:
                    result_ones = "IV";
                    break;
                case 5:
                    result_ones = "V";
                    break;
                case 6:
                    result_ones = "VI";
                    break;
                case 7:
                    result_ones = "VII";
                    break;
                case 8:
                    result_ones = "VIII";
                    break;
                case 9:
                    result_ones = "IX";
                    break;
                default:
                    //System.out.println("Wrong");
                    break;
            }
        }

        if(tenths < 50){
            switch (tenths){
                case 10:
                    result_tenths = "X";
                    break;
                case 20:
                    result_tenths = "XX";
                    break;
                case 30:
                    result_tenths = "XXX";
                    break;
                case 40:
                    result_tenths = "XXXX";
                    break;
            }
        }
        if(tenths < 100){
            switch (tenths){
                case 50:
                    result_tenths = "L";
                    break;
                case 60:
                    result_tenths = "LX";
                    break;
                case 70:
                    result_tenths = "LXX";
                    break;
                case 80:
                    result_tenths = "LXXX";
                    break;
                case 90:
                    result_tenths = "XC";
                    break;
                default:
                    //System.out.println("Wrong");
                    break;
            }
        }
        if(hundredths <= 500){
            switch (hundredths){
                case 100:
                    result_hundreths = "C";
                    break;
                case 200:
                    result_hundreths = "CC";
                    break;
                case 300:
                    result_hundreths = "CCC";
                    break;
                case 400:
                    result_hundreths = "CD";
                    break;
                default:
                    //System.out.println("Wrong");
                    break;
            }
        }

        if(hundredths < 1000){
            switch(hundredths){
                case 500:
                    result_Five_Hundreths = "D";
                    break;
                case 600:
                    result_Five_Hundreths = "DC";
                    break;
                case 700:
                    result_Five_Hundreths = "DCC";
                    break;
                case 800:
                    result_Five_Hundreths = "DCCC";
                    break;
                case 900:
                    result_Five_Hundreths = "CM";
                    break;
                default:
                    //System.out.println("Wrong");
                    break;
            }
        }
        if(thousandths < 4000){
            switch(thousandths){
                case 1000:
                    result_thousandths = "M";
                    break;
                case 2000:
                    result_thousandths = "MM";
                    break;
                case 3000:
                    result_thousandths = "MMM";
                    break;
                default:
                    //System.out.println("Wrong");
                    break;
            }
        }

        return result.concat(result_thousandths + result_Five_Hundreths + result_hundreths + result_Fifieth + result_tenths + result_ones);
    }
}
