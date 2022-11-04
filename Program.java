class Program{

//void multiple_of_3_and_5(){
 void multipleAnd(){
  int no =1;
  while(no<=30)
{
   if(no%3==0 && no%5==0){
     System.out.print(no+ " ");
   }
    no=no+1;
} 
   System.out.println();

}
 //void multiples_of_3_or_5() {
    void multipleOR(){
  int no = 1; 
  while(no<=30) // | - pipe
  {
  if(no%3==0 || no%5==0)
   {
   System.out.print(no+"  "); 
   }
  no = no+1; 
  }
       System.out.println();
 }



 
 
 public static void main(String args[]){
 
   Program pro=new Program();

     //pro.multiple_of_3_and_5();
     //pro. multiples_of_3_or_5();

       pro.multipleAnd();
       pro.multipleOR();
     
  

}

}
