package br.com.fiap.startupone.model;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_sleep")
@SequenceGenerator(name = "sleep", sequenceName = "SQ_SLEEP", allocationSize = 1)
public class Sleep {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sleep")
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "start_time", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar startTime;
	
	@Column(name = "end_time", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar endTime;
	
	@Column(name = "sleeping_time", nullable = false)
	private int sleepingTime;
	
	@Column(name = "time_in_bed", nullable = false)
	private int timeInBed;
	
	@Column(name = "nocturnal_awakenings", nullable = false)
	private int nocturnalAwakenings;
	
	@Column(name = "circadian_rhythm", nullable = false)
	private double circadianRhythm;
	
	@Column(name = "sleep_quality", nullable = false)
	private double sleepQuality;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_last_update")
    private Calendar dtLastUpdate;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_creation")
    private Calendar dtCreation;
    
    public Sleep() {}
	
	public Sleep(Calendar startTime, Calendar endTime, int sleepingTime, int timeInBed, int nocturnalAwakenings,
			double circadianRhythm, double sleepQuality) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.sleepingTime = sleepingTime;
		this.timeInBed = timeInBed;
		this.nocturnalAwakenings = nocturnalAwakenings;
		this.circadianRhythm = circadianRhythm;
		this.sleepQuality = sleepQuality;
	}

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getEndTime() {
		return endTime;
	}

	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}

	public int getSleepingTime() {
		return sleepingTime;
	}

	public void setSleepingTime(int sleepingTime) {
		this.sleepingTime = sleepingTime;
	}

	public int getTimeInBed() {
		return timeInBed;
	}

	public void setTimeInBed(int timeInBed) {
		this.timeInBed = timeInBed;
	}

	public int getNocturnalAwakenings() {
		return nocturnalAwakenings;
	}

	public void setNocturnalAwakenings(int nocturnalAwakenings) {
		this.nocturnalAwakenings = nocturnalAwakenings;
	}

	public double getCircadianRhythm() {
		return circadianRhythm;
	}

	public void setCircadianRhythm(double circadianRhythm) {
		this.circadianRhythm = circadianRhythm;
	}

	public double getSleepQuality() {
		return sleepQuality;
	}

	public void setSleepQuality(double sleepQuality) {
		this.sleepQuality = sleepQuality;
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

}