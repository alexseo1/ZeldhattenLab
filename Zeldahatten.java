public class Zeldahatten {

    public static void main(String[] args) {
      
      
      int st = 220;
      int ave = 12;//Set two variables: one to hold total streets and one to hold total avenues.

     
     
      String Link = ("Ronald");
      //Set Link's name as a String (or whoever's name you would like)
        
      int currentSt = 1;  
      // create Link's start street as an int
      int currentAve = 1;
      //create Link's starting avenue as an int
      
      
      //Print Link's current position
    System.out.println(Link + " is at " + currentSt + ", " + currentAve);
      //Print Link moving in each direction on four different lines of code below.
  
      currentSt = (currentSt + 170)%st;
      currentAve = (currentAve + 5)%ave;
          System.out.println(Link + " is at " + currentSt + ", " + currentAve);

currentSt = (currentSt + 170)%st;
      currentAve = (currentAve + 5)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
          currentSt = (currentSt + 170)%st;
                currentAve = (currentAve + 5)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
       currentSt = (currentSt + 170)%st;
                currentAve = (currentAve + 5)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
           currentSt = (currentSt + 170)%st;
                currentAve = (currentAve + 5)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
           currentSt = (currentSt + 170)%st;
                currentAve = (currentAve + 5)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
           currentSt = (currentSt + 170)%st;
                currentAve = (currentAve + 5)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
           currentSt = (currentSt + st-150)%st;
                currentAve = (currentAve + ave-3)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
          

currentSt = (currentSt + st-150)%st;
                currentAve = (currentAve + ave-3)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
          currentSt = (currentSt + st-150)%st;
                currentAve = (currentAve + ave-3)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
          currentSt = (currentSt + st-150)%st;
                currentAve = (currentAve + ave-3)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
          currentSt = (currentSt + st-150)%st;
                currentAve = (currentAve + ave-3)%ave;

          System.out.println(Link + " is at " + currentSt + ", " + currentAve);
    }

}
