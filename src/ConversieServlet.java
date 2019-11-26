import conversie.InfoConversie;
import org.jetbrains.annotations.NotNull;
import util.InfoEroare;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ConversieServlet")

public class ConversieServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        response.sendRedirect("../../web/index.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        String valoareDeConvertit = request.getParameter("valoareTemperatura");
        try {
            Double.parseDouble(valoareDeConvertit);

            if (valoareDeConvertit != null && !valoareDeConvertit.isEmpty()) {
                InfoConversie temp = new InfoConversie();
                temp.setValoareDeConvertit(Double.parseDouble(valoareDeConvertit));
                temp.setUnitateDin(request.getParameter("unitateDin"));
                temp.setUnitateCatre(request.getParameter("unitateCatre"));
                if (temp.getUnitateDin().equals(temp.getUnitateCatre())) {
                    temp.setValoareConvertita(temp.getValoareDeConvertit());
                } else {
                    switch (temp.getUnitateDin()) {
                        case "celsius":
                            switch (temp.getUnitateCatre()) {
                                case "kelvin":
                                    temp.setValoareConvertita(temp.getValoareDeConvertit() + 273.15);
                                    break;

                                case "fahrenheit":
                                    temp.setValoareConvertita(temp.getValoareDeConvertit() * 1.8 + 32);
                                    break;
                            }
                            break;
                        case "kelvin":
                            switch (temp.getUnitateCatre()) {
                                case "celsius":
                                    temp.setValoareConvertita(temp.getValoareDeConvertit() - 273.15);
                                    break;
                                case "fahrenheit":
                                    temp.setValoareConvertita(temp.getValoareDeConvertit() * 1.8 - 459.67);
                                    break;
                            }
                            break;
                        case "fahrenheit":
                            switch (temp.getUnitateCatre()) {
                                case "celsius":
                                    temp.setValoareConvertita((temp.getValoareDeConvertit() - 32) / 1.8);
                                    break;
                                case "kelvin":
                                    temp.setValoareConvertita((temp.getValoareDeConvertit() + 459.67) / 1.8);
                                    break;
                            }
                            break;
                    }

                }

                request.setAttribute("temp", temp);
                RequestDispatcher view = request.getRequestDispatcher("/infoConv.jsp");
                view.forward(request, response);


            } else {
                InfoEroare err = new InfoEroare();
                err.setMesaj("Va rugam introduceti o valoare");
                request.setAttribute("err", err);
                RequestDispatcher view = request.getRequestDispatcher("/infoEroare.jsp");
                view.forward(request, response);
            }
        }catch (NumberFormatException e)
        {
            InfoEroare err = new InfoEroare();
            err.setMesaj("Introdu un numar");
            request.setAttribute("err", err);
            RequestDispatcher view = request.getRequestDispatcher("/infoEroare.jsp");
            view.forward(request, response);
        }
    }
}
