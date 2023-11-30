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

* Phạm vi truy cập của biến:

   ![public,private...](https://github.com/nonghoangls/OOP/assets/85739308/7ef08ac0-922a-4744-823d-19feb3e623b5)

  - Public: truy cập và đc truy cập vào tất cả các values
  - Private: truy cập đc trong 1 class thôi
  - Default: mặc định nếu như không khai báo gì - phạm vi truy cập nội bộ 1 package
  - Protected: phạm vi truy cập trong và ngoài package nhưng phải thông qua tính kế thừa

* Các tính chất của OOP
  - Tính Đóng Gói(Encasulation): là việc "gói gọn" dữ liệu và các phương thức xử lý trong đối tượng nhằm ngăn chặn sự truy cập trực tiếp từ bên ngoài, che dấu thông tin bla bla..
    VD: hiểu nôm na ở đây ta có 1 cái hộp,trong đó ta để các item như bim bim,kẹo mút,sữa ông thọ,ba con sói..xong đó ta lấy băng dính dính chặt cái hộp lại và gọi 1 thằng ship đến để giao đồ đến điểm A. Lúc này thằng ship nó chỉ biết thứ nó ship là cái hộp chứ nó k biết thứ bên trong nó đem đi ship là gì và đó chính là tính chất đóng gói trong OOP
    + thuộc tính của class là private và muốn lấy các thuộc tính đó thì phải thông qua hàm get & set
    + Việc sử dụng tính đóng gói là rất quan trọng trong lập trình! nhằm để bảo vệ nhưng thông tin nhạy cảm hoặc sự truy cập trái phép từ 1 bên nào đó.
  VD: public class conNguoi() {
           private int CCCD;
           private int age;
           public String name;
           //đang sử dụng tính đóng gói
}
      
  - Tính Kế Thừa(Inheritance): Kể thừa là sự thừa hưởng. những gì mà class cha có thì class con sẽ đc thừa hưởng nhưng những gì class con có thì chưa chắc class cha có
    + Có method Overriding(ghi đè)(cũng có thể overload)
    + Java không hỗ trợ đa kế thừa(note: đơn kế thừa với lớp nhưng có thể đa kế thừa với interface), chỉ có đơn kế thừa 1 class con kế thừa 1 class ch, vì thế có interface xuất hiện
    + Đa kế thừa thì có interface(bản chất của interface là chỉ muốn nêu ra thứ nó muốn làm còn việc thực hiện sẽ do lớp con implements đó thực hiện)
    + VD: có interface nó có các chức năng như rút tiền hay tán gái
          interface nó sẽ k nói cách rút tiền hay tán gái là như nào mà nó sẽ cho thằng class thực hiện các chức năng đó
    
  - Tính Đa Hình(Polymorphism): (Linh hoạt) Đa hình là cùng 1 method nhưng method đó có thể thực hiện nhiều chức năng khác, thực hiện với inherit và interface
    + Có 2 loại đa hình: Đa hình trong thời gian chạy(liên quan đến tc kế thừa và method overriding là sự lựa chọn; biến của class cha có thể tham chiếu đc đến biến của class con), Đa hình thời gian chạy và thời gian biên dịch(overloading)
    + Method thực hiện tính đa hình này có thể kể đến là Overload(overriding cũng đc)
      
  - Tính Trừu Tượng(Abstraction): Lớp và phương thức trừu tượng đc cho là ko cụ thể của class cha -> thay vào đó class con sẽ thực hiện hoá cụ thể phương thức của class cha
    + Abstract class: là một lớp bị hạn chế ko đc sử dụng để tạo đối tượng(để truy cập nó, nó phải đc kế thừa từ một class khác)
    + Abstract method: chỉ sử dụng đc khi nó bên trong 1 abstract class, và nó ko có phần body. Body của nó sẽ đc phát triển trong class con kế thừa từ nó
    + Không thể tạo một đối tượng từ 1 class Abstract. Muốn tạo 1 đối tượng thì phải có 1 class con kế thừa từ class abstract cha
   
* Phương thức khởi tạo (Constructor): là 1 phương thức đặc biệt trong OOP, nó đc sử dụng để khởi tạo một đối tượng khi nó tạo ra((là dùng từ khóa new đấy)
  VD: Vietnampeople vn = new Vietnampeople("Hoang ngu", 20, 1.6f);
  - Vai trò của constructor:
    + Khởi tạo các thuộc tính của đối tượng.
    + Thiết lập các giá trị mặc định cho các thuộc tính của đối tượng.
    + Khởi tạo các đối tượng khác mà đối tượng hiện tại cần để thực hiện các chức năng của nó
    
  - Một class có thể có nhiều phương thức khởi tạo
  -  Constructor ko trả về dữ liệu gì hết, tên costructor giống với tên class luôn
  - Nếu như không khai báo phương thức khởi tạo thì mặc định jvm sẽ tạo phương thức khởi tạo cho mình
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
   - Có 2 kiểu overloading:
     + Function overloading: 1 hàm có thể cùng tên với nhau nhưng tham số hoặc số lượng tham số phải khác nhau
       ![Screenshot 2023-11-30 145758](https://github.com/nonghoangls/OOP/assets/85739308/bfce9388-5502-43e3-bcd7-ce04c5503ed6)
     + Operator overloading: Các toán tử có thể đc dùng trực tiếp với các đối tượng
       ![Screenshot 2023-11-30 150157](https://github.com/nonghoangls/OOP/assets/85739308/3cc6131a-9c50-482b-b295-d79b30a2b6ed)


 * Getter and Setter: đc dùng khi các biến để ở chế độ private
   + Get là lấy ra dữ liệu(ko nhận gì nhưng phải return ra)
   + Set là thêm(thay đổi) dữ liệu
* Phân biệt Abstract class và Interface
  - Abs class nó chỉ là 1 lớp nên nó đơn kế thừa có các thuộc tính
  - Interface nó cho phép đa kế thừa và nó k có thuộc tính (nếu có thuộc tính thì đó là các hằng)
  - Giống nhau
    + Đều đc sử dụng để đạt đc tính trừu tượng trong OOP
    + Đều đc sử dụng trong kế thừa
    + Đều có thể chứa cả method và các trường dữ liệu
    + Đều không thể tạo ra đối tượng cụ thể(tạo ra cái new new đấy) với keyword new
- Khác nhau
  + ![khác nhau 1](https://github.com/nonghoangls/OOP/assets/85739308/229515a8-b283-44ec-a689-83d99e003cad)
  + ![khác nhau 2](https://github.com/nonghoangls/OOP/assets/85739308/ea733dc4-fb28-4380-8406-6b56ac057f83)
  + ![khác nhau 3](https://github.com/nonghoangls/OOP/assets/85739308/bb0e4556-31ea-43bf-9bcc-d12edd995cd3)
* Từ khoá this và super
  - So sánh this và super: từ khóa this và super đều là các biến tham chiếu, nhưng chúng có những điểm khác biệt cơ bản sau:
    + This tham chiếu đến đối tượng hiện tại, trong khi super tham chiếu đến đối tượng cha của đối tượng hiện tại.
    + This có thể được sử dụng trong bất kỳ lớp nào, trong khi super chỉ có thể được sử dụng trong các lớp con.


* Lập trình hướng cấu trúc vs hướng đối tượng
  - Lập trình hướng đối tượng dựa trên khái niệm lập trình đối tượng. OOP cho phép các nhà phát triển chia nhỏ chương trình thành các đối tượng độc lập, mỗi đối tượng có thể chứa dữ 
    liệu và các phương thức để thao tác dữ liệu đó.
  - Lập trình hướng cấu trúc thì khái niệm lập trình chương trình kiểu có các hàm và thủ tục, mỗi hàm và thủ tục có 1 chức năng và nhiệm vụ nào đó.
  - OOP sẽ có nhiều ưu điểm hơn lập trình hướng cấu trúc vì nó có khả năng tái sử dụng cao, tính bảo mật,bảo trì tốt hơn và có khả năng mở rộng để dễ dàng upgrade hơn...






    
