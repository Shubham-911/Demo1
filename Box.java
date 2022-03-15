class Box
{
private double width,depth,height;

//instance variable,not static data members
//private is for encapsulation data hiding
//if we dont creat any constructor then compiler will create the default 
//constructor wihic assign 0.00 values to the no static data members 

Box(double w,double d,double height)//parmeterized constructor
{
	width=w;
	//'width' is instance var and 'w' is local variable
	depth=d;
	this.height=height;//local variable name is same as instance variable name
}
String getBoxDetails()
{
	return "box dim"+this.width+" "+this.depth+" "+this.height;
}
double getVolume()
{
	return width*depth*height;
}
}
