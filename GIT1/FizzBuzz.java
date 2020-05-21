public class FizzBuzz {

  public static void main (String[] args){
      //<condition> : <instruction si vrai> ? <instruction si faux>
    int max = ( args.length > 0 ) ? Integer.parseInt(args[0]) : 100;

    for (int i = 1; i<= max ; i++){  
       if (i % 15 == 0) System.out.print ("FizzBuzz");//multiple de 15
       else if (i % 3 == 0) System.out.print("Fizz");// multiple de 3
       else if (i % 5 == 0) System.out.print("Buzz");// multiple de 5
       else System.out.print(i);

       System.out.print(", " + "\n");
  }
}
}

