package com.practicas.API.Rest.models.services.mapper;

import com.practicas.API.Rest.models.entity.Cliente;
import com.practicas.API.Rest.models.services.dto.ClienteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends EntityMapper<ClienteDTO, Cliente>{

	ClienteMapper INSTANCE = Mappers.getMapper( ClienteMapper.class );
	 
	ClienteDTO toDto(Cliente cliente);

	Cliente toEntity(ClienteDTO clienteDTO);

	default Cliente fromId(Long id) {
		if (id == null) {
			return null;
		}
		Cliente cliente = new Cliente();
		cliente.setId(id);
		return cliente;
	}
}
