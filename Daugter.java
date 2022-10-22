class Daugter extends Mother{
 
int price=75000;

Daugter(){

System.out.println("DAUGTER CONSTRUCTOR");

}
void scooty(){

 System.out.println("DAUGTER SCOOTY:" + "DEO");

 super.scooty();

}
void price(){

 System.out.println("DAUGTER PRICE:" + price); 
 System.out.println("MOTHER PRICE:" + super.price);



}
}
