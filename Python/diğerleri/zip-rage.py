# rage zip enumerate

range (10)

list(range(10))
print(list)





for sayi in range(10):
    print(sayi)


for sayi in [*range(2,7)]:
    print(sayi)
    

for sayi in [*range(3,10,2)]:
    print(sayi)
    
    
# enumerate 

cılgınliste = ['a','b','c','d','e','f']
for harf in enumerate(cılgınliste):
    print(harf)
    

cılgınliste = ['a','b','c','d','e','f']
for index,harf in enumerate(cılgınliste):
    print(index , harf)
    
    
cılgınliste = ['a','b','c','d','e','f']
for index,harf in enumerate(cılgınliste):
    print(index+1 , harf)    
    
    
cılgınliste = ['a','b','c','d','e','f']
for index,harf in enumerate(cılgınliste):
    print("{}. harf:{}".format(index+1 , harf))
    
    
    
ulkeler = ['tr','fr','de']
siralamalar = range(1,4)

for ulke in zip(ulkeler,siralamalar):
    print(ulke)    