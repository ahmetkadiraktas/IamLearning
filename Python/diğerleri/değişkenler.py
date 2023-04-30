sayi = 10
print(sayi)

sayi = sayi + 2
print(sayi)



ornek = "Kadir"
print(ornek[1])

print (ornek[3:]) #ilk kısmı içerir

print (ornek[:3]) #son kısmı içermez

print (len(ornek)) #kaç harf var 

print (ornek + " aktaş")

ornek = ornek + "aktaş "

print(ornek*4)

print(ornek.upper())





asda=20

print(18>20)
#eger değeri olmsuz yapmak istiyosan başına not koy
print(not 18>asda)

print(asda == 18)
#eğer vereceği derğerin tersini almak istiyorsan ! kullan
print(asda != 18)

cılgınliste = ['a','b','c','d','e','f']
print(cılgınliste)
#listeye elaman ekleme
cılgınliste = cılgınliste+['g']
print(cılgınliste)
#strıng deki gibi sadece istediğimz yeri çağıra biliyoruz 
#listenin kendine özgü fonksiyonları için isminden sonra . koy
cılgınliste.append('k')
print(cılgınliste)






cılgıntuple = ('a','b','c','d','e','f')
print(cılgıntuple)
#listeden tek farkı değişemez, korumalı olması




#dictionary çok boyutlu tekil objeler
dict1={ 
    'isim':'kadir',
    'yas':20,
    'lokasyon':'istanbul'}
print(dict1)
print(dict1['yas'])

# dict içine dict koya bilirsin
dict2={ 
    'isim':{
        'ilk_isim': 'kadir',
        'ikinci_isim' : 'ahmet',
        },
    'yas':20,
    'lokasyon':'istanbul'}
print(dict2)
print(dict2['isim']['ilk_isim'])
#yine nokta koyarak özelliklere erişebilirsin
