import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Không thể giải phương trình nếu a = 0.");
            return;
        }
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta = " + quadraticEquation.getDelta());

        if (quadraticEquation.getDelta()==0){
            System.out.println("Phương trình có 1 nghiệm là : " + quadraticEquation.motNghiem());
        }else if (quadraticEquation.getDelta()<0){
            System.out.println("Phương trình vô nghiệm");
        }else if (quadraticEquation.getDelta()>0){
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("Nghiệm 1 là: " + quadraticEquation.getRoot1() + "\nNghiệm 2 là: " + quadraticEquation.getRoot2());
        }
    }
}