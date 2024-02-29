<%@page import="dao.UserDao"%>
<%@ page import="service.UserService" %>
<%@ page import="serviceImplementation.UserImpl" %>
<%@ page import="controller.HibernateUtil" %>
<%@ page import="bean.User" %>
<jsp:useBean id="u" class="bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%

  UserService userService;
  userService = new UserImpl(HibernateUtil.getSessionFactory());

  User  user_register=userService.Register_User(u);
  if(user_register!=null){
    response.sendRedirect("adduser-success.jsp");
  }else{
    response.sendRedirect("adduser-error.jsp");
  }
%>