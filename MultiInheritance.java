/* 
                                MultiLevel Inheritance
                                -------------------
                                |    Calculator    |                grand-parent class
                                --------------------
                                        ^
                                        |
                                        |
                                        |
                                --------------------
                                |   advance calc    |               parent class
                                ---------------------
                                        ^
                                        |
                                        |
                                        |
                                --------------------
                                |   power calc      |               child class
                                ---------------------

*/
public class MultiInheritance extends advanceCalc
{
    public double power(int a, int b)
    {
        return Math.pow(a, b);
    }
}
