class Son extends Father{

int salary=25000;

void bike(){
System.out.println("ns200");
super.bike();
System.out.println("father salary="+super.salary);

}


public static void main(String arg[]){

Son s=new Son();
System.out.println(s.salary);
s.bike();
s.car();

/*Father f=new Father();
f.bike();
s.salary
*/
}

}
