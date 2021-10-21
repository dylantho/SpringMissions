package dmacc.beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Entity
public class Mission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mission_name;
	private String target;
	private String type;
	private boolean in_progress;
	private Date launch_date;

	public Mission() {
		super();
	}
		
	public Mission(String mission_name) {
		this.mission_name = mission_name;
	}
	
	public Mission(String mission_name, String target, String type, boolean in_progress, Date launch_date) {
		this.mission_name = mission_name;
		this.target = target;
		this.type = type;
		this.in_progress = in_progress;
		this.launch_date = launch_date;
	}
		
	public Mission(int id, String mission_name, String target, String type, boolean in_progress, Date launch_date) {
		this.id = id;
		this.mission_name = mission_name;
		this.target = target;
		this.type = type;
		this.in_progress = in_progress;
		this.launch_date = launch_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMission_name() {
		return mission_name;
	}

	public void setMission_name(String mission_name) {
		this.mission_name = mission_name;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIn_progress() {
		return in_progress;
	}

	public void setIn_progress(boolean in_progress) {
		this.in_progress = in_progress;
	}

	public Date getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(Date launch_date) {
		this.launch_date = launch_date;
	}

	@Override
	public String toString() {
		return "Mission [id=" + id + ", mission_name=" + mission_name + ", target=" + target + ", type=" + type
				+ ", in_progress=" + in_progress + ", launch_date=" + launch_date + "]";
	}
	
	

}
