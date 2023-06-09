/*
 Program that calculates the average number of decimal places generated by Javas Math.random() function. 

*/
class Main {
  public static void main(String[] args) {
    final int ITERATIONS = 10000;
    String[] array = new String[ITERATIONS];

    // init some to zero
    double sum = 0;
    
    for(int i = 0 ; i < array.length; i++){
      System.out.println("Generating Random Number...");
      double random = Math.random();
      String str_random = String.valueOf(random);
      System.out.println("Random number generated : " + str_random);
      array[i] = str_random.substring(2);
      int how_many = array[i].length();
      System.out.println("There are " + how_many + " decimal places in this string.\n\n"); 
      sum+= how_many;
    }  

    double average = (double)sum / (double)array.length; 

    System.out.println("Average decimal places generated: " + average + " out of " + ITERATIONS + " iterations");

  }
}
         

    