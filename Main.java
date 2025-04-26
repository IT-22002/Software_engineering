package mainpack;
import com.Status;
import com.Status1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Self Status ...set with setter\n");
        Status status = new Status();
        status.setName("Atif");
        status.setAge(22);
        System.out.println("Name:"+status.getName());
        System.out.println("Age:"+status.getAge());
        status.SelfStatus();

        System.out.println("Self Status object ...set with cons\n");
        Status1 status1 = new Status1("Atif",22);
        System.out.println("Name:"+status1.getName1());
        System.out.println("Age:"+status1.getAge1());
        status1.SelfStatus();


    }
}
