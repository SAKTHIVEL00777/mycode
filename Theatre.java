class Theatre{

public static void main(String arg[])
{
     Theatre raja=new Theatre(); //Object Creation

     int balance=raja.bookTicket(200);//Method Calling, receive and store data value of balance 
         
     System.out.println("After booking ticket"+ balance);//Concatination Operator ("String"+value)

}

int bookTicket(int ticket)
{
  int ticket_price=120;
   
  int balance= ticket-ticket_price;//return this value of balance
  
  return balance;
  
}

}
