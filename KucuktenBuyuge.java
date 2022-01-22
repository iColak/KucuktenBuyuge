package kosulluIfadeler;
import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        int ilkSayi, ikinciSayi, ucuncuSayi;
        Scanner input = new Scanner (System.in);
        System.out.print("İlk sayı: ");
        ilkSayi = input.nextInt();
        System.out.print("İkinci sayı: ");
        ikinciSayi = input.nextInt();
        System.out.print("Üçüncü sayı: ");
        ucuncuSayi = input.nextInt();

        if (ilkSayi < ikinciSayi) {
            if (ikinciSayi < ucuncuSayi){
                System.out.println(ilkSayi + " < " + ikinciSayi + " < " + ucuncuSayi);
            }else if (ucuncuSayi < ilkSayi) {
                System.out.println(ucuncuSayi + " < " + ilkSayi + " < " + ikinciSayi);
            }else {
                System.out.println(ilkSayi + " < " + ucuncuSayi + " < " + ikinciSayi);
            }
        }else {
            if (ikinciSayi > ucuncuSayi){
                System.out.println(ucuncuSayi + " < " + ikinciSayi + " < " + ilkSayi);
            }else if (ucuncuSayi > ilkSayi) {
                System.out.println(ikinciSayi + " < " + ilkSayi + " < " + ucuncuSayi);
            }else {
                System.out.println(ikinciSayi + " < " + ucuncuSayi + " < " + ilkSayi);
            }
        }

    }
}
