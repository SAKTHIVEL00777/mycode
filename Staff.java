class Staff{

 int id,salary;
 String name,dept,city,college;

Staff()
{
    System.out.println("WELCOME TO ALL STAFF");
}
Staff(int id,String name){
       this.id=id;
       this. name=name;

}
Staff(int id,String name,String dept,String city){
       this. id=id;
       this.name=name;
       this.dept=dept;
       this.city=city;
}
Staff(int id,String name,String dept, String city,String college,int salary){
       this. id=id;
       this.name=name;
       this.dept=dept;
       this.city=city;
       this.college=college;
       this.salary=salary;

}

 void show()
{
    System.out.println("Id:"+id+"  Name: "+name+"  Dept: "+dept+"  City: "+city+"  College: "+college+"  Salary: " +salary);
     

}

public static void main(String args[]){

    Staff s=new Staff();
    Staff s1=new Staff(1,"BALA");
    Staff s2=new Staff(2,"BASHEER","IT","THURAIYUR");
    Staff s3=new Staff(3,"SABEER","CS","TRICHY","JMC",25000);
     
        s1.show();
        s2.show();
        s3.show();

}





}
