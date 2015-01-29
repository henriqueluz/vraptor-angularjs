package br.com.henriqueluz.enumeration;

public enum Gender {

	MALE("M", "Male"),
	FEMALE("F", "Female");
	
	private String code;
	private String type;
	
	private Gender(String code, String type) {
		this.code = code;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
	
	public String getCode() {
		return code;
	}
}
