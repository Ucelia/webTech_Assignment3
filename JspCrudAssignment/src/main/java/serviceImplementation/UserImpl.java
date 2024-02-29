package serviceImplementation;

import bean.User;
import dao.UserDao;
import org.hibernate.SessionFactory;
import service.UserService;

import java.util.List;

public class UserImpl implements UserService {
    public UserImpl(SessionFactory sessionFactory){

    }
    UserDao dao = new UserDao();
    @Override
    public User Register_User(User userobj) {
        return dao.registerUser(userobj);
    }

    @Override
    public User Update_User(User userobj) {
        return dao.UpdateUser(userobj);
    }

    @Override
    public User Delete_User(User userobj) {
        return dao.DeleteUser(userobj);
    }

    @Override
    public User Search_User(User userobj) {
        return dao.SearchUser(userobj);
    }

    @Override
    public List<User> AllUsers() {return dao.DisplayUser();}
}
