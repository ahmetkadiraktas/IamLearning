
from random import Random


oyunTahtası =[' ' for x in range(10)]

def ekranaGöster():
    print(' '+oyunTahtası[1]+' '+'|'+' '+oyunTahtası[2]+' '+'|'+' '+oyunTahtası[3])
    print("----------")
    print(' '+oyunTahtası[4]+' '+'|'+' '+oyunTahtası[5]+' '+'|'+' '+oyunTahtası[6])
    print("----------")
    print(' '+oyunTahtası[7]+' '+'|'+' '+oyunTahtası[8]+' '+'|'+' '+oyunTahtası[8])




def harfKoy(harf,konum):
    oyunTahtası[konum]=harf
    

def alanBosmu(konum):
    return oyunTahtası[konum]==' '



def tahtaDolu():
    if oyunTahtası.count(' ')>1:
        return False
    else:
        return True
    
    
def kazanan(oyunTahtası,harf):
    return(oyunTahtası[1]==harf and oyunTahtası[2]==harf and oyunTahtası[3]==harf ) or (oyunTahtası[4]==harf and oyunTahtası[5]==harf and oyunTahtası[6]==harf) or (oyunTahtası[7]==harf and oyunTahtası[8]==harf and oyunTahtası[9]==harf) or (oyunTahtası[1]==harf and oyunTahtası[4]==harf and oyunTahtası[7]==harf )or (oyunTahtası[2]==harf and oyunTahtası[5]==harf and oyunTahtası[8]==harf ) or (oyunTahtası[3]==harf and oyunTahtası[6]==harf and oyunTahtası[9]==harf ) or (oyunTahtası[1]==harf and oyunTahtası[5]==harf and oyunTahtası[9]==harf ) or (oyunTahtası[3]==harf and oyunTahtası[5]==harf and oyunTahtası[7]==harf )


def oyuncuHaraketi():
    konum = int(input("1-9 arası bir konum giriniz : "))
    if alanBosmu(konum):
        harfKoy('x',konum)
        if kazanan(oyunTahtası,'x'):
            ekranaGöster()
            print("tebrikler, kazandınız")
            exit()
        ekranaGöster()
    else:
        print("girdiğiniz konum yanlış")
        oyuncuHaraketi()  
        
def bilgisayarHaraketi():
    import random
    müsait_konumlar = [konum for konum,harf in enumerate(oyunTahtası)if harf==' ' and konum !=0 ]
    
    hareket = 0
    
    for harf in ['o','x']:
        for i in müsait_konumlar:
            kopyaTahta = oyunTahtası[:]
            kopyaTahta[i]=harf
            if kazanan(kopyaTahta,harf):
                hareket=i
                return hareket
    köşeler=[]
    
    for i in müsait_konumlar:
        if i in [1,3,7,9]:   
            köşeler.append(i)
    
    if len(köşeler) > 0:
        hareket = Random.choice(köşeler)
        return hareket
    
    if 5 in müsait_konumlar:
        hareket=5
        return hareket
    
    içerisi=[]
    
    for i in müsait_konumlar:
        if i in [2,4,6,8]:   
            içerisi.append(i)
    
    if len(içerisi) > 0:
        hareket = Random.choice(içerisi)
        return hareket
                 
            
def oyun():
    print("xox oynuna hoşgeldiniz")
    ekranaGöster()
    
    while not tahtaDolu():
        
        oyuncuHaraketi()
        if tahtaDolu():
            print("oyun bitti kazanan yok")
            exit()
            
        print("--------------------------")
        
        bilgisayar_Haraketi=bilgisayarHaraketi()
        harfKoy('o',bilgisayar_Haraketi)
        if kazanan(oyunTahtası,'o'):
            ekranaGöster()
            print("bilgisayar kazandı.")
            exit()
            
            
        ekranaGöster()
        if tahtaDolu():
            print("oyun bitti kazanan yok")
            exit()
            
        print("------------------------------")
    
    
    
    
oyun()