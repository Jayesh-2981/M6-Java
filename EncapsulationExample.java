class MyInfo
{
	private String name, nativePlace, branch;	//creating non static private variables 

	MyInfo(String name, String nativePlace, String branch)	//creating constructor
	{
		this.name = name;
		this.nativePlace = nativePlace;
		this.branch = branch;
	}

	public String getName()						//getter method for variable name
	{
		return name;
	}
	public void setName(String updateName)		//setter method for variable name
	{
		name = updateName;
	}

	public String getNativePlace()				//getter method for variable nativePlace
	{
		return nativePlace;
	}
	public void setNativePlace(String updateNativePlace)	//setter methof for variable nativePlace
	{
		nativePlace = updateNativePlace;
	}

	public String getBranch()					//getter method for variable branch
	{
		return branch;
	}
	public void setBranch(String updateBranch)	//setter method for variable branch
	{
		branch = updateBranch;
	}
}

class EncapsulationExample
{
	public static void main(String[] args) 
	{
		MyInfo obj = new MyInfo("Ramesh", "Pune", "Computer");	//object of MyIno class
		System.out.println(obj.getName());						//printing varibale name

		obj.setName("Jayesh");									//updating data of variable name 
		System.out.println(obj.getName());						//printing updated variable name
	}
}