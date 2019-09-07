import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import session.Cart;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //https://www.youtube.com/playlist?list=PLAma_mKffTOTTFqIkLXgHqVuL6xJhb0mr

        //сессия живёт в районе 30 мин.(неактивность) Идентификация сессии с помощью кукис
        //проверка авторизации с помощью сессии
        HttpSession session = request.getSession();

        String user = (String)session.getAttribute("current_user");

        if(user == null){
            //response для анонимного пользователя
            //session.setAttribute("current_user",ID);
        }else{
            //response для авторизованного пользователя
        }

        //------------------------------------------------------------------------------

        //http://localhost:8080/hello?name=Test&quantity=3
        //Передача в сессию объекта session.Cart(корзина)
//        HttpSession session = request.getSession();
//        Cart cart = (Cart)session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if(cart == null){
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart",cart);
//
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);

        //------------------------------------------------------------------------------
        //хранение счетчика входов на страницу,сессия юзера (данные из кукис) ,передача в сессию числа
//        HttpSession session = request.getSession();
//
//        Integer count = (Integer) session.getAttribute("count");
//        if(count == null){
//            session.setAttribute("count",1);
//            count = 1;
//        }else{
//            session.setAttribute("count",++count);
//        }
//
//        PrintWriter pw = response.getWriter();
//        pw.println("Your count " + count);
//------------------------------------------------------------------------------
        //отображение данных на странице браузера
//        String name = request.getParameter("name");
//        String surName = request.getParameter("surname");
//
//        PrintWriter pw = response.getWriter();
//
//        pw.println("<html>");
//        pw.println(String.format("<h1> Hello,%s %s </h1>",name,surName));
//        pw.println("</html>");
    }
}
