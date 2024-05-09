import java.util.*;

class BankAccount
{
	public static void main(String[] args) 
	{
		AccountRequirements obj = new AccountRequirements("Jayesh Jadhav","Pune",616089069767l,"CCMPJ2800B",123456,50000.45,9561242084l);
		boolean exit = false;
		AccountRequirements obj = null;
		double depositeBalance = 0;
		while(!exit)
		{
			System.out.println("1 : Create Bank Account");
			System.out.println("2 : Exsting Bank Account");
			System.out.println("3 : Exit");

			Scanner sc = new Scanner(System.in);
			System.out.println("Select Option : ");

			int option = sc.nextInt();
			switch (option)
			{
				case 1 : 
					{
						System.out.println("Enter Name:");
	                    String name = sc.next();
	                    System.out.println("Enter Address");
	                    String addr = sc.next();
	                    System.out.println("Enter Pan Number");
	                    String pan = sc.next();
	                    System.out.println("Enter Upi Pin");
	                    int upi = sc.nextInt();
	                    System.out.println("Enter Balance");
	                    double depositeBalance = sc.nextDouble(); // udpate currentbalance
	                    System.out.println("Enter Phone Number");
	                    long phone = sc.nextLong();
	                    System.out.println("Account Created Successfully");

	                    obj = new AccountRequirements(name, addr, pan, upi, depositeBalance, phone);
                	}
						 break;

				case 2 : System.out.println("Exsting Account");
						 break;

				case 3 : System.out.println("Exit ");
						 break;
			}
		}

	}
}


class AccountRequirements
{
	private String accountHolderName;
	private String address;
	private long adharNumber;
	private String panNumber;
	private int upiPin;
	private double bankBalance;
	private long phoneNumber;

	AccountRequirements(String accountHolderName, String address, long adharNumber, String panNumber, int upiPin, double bankBalance, long phoneNumber)
	{
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
		this.upiPin = upiPin;
		this.bankBalance = bankBalance;
		this.phoneNumber = phoneNumber;
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountholderName(String updateAccountHolderName)
	{
		accountHolderName = updateAccountHolderName;
	}

	public String getAddress()
	{
		return address;
	}
	public void setAddress(String updateAddress)
	{
		address = updateAddress;
	}

	public long getAdharNumber()
	{
		return adharNumber;
	}

	public String getPanNumber()
	{
		return panNumber;
	}
	
	public int getUpiPin()
	{
		return upiPin;
	}
	public void setUpiPin(int updateUpiPin)
	{
		upiPin = updateUpiPin;
	}

	public double getBankBalance()
	{
		return bankBalance;
	}
	public void setBankBalance(double updateBankBalance)
	{
		bankBalance = updateBankBalance;
	}

	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(long updatePhoneNumber)
	{
		phoneNumber = updatePhoneNumber;
	}

	void DisplayCustomerDetails()
	{
		System.out.println("Account holder name : "+this.accountHolderName);
		System.out.println("Address of User : "+this.address);
		System.out.println("Adhar Number of User : "+this.adharNumber);
		System.out.println("PAN Number of User : "+this.panNumber);
		System.out.println("UPI pin of User : "+this.upiPin);
		System.out.println("Bank Balance of User : "+this.bankBalance);
		System.out.println("Phone Number of User : "+this.phoneNumber);
	}
}


