import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static void main(String[] args) {
        User boris = new User("borisdz","ilijablablabla","borisdzotov@gmail.com");

        List<String> allUsers=new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        allUsers.add("borisdz");
        allUsers.add("ilijadz");
        allUsers.add("mihaildz");
        allUsers.add("magdalenadz");
        function(boris,allUsers);
    }

    public static boolean function (User user, List<String> allUsers) {
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";   //A
        if (user==null) {   //B
            throw new RuntimeException("The user is not instantiated"); //C
        }
        if (user.getUsername()==null || user.getPassword()==null)   //D
            throw new RuntimeException("The user is missing some mandatory information");   //E
        String password = user.getPassword();   //F
        String passwordLower = password.toLowerCase();  //G
        if (passwordLower.contains(user.getUsername().toLowerCase())) {     //H
            return false;   //I
        }
        else if (passwordLower.length()<8)  //J
            return false;   //K
        else {  //L
            boolean digit = false, upper = false, special = false;  //M

            for (int i=0;i<password.length();i++) { //N = int i = 0; O = i < password.length; P = i++
                if (Character.isDigit(password.charAt(i)))  //Q
                    digit = true;   //Q
                if (Character.isUpperCase(password.charAt(i)))  //Q
                    upper = true;   //Q
                if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //Q
                    special = true; //Q
            }
            if (!digit || !upper || !special)   //R
                return false;   //S
        }
        return true;    //T
    }
}