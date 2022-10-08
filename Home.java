class Home
{
public static void main(String[] args) // args
{
      Home home = new Home(); 
      int amount = home.read_eb(100); //300.0
      System.out.println("EB Reading amount "+ amount);
      //System.out.println("In Line 8 "+ units);
      return; 
}
   int read_eb(int consumed_units)

{   // Execute

       int units = 150; 
       System.out.println("In Line 14 "+ units); 
       int amount = units * 2; //Type Casting: 
       System.out.println("You have to pay "+ amount);

       return units; 
   }

}
