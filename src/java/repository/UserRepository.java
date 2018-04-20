package repository;

import db.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

public class UserRepository {

    public String saveUser(int nic_no,String initials,String surname,String tel_no,String email,String password,String m_type){
        String msg = null;
        try{
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("INSERT INTO user(nic_no,initials,surname,tel_no,email,password,m_type) VALUES ('"+nic_no+"','"+initials+"','"+surname+"','"+tel_no+"','"+email+"','"+password+"','"+m_type+"')");
            if(isExecuted){
                
                msg = "success";
            }
            else{
                msg = "Errorrrrrrrrrrrrr";
            }
            

            }catch(Exception e){
                e.printStackTrace();
                msg = "Error";
             }
        return msg;
    }

        
        
public List<String> getAllUsers(){
    List<String> userList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user");
        System.out.println(connection);
    while(data.next()){
        userList.add("<td>"+data.getString(1)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"viewUser.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updateUser.jsp?id="+data.getString(1)+"&initials="+data.getString(2)+"&surname="+data.getString(3)+"&tel_no="+data.getString(4)+"&email="+data.getString(5)+"&password="+data.getString(6)+"&m_type="+data.getString(7)+"\" />"+"Edit"+"<td class=\"td1\"><a href=\"deleteUser.jsp?id="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td></td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return userList;
}

public void deleteUser(int nic_no){
    
	try {
            DbConnection connection = new DbConnection();
            connection.setData("DELETE FROM user WHERE nic_no='"+nic_no+"'");
          
	} catch (Exception e) {
            e.printStackTrace();
        }
      
		
		
        }

public List<String> getAllUsersByType(String m_type){
    
    List<String> userList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.m_type = '"+m_type+"'");
        System.out.println(connection);
    while(data.next()){
        userList.add("<td>"+data.getString(1)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"typeUserView.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updateUser.jsp?id="+data.getString(1)+"&initials="+data.getString(2)+"&surname="+data.getString(3)+"&tel_no="+data.getString(4)+"&email="+data.getString(5)+"&password="+data.getString(6)+"&m_type="+data.getString(7)+"\" />"+"Edit"+"<td class=\"td1\"><a href=\"deleteUser.jsp?id="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td></td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return userList;
}

public List<String> getUserByEmail(String email){
    List<String> userList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.email='"+email+"'");
        System.out.println(connection);
    while(data.next()){
        userList.add("<div class=\"divtext\"> NIC NO    :   " +data.getString(1)+ "</div><div class=\"divtext\">  INITIALS         :   "+data.getString(2)+"</div><div class=\"divtext\">  SURNAME   :   "+data.getString(3)+"</div><div class=\"divtext\">  PHONE NO   :   "+data.getString(4)+"</div><div class=\"divtext\">EMAIL   :   "+data.getString(5)+"</div><div class=\"divtext\">  PASSWORD   :   "+data.getString(6)+"</div><div class=\"divtext\">  USER TYPE   :   "+data.getString(7)+"</div>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return userList;

}

public List<String> getUser(int nic_no){
    List<String> userList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        userList.add("<div class=\"divtext\"> NIC NO    :   " +data.getString(1)+ "</div><div class=\"divtext\">  INITIALS         :   "+data.getString(2)+"</div><div class=\"divtext\">  SURNAME   :   "+data.getString(3)+"</div><div class=\"divtext\">  PHONE NO   :   "+data.getString(4)+"</div><div class=\"divtext\">EMAIL   :   "+data.getString(5)+"</div><div class=\"divtext\">  PASSWORD   :   "+data.getString(6)+"</div><div class=\"divtext\">  USER TYPE   :   "+data.getString(7)+"</div>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return userList;
}


public String getUserPassword(String nic_no){
    String password=null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        password =data.getString(6);
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return password;
}

public String getUserTel_no(String nic_no){
    String tel_no=null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        tel_no =data.getString(4);
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return tel_no;
}

public String getUserEmail(String nic_no){
    String email=null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        email =data.getString(5);
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return email;
}

public String getUserLoginName(String nic_no){
    String surname=null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        surname =data.getString(3);
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return surname;
}

public String getUserInitials(String nic_no){
    String initials=null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        initials =data.getString(2);
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return initials;
}

public String getUserType(String nic_no){
    String initials=null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"'");
        System.out.println(connection);
    while(data.next()){
        initials =data.getString(7);
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return initials;
}

    public String updateUser(int nic_no,String new_initials,String new_surname,String new_tel_no,String new_email,String new_password){
      String msg = null;
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("UPDATE user SET initials='"+new_initials+"' , surname='"+new_surname+"' , tel_no='"+new_tel_no+"' , email='"+new_email+"' , password='"+new_password+"' WHERE user.nic_no='"+nic_no+"'");
            if(isExecuted){
                
                
                msg = "success";
            }else {
                msg = "Errorrrrrrrrrrrrr";
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = "There is error in the student update process";
            
        }
      return msg;
    }
    
    
  /*  
    public boolean login(int nic_no,String password){
        
        String userType;
    try{
        
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"' AND user.password='"+password+"'");
        System.out.println(connection);

        userType=data.getString(6);

            if(userType != null){
                return true;
            }else{
                return false;
            }
        } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
            return false;
    
        }

public String getUserType(int nic_no,String password){
    String userType = null;
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM user WHERE user.nic_no='"+nic_no+"' AND user.password='"+password+"'");
        System.out.println(connection);

        userType=data.getString(6);
        return userType;
    }    
     catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return userType;
}
*/

    public String updateProfile(int nic_no, String new_tel_no, String new_email, String new_password) {
              String msg = null;
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("UPDATE user SET tel_no='"+new_tel_no+"' , email='"+new_email+"' , password='"+new_password+"' WHERE user.nic_no='"+nic_no+"'");
            if(isExecuted){
                
                
                msg = "success";
            }else {
                msg = "Errorrrrrrrrrrrrr";
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = "There is error in the student update process";
            
        }
      return msg;
    }

}
