// STUDENT NAME: Conal Hamilton
// DATE: February 9 2025

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int birthDay;
		int birthMonth;
		int birthYear;
		int birthYVar;
		int birthMVar;
		int birthAVar;
		int currentYear;
		int currentDay;
		int currentMonth;
		int currentYVar;
		int currentMVar;
		int currentAVar;
		int julianBirthDay;
		int julianCurrentDay;
		int ageDays;
		int ageYears;
		String todaysDateIs;
		String birthDateIs;
		String differenceIs;
		/***** INITIALIZATION SECTION *****/
		birthDay = 26;
		birthMonth = 8;
		birthYear = 1918;
		currentDay = 2;
		currentYear = 2020;
		currentMonth = 2;
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		birthAVar = (14 - birthMonth) / 12;
		birthYVar = birthYear + 4800 - birthAVar;
		birthMVar = birthMonth + 12 * birthAVar - 3;
		currentAVar = (14 - currentMonth) / 12;
		currentYVar = currentYear + 4800 - currentAVar;
		currentMVar = currentMonth + 12 * currentAVar - 3;
		julianBirthDay = birthDay + (birthMVar * 153 + 2) / 5 + birthYVar * 365 + birthYVar / 4 - birthYVar / 100 + birthYVar / 400 - 32045;
		julianCurrentDay = currentDay + (currentMVar * 153 + 2) / 5 + currentYVar * 365 + currentYVar / 4 - currentYVar / 100 + currentYVar / 400 - 32045;
		ageDays = julianCurrentDay - julianBirthDay;
		ageYears = ageDays / 365;
		todaysDateIs = "Julian Day Number for today's date, " + currentMonth + "/" + currentDay + "/" + currentYear + ", is " + julianCurrentDay;
		birthDateIs = "Julian Day Number for birthday, " + birthMonth + "/" + birthDay + "/" + birthYear + ", is " + julianBirthDay;
		differenceIs = "The difference in days is " + ageDays + ", which makes you approximately " + ageYears + " years old!";
		
		/***** OUTPUT SECTION *****/
		System.out.println(todaysDateIs);
		System.out.println(birthDateIs);
		System.out.println(differenceIs);
  }
}
