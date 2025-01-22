public class NameChecker {
    public static void main(String[] args) {
    
        String[] names = {"Anna", "John", "Michał", "Ewa"};

      
        for (String name : names) {
          
            if (name.length() % 2 == 0) {
                System.out.println("Imię " + name + " ma parzystą liczbę liter.");
            } else {
                System.out.println("Imię " + name + " ma nieparzystą liczbę liter.");
            }
        }
    }
}
