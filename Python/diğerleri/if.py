sifre = "ahmet1454"


if sifre == 'kadir123' :
    print("Hoşgeldin")
elif sifre == 'ahmet1454':
    print("Bu şifreyi değiştirdin")
else:
    print("Tekrar deneyiniz")



#for dögüsü

arkadaşlar =["furkan","berkay","ismail","tunahan"]
print (arkadaşlar)
print ()
for dostlar in arkadaşlar:
    print(dostlar)

dost_sayısı = 0
for dostlar in arkadaşlar:
    dost_sayısı += 1
    print(dost_sayısı , dostlar)   
    
    
garipsayılar = [[1,2],[3,4],[5,6],[8,7]]

for x,y in garipsayılar:
    print (x*y)

