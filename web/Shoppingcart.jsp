<%-- 
    Document   : ShoppingCart
    Created on : 25-nov-2020, 20:23:50
    Author     : EliteBook
--%>

<%@page import="co.edu.utap.ecommerce.domain.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </head>
    <body>
   <%
            List<Product> products = new ArrayList  ();
            
            
            List<Product> shoppingCart = new ArrayList();
            if (session.getAttribute("products") != null) {
                products = (List<Product>) session.getAttribute("products");
            }
            if (session.getAttribute("shoppingCart") != null) {
                shoppingCart = (List<Product>) session.getAttribute("shoppingCart");
            }
        %>

        <div class="container">
            <h1>Productos agregados ( <%= shoppingCart.size()%> )</h1>

            <div class="form-row">

                <%
                    for (Product item : products) {
                %>

                <div class="card col-md-3">
                    <img src="<%= item.getImagen()%>" 
                         class="card-img-top" alt="..." height="250px" width="25px">
                    <div class="card-body">
                        <p class="card-text">
                            <%= item.getNombre()%>  <br>
                            $ <%= item.getPrecio()%><br>
                            <a href="ShoppingCartController?id=<%= item.getCodigo()%>&action=add" class="btn btn-outline-primary">+</a>
                            <a href="ShoppingCartController?id=<%= item.getCodigo()%>&action=remove" class="btn btn-outline-primary">-</a>
                        </p>
                    </div>
                </div>                    

                <%
                    }
                %>

            </div>

            <h1>Resumen</h1>   
            <hr>

            <div class="form-row">
                <div class="col-md-12">
                    <table class="table table-bordered">
                        <tr>
                            <td>Codigo</td>
                            <td>Nombre</td>
                            <td>Cantidad</td>
                            <td>Precio</td>
                            <td>Subtotal</td>
                        </tr>

                        <%
                            for (Product item : shoppingCart) {
                        %>
                        <tr>
                            <td><%= item.getCodigo()%></td>
                            <td><%= item.getNombre()%></td>
                            <td><%= item.getCantidad()%></td>
                            <td><%= item.getPrecio()%></td>
                            <td><%= item.getPrecio() * item.getCantidad()%> </td>
                        </tr>
                        <%
                            }
                        %>

                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

        <div class="container">
            <h1>Productos agregados ( <%= shoppingCart.size()%> )</h1>

            <div class="form-row">

                <%
                    for (Product item : products) {
                %>

                <div class="card col-md-3">
                    <img src="<%= item.getImagen()%>" 
                         class="card-img-top" alt="..." height="250px" width="25px">
                    <div class="card-body">
                        <p class="card-text">
                            <%= item.getNombre()%>  <br>
                            $ <%= item.getPrecio()%><br>
                            <a href="ShoppingCartController?id=<%= item.getCodigo()%>&action=add" class="btn btn-outline-primary">+</a>
                            <a href="ShoppingCartController?id=<%= item.getCodigo()%>&action=remove" class="btn btn-outline-primary">-</a>
                        </p>
                    </div>
                </div>                    

                <%
                    }
                %>

            </div>

            <h1>Resumen</h1>   
            <hr>

            <div class="form-row">
                <div class="col-md-12">
                    <table class="table table-bordered">
                        <tr>
                            <td>Codigo</td>
                            <td>Nombre</td>
                            <td>Cantidad</td>
                            <td>Precio</td>
                            <td>Subtotal</td>
                        </tr>

                        <%
                            for (Product item : shoppingCart) {
                        %>
                        <tr>
                            <td><%= item.getCodigo()%></td>
                            <td><%= item.getNombre()%></td>
                            <td><%= item.getCantidad()%></td>
                            <td><%= item.getPrecio()%></td>
                            <td><%= item.getPrecio() * item.getCantidad()%> </td>
                        </tr>
                        <%
                            }
                        %>

                    </table>
                </div>
            </div>
        </div>
    </body>
</html
            
       