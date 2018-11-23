package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Farm_Trader")
public class G3Trader impements Serializable{

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int T_id;

	@Column
	private String T_name;

	@Column
	private String T_email;

	@Column
	private int T_mobile;

	@Column
	private String T_password;

	@Column
	private String T_address;

	public int setT_id(int T_id){
		this.T_id=T_id;
	}
	public void getT_id(){
		return T_id;
	}

	public String setT_name(String T_name){
		this.T_name=T_name;
	}
	public void getT_name(){
		return T_name;
	}

	public String setT_email(String T_email){
		this.T_email=T_email;
	}
	public void getT_email(){
		return T_email;
	}

	public int T_mobile(int T_mobile){
		this.T_mobile=T_mobile;
	}
	public void T_mobile(){
		return T_mobile;
	}

	public String setT_password(String T_password){
		this.T_password=T_password;
	}
	public void getT_password(){
		return T_password;
	}

	public String setT_address(String T_address){
		this.T_address=T_address;
	}
	public void getT_address(){
		return T_address;
	}
}