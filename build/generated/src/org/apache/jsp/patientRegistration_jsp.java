package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>User</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/content.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/btn.css\"/> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form.css\"\n");
      out.write("</head>\n");
      out.write("<script>\n");
      out.write("    function myFunction() {\n");
      out.write("    alert(");
 request.getParameter("msg");
      out.write(");\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\t\t\n");
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
      out.write("\n");
      out.write("\t<div id=\"contentwrap\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <form  method=\"POST\" action=\"RegisterPatient\" >\n");
      out.write("                        <div class=\"form_description\">\n");
      out.write("\t\t\t\t<h2>  Patient Registration</h2>\n");
      out.write("\t\t\t\t<p>Use This form to register a new Patient</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container\" style=\"width:100%;\">\n");
      out.write("                            <div class=\"container\" style=\"width:49%;display:inline-block;\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                                    <li>\n");
      out.write("\t\t\t\t\t<label class=\"description\">Name </label>\n");
      out.write("                                            <span>\n");
      out.write("\t\t\t\t\t\t<input name= \"initials\" class=\"text\" maxlength=\"255\" size=\"10\" value=\"\" required=\"required\" style=\"text-transform:uppercase;\" pattern=\"[A-Za-z]+\"/>\n");
      out.write("\t\t\t\t\t\t<label for=\"street\">Initials</label>\n");
      out.write("                                            </span>\n");
      out.write("                                            <span>\n");
      out.write("\t\t\t\t\t\t<input name= \"surname\" class=\"text\" maxlength=\"255\" size=\"26\" value=\"\" required=\"required\" pattern=\"[A-Za-z]+\" style=\"text-transform:uppercase;\"/>\n");
      out.write("\t\t\t\t\t\t<label for=\"street\">Surname</label>\n");
      out.write("                                            </span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li style=\"height:15px;\" ></li>\n");
      out.write("                                    <li>\n");
      out.write("\t\t\t\t\t<label class=\"description\" for=\"guard\">Name of the Guardian</label>\n");
      out.write("        \t\t\t\t<div><input name= \"guard\" class=\"text\" maxlength=\"255\" size=\"26\"  pattern=\"[A-Za-z]+\" /></div>\n");
      out.write("                                    </li>\n");
      out.write("                                   <li>\n");
      out.write("\t\t\t\t\t<label class=\"description\" for=\"id\">NIC Number</label>\n");
      out.write("        \t\t\t\t<div><input type=\"number\" name=\"id\"/></div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("\t\t\t\t\t<label class=\"description\" for=\"age\">Age</label>\n");
      out.write("        \t\t\t\t<div><input type=\"number\" name=\"age\"/></div>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                    <li>\n");
      out.write("                                        <label class=\"description\" for=\"tel_no\">Tel No</label>\n");
      out.write("                                        <div><input type=\"text\" id=\"tel_no\" class=\"large text\" name=\"tel_no\" style=\"width:420px\" required=\"required\"  pattern=\"[0-9]{10}\"></div>\n");
      out.write("                                    </li>\n");
      out.write("        \t\t\t</ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li style=\"border:1px solid gray;width:360px \">\n");
      out.write("                                <label id = \"systemcheck\" class=\"description\">System Type</label>\n");
      out.write("                                    <span>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"cardiovascularSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Cardiovascular System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"digestiveSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Digestive System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"endocrineSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Endocrine System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"dermatologySystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Dermatology System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"immuneSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Immune System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"neuroMuscularSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Neuro Muscular System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"nervousSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Nervous System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"urinarySystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Urinary System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"reproductiveSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Reproductive System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"respiratorySystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Respiratory System</label>\n");
      out.write("                                        <input  name=\"o_type\" class=\"checkbox\" type=\"checkbox\" value=\"skeletalSystem\" />\n");
      out.write("                                            <label class=\"choice\" for=\"o_type\">Skeletal System</label>\n");
      out.write("                                    </span>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"diagnosis\">Diagnosis</label>\n");
      out.write("\t\t\t\t<textarea rows=\"4\" cols=\"50\" name=\"diagnosis\"  required=\"required\" placeholder=\"Enter Diagnosis Here...(Max 200 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"p_co\">P:Co</label>\n");
      out.write("\t\t\t\t<textarea rows=\"4\" cols=\"50\" name=\"p_co\" required=\"required\" placeholder=\"Enter p:co Here...(Max 300 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li>\n");
      out.write("                            <label class=\"description\" for=\"hx_p_co\">Hx P:Co</label>\n");
      out.write("\t\t\t\t<textarea name=\"hx_p_co\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter Hx P:Co Here...(Max 1500 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"pmhx\">PMHx</label>\n");
      out.write("\t\t\t\t <textarea name=\"pmhx\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter PMHx Here...(Max 1000 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"pshx\">PSHx</label>\n");
      out.write("\t\t\t\t <textarea name=\"pshx\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter PSHx Here...(Max 750 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"aihx\">AIHx</label>\n");
      out.write("\t\t\t\t<textarea name=\"aihx\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter AIHx Here...(Max 300 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"drughx\">Drug Hx</label>\n");
      out.write("\t\t\t\t <textarea name=\"drughx\" rows=\"10\" cols=\"50\" required=\"required\" Placeholder=\"Enter Drug Hx Here...(Max 1000 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"immunizationhx\">Immunization Hx</label>\n");
      out.write("\t\t\t\t<textarea name=\"immunizationhx\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter Immunization Hx Here...(Max 500 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"socialhx\">Social Hx</label>\n");
      out.write("\t\t\t\t<textarea name=\"socialhx\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter Social Hx Here...(Max 1000 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t\t<label class=\"description\" for=\"familyhx\">Family Hx</label>\n");
      out.write("\t\t\t\t\t <textarea name=\"familyhx\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter Family Hx Here...(Max 500 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li>\n");
      out.write("\t\t\t\t\t<label class=\"description\" for=\"examination\">Examination</label>\n");
      out.write("\t\t\t\t\t <textarea name=\"examination\" rows=\"10\" cols=\"50\" required=\"required\" placeholder=\"Enter Examination Here...(Max 750 Characters)\"></textarea>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\t\t\t<li style=\"height:30px\"></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <label class=\"description\" for=\"ix\">Ix</label>\n");
      out.write("\t\t\t\t<textarea rows=\"20\" cols=\"50\" name=\"ix\"  placeholder=\"Enter Ix Here...(Max 2000 Characters)\" ></textarea>\t\n");
      out.write("\t\t\t</li>\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <label class=\"description\" for=\"mx\">Mx</label>\n");
      out.write("\t\t\t\t<textarea rows=\"20\" cols=\"50\" name=\"mx\"  placeholder=\"Enter Mx Here...(Max 2000 Characters)\" ></textarea>\t\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <div style=\"border:1px solid gray;width:500px \">\n");
      out.write("                            <label id = \"systemcheck\" class=\"description\">Changes</label>\n");
      out.write("\t\t\t\t<span>\n");
      out.write("                                    <li>\n");
      out.write("\t\t\t\t\t<label class=\"description\" for=\"system\">Current Updates(Max 2000 Characters)</label>\n");
      out.write("                                            <textarea name=\"system\" rows=\"4\" cols=\"50\"    >None</textarea>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                </span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<li style=\"height:40px\"></li>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <span>\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"button\" value=\"     Submit     \"  />\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("\t\t\t\t<input type=\"reset\"  class=\"button\" onclick=\"resetText();\"/>\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("\t\t\t</li>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
