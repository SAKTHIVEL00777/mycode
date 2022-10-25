class Tamil extends Student{

int mark=75;

void mark(){

 System.out.println("TAMIL MARK IS:" +75);

}

public static void main(String args[]){

  Tamil sub=new Tamil();

   sub.mark();
   sub.subject();
   
   System.out.println(sub.name);
   System.out.println(sub.mark);

}

}
