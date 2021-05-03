package Entities;

import Abstract.IEntity;

public class Gamer implements IEntity {

	private int birthYear;
	private int gamerId;
	private String nationalityId;
	private String nickName;
	
	public Gamer() {
		
	}
	public Gamer(int birthYear, int gamerId, String nationalityId, String nickName) {
		super();
		this.birthYear = birthYear;
		this.gamerId = gamerId;
		this.nationalityId = nationalityId;
		this.nickName = nickName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
