public class FizzBuzz {

    public final int FIZZ_VALUE = 3;
    public final int BUZZ_VALUE = 5;
    public final int FIZZBUZZ_VALUE = 15;
    public final int MAX = 20;

    public final String FIZZ = "fizz";
    public final String BUZZ = "buzz";
    public final String FIZZBUZZ = "fizzbuzz";
    public final String LUCKY = "lucky";

    public static void main (String [] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.runFizzBuzz(20));
    }

    public  String runFizzBuzz(int number) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=this.MAX; i++) {
            sb.append(this.fizzBuzz(i));
            if (i + 1 <= this.MAX)
                sb.append(" ");
        }
        return sb.toString();
    }

    public String fizzBuzz(int number) {
        if (String.valueOf(number).contains("3")) {
            return "lucky";
        }
        if (number % FIZZBUZZ_VALUE == 0) {
            return this.FIZZBUZZ;
        }
        else if (number % BUZZ_VALUE == 0) {
            return this.BUZZ;
        }
        else if (number % FIZZ_VALUE == 0) {
            return this.FIZZ;
        }
        return String.valueOf(number);
    }


}
