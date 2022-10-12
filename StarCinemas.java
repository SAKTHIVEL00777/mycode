class StarCinemas
{
static String address="no.1 thuraiyur";
String movieName;
float movieTime;
boolean movieHit;

public static void main(String arg[])
{
   StarCinemas sc1=new StarCinemas();
     sc1.movieName="ps1";
     sc1.movieTime=10.00f;
     sc1.movieHit=true;

   StarCinemas sc2=new StarCinemas();
     sc2.movieName="vickram";
     sc2.movieTime=11.30f;
     sc2.movieHit=true;

   StarCinemas sc3=new StarCinemas();
     sc3.movieName="beast";
     sc3.movieTime=02.30f;
     sc3.movieHit=false;

   StarCinemas sc4=new StarCinemas();
     sc4.movieName="kgf";
     sc4.movieTime=06.00f;
     sc4.movieHit=true;

   StarCinemas sc5=new StarCinemas();
     sc5.movieName="valimai";
     sc5.movieTime=09.30f;
     sc5.movieHit=false;

   StarCinemas sc6=new StarCinemas();

  System.out.println(sc1.movieName);
  System.out.println(sc1.movieTime);
  System.out.println(sc1.movieHit);  

  System.out.println(sc2.movieName);
  System.out.println(sc2.movieTime);
  System.out.println(sc2.movieHit);  

  System.out.println(sc3.movieName);
  System.out.println(sc3.movieTime);
  System.out.println(sc3.movieHit);  

  System.out.println(sc4.movieName);
  System.out.println(sc4.movieTime);
  System.out.println(sc4.movieHit);  

  System.out.println(sc5.movieName);
  System.out.println(sc5.movieTime);
  System.out.println(sc5.movieHit);  

    //calling static varible
    System.out.println("address : "+StarCinemas.address);// called by class name
    System.out.println("address : "+st6.address);//called by object name
    System.out.println("address : "+address);//call directly

}

}
