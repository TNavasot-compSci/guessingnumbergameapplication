# GuessingNumberGame

## Description
   
### How to play this game?

You are given three options for the end range: **10**, **100**, or **1000**.  
- If you select **10**, the range of numbers is between 1 and 10.  
- If you select **100**, the range of numbers is between 1 and 100.  
- If you select **1000**, the range of numbers is between 1 and 1000.  

After selecting one of these options, a random secret number is generated within the chosen range.  
The goal of this game is to measure how many attempts it takes to find the secret number by using the **Binary Search Algorithm**.
 
 ## How the Binary Search Algorithm work:
The programme would calculate the halfway between 1 and your selected end range(10 or 100 or 1000).
Once the programme find the halfway of that number, it then checks if the number is greater than 
or less than or equal to the secret number.If the number is greater than the secret number, it searches the lower half
of the current range. If the number is less than the secret number it searches the upper half of the current range. If it equal
to the secret number then it is the correct answer, and then it also tells you the number of attempts that it takes to meet this given 
secret number.

In conclusion, program constantly follows these checks and perform these steps to reach the secret number due to the use of binary search algorithm.However, you can play the game again and click the previously 
chosen option of the end range or other given end ranges and it would automatically provide a different secret number since the programme generates a random number for the secret number within your selected range.

### Example(1):

Enter the end range 10, 100 or 1000:
10
The 'secret' number is: 2
The guess is: 5
Too High!
The guess is: 2
Correct!
It took 2 guesses.
Index: 1

---
### Example(2):
Enter the end range 10, 100 or 1000:
100
The 'secret' number is: 54
The guess is: 50
Too Low!
The guess is: 75
Too High!
The guess is: 62
Too High!
The guess is: 56
Too High!
The guess is: 53
Too Low!
The guess is: 54
Correct!
It took 6 guesses.
Index: 53

---

## How to Run  
To run the programme you need to compile all the files from the src folder and run the main class. 

## Programming language 
   Java
