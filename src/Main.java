import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method method = new Method();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Quản lý học sinh:");
            System.out.println("2. Quản lý hồ sơ học sinh: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("1. Thêm học sinh: ");
                    System.out.println("2. Danh sách quê học sinh: ");
                    System.out.println("3. Danh sách các học sinh học lớp:");
                    int choise2 = Integer.parseInt(sc.nextLine());
                    switch (choise2) {
                        case 1:
                            System.out.println("Tên học sinh:");
                            String name = sc.nextLine();
                            System.out.println("Ngày sinh: ");
                            String birthDay = sc.nextLine();
                            System.out.println("Quê quán:");
                            String queQuan = sc.nextLine();
                            System.out.println("Thêm mã số học sinh:");
                            int Id = Integer.parseInt(sc.nextLine());
                            HocSinh hocSinh = new HocSinh(name,birthDay,queQuan,Id);
                            method.addHocSinh(hocSinh);
                            break;
                        case 2:
                            System.out.println("Ở:");
                            String que = sc.nextLine();
                            for (HocSinh h: method.hocSinhs) {
                                if (que == h.getQueQuan());
                                System.out.println(h.toString());
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Thêm hồ sơ:");
                    System.out.println("2. Hiển thị danh sách hố sơ:");
                    int choise3 = Integer.parseInt(sc.nextLine());
                    switch (choise3) {
                        case 1:
                            System.out.println("Thêm tên lớp:");
                            String tenLop = sc.nextLine();
                            System.out.println("Tên khóa học: ");
                            String tenKhoaHoc = sc.nextLine();
                            System.out.println("Kỳ học: ");
                            int kyhoc = Integer.parseInt(sc.nextLine());
                            HoSo hoSo = new HoSo();
                    }

            }
        }while (true);
    }
}
