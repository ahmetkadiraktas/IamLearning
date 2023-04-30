from re import S


meyveler = ["ananas","muz","kivi","şeftali"]
print(meyveler)
#___________________________________________________________________________________


#Liste uzunluğu
print(len(meyveler))
#___________________________________________________________________________________


#listeden eleman çağırma
print(meyveler[2])
print(meyveler[2:3]) #iki ve üç arasını çağırı
#___________________________________________________________________________________


#listeden eleman silme
sehirler = ["ordu","giresun","sinop","kastmonu","artvin"]
sehirler[2] = "rize"
print(sehirler)

sehirler[1:3] = ["rize","trabzon"]
print(sehirler)
#___________________________________________________________________________________


#listeye elaman sokuşturmak
sehirler.insert(1,"bartın")
print(sehirler)
#___________________________________________________________________________________


#listeye eleman eklemek
sehirler.append("çorum")
print(sehirler)
#___________________________________________________________________________________


#listeleri birleştirme
sehirler.extend(meyveler)
print(sehirler)
#___________________________________________________________________________________


#listeden eleman silme
esyalar =["bardak","kalem","masa","duvar","petek","kafatası"]

esyalar.remove("kafatası") 

esyalar.pop(2) #üçünçü numaralı öğe silindi

del esyalar[0] #ilk elemanı sildi

del esyalar    #listeyi siler

esyalar.clear()
print(esyalar)

