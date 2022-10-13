import java.util.Scanner;
class OlaCabsProject 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String userName="Sanju";
		int passWord=1234;
		String source1="Kachigudarailwaystation";
		String destination1="Kukatpally";
		String source2="Secunderabadrailwaystation";
		String destination2="RGI";
		System.out.println("***Welcome to Ola Cabs***");
		System.out.println("***press 1 if you are a new user***");
		System.out.println("***press 2 if you have login details***");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
		// New User Account Registration
		System.out.println("enter your username");
			String userName1=scan.next();
			System.out.println("enter your password");
			int passWord1=scan.nextInt();
			System.out.println("Confirm your password");
			passWord1=scan.nextInt();
			System.out.println("enter your mobile number");
			int mobile=scan.nextInt();
			System.out.println("click CREATE to confirm your account");
			System.out.println();
			System.out.println("***Continue your booking***");
			System.out.println();

	System.out.println("press 1 for "+source1+" to "+destination1+"");
	System.out.println("press 2 for "+source1+" to "+source2+"");
	System.out.println("press 3 for "+source1+" to "+destination2+"");
	System.out.println("press 4 for "+destination1+" to "+source2+"");
	System.out.println("press 5 for "+destination1+" to "+destination2+"");
	int choice1=scan.nextInt();
	switch(choice1)
		{
		case 1:
			System.out.println("19km");
				System.out.println("enter vehicle you want to travel");
				char status=scan.next().charAt(0);
				
			switch(status)
			{
				case 's':
					System.out.println("Prime Sedan");
				System.out.println("Fare is 1211");
				break;
				case 'v':
					System.out.println("Prime SUV");
				System.out.println("Fare is 1625");
				break;
				case 'm':
					System.out.println("Mini");
				System.out.println("Fare is 1043");
				break;
			}
			break;
			case 2:
				System.out.println("7km");
				System.out.println("enter vehicle you want to travel");
				char status1=scan.next().charAt(0);
				switch(status1)
					{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 1000");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 1500");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 900");
					break;
					}
					break;
					case 3:
					System.out.println("7.1km");
					System.out.println("enter vehicle you want to travel");
					char status2=scan.next().charAt(0);
					switch(status2)
				{
						case 's':
							System.out.println("Prime Sedan");
						System.out.println("Fare is 1100");
						break;
						case 'v':
							System.out.println("Prime SUV");
						System.out.println("Fare is 1600");
						break;
						case 'm':
							System.out.println("Mini");
						System.out.println("Fare is 1000");
						break;
				}
				break;
				case 4:
				System.out.println("16km");
				System.out.println("enter vehicle you want to travel");
				char status3=scan.next().charAt(0);
				switch(status3)
				{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 1600");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 1000");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 900");
					break;
				}
				break;
				case 5:
				System.out.println("40km");
				System.out.println("enter vehicle you want to travel");
				char status4=scan.next().charAt(0);
				switch(status4)
				{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 2000");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 3000");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 1000");
					break;
				}
				break;
				case 6:
				System.out.println("37km");
				System.out.println("enter vehicle you want to travel");
				char status5=scan.next().charAt(0);
				switch(status5)
				{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 3000");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 4000");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 2000");
					break;
				}
				break;
		}
		break;
		case 2:
			//Already registered user details
			System.out.println("enter your username");
			userName1=scan.next();
			System.out.println("enter your password");
			passWord1=scan.nextInt();
			if(passWord==passWord1)
			{
				System.out.println("***Continue your booking***");
			System.out.println();
			System.out.println("press 1 for "+source1+" to "+destination1+"");
	System.out.println("press 2 for "+source1+" to "+source2+"");
	System.out.println("press 3 for "+source1+" to "+destination2+"");
	System.out.println("press 4 for "+destination1+" to "+source2+"");
	System.out.println("press 5 for "+destination1+" to "+destination2+"");
	choice1=scan.nextInt();
	switch(choice1)
		{
		case 1:
				System.out.println("19km");
				System.out.println("enter vehicle you want to travel");
				char status=scan.next().charAt(0);
			switch(status)
			{
				case 's':
					System.out.println("Prime Sedan");
				System.out.println("Fare is 1211");
				break;
				case 'v':
					System.out.println("Prime SUV");
				System.out.println("Fare is 1625");
				break;
				case 'm':
					System.out.println("Mini");
				System.out.println("Fare is 1043");
				break;
			}
			break;
			case 2:
				System.out.println("7km");
				System.out.println("enter vehicle you want to travel");
				char status1=scan.next().charAt(0);
				switch(status1)
					{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 1000");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 1500");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 900");
					break;
					}
					break;
					case 3:
					System.out.println("7.1km");
					System.out.println("enter vehicle you want to travel");
					char status2=scan.next().charAt(0);
					switch(status2)
				{
						case 's':
							System.out.println("Prime Sedan");
						System.out.println("Fare is 1100");
						break;
						case 'v':
							System.out.println("Prime SUV");
						System.out.println("Fare is 1600");
						break;
						case 'm':
							System.out.println("Mini");
						System.out.println("Fare is 1000");
						break;
				}
				break;
				case 4:
				System.out.println("16km");
				System.out.println("enter vehicle you want to travel");
				char status3=scan.next().charAt(0);
				switch(status3)
				{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 1600");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 1000");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 900");
					break;
				}
				break;
				case 5:
				System.out.println("40km");
				System.out.println("enter vehicle you want to travel");
				char status4=scan.next().charAt(0);
				switch(status4)
				{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 2000");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 3000");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 1000");
					break;
				}
				break;
				case 6:
				System.out.println("37km");
				System.out.println("enter vehicle you want to travel");
				char status5=scan.next().charAt(0);
				switch(status5)
				{
					case 's':
						System.out.println("Prime Sedan");
					System.out.println("Fare is 3000");
					break;
					case 'v':
						System.out.println("Prime SUV");
					System.out.println("Fare is 4000");
					break;
					case 'm':
						System.out.println("Mini");
					System.out.println("Fare is 2000");
					break;
				}
				break;
		}
			}
		}
		
		System.out.println("***If you are fine with price, please continue your booking***");
		System.out.println("***press 3 for Cash***");
		System.out.println("***press 4 for Credit***");
		System.out.println("***press 5 for Debit***");
		int number=scan.nextInt();
		switch(number)
		{
			case 3://Cash payment
				System.out.println("Thank you!! Your ride is confirmed");
			break;
			case 4://Credit details and payment
				System.out.println("1)ICICI\n2)HDFC\n");
			System.out.println("enter your card number");
			int card=scan.nextInt();
			System.out.println("enter expiry date");
			int date=scan.nextInt();
			System.out.println("enter your CVV");
			int security=scan.nextInt();
			System.out.println("enter cardholder name");
			String name=scan.next();
			System.out.println("***Click CONTINUE for payment***");
			System.out.println("Enter OTP for transaction");
			int num=scan.nextInt();
			System.out.println("***Your transaction is successful***");
			System.out.println("Thank you!! Your ride is confirmed");
			 break;
			 case 5://Debit details and payment 
				 System.out.println("1)SBI\n2)BOB\n");
			 System.out.println("enter your card number");
			card=scan.nextInt();
			System.out.println("enter expiry date");
			date=scan.nextInt();
			System.out.println("enter your CVV");
			security=scan.nextInt();
			System.out.println("enter cardholder name");
			name=scan.next();
			System.out.println("***Click CONTINUE for payment***");
			System.out.println("Enter OTP for transaction");
			num=scan.nextInt();
			System.out.println("***Your transaction is successful***");
			System.out.println("Thank you!! Your ride is confirmed");
			 break;
		}
		System.out.println();
		//Driver Details
		System.out.println("***Driver-Sanjana Shetty***");
		System.out.println("***Arriving in few minutes***");
		System.out.println("***contact:56473***");
		System.out.println();
		System.out.println("***Your destination has arrived***");
		System.out.println("***Hope you had a good ride***");
		//Feedback
		System.out.println("press b for poor ride");
		System.out.println("press g for good ride");
		System.out.println("press v for very good ride");
		char feedback=scan.next().charAt(0);
		System.out.println("***Thank you for your feedback***");
		System.out.println();
		System.out.println("***GPS turned off***");


			}
		}