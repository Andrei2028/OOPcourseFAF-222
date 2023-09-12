public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInitials() {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            return "";
        }

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        return String.format("%c. %c.", firstInitial, lastInitial);
    }
}
