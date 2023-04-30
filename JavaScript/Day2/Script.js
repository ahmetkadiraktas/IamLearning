// Write a script that prompt the user to enter base and height of the triangle and calculate an area of a triangle (area = 0.5 x b x h).

let base = prompt("Lütfen üçgenin tabanını girin:");
let height = prompt("Lütfen üçgenin yüksekliğini girin:");

let area = 0.5 * base * height;

console.log("Üçgenin alanı: " + area);




// Write a script that prompt the user to enter side a, side b, and side c of the triangle and and calculate the perimeter of triangle (perimeter = a + b + c)
let kenar1 = parseFloat(prompt("Lütfen bir kenear uzunluğu girin:"));
let kenar2 = parseFloat(prompt("Lütfen bir kenear uzunluğu girin:"));
let kenar3 = parseFloat(prompt("Lütfen bir kenear uzunluğu girin:"));

let cevre  = kenar1+kenar2+kenar3

console.log("Üçgenin alanı: " + cevre);



let uzunluk = parseFloat(prompt("Lütfen dikdörtgenin uzunluğunu girin: "));
let genislik = parseFloat(prompt("Lütfen dikdörtgenin genişliğini girin: "));

let alan = uzunluk * genislik;
let ceevre = 2 * (uzunluk + genislik);

console.log("Dikdörtgenin alanı: " + alan);
console.log("Dikdörtgenin çevresi: " + ceevre);