package util;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class View {
	
	private static Scanner scanner = new Scanner(System.in);

	public static String getStringNotNull(String msg){

		String input = null;

		while(true){

			System.out.println(msg);
			input = scanner.nextLine();

			if ( input != null && input.length() > 0){
				break;
			}

			System.out.println("Inserire un valore non nullo");
			
		}
		return input;
	}

	public static String getString(String msg){

		System.out.println(msg);
		return scanner.nextLine();
	}

	public static int getIntNotNull(String msg){

		int input = 0;

		while(true){

			System.out.println(msg);

			try{
				input = Integer.parseInt(scanner.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Inserire un valore numerico intero");
			}
		}
		return input;
	}
	
	public static float getFloatNotNull(String msg){

		float input = 0;

		while(true){

			System.out.println(msg);

			try{
				input = Float.parseFloat(scanner.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Inserire un valore numerico");
			}
		}
		return input;
	}
	
	public static double getDoubleNotNull(String msg){

		double input = 0;

		while(true){

			System.out.println(msg);

			try{
				input = Double.parseDouble(scanner.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Inserire un valore numerico");
			}
		}
		return input;
	}
	
	public static Integer getInt(String msg, boolean notNull){ // true: input vuoto non ammesso

		Integer input = null;

		while(true){

			System.out.println(msg);

			try{
				String in = scanner.nextLine();
				if (!notNull) {
					if (in.isEmpty()) {
						break;
				}
				}
				input = Integer.parseInt(in);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Inserire un valore numerico");
			}
		}
		return input;
	}
	
	public static LocalDate getDate(String msg){

		LocalDate input = null;

		while(true){

			System.out.println(msg);

			try{
				input = LocalDate.parse(scanner.nextLine());
				break;
			}
			catch(DateTimeParseException e){
				System.out.println("Inserire una data valida");
			}
		}
		return input;
	}
	
	public static void print( String msg){
		System.out.println(msg);
		
	}
	
	public static void print( Object msg){
		System.out.println(msg);
		
	}

	
	public static void printMapStringInt( Map<String,Integer> map ){
		
		Set<String> key = map.keySet();
		Set<String> sortedKey = new TreeSet<String>(key);
		
		for (String s : sortedKey ){
			System.out.println(" lettera " + s + ": " + map.get(s));
		}
	}

}
