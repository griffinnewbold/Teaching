'''
This file demonstrates the basics of looping using the for loop
and the while loop

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 7/30/23
'''


#Let's print the numbers 1 to 100, using what you know you could do:
'''
print(1)
print(2)
print(3)
   :
   :
print(100)
'''

#While this works it would take 100 lines, let's write this using loops

#First up the while loop
i = 0
while i < 100:
    i += 1
    print(i)

#Now a for loop
for i in range(1,101):
    print(i)


'''
The while loop is designated by the while keyword and at least one boolean
statement (condition) following it we also need to separately initialize a 
variable to go along with our condition. It is important to always be making
progress towards the condition in your loop otherwise you risk causing an 
infinite loop (your code will run forever)

The for loop designated by the for keyword and has the following format:

for x in y:
    code here

Let's focus more on the range function being used in the for loop, it returns a
sequence of numbers. Consider the following call to range:

range(x, y) -> returns a sequence in the range of [x, y) you also have the option
to provide an optional third argument that dictates the step in elements, by 
default this value is 1 so the following are equivalent:

range(1,101,1) and range(1,101) but let's say we want to print all odd numbers in
this range the following two for loops are options
'''

for i in range(101):
    if i % 2 == 1:
        print(i)


for i in range(1, 101, 2):
    print(i)


'''
The first loop uses the modulo operator, what the modulo does is return the
remainder of a / b which by definition is 1 for an odd number, also if we do 
not provide a start to our range function it defaults to 0

The second loop makes use of our knowledge of both the range of values and the
frequency of odd numbers (every other number)

Also fun fact, in Python 0 is intepreted as False for booleans and anything else
is True so the following conditionals are equivalent:

if i % 2 == 1:
    print(i)

if i % 2:
    print(i)

Please use the former throughout the course. Finally I leave you with a nested 
for loop, try to figure out the logisitics behind it for yourself!
'''

for i in range(101):
    for j in range(101):
        print(f"({i}, {j})")
