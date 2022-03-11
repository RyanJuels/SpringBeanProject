/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private long id;
	private String fName;
	private String lName;
	private int jerseyNum;
	private String position;
	
	public Player() {
		super();
	}
	
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

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the jerseyNum
	 */
	public int getJerseyNum() {
		return jerseyNum;
	}

	/**
	 * @param jerseyNum the jerseyNum to set
	 */
	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", fName=" + fName + ", lName=" + lName + ", jerseyNum=" + jerseyNum + ", position="
				+ position + "]";
	}
	
	
}
