package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Carlos Montoya
 * @since 14/11/2018
 */
@Getter @Setter
public class BaseEntity implements Serializable
{
	private Long id;
}
