package commandcalculator;

public class MyException extends Throwable
{
    double number;

    public MyException(double number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "Division by zero is not defined " + "Invalid number: " + number + "\n";
    }
}
