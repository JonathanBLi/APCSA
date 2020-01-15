/** 
 * The PayCheck class provides functionality for the calculation of a worker's wages,
 * given their responsibilities (manager or sales clerk), working hours, sales, and 
 * commission.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 10/28/19
 */
  
public class PayCheck 
{
	/* Static Constants Go Here */
	public static final int BASIC_HOURS = 40;
	public static final double BASIC_WAGE = 9.75;
	public static final int MANAGER_BONUS = 100;
	public static final double SALES_VOLUME_1 = 99.99;
	public static final double SALES_VOLUME_2 = 299.99;
	public static final double COMMISSION_1 = 0.05;
	public static final double COMMISSION_2 = 0.08;
	public static final double COMMISSION_3 = 0.13;
	
	/* Instance variables */
	private String employee;
	private double hoursWorked;
	private boolean isManager;
	private double weeklySales;
	
	/** 
	 *  Creates a PayCheck object for an employee given the name and
	 *  manager status.
	 *  @param name the name of the employee
	 *  @param manager indicates whether employee is a manager
	 */
	public PayCheck(String name, boolean manager)
	{
		employee = name;
		isManager = manager;
		hoursWorked = 0;
		weeklySales = 0;
	}

	/** 
	 *  Calculates a worker's total wages, comprised of base salary, overtime salary,
	 *  commission, and the manager's bonus
	 *  @return the total wages earned by the worker
	 */
	public double calcWages()
	{
		// Get base wages
		double baseWages = BASIC_WAGE * Math.min(hoursWorked, BASIC_HOURS);

		// Get wages from overtime working (if any)
		double overtimeWages = BASIC_WAGE * 1.5 * Math.max(0, hoursWorked - BASIC_HOURS);

		// Get wages from sales commission
		double comWages = calcCommission();

		// Get bonus for being a manager
		int managerBonus = (isManager ? MANAGER_BONUS : 0);

		return baseWages + overtimeWages + comWages + managerBonus;
	}
	
	/** 
	 *  Calculates commission from sales of a worker and the given bounds
	 *  and percentages for commission in a company
	 *  @return the commission earned by the worker
	 */
	private double calcCommission()
	{
		if (weeklySales <= SALES_VOLUME_1)
			return weeklySales * COMMISSION_1;
		else if (weeklySales <= SALES_VOLUME_2)
			return weeklySales * COMMISSION_2;
		else
			return weeklySales * COMMISSION_3;
	}
	
	/** Retrieves an employee's name
	 *  @return the name of this employee
	 */
	public String getName()
	{
		return employee;
	}
	
	/** Retrieves manager status of employee
	 *  @return true if this employee is a manager, false otherwise
	 */
	public boolean isManager()
	{
		return isManager;
	}
	
	/** Retrieves the number of hours worked 
	 *  @return the number of hours worked this pay period
	 */
	public double getHours()
	{
		return hoursWorked;
	}

	/** Resets the number of hours worked to newHours
	 *  @param newHours the number of hours worked this pay period
	 */
	public void setHours(double newHours)
	{
		hoursWorked = newHours;
	}

	/** Retrieves the total amount of sales generated 
	 *  @return the total amount of sales generated this pay period
	 */
	public double getSales()
	{
		return weeklySales;
	}

	/** Resets the amount of sales generated to newSales
	 *  @param newSales the total amount of sales generated this pay period
	 */
	public void setSales(double newSales)
	{
		weeklySales = newSales;
	}
}