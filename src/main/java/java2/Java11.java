package java2;

import java.util.Arrays;

class Java11 {
 
    public static void main(String[] args) {
        System.out.println("Intermediate Operation won't execute");
        Arrays.stream(new int[] { 0, 1 }).map(i -&gt; {
            System.out.println(i);
            return i;
            
        });
 
        System.out.println("Terminal operation starts here");
        Arrays.stream(new int[] { 0, 1 }).map(i -&gt; {
            System.out.println(i);
            return i;
            
        }).sum();
    }
}