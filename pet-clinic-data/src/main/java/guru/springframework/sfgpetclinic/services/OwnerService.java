package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author Carlos Montoya
 * @since 14/11/2018
 */
public interface OwnerService extends CrudService<Owner, Long>
{
	Owner findByLastName(String lastname);
}
