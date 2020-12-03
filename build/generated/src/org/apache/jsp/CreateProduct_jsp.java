package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.edu.utap.ecommerce.domain.Product;
import java.util.ArrayList;
import java.util.List;

public final class CreateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <div class=\"container\">\n");
      out.write("            <form method=\"post\" action=\"ProductController\">\n");
      out.write("\n");
      out.write("                ");

                    List<Product> products = new ArrayList();
                    if (session.getAttribute("products") != null) {
                        products = (List<Product>) session.getAttribute("products");
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <h1>Productos ( ");
      out.print( products.size());
      out.write(" )</h1>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Codigo:</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el código\" id=\"txtCodigo\" name=\"txtCodigo\" />\n");
      out.write("                    </div>           \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Nombre:</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el nombre\" id=\"txtNombre\" name=\"txtNombre\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Cantidad:</label>\n");
      out.write("                        <input class=\"form-control\" type=\"number\" placeholder=\"Ingrese la cantidad\" id=\"txtCantidad\" name=\"txtCantidad\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Precio</label>\n");
      out.write("                        <input class=\"form-control\" type=\"number\" placeholder=\"Ingrese la cantidad\" id=\"txtPrecio\" name=\"txtPrecio\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <br>\n");
      out.write("                        <label>Genero:</label>\n");
      out.write("                        <select class=\"form-control\" id=\"ddlGenero\" name=\"ddlGenero\">\n");
      out.write("                            <option value=\"-1\">--Seleccione--</option>\n");
      out.write("                            <option value=\"1\">Hombre</option>\n");
      out.write("                            <option value=\"2\">Mujer</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <br>\n");
      out.write("                        <label>Categoria:</label>\n");
      out.write("                        <select class=\"form-control\" id=\"ddlCategoria\" name=\"ddlCategoria\">\n");
      out.write("                            <option value=\"-1\">--Seleccione--</option>\n");
      out.write("                            <option value=\"1\">Camisas</option>\n");
      out.write("                            <option value=\"2\">Correas</option>\n");
      out.write("                            <option value=\"3\">Zapatos</option>\n");
      out.write("                            <option value=\"4\">Calzado Dama</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <br>\n");
      out.write("                        <label>Imagen:</label>\n");
      out.write("                        <input placeholder=\"Ingrese la url\" type=\"text\" class=\"form-control\" id=\"txtImagen\" name=\"txtImagen\" />\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <br>\n");
      out.write("                        <input class=\"btn-outline-success btn\" type=\"submit\" value=\"Guardar\" id=\"btnGuardar\" name=\"btnGuardar\" />\n");
      out.write("                        <a class=\"btn-outline-primary btn\" href=\"ListProduct.jsp\">Ver</a>\n");
      out.write("                        <a class=\"btn-outline-danger btn\" href=\"ShoppingCart.jsp\">Carrito de compra</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    if (request.getAttribute("preview") != null) {
                
      out.write("\n");
      out.write("                <label class=\"badge badge-success\">Resumen: ");
      out.print( request.getAttribute("preview"));
      out.write(" </label><br>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    if (request.getParameter("txtCodigo") != null
                            && request.getParameter("txtNombre") != null) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <label class=\"badge badge-dark\">Codigo: ");
      out.print( request.getParameter("txtCodigo"));
      out.write(" </label><br>\n");
      out.write("                <label class=\"badge badge-dark\">Nombre: ");
      out.print( request.getParameter("txtNombre"));
      out.write(" </label><br>\n");
      out.write("                <label class=\"badge badge-dark\">Cantidad: ");
      out.print( request.getParameter("txtCantidad"));
      out.write(" </label><br>\n");
      out.write("                <label class=\"badge badge-dark\">Precio: ");
      out.print( request.getParameter("txtPrecio"));
      out.write(" </label><br>\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
}
