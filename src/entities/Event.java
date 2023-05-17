package entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "events")
@Getter
@Setter
public class Event {
	

	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	private LocalDate date;
	private String description;
	private EventType event_type;
	private int max_event_participants;
	private Location location;
	private Set<Participation> participants;

	public Event(String title, LocalDate date, String description, EventType event_type, int max_event_participants, Location location, Set<Participation> participants) {
		super();
		this.title = title;
		this.date = date;
		this.description = description;
		this.event_type = event_type;
		this.max_event_participants = max_event_participants;
		this.location = location;
	}

	public Event() {

	}

	@Override
	public String toString() {
		return title + " " + description + " " + "in data" + " " + date;
	}


}