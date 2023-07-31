'''
This file demonstrates some elementary input collection
and also the fact that what you are reading now is a comment
block it is typically used to document code in places where it 
is needed, like function definitions once we get to that

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 7/30/23
'''


#We are also able to do single lined comments like so these are denoted with #

#It is also good practice to keep your code confined to a certain width, you 
#should not use more than 80 characters in a line, this helps with readability

#PRO-TIP the better you format your code, the easier it'll be for the staff 
#to assist you with the issues you are having :D


name = input("Hello user! What is your name? ")
age = int(input(f"Thanks {name}, may you now provide your age? "))

print(f"The user is {name}, and they are {age} year(s) old! ")

'''
Let's break down what we did above, Line 22 we define a variable named 'name'
and assigned it the return value of the input function. The input function
takes an optional string as its sole argument, this is the prompt that the
user sees when the program runs, providing no argument is functionally okay
but you may get confused when your program doesn't provide an output initially.

Line 23 is similar to line 22 in that we define a variable and assign it a value
the differences being: 1. We named the variable 'age' 2. We incased the input 
function with the int function which converts our response to an integer value.

It is important to be careful here, if you do not provide an integer looking 
response then the entire thing will explode - with errors - do not worry about
the format of the argument passed to the input function, this will be addressed 
at a later date.

Finally we print the relevant information to the terminal
'''

