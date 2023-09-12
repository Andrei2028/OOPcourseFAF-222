public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ion", "Doe");
        User user2 = new User("Miley", "Cyrus");

        System.out.println(user1.getInitials());
        System.out.println(user2.getInitials());
    }
}
