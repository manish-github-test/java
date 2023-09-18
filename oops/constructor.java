
// copy the object to another object 

class Student {
    
    String name;
    int roll_no;
    int marks;
    public void studentinfo() {
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.marks);
    }
    Student (Student s3){
        this.name = s3.name;
        this.marks = s3.marks;
        this.roll_no= s3.roll_no;
    } 
    Student(){
        
    }
}
    public class constructor {
    
    public static void main(String[] args) {
        Student s1 = new Student();
s1.name = "manish";
s1.roll_no = 55;
s1.marks = 56;

 Student s2 = new Student(s1);
 
 Student s3 = new  Student(s2);
 s3.studentinfo();





    }
}
