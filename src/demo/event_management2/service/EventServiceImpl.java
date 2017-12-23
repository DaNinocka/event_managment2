package demo.event_management2.service;

import demo.event_management2.dao.EventDAO;
import demo.event_management2.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private EventDAO eventDAO;

    public void setEventDAO(EventDAO eventDAO){
        this.eventDAO = eventDAO;
    }

    @Transactional
    public void addEvent(Event event){
        this.eventDAO.addEvent(event);
    }
    @Transactional
    public void updateEvent(Event event){
        this.eventDAO.updateEvent(event);
    }
    @Transactional
    public List<Event> listEvents(){
       return this.eventDAO.listEvents();}

    @Transactional
    public Event getEventById(int id){
        return this.eventDAO.getEventById(id);
    }
    @Transactional
    public void removeEvent(int id){
        this.eventDAO.removeEvent(id);
    }
}
