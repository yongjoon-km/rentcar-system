package user;

public class UserRepository {

    public User getUser(Long userId) {
        return new User(new L1License());
    }
}
