package Collections;
import java.util.Scanner;
import java.util.LinkedList;
public class Main_LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        //Nhap danh sach
        for(int i = 0; i<10;i++){
            System.out.println("Nhap arr["+ (i+1)+"]: ");
            linkedList.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(linkedList);
        //Xuat Phan tu dau tien va cuoi cung
        System.out.println("Phan tu dau tien: "+ linkedList.getFirst());
        System.out.println("Phan tu cuoi cung: "+ linkedList.getLast());
        //them 1 phan tu vao dau
        System.out.println("Danh sach sau khi them 1 phan tu vao dau danh sach: ");
        linkedList.addFirst(10);
        System.out.println(linkedList);
        //them 1 phan tu vao cuoi mang
        System.out.println("Danh sach sau khi them 1 phan tu vao cuoi danh sach: ");
        linkedList.addLast(11);
        System.out.println(linkedList);
        //Tim Kiem 1 phan tu trong Linked List
        System.out.println("Nhap so can tim: ");
        int numberSearch = Integer.parseInt(scanner.nextLine());
        if(linkedList.contains(numberSearch)){
            System.out.println("So can tim co trong danh sach: ");
        }else {
            System.out.println("So can tim khong ton tai trong danh sach");
        }
        //update 1 phan tu trong Linked list
        System.out.println("Danh sach sau khi update phan tu so 3: ");
        linkedList.set(3,100);
        System.out.println(linkedList);
        //xoa nhieu phan tu trong Linked List
        System.out.println("Danh sach sau khi xoa nhieu phan tu: ");
        linkedList.remove(5);
        System.out.println(linkedList);
    }

}
