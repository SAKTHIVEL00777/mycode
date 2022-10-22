class GrandDaugter extends Daugter{
 
int price=100000;

GrandDaugter(){

System.out.println("GRANDDAUGTER CONSTRUCTOR");

}
void scooty(){

 System.out.println("GRANDDAUGTER SCOOTY:" + "ACTIVA");
 
 super.scooty();
 
}
void price(){

 System.out.println("GRANDDAUGTER PRICE:" + price);

  super.price();

}

public static void main(String args[]){

   GrandDaugter gd=new GrandDaugter();
   
    gd.scooty();
    gd.price();



}

}
