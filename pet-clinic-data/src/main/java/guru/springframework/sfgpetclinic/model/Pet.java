package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author Carlos Montoya
 * @since 14/11/2018
 */
@Data
public class Pet extends BaseEntity
{
	private PetType petType;
	private Owner owner;
	private LocalDate birthday;
}
