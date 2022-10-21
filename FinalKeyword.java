final class FinalKeyword{ //can not inherit
 
final String name="Yuvan"; //can not reassign
 final int salary=50000;
final void display()
{ //can not override
    System.out.println("Final Method");
}
public static void main(String arg[]){
 
FinalKeyword fik=new FinalKeyword();
System.out.println(fik.name);
System.out.println(fik.salary);
fik.display();
} 
}
