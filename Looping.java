class Looping{
  
    void amount() 
{
        
      int amount=0;
      int day=1;
      while(day<=10){
          amount=amount+day;
           day=day+1;
       }
         System.out.println("amount:" +amount);
   } 
    void dosai(int dosai)
{

      int count=3;
      while(count>=1){
              dosai=dosai+dosai/2;
              count=count-1;
       }
       System.out.println("Dosai:" +dosai);
}
  void security(int beats)
{
       int security=0;
       while(beats>1){
        beats=beats/2;
        security=security+1;
      }
        System.out.println("Security:" +security);
}

public static void main(String args[]){
   
     Looping loop=new Looping();
      loop.amount();
      loop.dosai(8);
      loop.security(1024);

}

}
