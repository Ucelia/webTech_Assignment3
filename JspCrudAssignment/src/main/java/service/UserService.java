package service;

import bean.User;

import java.util.List;

public interface UserService {

    User Register_User(User userobj);
    User Update_User(User userobj);
    User Delete_User(User userobj);
    User Search_User(User userobj);
     List<User> AllUsers();



}
