abstract class School{
    private void show(){
        System.out.println("school");
    }
    abstract static class Student{
        static  int i=0;
        public void marks(){};
    }
    static void display(){
        System.out.println(School.Student.i);
    }
}
public class Test extends School {
    // public void marks(){
    //     i=1;
    // }
    public static void main(String[] args) {
        
        // Student s0 = new Student();
        // Student s1 = new Student();
        // s0.marks(s1);
        // School.Student stu = new Test();
        // stu.marks();
        // School.display();
        Student s= new Student();
        System.out.println(s.marks);
    }
    
}
class Student{
    public int marks;
    public void marks(Student s1){
        System.out.println(this==s1);
    }
}
