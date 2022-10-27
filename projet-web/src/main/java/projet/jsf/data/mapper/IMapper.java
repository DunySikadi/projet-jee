package projet.jsf.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import projet.commun.dto.DtoCompte;
import projet.commun.dto.DtoMouvement;
import projet.jsf.data.Compte;
import projet.jsf.data.Mouvement;

@Mapper(componentModel = "cdi")
public interface IMapper {

	// Compte

	Compte map(DtoCompte source);

	DtoCompte map(Compte source);

	Compte duplicate(Compte source);

	Compte update(@MappingTarget Compte target, Compte source);

	// Mouvement
	Mouvement map(DtoMouvement source);

	DtoMouvement map(Mouvement source);

	Mouvement duplicate(Mouvement source);

	Mouvement update(@MappingTarget Mouvement target, Mouvement source);

}
