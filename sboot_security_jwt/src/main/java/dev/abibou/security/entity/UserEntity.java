package dev.abibou.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
	private long id;
	private String username;
	private String password;

}
