import java.util.Scanner;

public class sinhvien {
    private String masv;
    private String hoten;
    private int namsinh;
    private  String lop;
    public sinhvien (){}
    public sinhvien(String masv, String hoten, int namsinh, String lop)
    {
        this.masv=masv;
        this.hoten=hoten;
        this.namsinh=namsinh;
        this.lop=lop;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        masv=sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten=sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap lop: ");
        lop=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("" +
                "Ma: "+masv+"  || " +
                "Ho ten: "+hoten+"  || " +
                "Nam sinh: "+namsinh+"  || " +
                "Lop: "+lop);
    }
}
