'''
This file demonstrates the basics of tuples and sets

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 8/4/23
'''

#We can create a tuple in the following ways:
my_first_tuple = tuple()
my_first_tuple = ("hello", True, 2023)

for item in my_first_tuple:
    print(item)

#We can also take advantage of tuple unpacking:
a,b,c = my_first_tuple

print(a)
print(b)
print(c)

#We can create a set in the following ways:
my_first_set = set()
my_first_set = {1,2,3,4,1}

print(my_first_set)

#We can add elements to sets:
my_first_set.add(21)
print(my_first_set)

#We can remove elements
my_first_set.remove(21)
print(my_first_set)

#We cannot index a set uncommenting and running the following line will error
# print(my_first_set[0])

'''
A lot of the stuff that applied to lists also applies to Tuples and Sets
I would heavily recommend checking out Chapter 5 "Python Essentials II"
for more infomration on Tuples and Sets

While I am here I will go over multilined strings and f strings
'''

#Sometimes our strings are just too long for example
my_message  = "Welcome to the internet! Have a look around Anything that brain of yours can think of can be found We've got mountains of content, some better, some worse If none of it's of interest to you, you'd be the first"

#That reaches col 226 that's way too long here is a better way to store the same string
my_message = """Welcome to the internet! Have a look around
Anything that brain of yours can think of can be found
We've got mountains of content, some better, some worse
If none of it's of interest to you, you'd be the first"""

#Look at all condensend that is! F strings are shortcuts to format strings we 
#can use {} to denote placeholders and put variable names inside, for example:

print(f"The first verse to \"Welcome to the Internet\" is \n\n{my_message}")

#It is important to note that \n moves you to a new line in the output