package org.OOPs_interface_practice;
interface F5
{
	public void addition();
	public void subtraction();
}
interface F0
{
	public void fraction();
}

interface F6 extends F5 ,F0
{
	// one interface can extend on or more interface
	abstract public void multiplication();
	abstract public void division();
}
public class Multiple_interface {

	public static void main(String[] args) {
		

	}

}
