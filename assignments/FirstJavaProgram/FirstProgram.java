public class FirstProgram {

    public static void main(String[] args) {

        String name = "Tyler's Dojo";
        int age = 39;
        String hometown = "Santa Clarita, CA";
        
        System.out.printf("""
            My name is %s
            I am %d years old
            My hometown is %s            
                """, name, age, hometown);
    }
    
}
