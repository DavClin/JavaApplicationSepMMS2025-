import java.util.Set;
import java.util.HashSet;

public class UsingSet1 {
    public static void main(String[] args) {

        Set<String> studentEmail = new HashSet<>();

        studentEmail.add("nwekedavidclin@gmail.com");
        studentEmail.add("genisesdavidruth@gmail.com");
        studentEmail.add("nwekedavidjuly@gmail.com");
        studentEmail.add("nwekedavidjune@gmail.com");
        studentEmail.add("nwekezealloveth@gmail.com");
        studentEmail.add("nwekedavidfrank@gmail.com");
        studentEmail.add("nwekedavidjohn@gmail.com");
        studentEmail.add("nwekedavidmeme@gmail.com");
        studentEmail.add("nwekedavidpraise@gmail.com");
        studentEmail.add("nwekedavidzeal@gmail.com");
		
		for(String email : studentEmail){
			System.out.println(email);
		};

        System.out.println(studentEmail);

       //System.out.println("Does StudentID contains 103  " + studentI.contains(102));
		
		//System.out.println("Does StudentID contains 103  " + studentID.contains(104));
    }
}