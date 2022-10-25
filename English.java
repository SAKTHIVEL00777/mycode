class English extends Student{

int mark=60;

void mark(){

System.out.println("ENGLISH MARK IS:"+ 60);

}
 
public static void main(String args[]){

  English sub=new English();

  sub.mark();
  sub.subject();

  System.out.println(sub.mark);
  System.out.println(sub.name);

}

}
