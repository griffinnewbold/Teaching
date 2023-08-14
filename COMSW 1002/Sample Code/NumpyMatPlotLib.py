'''
This file demonstrates the basics of Numpy and the various
operations.

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@modified by Griffin Newbold
@date 8/14/23
'''

import numpy as np  #recall that np and plt are known as alias
import matplotlib.pyplot as plt 


#We can create numpy arrays by using the array method from numpy
my_array = np.array([1,2,3])

print(np.sum(my_array))
print(np.prod(my_array))
print(np.max(my_array))
print(np.min(my_array))

'''
If you know the type is numpy array it is important
to know that you need to be using the numpy equivalents 
as shown above, as using the standard python ones is less 
efficient than sticking to vanilla python anyway
'''

my_second_array = np.array([4,5,6])

print(my_array * my_second_array)
print(my_array + my_second_array)
print(my_second_array / my_array)
print(my_array - my_second_array)
print(my_second_array // my_array)

#Those operations all work as expected now!

'''
While matplotlib works with native python lists, if it often used 
with numpy in order to make plots more efficiently 
'''
plt.title("My Graph")
plt.plot(my_array, my_second_array) 

'''
The above is how you plot a graph of two variables and provide a title
note if you run this in VSCode you will not be able to see the result
either run in Spyder or in a Jupyter Notebook!

Since this content is not too relevant to 1002 I will stop here, but
you are welcome to do more research on these libraries if you feel inclined
to do so :D

Also this would also mark the end of the sample code file that I am writing
hopefully this was helpful, if you have any questions feel free to email me
my email is on the course homepage!
'''