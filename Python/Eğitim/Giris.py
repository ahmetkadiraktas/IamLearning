import string
from tokenize import String
from xmlrpc.client import boolean



#yorum satırı
""" yorum paragrafı """

print("Hello, World!")
#___________________________________________________________________________________


#Syntax

#python da diğer dillerden farklı olarak boşluklar önemlidir
#___________________________________________________________________________________


#Ekrana yazdırma 

print("kadir")
print(intt)

x = "bu kodalr bir harika"
print(x)
#___________________________________________________________________________________


#global ve yerel değişkenler

y = "kolay"

def adana():
  y = "zor mu?"
  print("Python is " + y)

adana()

print("Python is " + y)
#___________________________________________________________________________________

#Veritipleri
"""""
Numeric Types:	int, float, complex
Sequence Types:	list, tuple, range
Mapping Type:	dict
Set Types:	set, frozenset
Boolean Type:	bool
Binary Types:	bytes, bytearray, memoryview
None Type:	NoneType
"""
#___________________________________________________________________________________


#tip değiştirme

sayı1 = 1 #int
sayı2 = float(sayı1) #sayı1 float bir sayıya dönüştü
#___________________________________________________________________________________


#rasgele sayı

import random

print(random.randrange(1,10))
#___________________________________________________________________________________


#string

a = """adana
merkez
patlıyo
herkez"""
print(a) 

#stringler birer arraydir
aa = "telefon"
print(aa[1])


print(len(aa))