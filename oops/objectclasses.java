import java.text.StringCharacterIterator;

class Student {

    String name;
    int roll_no;
    int marks;

    public void studentinfo() {
System.out.println(this.name);
System.out.println(this.roll_no);
System.out.println(this.marks);
    }
}
class Pen{
float  height;
String color;
String brand;

public void write(){
System.out.println(this.brand);
System.out.println(this.height);
System.out.println(this.color);
System.out.println("something to write");
}
}

public class objectclasses {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "manish";
        s1.roll_no = 027;
        s1.marks = 80;
        s1.studentinfo();
        Student s2 = new Student();
        
        s2.name = "aman";
        s2.roll_no = 67;
        s2.marks = 85;
        s2.studentinfo();
        
    Pen p1 = new Pen();
    p1.brand = "fort";
    p1.color = "black";
    p1.height = (float)2.5;
    p1.write();
    
    }
}
