'''
This file demonstrates the basics of controlling the flow of
your programs using conditionals

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 7/30/23
'''

#Let us get some integer values from the user
grade = int(input("Please enter an integer from 0-100 "))

#We can print something different based off the value of grade!
if grade >= 90:
    print("This grade is an A")
elif grade >= 80:
    print("This grade is a B")
elif grade >= 70:
    print("This grade is a C")
elif grade >= 60:
    print("This grade is a D")
else:
    print("Yikes, let's hope for a curve!")


'''
Let's break down the program above! Line 15 should be familar to you by now
if it is not please go back and view UserInput.py Lines 17-26 represent what
is often known as a conditional or just an if statement. We are able to have 
the following variations of an if statement:

1. if <condition>:

2. if <condition>: else:

3. if <condition>: elif <condition>:

4. if <condition>: elif <condition>: else:

We are not limited by how many elifs we can have but try your best to keep 
it to a minimum, it is also important to realize some other things, first
we used a colon ':' to indicate entry into a new code block in other coding
languages like Java, C, C++ it is represented as the following:

if(condition){
    //our code would go here
}

In Python we use a single colon, and the parentheses around the condition are
optional, it is also important to indent once for every new code block that you
enter, in Python you'll get errors if you don't do this anyway but that indentation
must be consistent consider the following two code blocks, which would you rather
read and attempt to work with:


if grade < 50:
    some code here
        some other here
    back here for some reason
out of here man

OR

if (grade < 50):
    some code here
    some other here
    see we are consistent

out of here

Please opt for the second one, while the parentheses are optional I recommend
using them regardless moving forward for consistency and it'll help later down
the road I promise. 

Finally here is one more example of using a conditional but this time with
strings instead of integer
'''

#Let's get the user's favorite food :D
favorite_food = input("Hey friend! What is your favorite food!? ")

if favorite_food == "Lima Beans":
    print("That is not cool beans :(")
else:
    print("That sounds like a good food for you!")


'''
In Python we compare strings using == this varies from language to language
but that is how it is in Python, which is great because it makes it so simple!

Another thing to notice, is how I named the variable with two words. You have
two options when it comes to the naming convention of your variables choose one
and stick to it! This will make your code much more readable:

1. camalCase -> favoriteFood, myObject, and myInteger are examples
2. under_score -> favorite_food, my_object, and my_integer are examples

The choice will vary amongst the teaching staff, I will try to remain consistent
I will be using the second option when writing Python code, if by chance you see 
me writing any other language I will revert to camalCase :) 
'''