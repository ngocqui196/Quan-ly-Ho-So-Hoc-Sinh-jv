import java.util.ArrayList;
import java.util.List;

public class Method {
    static List<HocSinh> hocSinhs = new ArrayList<>();
    static List<HoSo> hoSos = new ArrayList<>();

    public static void addHocSinh(HocSinh hocSinh) {
        hocSinhs.add(hocSinh);
    }

    public static HocSinh getCustomerByIdHocSinh(int id) {
        HocSinh hocSinh = new HocSinh();
        for (HocSinh hSinh : hocSinhs) {
            if (id == hSinh.getIdHocsinh()) {
                hocSinh = hSinh;
            }
        }
        return hocSinh;
    }
}
