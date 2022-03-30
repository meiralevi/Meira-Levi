//Meira Levi
//Program 1 - Pig Latin
//This program will convert a regular sentence to pig latin

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		
		String pigLatinSentence = "";
		String punctuation = "";
		
		//Recieving input
		System.out.print("Enter a sentence (with NO xtra spaces at the end): ");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		

		boolean done = false;
		
		//This loop runs through each word of the sentence one at a time
		while (!done)
		{
			
			//finding the next space, to delineate a word
			int nextSpace = sentence.indexOf(" ");
			String word = "";
			
			//if there is no next space aka sentence is over
			if (nextSpace==-1)
			{
				word = sentence.substring(0);
				word = sentence.substring(0, sentence.length()-1);
				punctuation = word.substring(word.length());
				done = true;
				
			}
			
			//pulls out the word
			else
			{
				word = sentence.substring(0, nextSpace);
			}
			
			//checks for double letters at beginning that should be counted as one letter
			boolean two = false;
			
			if (word.length()>2)
			{
				String firstTwoLetters = word.substring(0, 2);
				if (firstTwoLetters.equals("ch")||firstTwoLetters.equals("gh")||firstTwoLetters.equals("gn")||firstTwoLetters.equals("ph")||firstTwoLetters.equals("qu")||firstTwoLetters.equals("rh")||firstTwoLetters.equals("sh")||firstTwoLetters.equals("th")||firstTwoLetters.equals("wh"))
					
				{
					two = true;
				}
			}
			
			
			//checks for three letters at beginning that should be counted as one letter
			boolean three = false;
			if (word.length()>3)
			{
				String firstThreeLetters = word.substring(0, 3);
				if (firstThreeLetters.equals("sch"))
				{
					two = false;
					three = true;
				}
			}
			
			//checks to see if the first letter is a vowel
			String firstLetter = word.substring(0, 1);
			boolean vowel = false;
			if (firstLetter.equals("a")||firstLetter.equals("e")||firstLetter.equals("i")||firstLetter.equals("o")||firstLetter.equals("u"))
			{
				vowel = true;
			}
			
			
			String pigWord = "";
			
			//this set of 'if's adds the "ay" properly
			if (vowel)
			{
				pigWord = word.substring(0)+"ay";
			}
			else if (two)
			{
				pigWord = word.substring(2)+word.substring(0, 2)+"ay";
			}
			else if (three)
			{
				pigWord = word.substring(3)+word.substring(0, 3)+"ay";
			}
			else
			{
				pigWord = word.substring(1)+word.substring(0, 1)+"ay";
			}
			
			
			//concatenates word to new pig latin string
			pigLatinSentence = pigLatinSentence.concat(pigWord+" ");

			
			sentence = sentence.substring(nextSpace+1);
		}
		
		
		//These lines make the first letter capital and add a punctuation mark
		pigLatinSentence.concat(punctuation);
		String firstLetter = pigLatinSentence.substring(0, 1);
		firstLetter = firstLetter.toUpperCase();
		pigLatinSentence = firstLetter + pigLatinSentence.substring(1);
		String lastLetter = pigLatinSentence.substring(pigLatinSentence.length()-2, pigLatinSentence.length()-1);

		pigLatinSentence = pigLatinSentence.strip();
		
		if (!lastLetter.equals(".")||!lastLetter.equals("!")||!lastLetter.equals("?"))
		{
			String period = ".";
			pigLatinSentence = pigLatinSentence.concat(period);
		}
		
		//prints out the string and ends the program
		System.out.println(pigLatinSentence);
	}

}
