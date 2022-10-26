class Product1{


void show(Product pro){

    System.out.println("Product:"+pro.product);
    System.out.println("Name:"+pro.name);
    System.out.println("Price:"+pro.price);

}

public static void main(String args[]){

  Product pro=new Product();
  Product1 pro1=new Product1();
     pro1.show(pro);


}


}
