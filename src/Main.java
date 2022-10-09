import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kelime , sonuc ="";
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        kelime=input.nextLine();
        int uzunluk = kelime.length(), orta = 0;


        // Kelime uzunlugu birden fazla ise gerekli işlemlere geç
        if (uzunluk > 1)
        {
            // Kelime uzunluğu tek bir sayı ise
            if (uzunluk % 2 == 1)
            {
                // Kelimenin orta noktasını bul ve harfi al
                orta = kelime.length() / 2;
                sonuc = String.valueOf(kelime.charAt(orta));
            }
            // Kelime uzunluğu çift haneli bir sayı ise
            else
            {
                // Kelimenin orta noktasını bularak önce ve sonrasındaki harfleri al
                orta = kelime.length() / 2;
                sonuc = kelime.charAt(orta - 1) + "" + kelime.charAt(orta);
            }
        }
        // Kelime 2 haneden kısa ise uğraşma, aynen geri döndür
        else
        {
            System.out.println(kelime);
        }

        System.out.println(sonuc);
    }
}