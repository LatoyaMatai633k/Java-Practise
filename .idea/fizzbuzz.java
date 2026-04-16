class Fizzbuzz {
    public static void fizzbuzz() {

        int num = 0;

        for (num = 1; num < 30; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(num);
            }
        }
    }

}