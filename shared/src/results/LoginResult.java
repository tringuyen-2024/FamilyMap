package results;

/**
 * Class for the result body of the login service
 */
public class LoginResult extends Result {
    /**
     * the auth token associated with the user
     */
    private String authtoken;

    /**
     * the user name of the user
     */
    private String username;

    /**
     * the person ID of the user
     */
    private String personID;

    /**
     * Constructor that requires all parameters
     * @param message error message
     * @param success whether or not the request was successful
     * @param authtoken the auth token of the user
     * @param username the user name of the user
     * @param personID the user's person ID
     */
    public LoginResult(String message, Boolean success, String authtoken, String username, String personID) {
        super(message, success);
        this.authtoken = authtoken;
        this.username = username;
        this.personID = personID;
    }

    /**
     * Constructor that does not require message
     * @param success whether or not the request was successful
     * @param authtoken the auth token of the user
     * @param username the user name of the user
     * @param personID the user's person ID
     */
    public LoginResult(Boolean success, String authtoken, String username, String personID) {
        super.setSuccess(success);
        this.authtoken = authtoken;
        this.username = username;
        this.personID = personID;
    }

    public LoginResult() {

    }

    public String getAuthtoken() {
        return authtoken;
    }

    public void setAuthtoken(String authtoken) {
        this.authtoken = authtoken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }
}
