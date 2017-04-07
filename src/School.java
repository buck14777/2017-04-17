/**
 * Created by USER on 2017/4/7.
 */
public class School {
    public static void main(String arg[]){
        Teacher tea1 = new Teacher("peter","999636363");
        Student stud1 = new Student("jack","106000000");
        Stuff stf1 = new Stuff("aaa","000000001");
        System.out.println(stud1.getName());
        System.out.println(stud1.getId());
        System.out.println(tea1.getName());
        System.out.println(tea1.getId());
        System.out.println(stf1.getName());
        System.out.println(stf1.getId());
    }
}
