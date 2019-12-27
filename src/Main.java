public class Main {
    
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;

        if (isFriendNumber(number1, number2)) {
            System.out.println(number1 + " and " + number2 +" are friend numbers!");
        } else {
            System.out.println(number1 + " and " + number2 +" are not friend numbers!");
        }
    }

    public static boolean isFriendNumber(int number1, int number2) {

        int sumDivisor1 = getSumDivisor(number1);
        int sumDivisor2 = getSumDivisor(number2);

        return number1 == sumDivisor2 && number2 == sumDivisor1;
    }

    public static int getSumDivisor(int number) {

        int totalDivisor = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                totalDivisor += i;
            }
        }

        return totalDivisor;
    }
}
