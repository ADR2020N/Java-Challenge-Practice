# Java-Challenge-Practice-continue

21)	An array is defined to be a Bean array if it meets the following conditions
   a. If it contains a 9 then it also contains a 13.
   b. If it contains a 7 then it does not contain a 16.

So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays. The following arrays are not Bean arrays:
   a. { 9, 6, 18} (contains a 9 but no 13)
   b. {4, 7, 16} (contains both a 7 and a 16)

Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isBean (int[ ] a)

If you are programming in C or C++, the function signature is
   int isBean (int a[ ], int len) where len is the number of elements in the array.



There are three questions on this test. You have two hours to complete it. Please do your own work. You are not allowed to use any methods or functions provided by the system unless explicitly stated in the question. In particular, you are not allowed to convert int to a String or vice-versa.
Continue

22)	Write a function named countDigit that returns the number of times that a given digit appears in a positive number. For example countDigit(32121, 1) would return 2 because there are two 1s in 32121. Other examples:
countDigit(33331, 3) returns 4
countDigit(33331, 6) returns 0
countDigit(3, 3) returns 1

The function should return -1 if either argument is negative, so
countDigit(-543, 3) returns -1.

The function signature is 
	int countDigit(int n, int digit)

Hint: Use modulo base 10 and integer arithmetic to isolate the digits of the number.

23)	A Bunker array is defined to be an array in which at least one odd number is immediately followed by a prime number. So {4, 9, 6, 7, 3} is a Bunker array because the odd number 7 is immediately followed by the prime number 3. But {4, 9, 6, 15, 21} is not a Bunker array because none of the odd numbers are immediately followed by a prime number.

Write a function named isBunkerArray that returns 1 if its array argument is a Bunker array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isBunkerArray(int [ ] a)

If you are programming in C or C++, the function signature is
   int isBunkerArray(int a[ ], int len) where len is the number of elements in the array.

You may assume that there exists a function isPrime that returns 1 if it argument is a prime, otherwise it returns 0. You do not have to write this function.

24)	A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the array. So {3, 5, -2} is a Meera array because 3*2, 5*2 and -2*2 are not in the array. But {8, 3, 4} is not a Meera array because for n=4, 2*n=8 is in the array.

Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isMeera(int [ ] a)

If you are programming in C or C++, the function signature is
   int isMeera(int a[ ], int len) where len is the number of elements in the array.



There are three questions on this test. You have two hours to complete it. Please do your own work. You are not allowed to use any methods or functions provided by the system unless explicitly stated in the question. In particular, you are not allowed to convert int to a String or vice-versa.

25)	A Meera number is a number such that the number of nontrivial factors is a factor of the number. For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. (A nontrivial factor is a factor other than 1 and the number). Thus 6 has two nontrivial factors. Now, 2 is a factor of 6. Thus the number of nontrivial factors is a factor of 6. Hence 6 is a Meera number. Another Meera number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. Thus 30 has 6 nontrivial factors. Note that 6 is a factor of 30. So 30 is a Meera Number. However 21 is not a Meera number. The nontrivial factors of 21 are 3 and 7. Thus the number of nontrivial factors is 2. Note that 2 is not a factor of 21. Therefore, 21 is not a Meera number.

Write a function named isMeera that returns 1 if its integer argument is a Meera number, otherwise it returns 0.

The signature of the function is
   int isMeera(int n)

26)	A Bunker array is an array that contains the value 1 if and only if it contains a prime number. The array {7, 6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1.  The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not contain a 1. The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a prime number.
It is okay if a Bunker array contains more than one value 1 and more than one prime, so the array {3, 7, 1, 8, 1} is a Bunker array (3 and are the primes).

Write a function named isBunker that returns 1 if its array argument is a Bunker array and returns 0 otherwise.

You may assume the existence of a function named isPrime that returns 1 if its argument is a prime and returns 0 otherwise. You do not have to write isPrime, you can just call it.

If you are programming in Java or C#, the function signature is
   int isBunker (int [ ] a)

If you are programming in C or C++, the function signature is
   int isBunker(int a[ ], int len) where len is the number of elements in the array.

27)	A Nice array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array. 
For example, {2, 10, 9, 3} is a Nice array because
2 = 3-1
10 = 9+1
3 = 2 + 1
9 = 10 -1

Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.

The array {3, 4, 5, 7} is not a Nice array because of the value 7 which requires that the array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.

Write a function named isNice that returns 1 if its array argument is a Nice array. Otherwise it returns a 0.

If you are programming in Java or C#, the function signature is
   int isNice(int[ ] a)

If you are programming in C or C++, the function signature is
   int isNice(int a[ ], int len) where len is the number of elements in the array.


There are 3 questions on this test. You have two hours to finish it. Please do your own work. All you need to write is two functions. Please do not use any string methods. No sorting allowed. No additional data structures including arrays allowed. Try to write a simple, elegant and correct code.



28)	An integer is defined to be “continuous factored” if it can be expressed as the product of two or more continuous integers greater than 1.  
Examples of “continuous factored” integers are:
6 = 2 * 3. 
60 = 3 * 4 * 5
120 = 4 * 5 * 6
90 = 9*10
Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13

Write a function named isContinuousFactored(int  n) that returns 1 if n is continuous factored and 0 otherwise.
=Continue: Afternoon

29)	Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are known as twin primes. Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are many primes for which there is no twin. Examples are 23, 67. A twin array is defined to an array which every prime that has a twin appear with a twin. Some examples are 
{3, 5, 8, 10, 27}, 	     // 3 and 5 are twins and both are present
{11, 9, 12, 13, 23},       // 11 and 13 are twins and both are present, 23 has no twin
{5, 3, 14, 7, 18, 67}.      // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin

The following are NOT twin arrays:

{13, 14, 15, 3, 5} 	 // 13 has a twin prime and it is missing in the array
{1, 17, 8, 25, 67}     // 17 has a twin prime and it is missing in the array

Write a function named isTwin(int[ ] arr) that returns 1 if its array argument is a Twin array, otherwise it returns 0. 
