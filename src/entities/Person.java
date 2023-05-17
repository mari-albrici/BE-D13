package entities;

import java.sql.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Setter
@Getter
@NoArgsConstructor
public class Person {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	private String name;
	private String lastname;
	private String email;
	private Date birthday;
	private Gender gender;
	
	@OneToMany
	@JoinColumn(name = "partecipation", referencedColumnName = "id" )
	private Set<Participation> eventParticipation;
	
	public Person(String name, String lastname, String email, Date birthday, Gender gender) {
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.email = email;
		this.gender = gender;
	}
	

}
