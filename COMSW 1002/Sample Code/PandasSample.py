'''
This file demonstrates the basics of Pandas and the various
operations, this code was originally created by Dr. Bauer

As always you are welcome to look and modify this code to your 
needs but you are required to make a note of such either directly
in your code or if you are required to submit a README.txt file
then there. This is for academic integrity concerns

@modified by Griffin Newbold
@date 8/13/23
'''

import pandas as pd 
from pandas.io.parsers import read_csv
df = read_csv("WHO_first9cols.csv")

print(f"The type of the variable is:  {type(df)} and it has length: {len(df)}", "\n")

print(df)

print(df.head())
print("\n", df.tail())


print(df.loc[23], "\n")
print(df.iloc[23], "\n")

df.set_index("Country", inplace=True)


#.loc means locate, it locates elements using the index type of the dataframe
print(df.loc["Botswana"], "\n")

#.iloc means index locate, it locates elements using the traditional method
print(df.iloc[23], "\n")

lit = "Adult literacy rate (%)"
print(df[df[lit]>80], "\n") #we can filter data using booleans

print(df[df[lit].isnull() == False], "\n") #keep only rows that have a literacy rate entry