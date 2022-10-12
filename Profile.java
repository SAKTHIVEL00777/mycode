class Profile{

String name,city;
int age,salary;

Profile(String name,String city,int age ,int salary){
 this.name=name;
 this.city=city;
 this.salary=salary;
 this.age=age;


} 
void empInfo(){
  System.out.println("Name: "+name+"   City: "+city+"   Salary: "+salary+"       Age: " +age);

}

void staff(){
  System.out.println("Name: "+name+"   City: "+city+"    Salary: "+salary+"      Age: " +age);

}
void student(){
  System.out.println("Name: "+name+"   City: "+city+"    Salary: "+salary+"     Age: " +age);

}
public static void main(String args[])
{
    Profile pf1=new Profile("maddy", "pudhukottai",28, 50000);
    Profile pf2=new Profile("bala", "trichy",31,25000);
    Profile pf3=new Profile("jeeva", "tolgate",26,10000);

      pf1.empInfo();
      pf2.staff();
      pf3.student();

}

}
