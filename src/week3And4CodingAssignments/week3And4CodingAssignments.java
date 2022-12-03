package week3And4CodingAssignments;

public class week3And4CodingAssignments {

	public static void main(String[] args) {
		//1. create array int called ages with the following values; 
		
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
				
				System.out.println(ages[0]);
				
				//1.A subtract first element from last element 
				//last element is arraylength-1 
				
				System.out.println(ages[ages.length -1]- ages[0]);
				
				//1.B adds number 83 to int ages array
				
				//int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 83};
				//System.out.println(ages[ages.length -1] - ages[0]);
				
				
				//1.C loop-calculate average --
				
				int sum = 0;  //created a variable sum to hold the sum
				for (int age : ages) { //used enhanced loop that iterates through each element in the array
					sum += age; //then add the sum to age and once thru entire array output average
				}System.out.println(sum/ages.length);
				
				//2. create array String called names with the following elements
				
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				//2.A loop calculate average number of letters
				double sumOf = 0; //created a variable sumOf to hold the sum
				for (int i = 0; i<names.length; i++) {
					sumOf +=names[i].length();//sum is added to each element length, i iterates
				//until it reaches the length of the array then the output is average number of letters
				}System.out.println(sumOf/names.length);
				
				//2.B concatenate all the names together separated by spaces
				//i iterates through array until it's less than the length
				for (int i =0; i<names.length; i++) {
					System.out.print(names[i] + " ");//outputs each name with a space
					
				}//3. How do you access the last element of the array?
				//bc index starts at 0 last element is length of array-1	  
					//System.out.println(names.length - 1);
					 
				//4. How do you access the first element of an array?
					  //0 is the first index
					//System.out.println(names[0]);
				
				//5. //created new array of int called namelengths with value of the length of the names array 
				//created a for loop i iterates through names array and each time increased by 1 until it is less than the array length; element length
				//is stored in namelenghts and namelength is added to each element length
				//it will output the length of each element in name lengths
					
				//System.out.println();	
				int[] nameLengths = new int[names.length];				
					for (int i =0; i<names.length; i++) {
						nameLengths[i] += names[i].length();
						//System.out.println(nameLengths[i]);//output length of each element	
			}
				//6. write loop to iterate over the nameLengths array and calculate sum of all elements
					int sumNames = 0;//created a variable sumNames to hold the sum
					for (int i = 0; i<names.length; i++) { //i is 0, repeat it, increase by 1
					  sumNames += names[i].length();//i will iterate through the loop until it
					  //it is no longer less than the array names length
						
					}  System.out.println("\n" + sumNames);//output on next ling sum of all elements
					 
				//7.write a method that takes a String, word, and an int, n 
					System.out.println(concatinateString("Hello", 3));
				
				//8.write a method that takes two Strings, firstName and lastName and returns fullName
				String firstName = "Lily";
				String lastName = "Jones";
				String completeName = fullName(firstName,lastName); //variable completeName takes method fullname and pass in variable firstName and lastName
				System.out.println(completeName);
				
				//9.write method that takes an array of int and returns true if sum of ints >100
				System.out.println(sumGreaterThan(ages));//takes method pass in array ages to return true or false if greater than
				
				//10.Write a method that takes an array of double and returns the average of all the elements in the array.
				double[] numbers = {2, 4, 6, 20, 15, 12};
				System.out.println(returnAverage(numbers));//takes method and pass in array numbers through to return average of the array
				
				//11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
				double[] numbers2 = {3, 1, 5, 10, 11, 4};
			    boolean greaterThan = (firstArrayGreaterThan(numbers, numbers2)); //pass in array numbers2 and array numbers
			    System.out.println(greaterThan); //true or false if average of numbers elements > average numbers2 elements
			    
			    //12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			    boolean temp = true;
			    double money = 9.50;
			    boolean returnTrueOrFalse = (willBuyDrink(temp, money));
			    System.out.println(returnTrueOrFalse);
			    //13.
			    String[] cars = {"Honda", "Toyota", "Chevy", "Ford"};
			    String[] cars2 = {"Honda", "Mazda", "Toyota", "Kia"};
			    String returnCars = (extractSameCars(cars, cars2));
			    System.out.println(returnCars);
			    
			}//end method
			//7.//created method of return type String named w/data type String, int
			public static String concatinateString(String string, int n) {
				String result = "";//String variable to hold result
				for (int i =0; i<n; i++) {//i is 0, repeat it, increase by 1
					result +=string;
					//hello,3 arguments and returns the word concatenated to itself n 	
				} return result;
				
			}//8.
			public static String fullName(String firstName, String lastName)  {
				return firstName + " " + lastName;
				
				
			}//9.return type booleen
			public static boolean sumGreaterThan(int[] num) {
				int sum = 0; //int variable sum to hold sum
				for (int number : num) {
				int sumTotal = sum += number;
					if(sumTotal > 100) {//sum of array element ages > 100, yes
						return true;
					}
				}		return false;
					
			}//10. //return double name returnAverage datatype double
			public static double returnAverage(double[] num) {
				double sum = 0;
				for(double number : num) {
					sum += number;
				}return sum/num.length;
				
			}//11.//return boolean name firstArrayGreaterThan datatype double
			public static boolean firstArrayGreaterThan(double[] array1, double[] array2) {
				 double sum = 0; 	//created loop to get sum of first array elements		
				 for (int i = 0; i<array1.length; i++) {//i is 0, repeat it, increase by 1 until <array length
					sum += array1[i];
				} double sum2 = 0; //created loop to get sum of 2nd array elements	
				 for(int y = 0; y<array2.length; y++) {
					sum2 += array2[y];
				 }  if (sum / array1.length > sum2 / array2.length) {//if average of array 1> average array2
						return true;
					 
				} return false;
			
			}//12.//return boolean name willBuyDrink datatype boolean datatype double
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if (isHotOutside && moneyInPocket >10.50) {//if argument isHotOutside true & moneyInPocket
					return true;
				}return false;
			
			}//13.
			public static String extractSameCars(String[] str, String[] str2) {
				String result = ""; // to have an empty string to populate whatever we need this takes the result (duplicate) and stores it until and because of the code on line 159 adds and holds other duplicates
				for (int i =0; i<str.length; i++) {
					
					for (int x=0; x<str2.length; x++) {
						
						if (str[i].equals(str2[x])) {//if 
				          result += str[i] + " ";//takes result and keeps adding other duplicates to the result I want returned
						}
						
					}
				}
				return result; 
				
				
			}
		}//end class
