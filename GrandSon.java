class GrandSon extends Son {

int salary=10000;

GrandSon(){
 //super(78);
System.out.println("GRANDSON WELCOME");


}

/*GrandSon(int price){

 this();
 System.out.println(price);

}*/

void car(){


 System.out.println("GRANDSON CAR:" +"BREEZA");
 super.car();

}
void salary(){

 System.out.println("GRANDSON SALARY:"+salary);
 super.salary();

}

public static void main(String args[]){
   
   
  GrandSon gs=new GrandSon();
    // GrandSon gs=new GrandSon(5000);

    gs.car();
   gs.salary();

}
}
