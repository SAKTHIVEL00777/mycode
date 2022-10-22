class BabyDog extends Dog
{  
/*BabyDog(){

System.out.println("welcome all dogs");
}
*/
void weep()
{
System.out.println("weeping...");
} 

public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}   
}  
