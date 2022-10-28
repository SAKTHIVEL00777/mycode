class HPOil implements IndianOil {

public void work(){
 System.out.println("12 hours");
}
public void time(){
System.out.println("9 AM TO 9 PM");
}
public void shift(){
System.out.println("DAY SHIFT");
}
public void offer(){
System.out.println("10% offer");
}
public static void main(String args[]){

 // HPOil hp=new HPOil();
   IndianOil hp=new HPOil();
  hp.work();
  hp.time();
  hp.shift();
 //hp.offer(); --->dynamic binding can't call own child properties
  System.out.println(IndianOil.petrol);
  System.out.println(IndianOil.salary);
  System.out.println(IndianOil.leave);
 

}

}
