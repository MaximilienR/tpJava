import com.example.tpjavaeemedical.entitites.Patient;
//import com.example.tpjavaeemedical.services.PatientService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


@WebServlet(name = "Patient",value = "/PatientServlet")
    public class PatientServelet extends HttpServlet {

        private List<Patient> patients;

        //private PatientService patientService;

      /*  public void init(){
            patientService= new PatientService();
          //  patients = patientService.getPatients();
        }*/
        @Override
        protected  void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            if (request.getParameter("id") != null) {
                int id = Integer.parseInt(request.getParameter("id"));
                Patient patient=null;
                try {
                  //  patient = patientService.getPatient(id);
                }catch (Exception e){

                }
                if(patient !=null){
                    request.setAttribute("patient",patient);
                    request.getRequestDispatcher("patient.jsp").forward(request,response);
                }
            }
        }
    }
