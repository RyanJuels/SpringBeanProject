/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	@Id
	@GeneratedValue
	private long id;
	private String fName;
	private String lName;
	private int jerseyNum;
	private String position;
	
	public Player(String fName) {
		super();
		this.fName = fName;
	}
	
	public Player(String fName, String lName, int jerseyNum, String position) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.jerseyNum = jerseyNum;
		this.position = position;
	}
	
	public Player(int id, String fName, String lName, int jerseyNum, String position) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.jerseyNum = jerseyNum;
		this.position = position;
	}
	
}
