
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a=0; //первое число
        int b=0;//2е число
        int p;//+
        int m;//-
        int u;//*
        int r;///
        int r1=0;//римскость числа 1
        int r2=0;//римскость числа 2
        int Ex=0;//коэффициент ошибочности
        String[] roman = {"VIII", "III", "VII", "IV", "VI", "IX", "X", "II", "I", "V"};
        //такая последовательность, чтоб при проверке не было ошибок типа III не считалось за I.
        String[] roman1 = {"8", "3", "7", "4", "6", "9", "10", "2", "1", "5"};
        String[] roman3 = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        Scanner in = new Scanner(System.in);
        System.out.printf("Hello and welcome!");
        System.out.printf("\n");
        System.out.printf("Input the equation");
        System.out.printf("\n");
        String e1 = in.nextLine();
        String e = e1.replaceAll(" ", "");
        p = e.indexOf("+");
        m = e.indexOf("-");
        u = e.indexOf("*");
        r = e.indexOf("/");
        int countp = e.length() - e.replace(String.valueOf("+"), "").length();
        int countm = e.length() - e.replace(String.valueOf("-"), "").length();
        int countu = e.length() - e.replace(String.valueOf("*"), "").length();
        int countr = e.length() - e.replace(String.valueOf("/"), "").length();
        int count=countp+countm+countu+countr;

            String[] arr = e.split("[+\\-*/]");


            for (int i=0; i<roman.length; i++){

                if(roman[i].equals(arr[0])){
                    a=Integer.parseInt(roman1[i]);
                    r1=1;
                    break;
                }
            }
            if (a==0){
                try{
                    a=Integer.parseInt(arr[0]);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
            for (int i=0; i<roman.length; i++){

                if(roman[i].equals(arr[1])){
                    b=Integer.parseInt(roman1[i]);
                    r2=1;
                    break;
                }
            }
            if (b==0){
                try{
                    b=Integer.parseInt(arr[1]);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                }


            if((a>0)&&(b>0)&&(r1==r2)&&(a<11)&&(b<11)&&(count==1)){
                if(r1==0){
                    if(p>0){
                        System.out.println(a+b);
                    }
                    else if (m>0) {
                        System.out.println(a-b);
                    }
                    else if (u>0){
                        System.out.println(a*b);
                    }
                    else if (r>0){
                        if(((float)a/(float)b) % 1 == 0){
                            System.out.println(a/b);
                        }
                        else {
                            Ex+=1;
                        }

                    }
                    else {
                        Ex+=1;
                    }
                }
                if(r1==1){
                    if(p>0){
                        int x = a+b;
                        System.out.println(roman3[x]);
                    }
                    else if ((m>0)&&(a-b>0)) {
                        int x = a-b;
                        System.out.println(roman3[x]);
                    }
                    else if (u>0){
                        int x = a*b;
                        System.out.println(roman3[x]);
                    }
                    else if (r>0){
                        if(((float)a/(float)b) % 1 == 0){
                            int x = a/b;
                            System.out.println(roman3[x]);
                        }
                        else {
                            Ex+=1;
                        }

                    }
                    else {
                        Ex+=1;
                    }
                }

            }
            else {
                Ex+=1;
            }
            if(Ex>0){
                String test = null;
                test.toString();
            }
        }
    }
