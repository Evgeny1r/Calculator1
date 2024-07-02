
import java.util.Scanner;

public class Main {

    public static String calc(){
        System.out.printf("Hello and welcome!");
        System.out.printf("\n");
        System.out.printf("Input the equation");
        System.out.printf("\n");
        Scanner in1 = new Scanner(System.in);
        String e2 = in1.nextLine();
        return e2;
    }
    public static void main(String[] args) throws Exception {
        int a=0; //первое число
        int b=0;//2е число
        String answer;
        int p, m, u, r;//+-*/

        String e = calc().replaceAll("", "");
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
        String s1 = arr[0];
        String s2 = arr[1];

        if(count!=1){
            throw new Exception("fatal error");
        }
        try{
            a=Integer.parseInt(arr[0]);
        }
        catch (NumberFormatException ex) {

        }
        try{
            b=Integer.parseInt(arr[1]);
        }
        catch (NumberFormatException ex) {

        }
        String s11 = s1. replaceAll("^\"|\"$", "");
        String s21 = s2. replaceAll("^\"|\"$", "");
        if((a!=0)||((countu==1)||(countr==1))&&(b==0)||((countp==1)||(countm==1))&&(b!=0)||(s11.length()>10)||(s21.length()>10)){
            throw new Exception("fatal error");
        }
        if((s1.length()-s11.length()!=2)||((countu==1)||(countr==1))&&((s2.length()-s21.length()==2))||((countp==1)||(countm==1))&&(s2.length()-s21.length()!=2)||(b>10)){
            throw new Exception("fatal error");
        }
        if(countp>0){
            System.out.println("\""+s11+s21+"\"");
        }
        if(countm>0){
            int d = s11.indexOf(s21);
            if(d>-1){
                char[] chars = s11.toCharArray();
                int i=0;
                System.out.print("\"");
                for (char c : chars) {
                    System.out.print(c);
                    i++;
                    if(i==d){
                        break;
                    }
                }
                System.out.print("\"");
            }
            else {
                System.out.println("\""+s11+"\"");
            }
        }
        if(countu>0){
            int i=0;
            char[] chars = s11.toCharArray();
            System.out.print("\"");
            for(int x=0; x < b;x++){
                for (char c : chars) {
                    System.out.print(c);
                    i++;
                    if(i==40){
                        break;
                    }
                }
                if(i==40){
                    System.out.print("...");
                    break;
                }

            }
            System.out.print("\"");
        }
        if(countr>0){

            char[] chars = s11.toCharArray();
            int i=0;
            System.out.print("\"");
            for (char c : chars) {
                i++;
                if(i>s11.length()/b){
                    break;
                }
                System.out.print(c);
            }
            System.out.print("\"");
        }
    }
}
