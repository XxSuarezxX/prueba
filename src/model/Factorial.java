package model;

public class Factorial {

    int number_factorial;

    public void setNumber_factorial(int number_factorial) {
        this.number_factorial = number_factorial;
    }

    public int calculateFactorial(int number_factorial){
        if (number_factorial > 0){
            int i = calculateFactorial(number_factorial) * (number_factorial - 1);
            return i;
        }else{
            return 0;
        }
    }
}
