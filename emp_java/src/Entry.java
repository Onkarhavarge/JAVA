import org.cdac.utils.LinkedList;

public class Entry {
	
	public static void main(String[] args){
		//Employee [] arrEmployee= new Employee[50];
		LinkedList objEmpList = new LinkedList();
		Employee emp = null;
		//int index= 0;
		int mainChoice = 0;
		
		int displaySubMenuChoice = 0;
		int sortSubMenuChoice = 0;
		final int ADD = 1;
		final int DISPLAY= 2;
		final int SORT = 3;
		//final int SAVE_TO_FILE = 4;
		//final int LOAD_FROM_FILE = 5;
		final int EXIT= 6;
				
		while(mainChoice!=6)
		{
			Menu.mainMenu();
			mainChoice = ConsoleInput.getInteger();
			//System.out.println("ok "+mainChoice);
			switch(mainChoice)
			{
				case ADD:
				{
					int addSubMenuChoice = 0;
					while(addSubMenuChoice<4)
					{	//submenu loop
						
						Menu.addSubMenu();
						addSubMenuChoice = ConsoleInput.getInteger();	
					
						if(addSubMenuChoice<4 && addSubMenuChoice>0) 
						{
							System.out.println("\nEnter the details");
							System.out.println("\nEnter the Name");
							String name =ConsoleInput.getString();
							System.out.println("Enter the Address");
							String address =ConsoleInput.getString();
							System.out.println("Enter the Age");
							int age =ConsoleInput.getInteger();
							System.out.println("Enter the Gender");
							String gender =ConsoleInput.getString();
							System.out.println("Enter the Basic Salary" );
							float basicSalary = ConsoleInput.getFloat();
								
							switch (addSubMenuChoice) 
							{
								case 1:
									System.out.println("Enter the HRA");
									float hra = ConsoleInput.getFloat();
									//arrEmployee[index++] = new Manager(name,address, age, gender, basicSalary, hra);
									 emp = new Manager(name,address, age, gender, basicSalary, hra);
									 objEmpList.add(emp);
									break;
									
								case 2:
									System.out.println("Enter the Overtime");
									float overtime  = ConsoleInput.getFloat();
									emp = new Engineer(name,address, age, gender, basicSalary, overtime);
									objEmpList.add(emp);
									break;
									
								case 3:
									System.out.println("Enter the Commission");
									float commission  = ConsoleInput.getFloat();
									emp = new SalesPerson(name,address, age, gender, basicSalary, commission);
									objEmpList.add(emp);
									break;
									
								/*
								 * case 4: continue; default: continue;
								 */		
								}
						
								System.out.println("\nRecord added\n");
								System.out.println("-------------------");
								
							}
						}
				
					}
					break;
				
					case DISPLAY:
					{
						while(displaySubMenuChoice<7) 
						{
							Menu.displaySubMenu();
							displaySubMenuChoice = ConsoleInput.getInteger();	
							
							StringBuffer empData = new StringBuffer();
							switch(displaySubMenuChoice)
							{
								case 1:
									empData = objEmpList.displayList();
									System.out.println("\nAll Employee Details\n----------------");
									System.out.println(empData);
									break;
								
								case 2:
									empData = objEmpList.getFirst();
									System.out.println("\nFirst Employee Details\n----------------");
									System.out.println(empData);
									break;
									
								case 3:
									empData = objEmpList.getNext();
									System.out.println("\nOther Employee Details\n----------------");
									System.out.println(empData);
									break;
									
									/*
									 * case 2: empData = objEmpList.displayList();
									 * System.out.println("\nEmployee Details\n----------------");
									 * System.out.println(empData); case 3: empData = objEmpList.displayList();
									 * System.out.println("\nEmployee Details\n----------------");
									 * System.out.println(empData); case 4: empData = objEmpList.displayList();
									 * System.out.println("\nEmployee Details\n----------------");
									 * System.out.println(empData); case 5: empData = objEmpList.displayList();
									 * System.out.println("\nEmployee Details\n----------------");
									 * System.out.println(empData);
									 */
								case 6:
									break;
									
							}
							break;
						}
					}
					break;

//					System.out.println(objEmpList);
//					StringBuffer empData = objEmpList.displayList();
//					System.out.println("\nEmployee Details\n----------------");
//					System.out.println(empData);
					/*
					 * for(int tmp=0;tmp<index;tmp++) {
					 * System.out.println("----------------------");
					 * arrEmployee[tmp].displayDetails();
					 * System.out.println("----------------------");
					 * 
					 * }
					 */					
					
					case SORT:
					{
						while(sortSubMenuChoice<4)
						{	//submenu loop
							Menu.sortSubMenu();
							
							sortSubMenuChoice = ConsoleInput.getInteger();
							switch(sortSubMenuChoice)
							{
								case 1:
		//							empData = objEmpList.displayList();
		//							System.out.println("\nEmployee Details\n----------------");
		//							System.out.println(empData);
									break;
								case 6:
									break;
							}
						}
					}
					break;
					case EXIT:
						System.exit(0);
						break;
				}
		}
	}
}



/************************************************************************************************
public class Entry {

public static void main(String[] args){
	Employee [] arrEmployee= new Employee[50];
	int index= 0;
	int choice = 0;
	int option = 0;
	final int ADD = 1;
	final int DISPLAY= 2;
	final int EXIT= 6;
			
	while(choice!=6){
		System.out.println("\n1. Add");
		System.out.println("2. Display");
		System.out.println("6. Exit");
		System.out.println("Enter your choice");
		
		choice = ConsoleInput.getInteger();
			
		switch(choice){
			case ADD:
				while(option<4){								//second submenu
					System.out.println("1. Manager");
					System.out.println("2. Engineer");
					System.out.println("3. SalesPerson");
					System.out.println("4. Exit");
					System.out.println("Enter your choice");
					
					option = ConsoleInput.getInteger();	
				
					if(option<4 && option>0) {
													
						System.out.println("\nEnter the name");
						String name =ConsoleInput.getString();
						System.out.println("Enter the address");
						String address =ConsoleInput.getString();
						System.out.println("Enter the age");
						int age =ConsoleInput.getInteger();
						System.out.println("Enter the gender ");
						String gender =ConsoleInput.getString();
						System.out.println("Enter the basicSalary" );
						float basicSalary = ConsoleInput.getFloat();
							
						switch (option) {
							case 1:
								System.out.println("Enter the hra ");
								float hra = ConsoleInput.getFloat();
								arrEmployee[index++] = new Manager(name,address, age, gender, basicSalary, hra);
								break;
							case 2:
								System.out.println("Enter the overtime ");
								float overtime  = ConsoleInput.getFloat();
								arrEmployee[index++] = new Engineer(name,address, age, gender, basicSalary, overtime);
								break;
							case 3:
								System.out.println("Enter the commission ");
								float commission  = ConsoleInput.getFloat();
								arrEmployee[index++] = new SalesPerson(name,address, age, gender, basicSalary, commission);
								break;
							/*
							 * case 4: continue; default: continue;
							 		
						}
						System.out.println("\nRecord added\n");
					}
				}	
			break;
			case DISPLAY:
				for(int tmp=0;tmp<index;tmp++)
				{
					System.out.println("----------------------");
					arrEmployee[tmp].displayDetails();
					System.out.println("----------------------");

				}
				break;
			case EXIT:
				System.exit(0);
				break;
		}
	}
}
}
*/