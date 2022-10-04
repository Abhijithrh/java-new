package last2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

 

public class q9 {
      public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("ramesh");
        list.add("suresh");
        list.add("Nani");
        list.add("Vishnu");
        list.add("Vivek");
        list.add("Hemanthe");
        System.out.println("Actual LinkedList:"+list);
        List<String> list1 = new ArrayList<String>(list);
           
            System.out.println("Results after toarray operation:" + list1);
      }
    }
