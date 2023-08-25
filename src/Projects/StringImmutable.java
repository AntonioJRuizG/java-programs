package Projects;

public class StringImmutable {
    public static void main(String[] args)
    {
        String s1 = "JAVA";
        String s2 = "JAVA";

        System.out.println(s1 == s2);         //Output : true

        s1 = s1 + "J2EE";

        System.out.println(s1 == s2);         //Output : false

        // s1 and s2 are pointing to two different object in memory.
    }
}
