package demo.event_management2.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name="event")
public class Event {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "start_date")
	private String start_date;
	@Column(name = "start_time")
	private String start_time;
	@Column(name = "end_date")
	private String end_date;
	@Column(name = "end_time")
	private String end_time;

	public Event() {
	}

	public Event(String name, String location, String start_date, String start_time, String end_date, String end_time) {
		super();
		this.name = name;
		this.location = location;
		this.start_date = start_date;
		this.start_time = start_time;
		this.end_date = end_date;
		this.end_time = end_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	@Override
	public String toString() {
		return "Event{" +
				"name='" + name + '\'' +
				", location='" + location + '\'' +
				", start_date='" + start_date + '\'' +
				", start_time='" + start_time + '\'' +
				", end_date='" + end_date + '\'' +
				", end_time='" + end_time + '\'' +
				'}';
	}
}
	


