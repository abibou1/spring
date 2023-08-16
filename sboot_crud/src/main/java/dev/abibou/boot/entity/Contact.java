package dev.abibou.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="CONTACT_MASTER")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Contact {
	@Id
	@Column(name="contact_id")
	private int id;
	@Column(name="CONTACT_NAME")
	private String name;
	@Column(name="CONTACT_NUMBER")
	private String number;

}
