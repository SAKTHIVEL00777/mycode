class Demo2 extends Demo1{

Demo2(){

 System.out.println("Success For Multilevel Inheritance");

}
void area(){

 System.out.println("Demo2 Area");
  super.area();

}

public static void main(String args[]){

  Demo2 de=new Demo2();
  
    de.area();

}


}
