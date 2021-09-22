/**
 * A high- profile secret agency wants to handle all the messages sent and received in ciphers. They need to build a program/ software where every mail sent or received in the organization will be encrypted using some secret codes. One of formats used can be as follows:


Actual
a
b
c
d
e
f
g
h
i
Cipher
f
g
h
i
j
k
l
m
n



Actual
j
k
l
m
n
o
p
q
r
Cipher
o
p
q
r
s
t
u
v
w



Actual
s
t
u
v
w
x
y
z
Cipher
x
y
z
a
b
c
d
e



The task is to encrypt the given string(str1) as per the ciphers given in the format above.

Note : String cannot have any special characters, space, number or any uppercase latter.

Example 1:
Input :
word -> value of str1

Output:
btwi  -> after changing the character with the ciphers

w  o   r   d
|     |   |    |
b   t   w   i
Hence the output if btwi

Example 2:
Input :
reply  -> Value of str1

Output : 
wjuqd

 */

package prevTCS;
import java.util.*;
public class CipherTCS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = "";
		int val=0;
		for(char c : str1.toCharArray()) {
			val = (int)c+5;
			if(val>=122)
				val -= 26;
			str2 += (char)val;
		}
		System.out.println(str2);
		sc.close();

	}
}

