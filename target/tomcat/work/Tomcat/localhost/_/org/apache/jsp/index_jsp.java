/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-06-08 04:34:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import com.Shop.InternetShop.Model.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 private int c = 0;
 private List<Integer> Cloths;
 private int buttonID = 0; 
 ArrayList<Clothing> loadedClothing = new ArrayList<Clothing>();
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 String name = (String) request.getSession().getAttribute("login"); 
      out.write("\r\n");
      out.write("                ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /index.jsp(20,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("myName");
      // /index.jsp(20,16) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(name);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n");
      out.write("                <h2 style=\"display:inline-block\">Вы вошли как:</h2>\r\n");
      out.write("                <h3 style=\"display:inline-block\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
loadedClothing = Information.getInstance().getClothing();
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <h1>Ассортимент:</h1>\r\n");
      out.write("\r\n");
      out.write("               ");
 if (request.getAttribute("list") == null) {
      out.write("\r\n");
      out.write("                           ");
 request.setAttribute("list", new ArrayList());
      out.write("\r\n");
      out.write("               ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 ((List)request.getAttribute("list")).clear(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 for (int i = 1; i <= loadedClothing.size(); i++) {
      out.write("\r\n");
      out.write("                ");
 ((List)request.getAttribute("list")).add (Information.getInstance().getClothById(i)); 
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <table>\r\n");
      out.write("                    <col width=\"150\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Наименование</th>\r\n");
      out.write("                        <th>Производитель</th>\r\n");
      out.write("                        <th>Цена</th>\r\n");
      out.write("                        <th>Материал</th>\r\n");
      out.write("                        <th>Добавить в корзину</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /index.jsp(57,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(57,20) '${list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /index.jsp(57,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        ");
 buttonID++; 
            out.write("\r\n");
            out.write("                        <tr>\r\n");
            out.write("                            <td align=\"center\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </td>\r\n");
            out.write("                            <td align=\"center\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.getManufacturer()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </td>\r\n");
            out.write("                            <td align=\"center\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.getCost()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </td>\r\n");
            out.write("                            <td align=\"center\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.getMaterial()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </td>\r\n");
            out.write("                            <td align=\"center\">\r\n");
            out.write("                                <form  name=\"buyButton\" method=\"post\" action=\"/hello\">\r\n");
            out.write("                                    <input id=\"btn\" type=\"submit\" value=");
            out.print(buttonID);
            out.write(" name=\"button\";/>\r\n");
            out.write("                                </form>\r\n");
            out.write("                            </td>\r\n");
            out.write("                        </tr>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                ");
((List)request.getAttribute("list")).clear(); 
      out.write("\r\n");
      out.write("                ");
 buttonID = 0; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <h1>Корзина:</h1>\r\n");
      out.write("\r\n");
      out.write("                ");
 Integer id = (Integer) request.getSession().getAttribute("idUser"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 Cloths = Information.getInstance().map.get(id).getClothings(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <table>\r\n");
      out.write("                    <col width=\"150\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <col width=\"100\" valign=\"top\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Наименование</th>\r\n");
      out.write("                        <th>Производитель</th>\r\n");
      out.write("                        <th>Цена</th>\r\n");
      out.write("                        <th>Материал</th>\r\n");
      out.write("                ");
for (int j=0; j<Cloths.size(); j++){ 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"center\">\r\n");
      out.write("                            ");
      out.print(Information.getInstance().getClothById(Cloths.get(j)).getName());
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td align=\"center\">\r\n");
      out.write("                            ");
      out.print(Information.getInstance().getClothById(Cloths.get(j)).getManufacturer());
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td align=\"center\">\r\n");
      out.write("                            ");
      out.print(Information.getInstance().getClothById(Cloths.get(j)).getCost());
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td align=\"center\">\r\n");
      out.write("                            ");
      out.print(Information.getInstance().getClothById(Cloths.get(j)).getMaterial());
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("           ");
 Cloths = null; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
