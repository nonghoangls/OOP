# OOP
Try Hard OOP

* Lập trình hướng đối tượng (OOP) là gì?
- Là phương pháp lập trình mà trong đó chương trình đc tổ chức như một tập hợp các đối tượng,trong đó mỗi
  đối tượng có các method(phương thức),properties(thuộc tính)
  + Thuộc tính là những thông tin của object(vd:O(con người): height,weight,age...)
  + Phương thức là những thứ mà object có thể thực hiện đc
    vd:con người: chạy, nhảy, bơi,ăn uống....
    ==> quy bài toán về các đối tượng, mỗi đối tượng lại có các thuộc tính và phương thức ==> thì gọi là lập trình hướng đối tượng
    
* Class: ví như là loài của đối tượng
  VD: Car là một loại phương tiện. Các loại xe như Mec,Masserati,Audi sẽ là các object của Car(vì các loại xe trên đều có các thuộc tính và phương thức của lớp Car)

* Object: là đối tượng thể hiện(instance) của một class
VD: xe Mec là đối tượng của lớp Car,xe Mec có các thuộc tính như có 4 bánh,màu sơn,hãng sx..và có các method như tăng ga,đá số...

* Phạm vi truy cập của biến
  - Public: truy cập và đc truy cập vào tất cả các value
  - Private: truy cập đc trong 1 class thôi
  - Default: mặc định nếu như không khai báo gì - phạm vi truy cập nội bộ 1 package
  - Protected: phạm vi truy cập trong và ngoài package nhưng phải thông qua tính kế thừa

* Các tính chất của OOP
  - Tính Đóng Gói(Encasulation): hiểu nôm na ở đây ta có 1 cái hộp,trong đó ta để các item như bim bim,kẹo mút,sữa ông thọ,ba con sói..xong đó ta lấy băng dính dính chặt cái hộp lại và gọi 1 thằng ship đến để giao đồ đến điểm A. Lúc này thằng ship nó chỉ biết thứ nó ship là cái hộp chứ nó k biết thứ bên trong nó đem đi ship là gì và đó chính là tính chất đóng gói trong OOP
    + Việc sử dụng tính đóng gói là rất quan trọng trong lập trình! nhằm để bảo vệ nhưng thông tin nhạy cảm hoặc sự truy cập trái phép từ 1 bên nào đó.
  VD: public class conNguoi() {
           private int CCCD;
           private int age;
           public String name;
           //đang sử dụng tính đóng gói
}
      
  - Tính Kế Thừa(Inheritance): Kể thừa là sự thừa hưởng. những gì mà class cha có thì class con sẽ đc thừa hưởng nhưng những gì class con có thì chưa chắc class cha có
    + Có method Overriding(ghi đè)(cũng có thể overload)
    + Java không hỗ trợ đa kế thừa, vì thế có interface xuất hiện
    
  - Tính Đa Hình(Polymorphism): (Linh hoạt) Đa hình là cùng 1 method nhưng method đó có thể thực hiện nhiều chức năng khác, thực hiệm với inherit và interface
    + Method thực hiện tính đa hình này có thể kể đến là Overload(overriding cũng đc)
      
  - Tính Trừu Tượng(Abstraction): Lớp và phương thức trừu tượng đc cho là ko cụ thể của class cha -> thay vào đó class con sẽ thực hiện hoá cụ thể phương thức của class cha
    + Abstract class: là một lớp bị hạn chế ko đc sử dụng để tạo đối tượng(để truy cập nó, nó phải đc kế thừa từ một class khác)
    + Abstract method: chỉ sử dụng đc khi nó bên trong 1 abstract class, và nó ko có phần body. Body của nó sẽ đc phát triển trong class con kế thừa từ nó
    + Không thể tạo một đối tượng từ 1 class Abstract. Muốn tạo 1 đối tượng thì phải có 1 class con kế thừa từ class abstract cha
   
* Phương thức khởi tạo (Constructor): là 1 phương thức đặc biệt trong OOP, nó đc sử dụng để khởi tạo một đối tượng khi nó tạo ra((là dùng từ khóa new đấy)
  VD: Vietnampeople vn = new Vietnampeople("Hoang ngu", 20, 1.6f);
  + Một class có thể có nhiều phương thức khởi tạo
  +  Constructor ko trả về dữ liệu gì hết, tên costructor giống với tên class luôn
  + Nếu như không khai báo phương thức khởi tạo thì mặc định jvm sẽ tạo phương thức khởi tạo cho mình
 VD: public class Persons {

	protected String name;
	protected int age;
	protected float height;
	
	public Persons(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
//  constractor này có tham số truyền vào là name,age,height đó
	}
 }

 VD2:public class Persons {

	protected String name;
	protected int age;
	protected float height;
	
	public Persons() {
	}
 //đây là 1 constractor rỗng và nó là default luôn
 }

 * Overriding(ghi đè): giúp các method của class con có thể ghi đè lên method của class cha
 * Overloading(nạp chồng): là tên của phương thức có thể giống nhau nhưng tham số truyền vào phải khác nhau

 * Getter and Setter: đc dùng khi các biến để ở chế độ private
   + Get là lấy ra dữ liệu(ko nhận gì nhưng phải return ra)
   + Set là thêm(thay đổi) dữ liệu
