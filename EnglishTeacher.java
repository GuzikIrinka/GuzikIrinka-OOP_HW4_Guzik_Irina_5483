public class EnglishTeacher extends Teacher{

    protected EnglishTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "EnglishTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}