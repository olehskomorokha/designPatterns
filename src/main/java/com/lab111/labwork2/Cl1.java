package com.lab111.labwork2;
/**
* Class which implements interface If1, extends Cl2, consists
* of field of Cl1`s type, methods which allow to print
* information about class and method on console
* @author Oleg
* 
*/
public class Cl1 extends Cl2 implements if1
{
	/**
	* Field of Cl1`s type
	*/
	Cl1 cl1;
	
	 /**
     * Method which prints information about class and method on console
     */	
	public void method1() 
	{
		System.out.println("Cl1 - method1");
	}
	
	 /**
     * Method which prints information about class and method on console
     */	
	public void method2() 
	{
		System.out.println("Cl1 - method2");
	}
}
