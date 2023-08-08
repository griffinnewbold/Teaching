'''
This file demonstrates the basics of classes in Python. It
is also a part of a three part series, you will only be held
to the content in this file (if you're taught this at all) the
reason I am doing it is to prep for technical interviews and I 
need to review OOP and OOD in Python.

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 8/8/23
'''

#We can define a basic class as follows:
class BasicClass(object):
    pass

'''
Of course this is boring but it shows off some important concepts
firstly classes are defined beginning with the word class and then name 
is by convention of the form 'ClassName' and we can either leave it with 
a colon or put parentheses and identify a Base (or parent) class, the 
default for this would be object which is what I did here. Let's see a fully
developed class now
'''

class Coordinate(object):

    def __init__(self, x, y):
        self.x = x
        self.y = y 

    def getX(self):
        return self.x
    
    def getY(self):
        return self.y
    
    def __str__(self):
        return f"The coordinate is ({self.x}, {self.y})"
    
    def setX(self, x):
        self.x = x
    
    def setY(self, y):
        self.y = y

'''
There is a lot here to unpack, firstly inside the class we defined
methods (outside of classes they are known as functions) and in order to 
get useful results we typically use the return keyword to return something useful

Consider the following simple function that takes adds three numbers:

def add(a, b, c):
   return a + b + c

Once we have defined a function we can use it:

my_sum = add(1,2,3)

The above line is only valid since we return something from the function.

When it comes to OOP we need a way to refer to the current executing object,
in Python this is done through the self keyword and in all methods it is the 
first parameter for the methods, any method with a name surrounded by two _
on each side represents some underlying attribute of the object functionally 
speaking.

__init__ is what is first run when you create objects and it provides the object
its attributes and initial values __str__ is what is run whenever you attempt to 
print an object let's instantiate an object and demo these properties.
'''

my_coordinate = Coordinate(20, 23)
print(my_coordinate)

print(my_coordinate.getX())
print(my_coordinate.getY())

my_coordinate.setY(24)
print(my_coordinate)