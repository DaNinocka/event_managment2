package demo.event_management2.dao;


import demo.event_management2.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;

import java.util.List;


import org.jboss.logging.Logger;


public class EventDAOImpl implements EventDAO {

   private static final Logger logger = LoggerFactory.logger(Event.class);
   private SessionFactory sessionFactory;

   public void setSessionFactory(SessionFactory sf){
       this.sessionFactory = sf;

   }
   public void addEvent(Event event){
       Session session = this.sessionFactory.getCurrentSession();
       session.persist(event);
       logger.info("Event added successfully, Even details: " + event);
   }
   public void updateEvent(Event event){
       Session session = this.sessionFactory.getCurrentSession();
       session.update(event);
       logger.info("Event updated successfully, Event details: " + event);
   }

       @SuppressWarnings("unchecked")
       public List<Event> listEvents(){
           Session session = this.sessionFactory.getCurrentSession();
           List<Event> eventList = session.createQuery("from Event").list();
           for (Event event : eventList){
               logger.info("Even list: " + event);
       } return eventList;
   }

   public Event getEventById (int id){
           Session session = this.sessionFactory.getCurrentSession();
           Event event = (Event) session.load(Event.class, new Integer(id));
           logger.info("Event loaded successfully, Event details: " + event);
           return event;
   }
   public void removeEvent(int id){
       Session session = this.sessionFactory.getCurrentSession();
       Event event = (Event) session.load(Event.class, new Integer(id));
       if(event != null){
           session.delete(event);
       }
       logger.info(" Event deleted successfully, Event details: "+ event);
   }
}
