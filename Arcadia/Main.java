// package Arcadia;
// abstract package Arcadia;
abstract class School{
    abstract static class Student{
        static int i=0;
        public void marks(){

        }
        static void display(){
            System.out.println(School.Student.i);
        }
    }
    public class Main extends School.Student{
        public void marks(){
            i=1;
        }
        public static void main(String[] args) {
            School.Student stu = new Main();
            stu.marks();
            School.display();
        }
    }

}
