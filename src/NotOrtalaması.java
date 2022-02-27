import java.util.Scanner;

public class NotOrtalaması {

    public static void main(String[] args) {
	int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("matematik notunuz: ");
        mat= inp.nextInt();
        System.out.println("fizik notunuz: ");
        fizik=inp.nextInt();
        System.out.println("kimya notunuz: ");
        kimya=inp.nextInt();
        System.out.println("türkçe notunuz: ");
        turkce=inp.nextInt();
        System.out.println("tarih notunuz: ");
        tarih=inp.nextInt();
        System.out.println("müzik notunuz: ");
        muzik=inp.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6.0;
        System.out.println("ortalamanız: "+sonuc);

        String durum=(sonuc>=60)?"geçti":"kaldı";
        System.out.println(durum);



    }
}
