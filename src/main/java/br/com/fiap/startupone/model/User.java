package br.com.fiap.startupone.model;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import br.com.fiap.startupone.types.Genders;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_users")
@SequenceGenerator(name = "user", sequenceName = "SQ_USER", allocationSize = 1)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user")
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@Column(name = "height", nullable = false)
	private double height;
	
	@Column(name = "weight", nullable = false)
	private double weight;
	
	@Column(name = "gender", nullable = false)
	@Enumerated(EnumType.STRING)
	private Genders gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_last_update")
    private Calendar dtLastUpdate;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_creation")
    private Calendar dtCreation;

    public User() {}

	public User(String name, int age, double height, double weight, Genders gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Genders getGender() {
		return gender;
	}

	public void setGender(Genders gender) {
		this.gender = gender;
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
    
}
