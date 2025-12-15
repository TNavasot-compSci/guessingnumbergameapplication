# GuessingNumberGame

## Description
   
## How to play this game?
 You have been given three option which are 10 or 100 or 1000. If you select 10, the range of numbers is between 1 to 10.
 If you select 100,  the range of numbers is between 1 to 100. If you select  1000, the range of numbers is between 1 to 1000. 
 After you select  one of this options, you would be given a random secret number that is found within
 the range between 1 and the end range which you've selected. The end goal of this game is to measure how long 
 does it take to reach the given secret number by using Binary Search Algorithm.
 How the  Binary Search Algorithm works:
 After you have given the selected range and the secret number is created within the chosen range, then the program execute the Binary Search Algorithm
 to find the secret number. 
 
 ## How the Binary Search Algorithm work:
The programme would calculate the halfway between 1 and your selected end range(10 or 100 or 1000).
Once the programme find the halfway of that number, it then checks if the number is greater than 
or less than or equal to the secret number.If the number is greater than the secret number, it searches the lower half
of the current range. If the number is less than the secret number it searches the upper half of the current range. If it equal
to the secret number then it is the correct answer, and then it also tells you the number of attempts that it takes to meet this given 
secret number.

In conclusion, program constantly follows these checks and perform these steps to reach the secret number due to the use of binary search algorithm.However, you can play the game again and click the previously 
chosen option of the end range or other given end ranges and it would automatically provide a different secret number since the programme generates a random number for the secret number within your selected range.

## EXAMPLE(1):
Enter the end range 10, 100 or 1000:    - They given you three option to choose from
10                                       - You choose the option by entering the number.So I entered 10 as my end range
The 'secret' number is: 2                 - It provided me a secret number which is 2.
The guess is:5                             - The programme would half betweeen 1 and my selected end range which is 10 to find the halfway of the number. So the halfway is 5
Too High!                                 -5 is greater than 2 so the number is too high. So therefore the programme would find the halfway between 1 and 4.The halfway between 1 and 4 which is 2.
The guess is : 2                          - So 2 is the correct answer because it equal to the secret number. 
Correct!
It took 2 guesses.                          - It would show how long does it take to meet that secret number which is 2 attempts.
1                                            -It also return the index that is assigned to that number. 

## EXAMPLE(2):
Enter the end range 10, 100 or 1000:           -They given you three option to choose from
100                                             - You choose the option by entering the number.So I entered 100 as my end range
The 'secret' number is: 54                      -It provided me a secret number which is 54.
The guess is: 50                                -The programme would half betweeen 1 and my selected end range which is 100 to find the halfway of the number. So the halfway is 50.
Too Low!                                        -50 is less than 54.So therefore the programme would find the halfway between 51 100 which is 75.
The guess is:75                                  -75 is greater than 54. So it find the halfway between 51 and 74 which is 62.                              
Too High!                                  
The guess is:62                                  -62 is greater than 54. So it find the halfway between 51 and 61 which is 56. 
Too High!
The guess is:56                                   -56 is greater than 54. So it find the halfway between 51 and 55 which is 53.
Too High!
The guess is: 53                                  -53 is less than 54. So it find the halfway between 53 and 55 which is 54. 
Too Low!
The guess is : 54                                 - So 54 is a correct answer because it equal to the secret number.
Correct!
It took 6 guesses.                                 - It would show how long does it take to meet that secret number which is 6 attempts.
53                                                  -It also return the index that is assigned to that number. 


## How to Run  
To run the programme you need to compile all the files from the src folder and run the main class. 

# #Programming language 
   Java
