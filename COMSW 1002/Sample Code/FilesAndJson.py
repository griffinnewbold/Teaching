'''
This file demonstrates the basics of Files and using JSON
more like Files with the brief JSON appearance haha

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@author Griffin Newbold
@date 8/12/23
'''

import json #we will need this later

my_file = open("FilePractice.txt", "r+")

for line in my_file:
    print(line)

for i in range(1,101):
    my_file.write(str(i) + "\n")

my_file.close()

'''
Here we open a file using the open function providing the file path and 
the mode we wish to open it r+ is read and write then we print each line
in the file and then add some lines to the file and afterwards we close 
the file. If you were to run the code 2 times you would get different outputs.

In fairness since the file changes with each time you run the code it isn't 
limited to two times.
'''

#Let's make a JSON file now! Since I do not have one on hand, we'll make one

dictionary = {
    "Name" : "Griffin",
    "Age"  : 20,
    "Class" : "Junior/2025"
}

with open("Sample.json", "w") as outfile:
    json.dump(dictionary, outfile)

'''
From this we have successfully converted a Python dictionary to JSON
You can read the notes or the appropriate lab materials to figure out
how to use JSON as input
'''