/**
 * An English school teacher is teaching how to build sentences for kindergarten students. She starts by teaching two words in a sentence, then 3 words and so on. The next step is that she asks the students to find which word in the sentence they have made has the maximum number of alphabets. The task here is to write program to find the longest word in each input sentence(str).

Note :
The sentence can consist of uppercase, lowercase alphabets, special characters and numbers.

Example 1:
Input :
Knowledge is the greatest gift   -> Value of str

Output :
9

Explanation:

Word
No. of characters
Knowledge
9
Is
2
The
3
Greatest
8
Gift
4


From the above table, we can derive the word with highest number of characters is knowledge.
Hence , output is 9.

Example 2:
Inpout :
11223##%%5566778899 Saturn V rocket’s  first stage carries 203,400 gallons (770,000 litres) of kerosene fuel

Output :
19  -> word with max characters

Expalantion:
Longest word in the sentence is 
11223##%%5566778899
Hence, output is 19.

The Input format for testing 
The candidate has to write the code to accept one input(s)
First Input -
Accept value for number of str which is a string of characters 

The output format for testing 
The output should be a positive integer number.

Constraints:
str= A-Z, a-z,0-9, special characters

 */

package prevTCS;
import java.util.*;
public class SchoolTCS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0,max=0;
		for(String str1 : str.split(" ")) {
			count = str1.length();
			if(count>max)
				max=count;
		}
		System.out.println(max);
		sc.close();
	}

}
