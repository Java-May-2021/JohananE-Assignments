public class Buzz {
    public static String fizzBuzz(int num){
        if(num % 5 == 0 && num % 3 == 0)
            return "FizzBuzz";
        if(num % 5 == 0)
            return "Buzz";
        if(num % 3 == 0)
            return "Fizz";
        return Integer.toString(num);
    }
}
