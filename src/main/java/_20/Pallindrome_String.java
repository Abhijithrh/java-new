package _20;

import java.util.Scanner;

public class Pallindrome_String {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String sen;
        System.out.println("Enter the String: ");
        sen = in.nextLine();
        pallindrome(sen);

        in.close();
    }

    public static void pallindrome(String s) {
        int len = s.length();

        for (int i = 0; i < len; i++) {
            String res = "";
            if (s.charAt(i) == ' ') {
                res = s.substring(0, i);
                String rev = "";
                for (int j = res.length() - 1; j >= 0; j--) {
                    rev = rev + res.charAt(i);
                }
                if (rev.equals(res)) {
                    rev = "*";
                    System.out.print(rev + " ");
                } else {
                    System.out.print(res + " ");
                }
            }    
        }           
    }
}