package javabootcampweek1;
public class LetterGrade{
    public static void main(String [] args){
        int vize, final;
        double sonuc; 

        Scanner scan= new Scanner (System.in);
        System.out.println ("Vize Notunuzu Giriniz:");
        vize=scan.nextInt();

        System.out.println ("Final Notunuzu Giriniz:");
        final=scan.nextInt();

        sonuc=(vize*0.40 + final*0.60) ; //Vize notunun %40'ı Final notunun %60'ı alınır ve ortalama hesaplanır. //
        System.out.println ("Ders Notunuz: " + sonuc);

        if (sonuc>85){ //85 ve üstü AA//
            System.out.println ("Harf Notunuz AA");
        
        }
        else if (sonuc<85 && sonuc > 80) { // 85 ve 80 arası BA //
            System.out.println ("Harf Notunuz BA");
        }
        else if (sonuc<80 && sonuc>75){ //75 ve 80 arası BB//
            System.out.println("Harf Notunuz BB");
        
        }
        else if (sonuc<75 && sonuc>65 ){ //75 ve 65 arası CB//
            System.out.println ("Harf Notunuz CB");
        }
        else if (sonuc<65 && sonuc>60){ //65 ve 60 arası CC
            System.out.println ("Harf Notunuz CC");
        }
        else if (sonuc<60 && sonuc>55){ //55 ve 60 arası CD //
            System.out.println ("Harf Notunuz CD");

        }
        else if (sonuc<55 && sonuc>50){ // 55 ve 50 arası DD //
            System.out.println("Harf Notunuz DD");
        
        }
        else { //50'den düşük ortalama ise FF olarak görünüyor. //
            System.out.println("Harf Notunuz FF Başarısız Oldunuz!");

        }
    }
}