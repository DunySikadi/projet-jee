package projet.ejb.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import projet.commun.dto.DtoCompte;
import projet.commun.dto.DtoMouvement;
import projet.ejb.data.Compte;
import projet.ejb.data.Mouvement;

@Mapper(componentModel = "cdi")
public interface IMapperEjb {

	static final IMapperEjb INSTANCE = Mappers.getMapper(IMapperEjb.class);

	// Compte

	Compte map(DtoCompte source);

	DtoCompte map(Compte source);

	// Compte
	Mouvement map(DtoMouvement source);

	DtoMouvement map(Mouvement source);
}
