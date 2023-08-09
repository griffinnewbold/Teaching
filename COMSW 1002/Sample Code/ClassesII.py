'''
This file demonstrates some more classes in Python. It
is also a part of a three part series, you will only be held
to the content in this file (if you're taught this at all) the
reason I am doing it is to prep for technical interviews and I 
need to review OOP and OOD in Python.

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 8/9/23
'''

#Recall the Coordinate Class from last time
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


#We will now make a child class for the Coordinate class

class Coordinate3D(Coordinate):

    def __init__(self, x, y, z):
        super().__init__(x, y)
        self.z = z
    
    def __str__(self):
        return f"The coordinate is ({self.x}, {self.y}, {self.z})"
    
my_coordinate = Coordinate(20, 23)
print(my_coordinate)

my_3d_coordinate = Coordinate3D(20,23,2)
print(my_3d_coordinate)

print(isinstance(my_coordinate, Coordinate))
print(isinstance(my_coordinate, Coordinate3D))
print(isinstance(my_3d_coordinate, Coordinate))
print(isinstance(my_3d_coordinate, Coordinate3D))

'''
First let's define the relationship between these two classes:

                    object
                      ^
                      |
                  Coordinate
                      ^
                      |
                 Coordinate3D

object is an ancestor for all Python object types all objects derive some
attributes and properties from it. In our case Coordinate is the child of 
object and Coordinate3D is the grandchild of object and the child of Coordinate
the parent (or base) class is specified in the parentheses upon class declaration.

In Python you are actually able to have multiple parents - how nostalgic - in
other Object Oriented languages like Java you can only have one parent.

All instance methods and attributes are inherited by children (python technically
has static methods and class variables but you rarely see them) in the event you 
wish to write your own method of the same name but with different functionality this
is known as method overriding. Like we did with __str__(). Also to have a child class
we must also have a parent which is why we call the super().__init__() as it allows
us to establish the parent before finishing establishing the child
'''

'''
Finally we have the isinstance function which returns true if the first argument
is an instance of the second, child classes are always instances of their parents
(see reasoing above) parents are never instances of their children
'''
