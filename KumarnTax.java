class KumarnTax extends Pothys {

KumarnTax(){
 
  System.out.println("25% Discount");
 
}
KumarnTax(int price){
 
 //this();
  super(price);
  System.out.println(price);
 
}



public static void main(String args[]){
   
   KumarnTax shirt=new KumarnTax();
   KumarnTax pant=new KumarnTax(500);



}



}
