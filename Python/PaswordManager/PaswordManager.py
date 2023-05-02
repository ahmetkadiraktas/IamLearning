from cryptography.fernet import Fernet

def write_key():
    key = Fernet.generate_key()
    with open("key.key","wb") as key_file:
        key_file.write(key)

write_key()
def load_key():
    file = open("key.key","rb" )
    key=file.read()
    file.close()
    return key


genel_pwd = input("Genel Şifreniz nedir? ")
key=load_key() + master_pwd.bytes
fer = Fernet(key)







def yeni():
    isim = input('Hesap adi:')
    pwd = input("   Şifre : ")
    
    with open('şifreler.txt', 'a')as f:
        f.write(isim +"|"+ pwd +"\n")
    


def mevcut():
    with open('şifreler.txt', 'r')as f:
        for line in f.readlines():
            data = line.rstrip()
            user, passw =data.split("|")
            print("Kullanıcı: ", user,", Password:", passw)
            
            

    


while True:
    mode = input("Yeni bir şifre eklemek mi istersin? mevcut olanları görüntülemek mi? (yeni,mevcut) çikmka için q 'ya basin? ").lower()
    if mode == "q":
        break

    if mode == "mevcut":
        mevcut()
    elif mode == "yeni":
        yeni()
    else:
        print("geçersiz seçenek")
        continue
