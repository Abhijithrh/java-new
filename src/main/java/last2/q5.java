package last2;

import java.util.*;



public class q5 {

 

    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("pink");
        c1.add("white");
        c1.add("black");
        c1.add("blue");
        c1.add("red");

 

 

       ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

 

 

       
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
           c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
       
   }
}
