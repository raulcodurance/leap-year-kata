public final class LeapYearChecker {

    public static boolean check(int year) {


        if(isDivisibleBy100(year) & !isDivisibleBy400(year)){

            return false;
        }

        if(isDivisibleBy400(year)){
            return true;
        }


        if(isDivisibleBy4(year)){

            return true;
        }

        return false;
    }

    private static boolean isDivisibleBy100(int year) {
        return year % 100 ==0;
    }

    private static boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private static boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }
}
