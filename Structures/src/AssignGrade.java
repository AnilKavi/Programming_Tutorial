import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt();
		if(input>=95)
		{
	    //if int >=95 then assign grade 1
			System.out.println("input is " + 1.0+""+input);
		}
		else
		{
			if (input>=85)
			{
				//if int>=85 value assaign 1.3
				System.out.println("input is " +1.3+" "+input);	
			}
			else
			{
				if(input>=80)
				{
					//if int>=80 value assign 1.7
					System.out.println("input is "+1.7+""+input);
				}
				else
				{
					if(input>=75)
					{
						//if int>=75 value assign 2.0
						System.out.println("input is" + 2.0+""+input);
					}
					else
					{
						if(input<=70)
						{
							//if int>=70 value assign 2.3
							System.out.println("input is" +2.3+""+ input);
						}
							else
							{
								if(input<=65)
								{
									//if int>=65 value assign 2.7
									System.out.println("input " +2.7+""+ input);
							}
								else
								{
									if(input<=60)
									{
										//if int>=60 value assign 3.0
										System.out.println("input " +3.0+""+ input);
									}
									else
									{
										if(input<=55)
										{
											//if int>=55 value assign 3.3
											System.out.println("input " +3.3+""+ input);
										}
										else
										{
											if(input<=53)
											{
												//if int>=53 value asign 3.7
												System.out.println("input " + 3.7+""+input);
											}
											else
											{
												if(input<=50)
												{
													//if int>=50 value assign 4.0
													System.out.println("input " +4.0+""+ input);
												}
											}
										}
									}
								}
						}
					}
				}
				
			}
		}
		
		//System.out.println("input " + input);
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}

