class Hi{

 void oddNumber(){
   int value=1;
   while(value<=9){
  System.out.print(value +" ");
  value=value+2;
}
  System.out.println();
}
  void lineNumbers(){
   int value=1;
   while(value<=5){
  System.out.print(value +" ");
   value=value+1;
}
   System.out.println();
}
public static void main(String args[]){

   Hi hi=new Hi();
     hi.oddNumber();
     hi.lineNumbers();
}

}
