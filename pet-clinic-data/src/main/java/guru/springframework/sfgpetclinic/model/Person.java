package guru.springframework.sfgpetclinic.model;

import lombok.Data;

/**
 * @author Carlos Montoya
 * @since 14/11/2018
 */
@Data
public class Person extends BaseEntity
{
	private String firstName;
	private String lastName;
}
