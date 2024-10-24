import java.util.Scanner;

public class Bai_1_1_6 {

    public static void GiaiPhuongTrinhBacNhatMotAn(double a, double b) {
        if(a == 0) {
            if(b == 0) System.out.println("Phuong trinh co vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.printf("Nghiem cua phuong trinh la: x = %.4f%n", (-b / a));
        }
    }

    public static void GiaiPhuongTrinhBacNhatHaiAn(double a11, double a12, double a21, double a22, double b1, double b2) {
        double D = a11 * a22 - a21 * a12;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        } else {
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.printf("Nghiem cua he phuong trinh la: x1 = %.4f, x2 = %.4f%n", x1, x2);
        }
    }

    public static void GiaiPhuongTrinhBacHaiMotAn(double a, double b, double c) {
        if(a == 0) {
            GiaiPhuongTrinhBacNhatMotAn(b, c);
            return;
        }

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = %.4f, x2 = %.4f%n", x1, x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Phuong trinh co nghiem kep: x = %.4f%n", x);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What kind of equation do you want to solve? Press");
        System.out.println("1 to solve The first-degree equation (linear equation) with one variable:" +
                "\n     a.x + b = 0");
        System.out.println("2 to solve The system of first-degree equations (linear system) with two variables:" +
                "\n     a11.x1 + a12.x2 = b1, a21.x1 + a22.x2 = b2");
        System.out.println("3 to solve The second-degree equation with one variable:" +
                "\n     a.x^2 + b.x + c = 0");

        System.out.print("Select the type of equation you want to solve: ");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.print("Nhap vao he so a: ");
                double a = sc.nextDouble();
                System.out.print("Nhap vao he so b: ");
                double b = sc.nextDouble();
                GiaiPhuongTrinhBacNhatMotAn(a, b);
                break;
            case 2:
                System.out.print("Nhap vao he so a11: ");
                double a11 = sc.nextDouble();
                System.out.print("Nhap vao he so a12: ");
                double a12 = sc.nextDouble();
                System.out.print("Nhap vao he so a21: ");
                double a21 = sc.nextDouble();
                System.out.print("Nhap vao he so a22: ");
                double a22 = sc.nextDouble();
                System.out.print("Nhap vao gia tri b1: ");
                double b1 = sc.nextDouble();
                System.out.print("Nhap vao gia tri b2: ");
                double b2 = sc.nextDouble();
                GiaiPhuongTrinhBacNhatHaiAn(a11, a12, a21, a22, b1, b2);
                break;
            case 3:
                System.out.print("Nhap vao he so a: ");
                a = sc.nextDouble();
                System.out.print("Nhap vao he so b: ");
                b = sc.nextDouble();
                System.out.print("Nhap vao he so c: ");
                double c = sc.nextDouble();
                GiaiPhuongTrinhBacHaiMotAn(a, b, c);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                break;
        }

        sc.close();
    }
}
