import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import org.hibernate.*;


 @WebServlet("/loansServlet")
public class loansServlet extends HttpServlet {

   private  LoanController loanController;
     public void init() {
         loanController = new LoanController();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String itemIdStr = request.getParameter("itemId");
        String action = request.getParameter("action");
        
        if (itemIdStr != null && !itemIdStr.isEmpty() && action != null && !action.isEmpty()) {
            int itemId = Integer.parseInt(itemIdStr);
            
            if (action.equals("loan")) {
                loanController.updateItemToBorrowed(itemId);
            } else if (action.equals("return")) {
                loanController.updateItemToReturned(itemId);
            }
            
            // Redirect back to the loanItem.html page after processing
            response.sendRedirect("loans.html");
            response.getWriter().println("valid input.");
        } else {
            // Handle invalid input scenario
            response.getWriter().println("Invalid input.");
        }
    }
}

