package java2;

import java.util.stream.Stream;



public class Java15 {  
    
    public static void main(String[] args){  
        Stream.iterate(2, count->count+1).filter(number->number%2==0).limit(5).forEach(System.out::println);
    }  
}
