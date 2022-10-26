class Copy{

String product;
int price;

Copy(){

 System.out.println("NO-ARUGUMENT CONSTRUCTOR");
 
}
Copy(Copy copy){
 
 this. product=copy.product;
 this .price=copy.price;
 System.out.println(this.product+"....."+this.price);


}

public static void main(String args[]){

    Copy cy=new Copy();
   
    cy.product="LAPTOP";
    cy.price=20000;

   Copy cy1=new Copy(cy);

}

}
