package repository;

import db.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PatientRepositoty {
    

        public boolean savePatient(int id,String initials,String surname,String guard,int age,String tel_no,String diagnosis,
               String p_co,String hx_p_co,String pmhx,String pshx,String aihx,String drughx,String immunizationhx,
               String socialhx,String familyhx,String examination,String system,String ix,String mx){
        
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("INSERT INTO patient(id,initials,surname,guard,age,tel_no,diagnosis,"
                    + "p_co,hx_p_co,pmhx,pshx,aihx,drughx,immunizationhx,socialhx,familyhx,examination,system,ix,mx)"
                    + "VALUES("+id+",'"+initials+"','"+surname+"','"+guard+"',"+age+",'"+tel_no+"','"+diagnosis+"',"
                    + "'"+p_co+"','"+hx_p_co+"','"+pmhx+"','"+pshx+"','"+aihx+"','"+drughx+"','"+immunizationhx+"',"
                    + "'"+socialhx+"','"+familyhx+"','"+examination+"','"+system+"','"+ix+"','"+mx+"')");
            
            return isExecuted; 
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return false;
    }
        
        
    public String insert_type(int last ,String[]typ){
        String msg = null;
        try {
                for(String organ : typ){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO organType(num,organ)"
                                        + "VALUES("+last+",'"+organ+"')");    
                    if(isExecuted){
                        msg = "Patient successfully registered";
                    }else{
                        msg = "Patient registration unsuccessful";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "There is an error in the request.";
                System.out.print(msg);
            }
            return msg;
        }
        
    
    public String getLastIds(){
        String id = null;
        try{
            DbConnection connection = new DbConnection();
            ResultSet data = connection.getData("SELECT MAX(patient.num) FROM patient");
            System.out.println(connection);
        while(data.next()){
            id =data.getString(1);
                }    
            } catch(ClassNotFoundException | SQLException e){
                    e.printStackTrace();
            }
                return id;
        }
        
        
        

    
    
  public List<String> getAllPatientss(){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT  * FROM patient ORDER BY num DESC LIMIT 30");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"viewPatient.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updatePatient.jsp??&num="+data.getString(1)+"&initials="+data.getString(3)+"&surname="+data.getString(4)+"&id="+data.getString(2)+"&guard="+data.getString(5)+"&age="+data.getString(6)+"&tel_no="+data.getString(7)+"&diagnosis="+data.getString(8)+"&p_co="+data.getString(9)+"&hx_p_co="+data.getString(10)+"&pmhx="+data.getString(11)+"&pshx="+data.getString(12)+"&aihx="+data.getString(13)+"&drughx="+data.getString(14)+"&immunizationhx="+data.getString(15)+"&socialhx="+data.getString(16)+"&familyhx="+data.getString(17)+"&examination="+data.getString(18)+"&system="+data.getString(19)+"&ix="+data.getString(20)+"&mx="+data.getString(21)+"\" />"+"Edit"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdftest.jsp?id="+data.getString(1)+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
public List<String> getPatientDetails(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  INITIALS         :   "+data.getString(3)+"</div><div class=\"divtext\">  SURNAME   :   "+data.getString(4)+"</div><div class=\"divtext\"> NAME OF THE GUARDIAN    :   " +data.getString(5)+ "</div><div class=\"divtext\"> GUARDIAN'S NIC NO    :   " +data.getString(2)+ "</div><div class=\"divtext\">  AGE   :   "+data.getString(6)+"</div><div class=\"divtext\">  PHONE NO   :   "+data.getString(7)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}

  
  public List<String> getPatientOrganTypes(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM organType WHERE organType.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">  SYSTEM TYPES         :  </div><div class=\"divtext\"></div>");
        patientList.add("");
    while(data.next()){
        patientList.add("<div class=\"divtext\">           *   "+data.getString(3)+"</div>");
        
    } 
    
    patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  

  public List<String> getPatientOtherDetails(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  DIAGNOSIS         :   "+data.getString(8)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  P:CO   :   "+data.getString(9)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\"> HX:P:CO    :   " +data.getString(10)+ "</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\"> PMHX    :   " +data.getString(11)+ "</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  PSHX   :   "+data.getString(12)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  AIHX   :   "+data.getString(13)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  DRUGHX         :   "+data.getString(14)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  IMMUNIZATIONHX         :   "+data.getString(15)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  SOCIALHX         :   "+data.getString(16)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  FAMILYHX         :   "+data.getString(17)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  EXAMINATION         :   "+data.getString(18)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  SYSTEM         :   "+data.getString(19)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  IX         :   "+data.getString(20)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  MX         :   "+data.getString(21)+"</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  public List<String> getOrganTypesForUpdatePanel(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM organType WHERE organType.num='"+id+"'");
        System.out.println(connection);
        
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 

    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
  public List<String> getPatientt(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add(data.getString(3));
        patientList.add(data.getString(4));
        patientList.add(data.getString(5));
        patientList.add(data.getString(2));
        patientList.add(data.getString(6));
        patientList.add(data.getString(7));
        patientList.add(data.getString(8));
        patientList.add(data.getString(9));
        patientList.add(data.getString(10));
        patientList.add(data.getString(11));
        patientList.add(data.getString(12));
        patientList.add(data.getString(13));
        patientList.add(data.getString(14));
        patientList.add(data.getString(15));
        patientList.add(data.getString(16));
        patientList.add(data.getString(17));
        patientList.add(data.getString(18));
        patientList.add(data.getString(20));
        patientList.add(data.getString(21));
        patientList.add(data.getString(19));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  public List<String> getPatientByGuardianNIC(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.id='"+id+"'");
        System.out.println(connection);
        String nic= "nic";
    while(data.next()){
        patientList.add("<td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"guardianNicPatientView.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updatePatient.jsp??&num="+data.getString(1)+"&type="+nic+"&initials="+data.getString(3)+"&surname="+data.getString(4)+"&id="+data.getString(2)+"&guard="+data.getString(5)+"&age="+data.getString(6)+"&tel_no="+data.getString(7)+"&diagnosis="+data.getString(8)+"&p_co="+data.getString(9)+"&hx_p_co="+data.getString(10)+"&pmhx="+data.getString(11)+"&pshx="+data.getString(12)+"&aihx="+data.getString(13)+"&drughx="+data.getString(14)+"&immunizationhx="+data.getString(15)+"&socialhx="+data.getString(16)+"&familyhx="+data.getString(17)+"&examination="+data.getString(18)+"&system="+data.getString(19)+"&ix="+data.getString(20)+"&mx="+data.getString(21)+"\" />"+"Edit"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&type="+nic+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByGuardianNICResults.jsp?patientid="+data.getString(1)+"&id="+id+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
  public String getGuardianNIC(int id){
  
              String nic = null;
        try{
            DbConnection connection = new DbConnection();
            ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
            System.out.println(connection);
        while(data.next()){
            nic =data.getString(2);
                }    
            } catch(ClassNotFoundException | SQLException e){
                    e.printStackTrace();
            }
                return nic;
  
  }
  
    public String getPatientAge(int id){
  
              String age = null;
        try{
            DbConnection connection = new DbConnection();
            ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
            System.out.println(connection);
        while(data.next()){
            age =data.getString(6);
                }    
            } catch(ClassNotFoundException | SQLException e){
                    e.printStackTrace();
            }
                return age;
  
  }
  

  public List<String> getPatientByOrganType(String o_type){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT patient.num,patient.id,patient.initials,patient.surname,patient.guard,patient.age,patient.tel_no,patient.diagnosis,patient.p_co,patient.hx_p_co,patient.pmhx,patient.pshx,patient.aihx,patient.drughx,patient.immunizationhx,patient.socialhx,patient.familyhx,patient.examination,patient.system,patient.ix,patient.mx FROM organType RIGHT JOIN patient ON organType.num = patient.num Where organ ='"+o_type+"'");
        System.out.println(connection);
        String organ = o_type;
        String or_type = "organ";
    while(data.next()){
        patientList.add("<td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"organTypePatientView.jsp?id="+data.getString(1)+"&organ="+organ+"\" />"+"View"+"</td><td><a href=\"updatePatient.jsp??&num="+data.getString(1)+"&organ="+organ+"&type="+or_type+"&initials="+data.getString(3)+"&surname="+data.getString(4)+"&id="+data.getString(2)+"&guard="+data.getString(5)+"&age="+data.getString(6)+"&tel_no="+data.getString(7)+"&diagnosis="+data.getString(8)+"&p_co="+data.getString(9)+"&hx_p_co="+data.getString(10)+"&pmhx="+data.getString(11)+"&pshx="+data.getString(12)+"&aihx="+data.getString(13)+"&drughx="+data.getString(14)+"&immunizationhx="+data.getString(15)+"&socialhx="+data.getString(16)+"&familyhx="+data.getString(17)+"&examination="+data.getString(18)+"&system="+data.getString(19)+"&ix="+data.getString(20)+"&mx="+data.getString(21)+"\" />"+"Edit"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&organ="+organ+"&type="+or_type+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByOrganTypeResults.jsp?id="+data.getString(1)+"&o_type="+o_type+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
    public List<String> getPatientByAge(int age){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.age='"+age+"'");
        System.out.println(connection);
        String ageOfPatient = "age";
    while(data.next()){
        patientList.add("<td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"agePatientView.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updatePatient.jsp??&num="+data.getString(1)+"&type="+ageOfPatient+"&initials="+data.getString(3)+"&surname="+data.getString(4)+"&id="+data.getString(2)+"&guard="+data.getString(5)+"&age="+data.getString(6)+"&tel_no="+data.getString(7)+"&diagnosis="+data.getString(8)+"&p_co="+data.getString(9)+"&hx_p_co="+data.getString(10)+"&pmhx="+data.getString(11)+"&pshx="+data.getString(12)+"&aihx="+data.getString(13)+"&drughx="+data.getString(14)+"&immunizationhx="+data.getString(15)+"&socialhx="+data.getString(16)+"&familyhx="+data.getString(17)+"&examination="+data.getString(18)+"&system="+data.getString(19)+"&ix="+data.getString(20)+"&mx="+data.getString(21)+"\" />"+"Edit"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&type="+ageOfPatient+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByAgeResults.jsp?id="+data.getString(1)+"&age="+age+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
public void delete(int num){
    
	try {
            DbConnection connection = new DbConnection();
            connection.setData("DELETE FROM patient WHERE num='"+num+"'");
          
	} catch (Exception e) {
            e.printStackTrace();
        }
        
}
public boolean deleteOrganType(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM organType WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}     

public void deletePatient(int num){
    
    try{
    if(deleteOrganType(num)){

    delete(num);

}
    }catch (Exception e){
        e.printStackTrace();
    }

}
		
        

    public String updatePatient(int num, int new_age, String new_tel_no, String new_diagnosis, String new_p_co, String new_hx_p_co, String new_pmhx, String new_pshx, String new_aihx, String new_drughx, String new_immunizationhx, String new_socialhx, String new_familyhx, String new_examination, String new_system, String new_ix, String new_mx) {
              String msg = "";
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("UPDATE patient SET age='"+new_age+"' , tel_no='"+new_tel_no+"' , diagnosis='"+new_diagnosis+"' , p_co='"+new_p_co+"', hx_p_co='"+new_hx_p_co+"', pmhx='"+new_pmhx+"', pshx='"+new_pshx+"', aihx='"+new_aihx+"', drughx='"+new_drughx+"', immunizationhx='"+new_immunizationhx+"', socialhx='"+new_socialhx+"', familyhx='"+new_familyhx+"', examination='"+new_examination+"', system='"+new_system+"', ix='"+new_ix+"' , mx='"+new_mx+"' WHERE patient.num ='"+num+"'");
            if(isExecuted){
                msg = "success";
            }else {
                msg = "User data update query did not executed";
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = "There is error in the student update process";
            
        }
      return msg;

    }






}