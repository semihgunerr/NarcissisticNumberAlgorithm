NarcissisticNumber

*Bu Java programı, verilen bir sayının narsistik (narcissistic) bir sayı olup olmadığını kontrol eder. Bir sayı, her bir basamağının kendi basamak sayısının üssü alınarak elde edilen sayıların toplamına eşitse narsistik sayıdır.

Kullanım

*Program, kullanıcıdan bir sayı girmesini ister ve girilen sayının narsistik bir sayı olup olmadığını kontrol eder. Sonuç olarak, sayı narsistik ise bu durum belirtilir; değilse, sayının narsistik olmadığı belirtilir.

Kod Açıklaması


-countDigit(int num): Verilen sayının kaç basamaklı olduğunu hesaplar.
-isNarcissistic(int num): Sayının narsistik olup olmadığını kontrol eder. Sayının her bir basamağını, toplam basamak sayısının üssü olarak alır ve bu sayıların toplamını hesaplar. Eğer bu toplam, orijinal sayıya eşitse, sayı narsistik kabul edilir.
-Ana Metot: public static void main(String[] args)
-Scanner sc = new Scanner(System.in); : Kullanıcıdan giriş almak için kullanılır.
-int inputNumber = sc.nextInt(); : Kullanıcının girdiği sayıyı alır.
-isNarcissistic(inputNumber) : Sayının narsistik olup olmadığını kontrol eder ve sonucu ekrana yazdırır.

Örnek

Örneğin, 153 sayısını girdiğinizde program şu şekilde çalışacaktır:

Enter the number: 153
153 is a narcissistic number.
Çünkü 153 = 1³ + 5³ + 3³ olduğu için 153 narsistik bir sayıdır.

