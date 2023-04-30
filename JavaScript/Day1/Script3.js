// 'Aşk bu dünyadaki en iyi şeydir. Bazıları aşkını buldu ve bazıları hala aşkını arıyor.' Bu cümledeki love kelimesini sayın.

const seentence = 'Aşk bu dünyadaki en iyi şeydir. Bazıları aşkını buldu ve bazıları hala aşkını arıyor.';
const wordToFind = 'aşk';

const count = seentence.split(wordToFind).length - 1;
console.log(count); 



// Aşağıdaki cümledeki tüm çünkü sayısını saymak için match() kullanın:'Bir cümleyi çünkü ile bitiremezsiniz çünkü çünkü bir bağlaçtır'

const cümle = 'Bir cümleyi çünkü ile bitiremezsiniz çünkü çünkü bir bağlaçtır';
const hedef = (cümle.match(/çünkü/g) || []).length;
console.log(hedef); 







// Aşağıdaki metni temizleyin ve en sık kullanılan kelimeyi bulun (ipucu, değiştirme ve normal ifadeleri kullanın).

const sentence = '%I $am@% a %tea@cher%, &and& I lo%#ve %te@a@ching%;. The@re $is no@th@ing; &as& mo@re rewarding as educa@ting &and& @emp%o@weri@ng peo@ple. ;I found tea@ching m%o@re interesting tha@n any ot#her %jo@bs. %Do@es thi%s mo@tiv#ate yo@u to be a tea@cher!? %Th#is 30#Days&OfJavaScript &is al@so $the $resu@lt of &love& of tea&ching'

// Metni temizleme
const cleanedSentence = sentence.replace(/[^\w\s]/gi, '').toLowerCase();

// Kelimeleri diziye ayırma
const words = cleanedSentence.split(/\s+/);

// Her kelimenin sayısını hesaplayın ve en sık kullanılan kelimeyi bulun
let wordCount = {};
let mostFrequentWord = '';
let maxCount = 0;
for (let word of words) {
  if (wordCount[word]) {
    wordCount[word]++;
  } else {
    wordCount[word] = 1;
  }
  if (wordCount[word] > maxCount) {
    mostFrequentWord = word;
    maxCount = wordCount[word];
  }
}

console.log(`En sık kullanılan kelime: "${mostFrequentWord}" (${maxCount} kez)`);




// Aşağıdaki metinden sayıları çıkararak kişinin yıllık toplam gelirini hesaplayın.
// 'Aylık maaşından 5000 euro, yıllık 10000 euro ikramiye, ayda 15000 euro online kurstan kazanıyor.'


const text = 'Aylık maaşından 5000 euro, yıllık 10000 euro ikramiye, ayda 15000 euro online kurstan kazanıyor.';
const numbers = text.match(/\d+/g).map(Number); 
const totalIncome = numbers.reduce((acc, curr) => acc + curr, 0); 
console.log(totalIncome);