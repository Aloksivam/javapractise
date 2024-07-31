abstract class Teacher{
    private void show(){
        System.out.println("Teacher");
    }
}

public class Student extends Teacher{
    protected void show(){
        System.out.println("student");
    }
    public static void main(String[] args) {
        Teacher t = new Student();
        // t.show();
    }
}
