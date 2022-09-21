package treeset;

interface Bank1{
float rateOfInterest();
}
class SBI implements Bank1{
public float rateOfInterest(){return 9.15f;}
}
class PNB implements Bank1{
public float rateOfInterest(){return 9.7f;}
}
class ERT{
public static void main(String[] args){
Bank1 b=new SBI();
System.out.println("ROI: "+b.rateOfInterest());
}}
