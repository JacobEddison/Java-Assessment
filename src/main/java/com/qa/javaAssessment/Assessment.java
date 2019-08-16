package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		input = input.toLowerCase();
		String sentence = "";
		int occurence =0;
		int end = 0;
		int start = 0;
		for (int i=input.length();i==3;i--) {
			if (input.substring(i-4,i).equals("treb")) {
				occurence++;
				if (occurence==1) {
					start = i-4;
				}else if (occurence==2){
					end = i;
				} else {
					continue;
				}
				
			}
			else {
				continue;
			}
			sentence = input.substring(end,start);
			
		}
//		for (int i=0;i<input.length()-3;i++) {
//			if (input.substring(i,i+4).equals("bert")){
//				start = i+5;
//				for (int j=start;j<input.length()-3;j++) {
//					if (input.substring(j,j+4).equals("bert")) {
//						end = j;
//						sentence = input.substring(end,start);
//					} else {
//						continue;
//					}
//				}
//			}else {
//				continue;
//				
//			}
//		}
		return sentence;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		int first =0;
		int second =0;
		int third =0;
		boolean bool = false;
		if (a>b && a>c) {
			third = a;
			if (b>c) {
				second = b;
				first = c;
			} else {
				second = c;
				first = b;
			}
			int test1 = third-second;
			int test2 = second-first;
			if (test1==test2) {
				return bool=true;
			} else {
				return bool = false;
			}
		}
		else if ((a>b && a<c) ||(a<b && a>c)) {
			second = a;
			if (b>c) {
				third = b;
				first = c;
			}
			else {
				first = b;
				third = c;
			}
			int test1 = third-second;
			int test2 = second-first;
			if (test1==test2) {
				return bool = true;
			} else {
				return bool = false;
			}
		}
		else if (a<b && a<c) {
			first = a;
			if (b<c) {
				third = c;
				second = b;
			} 
			else {
				third = b;
				second = c;
			}
			int test1 = third-second;
			int test2 = second-first;
			if (test1==test2) {
				return bool = true;
			} else {
				return bool = false;
			} 
		}
		return bool;
	}


	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		int trim = input.length()-a;
		int start = trim/2;
		int end = input.length()-start;
		String word = "";
		System.out.println(trim);
		for (int i=0; i<input.length();i++) {
			if (i<start) {
				word += input.substring(i,i+1);
			}
			else if (i>=end) {
				word += input.substring(i,i+1);
			}
			else {
				word += "";
			}
		}
		return word;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		int runningTotal = 0;
		int max = 0;
		for (int i=0;i<input.length()-1;i++) {
			if (input.substring(i, i+1).equals(input.substring(i+1, i+2))) {
				runningTotal++;
				if (runningTotal>max) {
					max = runningTotal;
//					return max;
				}
				else {
					continue;
				}
			}
			else {
				runningTotal = 0;
			}
			System.out.println(max);
//			return max;
		}
		return max;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		return -1;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		String answer = "";
		if (arg1%3==0 && arg1%5==0) {
			answer = "fizzbuzz";
		}
		else if (arg1%3==0 && arg1%5!=0) {
			answer = "fizz";
		}
		else if (arg1%3!=0 && arg1%5==0) {
			answer = "buzz";
		}
		else {
			answer = "arg1";
		}
		return answer;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		return -1;
	}
}
