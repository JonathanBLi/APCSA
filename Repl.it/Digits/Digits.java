/**
 * The Digits class provides methods that return the sum of the digits in a specified
 * non-negative, whole number, receive three non-negative integer parameters and return
 * the one with the highest digit sum, and receive two integer parameters and return a
 * count of the number of digits that occur in the same place in both numbers. For example,
 * given the values 123 and 321, only the digit 2 is in the same place.
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/23/20
*/

public class Digits
{

	/**
	 * Returns the sum of the digits in a specified whole number
	 * @param number the number to digit sum
	 *    Precondition: number >= 0
	 * @return the sum of the digits
	 */
	public static int digitSum(int number)
	{
	  int sum = 0;
	  while (number> 0)
	  {
	    sum += number % 10;
	    number /= 10;
	  }
	  return sum;
	}

	/**
	 * Returns the number with the highest digit sum of three specified numbers
	 * @param num1 the first number
	 * @param num2 the second number
	 * @param num3 the third number
	 *    Precondition: num1 >= 0, num2 >= 0, num3 >= 0 
	 * @return the number with the highest digit sum
	 */
	public static int highestSum(int num1, int num2, int num3)
	{
		int sum1 = digitSum(num1);
		int sum2 = digitSum(num2);
		int sum3 = digitSum(num3);
		if (sum1 >= sum2 && sum1 >= sum3)
		  return num1;
		if (sum2 >= sum1 && sum2 >= sum3)
		  return num2;
		return num3;
	}
	

	/**
	 * Returns the number of digits that occur in the same place in each of two specified numbers
	 * @parm num1 the first number
	 * @param num2 the second number
	 *    Precondition: num1 >= 0, num2 >= 0 
	 * @return the number of digits that occur in the same place in both numbers
	 */
	public static int countMatchingDigits(int num1, int num2)
	{
    int count = 0;
    if ((num1 == 0 && num2 % 10 == 0) || (num2 == 0 && num1 % 10 == 0))
      count++;
    while (num1 > 0 && num2 > 0)
    {
      if ((num1 % 10) == (num2 % 10))
        count++;
      num1 /= 10;
      num2 /= 10;
    }
    return count;
	}

}