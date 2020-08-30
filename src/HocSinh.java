public class HocSinh {
    private String Name;
    private String ngaySinh;
    private String queQuan;
    private int IdHocsinh;

    public HocSinh() {
    }

    public HocSinh(String name, String ngaySinh, String queQuan, int idHocsinh) {
        this.Name = name;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.IdHocsinh = idHocsinh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getIdHocsinh() {
        return IdHocsinh;
    }

    public void setIdHocsinh(int idHocsinh) {
        IdHocsinh = idHocsinh;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "Name='" + Name + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", IdHocsinh=" + IdHocsinh +
                 "} \n";
    }
}

