class Son extends Dad{

int salary=25000;

Son(){

 System.out.println("SON WELCOME");

}
/*
Son(int r){

 System.out.println("SON WELCOME kooooo");

}
*/
void car(){

 System.out.println("SON CAR:" +"BMW");

 super.car();

}
void salary(){

 System.out.println("SON SALARY:"+salary);
 System.out.println("DAD SALARY:"+super.salary);

}


}
