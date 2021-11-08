import java.util.Scanner;

public class AppleLink {
    Node head = null;
    Node tail = null;
    Scanner nhap = new Scanner(System.in);
    int ma;
    double khoiLuong;
    String mausac;
    public AppleLinkedList(){}
    public void nhapThongtin(){
        System.out.print("- Nhập mã của táo: ");
        ma = nhap.nextInt();
        System.out.print("- Nhập khối lượng của táo: ");
        khoiLuong = nhap.nextDouble();
        System.out.print("- Nhập màu sắc của táo: ");
        nhap.nextLine();
        mausac = nhap.nextLine();
        System.out.println("______________________");

    }
    public void inThongTin(){
        Node current = head;

        if(head == null){
            System.out.println("- DANH SÁCH RỖNG.");
        }else{
            while(current != null){
                System.out.println("- Mã: "+current.ma);
                System.out.println("- Khối lượng: "+current.khoiLuong);
                System.out.println("- Màu sắc: "+current.mausac);
                System.out.println("_________________________");
                current = current.next;
            }
        }
    }
    public void addHead(){
        nhapThongtin();
        Node newNode = new Node(ma, khoiLuong, mausac);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addTail(){
        nhapThongtin();
        Node newNode = new Node(ma, khoiLuong, mausac);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void tim(){
        Node tam1 = head;
        System.out.print("- Nhập mã táo muốn tìm: ");
        int maTim = nhap.nextInt();
        while(tam1 != null){
            if(tam1.ma == maTim)
                System.out.println("- Táo muốn tìm: ");
                inThongTin();
            tam1 = tam1.next;
        }
        
    }
    void removeTail(){
        Node tam = head;
        if(head == null){
            System.out.println("- DANH SÁCH RỖNG");
            return;
        }
        while(tam != null){
            if(tam.next == tail){
                tail = tam;
                tail.next = null;
                return;
            }
            tam = tam.next;
        }
    }
    void themTruoc(){
        System.out.println("- Nhập mã của táo bạn muốn thêm trước: ");
        ma = nhap.nextInt();
        tim();
        System.out.println("- Nhập táo bạn muốn thêm: ");
        nhapThongtin();
        

    }
    
}
