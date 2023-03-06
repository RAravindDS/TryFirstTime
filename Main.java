class Main {
  public static void main(String[] args) {

    // Creating a String outside the pool! 
    String  b = new String("aravind"); 
    String a = new String("aravind"); 
    // a == b -> false 

    // Creating a String with String pool 
    String c = "aravind"; 
    String d = "aravind"; 
    // c == d -> true 

    // Checking only values not objects
    System.out.println("Checking only values: "+c.equals(d));
    System.out.println("Outside the Stringpool" + a == b); 
    System.out.println("Inside the Stringpool" + c == d); 
    
  }
}