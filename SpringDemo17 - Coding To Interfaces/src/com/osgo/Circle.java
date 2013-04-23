package com.osgo;

public class Circle implements Shape
{
	private Point centre;
	
	public void draw()
	{
		System.out.println("Drawing Circle.");
		System.out.println("Circle with centre point at:" +"(" + centre.getX() + ", " + centre.getY() + ")" );
		
	} // end method draw

	public Point getCentre()
	{
		return centre;
	} // end method getCentre

	public void setCentre(Point centre)
	{
		this.centre = centre;
	} // end method setCentre

	
} // end Class Circle
