# GuessingNumberGame

## Description
   
### How to play this game?

You are given three options for the end range: **10**, **100**, or **1000**.  
- If you select **10**, the range of numbers is between 1 and 10.  
- If you select **100**, the range of numbers is between 1 and 100.  
- If you select **1000**, the range of numbers is between 1 and 1000.  

After selecting one of these options, a random secret number is generated within the chosen range.  
The goal of this game is to measure how many attempts it takes to find the secret number by using the **Binary Search Algorithm**.
 
### How the Binary Search Algorithm works:

Once the range is selected and the secret number is generated, the program executes the Binary Search Algorithm to find the secret number.  

- The program calculates the halfway point between 1 and your selected end range (10, 100, or 1000).  
- It then compares this halfway point to the secret number:  
  - If the halfway point is **greater** than the secret number, the program searches the lower half of the current range.  
  - If the halfway point is **less** than the secret number, it searches the upper half of the current range.  
  - If the halfway point is **equal** to the secret number, the program has found the correct answer and reports the number of attempts taken.

The program repeats these steps until it finds the secret number.

---

You can play the game multiple times, choosing any of the available ranges. Each time, the program generates a new random secret number within the selected range and calculates the number of attempts needed to find it.

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
