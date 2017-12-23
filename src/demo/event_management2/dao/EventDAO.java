package demo.event_management2.dao;




import demo.event_management2.model.Event;

import java.util.List;

public interface EventDAO {

	public void addEvent(Event event);
	public void updateEvent(Event event);
	public List<Event> listEvents();
	public Event getEventById(int id);
	public void removeEvent(int id);
}
