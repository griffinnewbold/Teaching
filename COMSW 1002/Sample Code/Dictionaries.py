'''
This file demonstrates the basics of dictionaries

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 8/7/23
'''

#We can define a dictionary in two different ways
my_dict = {}
my_dict = dict()

#We use dictionaries to map entities as follows: a -> b it is not guaranteed
#that b -> a that is typically reserved for more advanced applications

my_dict["Computer"] = ["Science", "Engineering", "Desktop"]
my_dict["World"] = ["Peace", "Hunger", "War"]

print(my_dict, "\n")
print(my_dict["Computer"], "\n")
print(my_dict["World"], "\n")

'''
The values in dictionaries are accessed via keys, in the example where
we had a -> b a is the key and b is the value there are multiple ways
to iterate through a dictionary let's see them below
'''

for key in my_dict.keys():  # logically equivalent to my_dict
    print(key)

for value in my_dict.values():
    print(value)

for key, value in my_dict.items():
    print(f"The key '{key}' maps to: '{value}'")

'''
We can check if a key is contained in a dictionary in a conditional
with the key in dict syntax as shown below. If we want to check for values
then we need access to them first using the appropriate key
'''

if "Computer" in my_dict:
    print("Welcome to the Digital Age")
else:
    print("Ahh the stone age I see")

if "Science" in my_dict["Computer"]:
    print("Science Rules")
else:
    print("Bill Nye does not approve")

