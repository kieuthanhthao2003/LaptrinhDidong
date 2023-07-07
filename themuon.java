import java.util.Scanner;

public class themuon extends sinhvien {
    private int sophieumuon;
    private int ngaymuon;
    private int hantra;
    private int sohieusach;
    public themuon(){}
    public themuon(String masv, String hoten, int namsinh, String lop,
                   int sophieumuon, int ngaymuon, int hantra, int sohieusach)
    {
        super(masv, hoten, namsinh, lop);
        this.sophieumuon=sophieumuon;
        this.ngaymuon=ngaymuon;
        this.hantra=hantra;
        this.sohieusach=sohieusach;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phieu muon: ");
        sophieumuon=sc.nextInt();
        System.out.print("Nhap ngay muon: ");
        ngaymuon=sc.nextInt();
        System.out.print("Nhap han tra: ");
        hantra=sc.nextInt();
        System.out.print("Nhap so hieu sach: ");
        sohieusach=sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("" +
                "So phieu muon: "+sophieumuon+"  || " +
                "Ngay muon: "+ngaymuon+"  || " +
                "Han tra: "+hantra+"  || " +
                "So hieu sach: "+sohieusach);
    }
    public void menu()
    {
        System.out.println("1. Nhap thong tin cac the muon");
        System.out.println("2. Xuat thong tin cac the muon");
        System.out.println("3. In ra thong tin the muon sinh vien lop CNTT");
        System.out.println();
    }
    public static void main(String[] args) {
        themuon themuon=new themuon();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n=sc.nextInt();
        themuon a[]=new themuon[n];
        int lc;
        do {
            themuon.menu();
            System.out.print("Nhap lua chon: ");
            lc=sc.nextInt();
            switch (lc)
            {
                case 1:
                {
                    System.out.println("-----NHAP THONG TIN CAC THE MUON-----");
                    for (int i=0; i<n;i++)
                    {
                        System.out.println("Nhap vao thong tin thu "+(i+1)+": ");
                            a[i]=new themuon();
                            a[i].nhap();
                        }
                    }
                break;
                case 2:
                {
                    System.out.println("-----XUAT THONG TIN CAC THE MUON-----");
                    for (int i=0; i<n ;i++)
                    {
                        System.out.println("Xuat thong tin thu "+(i+1)+": ");
                            a[i].xuat();
                    }
                }
                break;
                case 3:
                {
                    System.out.println("-----IN RA THONG TIN THE MUON SINH VIEN LOP CNTT-----");
                    String x;
                    x=sc.nextLine();
                    for (int i=0;i<n;i++)
                    {
                        if (a[i].getLop().equalsIgnoreCase("CNTT"))
                        {
                            a[i].xuat();
                        }
                    }
                }
                break;
            }
        }while (lc!=3);
    }
}

