import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int yıl,birler,yüzler,binler,dt,rt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        dt=sc.nextInt();
        yıl=dt;
        birler=yıl%10;
        yıl=yıl-birler;
        yüzler=yıl%100;
        yıl=yıl-yüzler;
        yüzler=yüzler/10;
        binler=yıl%1000;
        binler=binler/100;
        yıl=yıl-binler;
        yıl=yıl/1000;
        if (birler == 0 && yüzler ==0)
        {

            if (dt%400 == 0){
                System.out.println(dt+" "+"Artık Yıldır.");
            }
            else {
                System.out.println(dt+" " +"Artık Yıl Değildir.");
            }
        }
        else {
            rt=binler+yüzler+birler+yıl;
            if (dt%rt ==0){
                System.out.println(dt+" "+" Artık Yılıdır.");
            }
            else {
                System.out.println(dt+" "+"Artık Yıl Değildir.");
            }
        }

    }
}