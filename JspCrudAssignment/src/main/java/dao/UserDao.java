package dao;

import bean.User;
import controller.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {


        public User registerUser (User user){
                try{
                        Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction tr= session.beginTransaction();
                        session.save(user);
                        tr.commit();
                        return user;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;

        }

        public User UpdateUser (User user){
                try{
                        Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction tr= session.beginTransaction();
                        session.update(user);
                        tr.commit();
                        return user;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;

        }

        public User DeleteUser (User user){
                try{
                        Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction tr= session.beginTransaction();
                        session.delete(user);
                        tr.commit();
                        return user;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;

        }

        public List<User> DisplayUser(){
                try {
                        Session session=HibernateUtil.getSessionFactory().openSession();
                        List<User> user_data=session.createQuery("select ad from User ad").list();
                        session.beginTransaction().commit();
                        session.close();
                        return user_data;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;
        }
        public User SearchUser(User user){
                try {
                        Session session=HibernateUtil.getSessionFactory().openSession();
                        User user_data=session.get(User.class,user.getId());
                        session.beginTransaction().commit();
                        session.close();
                        return user_data;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;
        }




}
