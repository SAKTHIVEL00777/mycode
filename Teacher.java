class Teacher extends School{

void hoppy(){

System.out.println("Playing Football");
}
void name(){
 
 System.out.println("ABD");

}
void staff(){
 System.out.println("jeeva");
}
public static void main(String args[]){

 // Teacher tea=new Teacher();
  School tea=new Teacher();   // Dynamic binding
  tea.hoppy();
  tea.home();  //static keyword declared
  tea.name();
  tea.noOfTeacher();
  //tea.staff();--->dynamic binding can't call own child properties

}

}
