package treeset;

interface StaticTest1 {
	  
    static int sub(int a, int b){
        return a - b;
    }
}
public class Static implements StaticTest1{
   public static void main( String[] args ) {      
        Static st = new Static();     
     //   System.out.println(" 2 * 2 = " + st.multiply(2,2));     
        System.out.println(" 2 - 3 = " + StaticTest1.sub(2,3));
   }
}
