'''
This file demonstrates the basics of lists, including traversal;
appending, removing etc

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 8/1/23
'''

#We can define empty lists in one of two ways:

my_first_list = [] 
my_second_list = list()

#You will most likely use the form on Line 16 now we can add items:
my_first_list.append(1)
my_first_list.append("welcome")
my_first_list.append(my_second_list)

print(my_first_list)

'''
Lists in python are able to store multiple data types and are not 
homogenous. As you can see we can store integers, strings, and even
other lists! There are some operations that cannot be done when the 
list is not homogenous, I will use the second list to demostrate
'''

for i in range(101):
    my_second_list.append(i)

print(f"The maximum value in the list is {max(my_second_list)}")
print(f"The minimum value in the list is {min(my_second_list)}")
print(f"The sum of the list is {sum(my_second_list)}")

'''
This is an example when the list contains integers, this would work with
floating point values too, try experimenting with it! We can now remove items
'''

my_first_list.remove(my_second_list)
my_first_list.pop()

'''
Using the remove method removes the first instance of what you pass into it
the pop method removes the item at the specified index but by default it is
the end of the list, now we can traverse the list in multiple ways 
'''
my_first_list.append(2)

for i in range(len(my_first_list)):
    print(my_first_list[i])

for item in my_first_list:
    print(item)

for i, item in enumerate(my_first_list):
    print(f"{item} occcured at index: {i}")

'''
There are a few things to understand here, first the len() function returns
how many items are in the collection, second as evidenced by the last result
indexing starts at 0 which is why we do not need to do len(x)+1 as that index
does not exist. 

The manual indexing of items is done with the name of the collection a set of
square brackets and a integer value representing the index. Enumerate is a function that
gives us both the item and index at the same time.

Finally we will do a few examples using list comprehension which allows us to compactly
create lists in Python
'''

list_comp = [x for x in range(100)] 

list_comp_again = ["FizzBuzz" if not x % 3 and not x % 5 else "Fizz" if not x % 3  
                   else "Buzz" if not x % 5 else x for x in range(1, 100)]

print(list_comp)
print(list_comp_again)

'''
The first here is a basic list comprehension with no conditions while the second 
include some conditions, in fact that comprehension helps solve a famous problem
in CS, famous because it is well known and not because it is impactful
'''