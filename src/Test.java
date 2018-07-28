import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Product[] pro = new Product[2];

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pierwszego produktu:");
        pro[0].setName(scan.nextLine());
        System.out.println("Podaj nazwę producenta:");
        pro[0].setProducer(scan.nextLine());
        System.out.println("Podaj cenę:");
        pro[0].setPrice(scan.nextDouble());
        System.out.println("Podaj nazwę drugiego produktu:");
        pro[1].setName(scan.nextLine());
        System.out.println("Podaj producenta:");
        pro[1].setProducer(scan.nextLine());
        System.out.println("Podaj cenę:");
        pro[1].setPrice(scan.nextDouble());

    }
}