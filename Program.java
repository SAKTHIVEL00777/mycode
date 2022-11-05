class Program{


  void printOne() {
					
					int start=1;
					int end=6;
					while(start<end)
                   {
						System.out.print(1 + " ");
						start=start+1;
						}
				   System.out.println();
				}
  void print12345() {
					int start=1;
					int end=6;
					while(start<end)
                  {
						System.out.print(start + " ");
						start=start+1;
					}
					System.out.println();
				}
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
	void sum_of_first_n_numbers() {
				int sum=0;
				int no=1;
				while(no<=10) 
             {
					sum=sum+no;
					no=no+1;
				}
				System.out.println(sum);
			}
    void count_of_digits(int no) {
		     int count=0;
		     while(no>0) {
		    	 System.out.print(no%10);
		    	 count=count+1;
		    	 no=no/10;
		     }
	 	     System.out.println(" No of Digits is:"+count);
	}

	
	
    

 public static void main(String args[]){
 
   Program pro=new Program();

     //pro.multiple_of_3_and_5();
     //pro. multiples_of_3_or_5();
       
       pro.printOne();
	   pro.print12345();
       pro.multipleAnd();
       pro.multipleOR();
       pro.sum_of_first_n_numbers();
       pro.count_of_digits(5674);
       
    

     
  

}

}
