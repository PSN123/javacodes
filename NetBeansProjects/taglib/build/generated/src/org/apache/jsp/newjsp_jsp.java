package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_if_test.release();
    _jspx_tagPool_f_set_var_value_scope_nobody.release();
    _jspx_tagPool_f_set_var_value_nobody.release();
    _jspx_tagPool_f_out_value_nobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>TODO write content</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("<!--    ");
      if (_jspx_meth_f_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(9/0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("      -->\n");
      out.write("      ");
      if (_jspx_meth_f_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      ");
      if (_jspx_meth_f_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("          ");
      if (_jspx_meth_f_set_2(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("          ");
      if (_jspx_meth_f_if_1(_jspx_page_context))
        return;
      out.write("      \n");
      out.write("      <h1>Hello World!</h1>\n");
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

  private boolean _jspx_meth_f_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_f_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_f_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_f_set_0.setPageContext(_jspx_page_context);
    _jspx_th_f_set_0.setParent(null);
    _jspx_th_f_set_0.setVar("name");
    _jspx_th_f_set_0.setValue(new String("pradeep"));
    int _jspx_eval_f_set_0 = _jspx_th_f_set_0.doStartTag();
    if (_jspx_th_f_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_set_var_value_nobody.reuse(_jspx_th_f_set_0);
      return true;
    }
    _jspx_tagPool_f_set_var_value_nobody.reuse(_jspx_th_f_set_0);
    return false;
  }

  private boolean _jspx_meth_f_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_f_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_f_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_f_set_1.setPageContext(_jspx_page_context);
    _jspx_th_f_set_1.setParent(null);
    _jspx_th_f_set_1.setVar("salary");
    _jspx_th_f_set_1.setScope("session");
    _jspx_th_f_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2000*2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_f_set_1 = _jspx_th_f_set_1.doStartTag();
    if (_jspx_th_f_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_set_var_value_scope_nobody.reuse(_jspx_th_f_set_1);
      return true;
    }
    _jspx_tagPool_f_set_var_value_scope_nobody.reuse(_jspx_th_f_set_1);
    return false;
  }

  private boolean _jspx_meth_f_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_f_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_f_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_f_if_0.setPageContext(_jspx_page_context);
    _jspx_th_f_if_0.setParent(null);
    _jspx_th_f_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salary>2000}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_f_if_0 = _jspx_th_f_if_0.doStartTag();
    if (_jspx_eval_f_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("          <p>my salary is:");
        if (_jspx_meth_f_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_if_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_f_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_if_test.reuse(_jspx_th_f_if_0);
      return true;
    }
    _jspx_tagPool_f_if_test.reuse(_jspx_th_f_if_0);
    return false;
  }

  private boolean _jspx_meth_f_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_f_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_f_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_f_out_0.setPageContext(_jspx_page_context);
    _jspx_th_f_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_if_0);
    _jspx_th_f_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${salary}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_f_out_0 = _jspx_th_f_out_0.doStartTag();
    if (_jspx_th_f_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_out_value_nobody.reuse(_jspx_th_f_out_0);
      return true;
    }
    _jspx_tagPool_f_out_value_nobody.reuse(_jspx_th_f_out_0);
    return false;
  }

  private boolean _jspx_meth_f_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_f_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_f_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_f_set_2.setPageContext(_jspx_page_context);
    _jspx_th_f_set_2.setParent(null);
    _jspx_th_f_set_2.setVar("name");
    _jspx_th_f_set_2.setValue(new String("alok123"));
    _jspx_th_f_set_2.setScope("session");
    int _jspx_eval_f_set_2 = _jspx_th_f_set_2.doStartTag();
    if (_jspx_th_f_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_set_var_value_scope_nobody.reuse(_jspx_th_f_set_2);
      return true;
    }
    _jspx_tagPool_f_set_var_value_scope_nobody.reuse(_jspx_th_f_set_2);
    return false;
  }

  private boolean _jspx_meth_f_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_f_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_f_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_f_if_1.setPageContext(_jspx_page_context);
    _jspx_th_f_if_1.setParent(null);
    _jspx_th_f_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_f_if_1 = _jspx_th_f_if_1.doStartTag();
    if (_jspx_eval_f_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              ");
        if (_jspx_meth_f_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_f_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_if_test.reuse(_jspx_th_f_if_1);
      return true;
    }
    _jspx_tagPool_f_if_test.reuse(_jspx_th_f_if_1);
    return false;
  }

  private boolean _jspx_meth_f_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_f_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_f_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_f_out_1.setPageContext(_jspx_page_context);
    _jspx_th_f_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_if_1);
    _jspx_th_f_out_1.setValue(new String("pradeep"));
    int _jspx_eval_f_out_1 = _jspx_th_f_out_1.doStartTag();
    if (_jspx_th_f_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_out_value_nobody.reuse(_jspx_th_f_out_1);
      return true;
    }
    _jspx_tagPool_f_out_value_nobody.reuse(_jspx_th_f_out_1);
    return false;
  }
}
