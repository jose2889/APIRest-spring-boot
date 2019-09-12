package com.practicas.API.Rest.models.services.mapper;

import com.practicas.API.Rest.models.entity.Cliente;
import com.practicas.API.Rest.models.entity.Factura;
import com.practicas.API.Rest.models.services.dto.ClienteDTO;
import com.practicas.API.Rest.models.services.dto.FacturaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends EntityMapper<FacturaDTO, Factura>{

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
