import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bạn hãy nhập một số nguyên dương bất kỳ😁: ");
        int so = Integer.parseInt(sc.nextLine());
        int donVi = so % 10;
        int chuc = (so / 10) % 10;
        int tram = so / 100;
        switch (tram) {
            case 1:
                System.out.printf("Một trăm");
                break;
            case 2:
                System.out.printf("Hai trăm");
                break;
            case 3:
                System.out.printf("Ba trăm");
                break;
            case 4:
                System.out.printf("Bốn trăm");
                break;
            case 5:
                System.out.printf("Năm trăm");
                break;
            case 6:
                System.out.printf("Sáu trăm");
                break;
            case 7:
                System.out.printf("Bảy trăm");
                break;
            case 8:
                System.out.printf("Tám trăm");
                break;
            case 9:
                System.out.printf("Chín trăm");
                break;
        }
        switch (chuc) {
            case 0:
                if (tram == 1 ||tram == 2 ||tram == 3 ||tram == 4 ||tram == 5 ||tram == 6 ||tram == 7 ||tram == 8 ||tram == 9){
                    if (donVi !=0){
                        System.out.printf(" lẻ ");
                    }
                }
                break;
            case 1:
                System.out.printf("mười ");
                break;
            case 2:
                System.out.printf(" hai mươi ");
                break;
            case 3:
                System.out.printf(" ba mươi ");
                break;
            case 4:
                System.out.printf(" bốn mươi ");
                break;
            case 5:
                System.out.printf(" năm mươi ");
                break;
            case 6:
                System.out.printf(" sáu mươi ");
                break;
            case 7:
                System.out.printf(" bảy mươi ");
                break;
            case 8:
                System.out.printf(" tám mươi ");
                break;
            case 9:
                System.out.printf(" chín mươi ");
                break;
        }
        switch (donVi) {
            case 1:
                System.out.printf("một");
                break;
            case 2:
                System.out.printf("hai");
                break;
            case 3:
                System.out.printf("ba");
                break;
            case 4:
                System.out.printf("bốn");
                break;
            case 5:
                System.out.printf("năm");
                break;
            case 6:
                System.out.printf("sáu");
                break;
            case 7:
                System.out.printf("bảy");
                break;
            case 8:
                System.out.printf("tám");
                break;
            case 9:
                System.out.printf("chín");
                break;
        }
    }
}