def calculate_safe_periods(cycle_length):
	first_safe_period = 7;
	second_safe_period_start = cycle_length - first_safe_period;
	second_safe_period_end = cycle_length;
	print(f"first safe period: Day 1 to {first_safe_period}");
	print(f"second safe period: Day {second_safe_period_start} to {second_safe_period_end}");


def calculate_ovulation_day(cycle_length):
	result = cycle_length - 14;
	print(f"your ovulation day is {result}");
	return result;



def calculate_next_eriod_day(cycle_length, Last_period_day):
	next_period_day = Last_period_day +  cycle_length;
	print(f"next Period Day is {next_period_day}");
	return next_period_day;





while(True):
	print("""
			 	WELCOME TO MENSTRUAL CYCLE APP
			
				Choose your option
				1.Calculate safe periods
				2.Calculate ovulation day
				3.Calculate next period day
				0.Exit			
				""");
	option = int(input("Enter your option: "));
	match(option):
		case 1: 
			userInput =  int(input("Enter your cycle Length:"));
			calculate_safe_periods(userInput);
			break;
		case 2:
			userInput2 = int(input("Enter your cycle Length:"));
			calculate_ovulation_day(userInput2);
			break;
		case 3: 
			userInput3 = int(input("Enter your cycle Length :"));
			userInput4 = int(input("Enter your last period day :"));
			calculate_next_eriod_day(userInput3, userInput4);
			break;
		
		case 0:
			while False:
				print("bye bye");
			break;
	
		case _: print("invalid input.. try again");

