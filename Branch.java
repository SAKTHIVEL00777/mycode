package tamilnadu.erode;

import tamilnadu.chennai.Office;

 public class Branch extends Office{

 public Branch(){

  System.out.println("single inheritance");

}

public int salary=25000;

 public void work(){

  System.out.println("wirking time 9 am - 9 pm");

}

public static void main(String args[]){

    Branch br=new Branch();

     
      System.out.println("Salary :"+br.salary);
    
      br.work();
    
}

}
