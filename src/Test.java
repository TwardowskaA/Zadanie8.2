import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Product[] pro = new Product[2];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {

            System.out.println("Podaj nazwy produktów");
            pro[i].setName(scan.nextLine());

            if (pro[0].setName(scan.nextLine()) == pro[1].setName(scan.nextLine())) {
                System.out.println("W tablicy jest już taki element");
            } else {
                System.out.println("Podaj nazwę");
                pro[i].setName(scan.nextLine());
                {

            System.out.println("Podaj cenę:");
            pro[i].setPrice(scan.nextDouble());

            if (pro[0].setPrice(scan.nextDouble() == pro[1].setPrice(scan.nextDouble())) {
                    System.out.println("W tablicy jest już taki element");
                } else{
                    System.out.println("Podaj cenę");
                    pro[i].setPrice(scan.nextDouble());

                }

                }
            }
        }
    }
}