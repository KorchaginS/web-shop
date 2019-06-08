<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@page import="java.util.ArrayList"%>
<%@page import ="com.Shop.InternetShop.Model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page pageEncoding="UTF-8" %>
<html>
    <meta charset="utf-8" />
    <link href="style.css" rel="stylesheet" type="text/css">
    <body>


                <%! private int c = 0;%>
                <%! private List<Integer> Cloths;%>
                <%! private int buttonID = 0; %>


                <% String name = (String) request.getSession().getAttribute("login"); %>
                <c:set var="myName" value="<%=name%>"/>
                <h2 style="display:inline-block">Вы вошли как:</h2>
                <h3 style="display:inline-block">${myName}</h3>



                <%! ArrayList<Clothing> loadedClothing = new ArrayList<Clothing>();%>
                <%loadedClothing = Information.getInstance().getClothing();%>


                <h1>Ассортимент:</h1>

               <% if (request.getAttribute("list") == null) {%>
                           <% request.setAttribute("list", new ArrayList());%>
               <%}%>

                <% ((List)request.getAttribute("list")).clear(); %>



                <% for (int i = 1; i <= loadedClothing.size(); i++) {%>
                <% ((List)request.getAttribute("list")).add (Information.getInstance().getClothById(i)); %>
                <%}%>

                <table>
                    <col width="150" valign="top">
                    <col width="100" valign="top">
                    <col width="100" valign="top">
                    <col width="100" valign="top">
                    <col width="100" valign="top">
                    <tr>
                        <th>Наименование</th>
                        <th>Производитель</th>
                        <th>Цена</th>
                        <th>Материал</th>
                        <th>Добавить в корзину</th>
                    </tr>
                    <c:forEach items="${list}" var="item">
                        <% buttonID++; %>
                        <tr>
                            <td align="center">
                                ${item.getName()}
                            </td>
                            <td align="center">
                                ${item.getManufacturer()}
                            </td>
                            <td align="center">
                                ${item.getCost()}
                            </td>
                            <td align="center">
                                ${item.getMaterial()}
                            </td>
                            <td align="center">
                                <form  name="buyButton" method="post" action="/hello">
                                    <input id="btn" type="submit" value=<%=buttonID%> name="button";/>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </table>

                <%((List)request.getAttribute("list")).clear(); %>
                <% buttonID = 0; %>

                <h1>Корзина:</h1>

                <% Integer id = (Integer) request.getSession().getAttribute("idUser"); %>

                <% Cloths = Information.getInstance().map.get(id).getClothings(); %>

                <table>
                    <col width="150" valign="top">
                    <col width="100" valign="top">
                    <col width="100" valign="top">
                    <col width="100" valign="top">
                    <tr>
                        <th>Наименование</th>
                        <th>Производитель</th>
                        <th>Цена</th>
                        <th>Материал</th>
                <%for (int j=0; j<Cloths.size(); j++){ %>
                    <tr>
                        <td align="center">
                            <%=Information.getInstance().getClothById(Cloths.get(j)).getName()%>
                        </td>
                        <td align="center">
                            <%=Information.getInstance().getClothById(Cloths.get(j)).getManufacturer()%>
                        </td>
                        <td align="center">
                            <%=Information.getInstance().getClothById(Cloths.get(j)).getCost()%>
                        </td>
                        <td align="center">
                            <%=Information.getInstance().getClothById(Cloths.get(j)).getMaterial()%>
                        </td>
                    </tr>
                <% } %>
                </table>

           <% Cloths = null; %>

    </body>
</html>
