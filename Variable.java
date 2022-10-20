class Variable{

static float d=567.8f;

int c=75;                   //instance 

void show(int a,int b){    //method definition
    
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
   

}

public static void main(String args[]){

   Variable var=new Variable();     //object created

      var.show(57,39);             // local method calling

     // var.c=75;
    System.out.println(var.c);   //instance method calling

    System.out.println(d);      // static method calling


}


}
