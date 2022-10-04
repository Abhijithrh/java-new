package last2;

import java.util.Collections;
import java.util.LinkedList;

 

public class q10 {
      public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("abhijith");
        linkedList.add("alfy");
        linkedList.add("rahul");
        linkedList.add("praphul");
        linkedList.add("insaf");
        linkedList.add("Hemanth");
        System.out.println("Actual LinkedList:"+linkedList);
        Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);      
            Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);
      }
    }
