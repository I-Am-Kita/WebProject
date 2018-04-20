package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import repository.PatientRepositoty;

public final class guardianNicPatientView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/leftnav.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/content.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/btn.css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form.css\"/>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .divtext\n");
      out.write("            {\n");
      out.write("                font-family:    Agency FB;\n");
      out.write("                font-size:      40px;\n");
      out.write("                width: 1000px; \n");
      out.write("                word-wrap:break-word;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"headerwrap\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("                    <img src=\"img/logo.png\" width=\"70px\" height=\"70px\" alt=\"PMS logo\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"title\">\n");
      out.write("                    <font face=\"Agency FB\" color=\"#b5dfeb\" size=\"6px\" >Examination Database<br>:)</font>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"float:right; padding:27px;\">\n");
      out.write("                    <font face=\"Calibri\" color=\"white\" size=\"4\">You Are Logged In As   <strong><span style=\"text-transform:uppercase;\"><a class=\"head\">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</a></span></strong></font>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/leftnav.css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"leftcolumnwrap\">\n");
      out.write("            <div id=\"leftcolumn\">\n");
      out.write("                <ul class=\"leftnav\">\n");
      out.write("                    <li class=\"leftnav\"><a class=\"home\" href=\"home.jsp\"><img src=\"img/icons/glyphicons_free/glyphicons/png/glyphicons-21-home.png\"/><font color=\"#000000\" size=\"5\" face=\"Agency FB\"><span> HOME</span></font></a></li>\t\n");
      out.write("                    <li class=\"leftnav\"><a class=\"home\" href=\"dashboard.jsp\"><img src=\"img/icons/glyphicons_free/glyphicons/png/glyphicons-479-blackboard.png\"/><font color=\"#000000\" size=\"5\" face=\"Agency FB\"> DASHBOARD</font></a></li>\t\t\n");
      out.write("                    <li class=\"leftnav\"><a class=\"home\" href=\"profile.jsp\"><img src=\"img/icons/glyphicons_free/glyphicons/png/glyphicons-4-user.png\"/><font color=\"#000000\" size=\"5\" face=\"Agency FB\"> PROFILE</font></a></li>\t\t\n");
      out.write("                    <li class=\"leftnav\"><a class=\"home\" href=\"LogOut\"><img src=\"img/icons/glyphicons_free/glyphicons/png/glyphicons-388-log-out.png\"/><font color=\"#000000\" size=\"5\" face=\"Agency FB\"> LOGOUT</font></a></li>\t\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"contentwrap\">\n");
      out.write("        <div id=\"content\">\n");
      out.write("        <table border=\"0\">  \n");
      out.write("            <font color=\"#111100\" size=\"15\" face=\"Agency FB\"> View Patient</font>\n");
      out.write("            <div>_________________________________</div>\n");
      out.write("        ");

          try {
                    int id = Integer.parseInt(request.getParameter("id"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    List<String> allPatients1 = (List<String>) patientRepository.getPatientDetails(id);
                    for (String string : allPatients1) {
                        out.print(string);
                    }
                    List<String> allPatients2 = (List<String>) patientRepository.getPatientOrganTypes(id);
                    for (String string : allPatients2) {
                        out.print(string);
                    }
                    List<String> allPatients3 = (List<String>) patientRepository.getPatientOtherDetails(id);
                    for (String string : allPatients3) {
                        out.print(string);
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div style=\"height:10px;\"></div>\n");
      out.write("        <div>_________________________________</div>\n");
      out.write("        <div><a href=\"searchPatientByGuardianNICResults.jsp?&nic_no=idk\"><button class=\"button\">Back</button></a></div>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"footerwrap\">\n");
      out.write("            <div id=\"footer\">\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("                    <font color=\"white\" size=\"2px\" align=\"center\">&copy; 2017, All rights reserved by PMS</font>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
