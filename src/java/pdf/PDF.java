/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.ArrayList;
import java.util.List;
import repository.PatientRepositoty;

public class PDF extends HttpServlet {
 private static final long serialVersionUID = 1L;

 public PDF() {
  super();
 }

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request, response);
 }

 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String idd = request.getParameter("id");
     int id =Integer.parseInt(idd); 
  //get the output stream for writing binary data in the response.
  ServletOutputStream os = response.getOutputStream();
  //set the response content type to PDF
  response.setContentType("application/pdf"); 
  //create a new document
  Document doc = new Document();

  //create some special styles and font sizes
  Font bfBold18 = new Font(FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(0, 0, 0)); 
  
  try{
   
   //create an instance of the PdfWriter using the output stream
   PdfWriter.getInstance(doc, os); 

   //document header properties
   doc.addAuthor("DOC");
   doc.addCreationDate();
   doc.addProducer();
  // doc.addCreator("PatientDetails");
   doc.addTitle("PatientPDF");
   doc.setPageSize(PageSize.LETTER);
   doc.open();

   //add a new paragraph
   //doc.add( new Paragraph("Patient Details", bfBold18));
   
 
 
 PatientRepositoty patientRepositoty = new PatientRepositoty();
            List<String> patientList = new ArrayList<String>();
            patientList = patientRepositoty.getPatientt(id);
            String[] patientListt = new String[patientList.size()];
            patientListt = patientList.toArray(patientListt);
            
            String initials= patientListt[0];
            String surname= patientListt[1];
            String guardian= patientListt[2];
            String guardNIC= patientListt[3];
            String age= patientListt[4];
            String tel_no= patientListt[5];
            String diagnosis= patientListt[6];
            String p_co = patientListt[7];
            String hx_p_co = patientListt[8];
            String pmhx = patientListt[9];
            String pshx = patientListt[10];
            String aihx = patientListt[11];
            String drughx = patientListt[12];
            String immunization = patientListt[13];
            String socialhx = patientListt[14];
            String family = patientListt[15];
            String examination = patientListt[16];
            String ix = patientListt[17];
            String mx = patientListt[18];
            String changes = patientListt[19];

           
              doc.open();
              
              Font font1 = new Font(Font.FontFamily.HELVETICA  , 25, Font.BOLD);
             
             Paragraph paragraph1 = new Paragraph();
             paragraph1.setAlignment(Element.ALIGN_CENTER);
             paragraph1.setFont(font1);
             paragraph1.add("Patient Details");
             paragraph1.setSpacingAfter(60);
             doc.add(paragraph1);
             
             PdfPTable table1 = new PdfPTable(2);
             PdfPCell cell1 = new PdfPCell(new Paragraph("INITIALS"));
             PdfPCell cell2 = new PdfPCell(new Paragraph(initials));
             PdfPCell cell3 = new PdfPCell(new Paragraph("SURNAME"));
             PdfPCell cell4 = new PdfPCell(new Paragraph(surname));
             PdfPCell cell5 = new PdfPCell(new Paragraph("GUARDIAN'S  NAME"));
             PdfPCell cell6 = new PdfPCell(new Paragraph(guardian));
             PdfPCell cell7 = new PdfPCell(new Paragraph("GUARDIAN'S  NIC NO"));
             PdfPCell cell8 = new PdfPCell(new Paragraph(guardNIC));
             PdfPCell cell9 = new PdfPCell(new Paragraph("AGE"));
             PdfPCell cell10 = new PdfPCell(new Paragraph(age));
             PdfPCell cell13 = new PdfPCell(new Paragraph("TELEPHONE"));
             PdfPCell cell14 = new PdfPCell(new Paragraph(tel_no));
             PdfPCell cell15 = new PdfPCell(new Paragraph("DIAGNOSIS"));
             PdfPCell cell16 = new PdfPCell(new Paragraph(diagnosis));
             PdfPCell cell17 = new PdfPCell(new Paragraph("P:CO"));
             PdfPCell cell18 = new PdfPCell(new Paragraph(p_co));
             PdfPCell cell19 = new PdfPCell(new Paragraph("HX:P:CO"));
             PdfPCell cell20 = new PdfPCell(new Paragraph(hx_p_co));
             PdfPCell cell21 = new PdfPCell(new Paragraph("PMHX"));
             PdfPCell cell22 = new PdfPCell(new Paragraph(pmhx));
             PdfPCell cell23 = new PdfPCell(new Paragraph("PSHX"));
             PdfPCell cell24 = new PdfPCell(new Paragraph(pshx));
             PdfPCell cell25 = new PdfPCell(new Paragraph("AIHX"));
             PdfPCell cell26 = new PdfPCell(new Paragraph(aihx));
             PdfPCell cell27 = new PdfPCell(new Paragraph("DRUGHX"));
             PdfPCell cell28 = new PdfPCell(new Paragraph(drughx));
             PdfPCell cell29 = new PdfPCell(new Paragraph("IMMUNIZATION"));
             PdfPCell cell30 = new PdfPCell(new Paragraph(immunization));
             PdfPCell cell31 = new PdfPCell(new Paragraph("SOCIALHX"));
             PdfPCell cell32 = new PdfPCell(new Paragraph(socialhx));
             PdfPCell cell33 = new PdfPCell(new Paragraph("FAMILY"));
             PdfPCell cell34 = new PdfPCell(new Paragraph(family));
             PdfPCell cell35 = new PdfPCell(new Paragraph("EXAMINATION"));
             PdfPCell cell36 = new PdfPCell(new Paragraph(examination));
             PdfPCell cell37 = new PdfPCell(new Paragraph("IX"));
             PdfPCell cell38 = new PdfPCell(new Paragraph(ix));
             PdfPCell cell39 = new PdfPCell(new Paragraph("MX"));
             PdfPCell cell40 = new PdfPCell(new Paragraph(mx));
             PdfPCell cell41 = new PdfPCell(new Paragraph("CHANGES"));
             PdfPCell cell42 = new PdfPCell(new Paragraph(changes));
             table1.addCell(cell1);
             table1.addCell(cell2);
             table1.addCell(cell3);
             table1.addCell(cell4);
             table1.addCell(cell5);
             table1.addCell(cell6);
             table1.addCell(cell7);
             table1.addCell(cell8);
             table1.addCell(cell9);
             table1.addCell(cell10);
             table1.addCell(cell13);
             table1.addCell(cell14);
             table1.addCell(cell15);
             table1.addCell(cell16);
             table1.addCell(cell17);
             table1.addCell(cell18);
             table1.addCell(cell19);
             table1.addCell(cell20);
             table1.addCell(cell21);
             table1.addCell(cell22);
             table1.addCell(cell23);
             table1.addCell(cell24);
             table1.addCell(cell25);
             table1.addCell(cell26);
             table1.addCell(cell27);
             table1.addCell(cell28);
             table1.addCell(cell29);
             table1.addCell(cell30);
             table1.addCell(cell31);
             table1.addCell(cell32);
             table1.addCell(cell33);
             table1.addCell(cell34);
             table1.addCell(cell35);
             table1.addCell(cell36);
             table1.addCell(cell37);
             table1.addCell(cell38);
             table1.addCell(cell39);
             table1.addCell(cell40);
             table1.addCell(cell41);
             table1.addCell(cell42);
             
             doc.add(table1);
             
             
             PdfPTable table5 = new PdfPTable(2);


             doc.add(table5);
             
             doc.close();
   
   response.sendRedirect("dashboard.jsp");

  }catch(DocumentException e){
   e.printStackTrace();
  }
  catch(Exception e){
   e.printStackTrace();
  }

 }

}