public class Passenger {
    private String title;
    private String firstName;
    private String lastName;


    public Passenger(String title, String firstName, String lastName) //constructor
    {
        if(!title.equals("Mr") && !title.equals("Mrs")&& !title.equals("Ms")){
            throw new IllegalArgumentException("Invalid Passenger Title");
        }
        if(firstName == null || firstName.length() <3){
            throw new IllegalArgumentException("Invalid first name length");
        }
        if(lastName == null || lastName.length() < 3){
            throw new IllegalArgumentException("Invalid last name length");
        }
        this.title = title;
        this.firstName = firstName;
        this. lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
