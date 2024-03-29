public class Q05_LeapYearChecker {

/*
    5. Create a Java program to check whether a given year is a leap year or not.
*/


/*
 Condition :
    If the year is divisible by 4 and not divisible by 100,
    or if the year is divisible by 400,
    then it is a leap year; otherwise, it is not
*/

    public static void main(String[] args) {
        calLeapYearM1(2024);
        calLeapYearM1(2011);

        System.out.println("\nusing method 2");
        calLeapYearM2(2024);
        calLeapYearM2(2011);

    }

    static void calLeapYearM1(int year){

        if((year % 4 == 0 && year%100 !=0)|| year % 400 == 0){
            System.out.printf("%d is a leap year ! %n",year);
        }else {
            System.out.printf("%d is not a leap year ! %n",year);
        }

    }

    static void calLeapYearM2(int year){
        String result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "leap year" : "not a leap year";

        System.out.printf("%d is %s %n",year,result);

    }

}
