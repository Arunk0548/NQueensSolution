# N-by-N Queens Problem
N-by-N Queens Problem One of the oldest chess based problems is to place 8 queens on a chessboard without the queens attacking each other. (If you are not familiar with chess, a queen can attack any square on the same row, any square on the same column, or any square on the same diagonal).

It is an amusing little exercise to write code to enumerate all solutions. Your task, in this week's challenge is to write code to display A single solution to placing n queens on an n by n chessboard.

The user inputs n, and the output should be a solution of the form   Queens on (x1,y1),(x2,y2),...,(xn,yn) where the xi stands for the row number and yi stands for the column number.

Example:  
Enter size of chess board n by n: 8   
Output: Queens on (1,1),(7,2),(5,3),(8,4),(2,5),(4,6),(6,7),(3,8)   

Note that n should be in the range 4 to 25 (inclusive).

#To Run
~~~
javac SinqleQueenSolution.java
java SinqleQueenSolution

Enter the size of chess board N by N:
8
 1  0  0  0  0  0  0  0
 0  0  0  0  0  0  1  0
 0  0  0  0  1  0  0  0
 0  0  0  0  0  0  0  1
 0  1  0  0  0  0  0  0
 0  0  0  1  0  0  0  0
 0  0  0  0  0  1  0  0
 0  0  1  0  0  0  0  0

 Queens on : (1,1),(2,7),(3,5),(4,8),(5,2),(6,4),(7,6),(8,3)
~~~
