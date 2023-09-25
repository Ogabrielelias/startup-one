package br.com.fiap.startupone.model;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_heart_rate")
@SequenceGenerator(name = "heart", sequenceName = "SQ_heart", allocationSize = 1)
public class HeartRate {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "heart") 
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "rest_heart_rate", nullable = false)
	private int restingHeartRate;
	
	@Column(name = "act_heart_hate", nullable = false)
	private int activityHeartRate;
	
	@Column(name = "during_sleep", nullable = false)
	private int heartRateDuringSleep;
	
	@Column(name = "alerts", nullable = false)
	private int heartRateAlerts;
	
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_last_update")
    private Calendar dtLastUpdate;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_creation")
    private Calendar dtCreation;
    
    @ManyToOne(optional=false) 
    @JoinColumn(name="user_id", nullable=false, updatable=false)
    private User user;

	public HeartRate() {
	}



	public HeartRate(int restingHeartRate, int activityHeartRate, int heartRateDuringSleep, int heartRateAlerts) {
		super();
		this.restingHeartRate = restingHeartRate;
		this.activityHeartRate = activityHeartRate;
		this.heartRateDuringSleep = heartRateDuringSleep;
		this.heartRateAlerts = heartRateAlerts;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Calendar getDtLastUpdate() {
		return dtLastUpdate;
	}

	public void setDtLastUpdate(Calendar dtLastUpdate) {
		this.dtLastUpdate = dtLastUpdate;
	}

	public Calendar getDtCreation() {
		return dtCreation;
	}

	public void setDtCreation(Calendar dtCreation) {
		this.dtCreation = dtCreation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRestingHeartRate() {
		return restingHeartRate;
	}

	public void setRestingHeartRate(int restingHeartRate) {
		this.restingHeartRate = restingHeartRate;
	}

	public int getActivityHeartRate() {
		return activityHeartRate;
	}

	public void setActivityHeartRate(int activityHeartRate) {
		this.activityHeartRate = activityHeartRate;
	}

	public int getHeartRateDuringSleep() {
		return heartRateDuringSleep;
	}

	public void setHeartRateDuringSleep(int heartRateDuringSleep) {
		this.heartRateDuringSleep = heartRateDuringSleep;
	}

	public int getHeartRateAlerts() {
		return heartRateAlerts;
	}

	public void setHeartRateAlerts(int heartRateAlerts) {
		this.heartRateAlerts = heartRateAlerts;
	}
	
	
}

