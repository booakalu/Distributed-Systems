/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.models.Tbanswers;
import za.ac.tut.models.Tbquestions;
import za.ac.tut.models.Tbwebtests;
import za.ac.tut.sessions.TbanswersFacadeLocal;
import za.ac.tut.sessions.TbquestionsFacadeLocal;
import za.ac.tut.sessions.TbwebtestsFacadeLocal;
import za.ac.tut.sessions.TbwrittentestsFacadeLocal;

/**
 *
 * @author LNdlovu
 */
public class HomeServlet extends HttpServlet {

    @EJB
    private TbwebtestsFacadeLocal tbwebtestsFacadeLocal;
    @EJB
    private TbquestionsFacadeLocal tbquestionsFacadeLocal;
    @EJB
    private TbanswersFacadeLocal tbanswersFacadeLocal;
    @EJB
    private TbwrittentestsFacadeLocal tbwrittentestsFacadeLocal;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String selectedButton = request.getParameter("btnSetTest");
        if (selectedButton.equals("Set Test")) {
            String questionA, questionB, answerA, answerB;
            questionA = request.getParameter("questionA");
            questionB = request.getParameter("questionB");
            answerA = request.getParameter("answerA");
            answerB = request.getParameter("answerB");

            //Writing the web test to the database
            try {
                int foundWebTestId = tbwebtestsFacadeLocal.count() + 1;
                tbwebtestsFacadeLocal.create(new Tbwebtests(0, "Web Test " + foundWebTestId));
                //Write the questions to the database
                tbquestionsFacadeLocal.create(new Tbquestions(0, foundWebTestId, questionA));
                tbquestionsFacadeLocal.create(new Tbquestions(0, foundWebTestId, questionB));
                //Write the answers to the database
                int foundQuestionId = tbquestionsFacadeLocal.count() + 1;
                tbanswersFacadeLocal.create(new Tbanswers(0, foundQuestionId, answerA));
                tbanswersFacadeLocal.create(new Tbanswers(0, foundQuestionId, answerB));
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet HomeServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<p>Test successfully created!</p>");
                out.println("</body>");
                out.println("</html>");
            } catch (Exception ex) {

            }
        } else if (selectedButton.equals("View Test")) {
            RequestDispatcher ds = request.getRequestDispatcher("test.html");
            ds.include(request, response);
        } else if (selectedButton.equals("Submit Test")) {

        }
    }
}
