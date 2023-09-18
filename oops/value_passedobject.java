
class Student{
    String name;
    int roll_no;
    String branch;
     public void studentinfo(){
        System.out.println(this.branch);
        System.out.println(this.roll_no);
        System.out.println(this.name);
     }


    
    Student(String name,int roll_no,String branch){
        this.branch = branch;
        this.roll_no = roll_no;
        this.name = name;

    }
}

public class value_passedobject {
public static void main(String[] args) {
    Student s1 = new Student("aman", 24,"AIML");
    s1.studentinfo();

}
}
