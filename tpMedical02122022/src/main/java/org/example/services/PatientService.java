package org.example.services;

import org.example.entities.Consultation;
import org.example.entities.Patient;
import org.example.entities.Prescription;
import org.example.interfaces.IDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.management.Query;
import java.util.Date;
import java.util.List;

public class PatientService  implements IDAO {

    private StandardServiceRegistry registry;
    private SessionFactory sessionFactory;
    private Session session;

    public PatientService() {
        registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    @Override
    public boolean create(Patient o) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;

    }

    //ajouter  une prescription
/*en cours
    public boolean addNewPrescription(Prescription prescription, String nss) {
        boolean result = false;
        Patient patient = this.findByNss(nss);
        session.getTransaction().begin();
    if (patient!=null){
        prescription.setPatient(patient);
        session.save(prescription);
        result=true;
        }
        session.getTransaction().commit();
        return result;
    }


   /*test
    @Override
    public List<Consultation>filterByDate(Date min,Date max)throws  Exception{
        if (min.before(max)){
            session = sessionFactory.openSession();
            session.beginTransaction();
         }
        throw new Exception("error date ");
    };*/
}
