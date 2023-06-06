import java.util.Scanner;

public class EkoBank {


    public static void main(String[] args) {

        int bakiye = 500;
        Scanner input = new Scanner(System.in);

        System.out.println("Ekobank Bankamatige Hosgeldin Sekerim");


        while(true) {

            System.out.println("**********");
            System.out.println("Islem Turunu Sec sekerim");
            System.out.println("1 Para Yatirma");
            System.out.println("2 Para Cekme  ");
            System.out.println("3 Bakiye Sorma");
            System.out.println("4 Cikis");

            Scanner scan = new Scanner(System.in);
            int islem = scan.nextInt();

            switch(islem)  {
                case 1:
                {
                    Scanner sca = new Scanner(System.in);
                    System.out.println("Yatirilacak Tutari Giriniz");
                    int a = sca.nextInt();
                    bakiye = bakiye+a;
                    System.out.println("Paraniz hesabiniza yatirildi sekerim.");
                    System.out.println("Bakiyeniz: "+bakiye);
                    System.out.println("Baska islem yapmak icin E ' ye bas sekerim.");
                    System.out.println("Cikis yapmak icin A ' ya bas sekerim");
                    System.out.print("Isleminiz: ");

                    Scanner sc = new Scanner(System.in);
                    String aaa = sc.nextLine();
                    switch(aaa) {
                        case "A":
                        {
                            break;
                        }
                        case "E":
                        {
                            continue;
                        }
                    }
                }
                case 2:
                {
                    Scanner sca = new Scanner(System.in);

                    System.out.print("Cekilecek Tutari Gir sekerim:");
                    int b = sca.nextInt();
                    if (bakiye < b) {
                        System.out.println("Bakiyen yetersiz sekerim. Tekrar dene belki gelir.");
                        continue;
                    }
                    else {
                        bakiye=bakiye-b;
                        System.out.println("Para cekme islemin basariyla gerceklesti sekerim");
                        System.out.println("Bakiyeniz: "+bakiye);
                        System.out.println("Baska islem yapmak icin E ' ye bas sekerim.");
                        System.out.println("Cikis yapmak icin A ' ya bas sekerim");
                        System.out.print("Isleminiz: ");

                        Scanner inp = new Scanner(System.in);
                        String a = inp.nextLine();
                        switch(a) {
                            case "A":
                            {
                                break;
                            }
                            case "E":
                            {
                                continue;
                            }
                        }
                    }}

                case 3:
                {


                    System.out.println("Bakiyeniz: "+bakiye);
                    System.out.println("Baska islem yapmak icin E ' ye bas sekerim.");
                    System.out.println("Cikis yapmak icin A ' ya bas sekerim");
                    System.out.print("Isleminiz: ");

                    Scanner i = new Scanner(System.in);
                    String ss = i.nextLine();
                    switch(ss) {
                        case "A":
                        {
                            break;
                        }
                        case "E":
                        {
                            continue;
                        }
                    }
                }
                case 4:
                {
                    System.out.println("Cikis Yapiliyor bekle sekerim.");
                    break;
                }
            }


        }
    }
}
