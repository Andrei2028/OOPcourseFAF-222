public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInitials() {
        // Check if either first name or last name is null or empty
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            return "";
        }

        // Extract the first character of each name and format it as "X. Y."
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        return String.format("%c. %c.", firstInitial, lastInitial);
    }
}
