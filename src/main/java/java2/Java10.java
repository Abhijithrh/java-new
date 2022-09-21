package java2;

import java.util.Random;

class Java10 {
 
    public static void main(String[] args) {
 
        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
        
    }
}
