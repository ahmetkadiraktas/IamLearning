#kullanım şekli
# while <şart dogruysa>
#       <burada yazanı yap>
#else:
#<burda yazılanı yap>

#ama bu şart bir aralkıta olabilir


x=0

while x < 10:
    print ("{} degeri 10 dan küçüktür" .format(x))
    x = x+1
    
sayi=7
sonuc=1

while sayi > 0:
    sonuc = sayi * sonuc
    sayi = sayi - 1

print(sonuc) #dikkat bu satırı döngünün dışına yazarak sadece sonuçu bastırdık