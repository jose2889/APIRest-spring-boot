package com.practicas.API.Rest.models.services.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.practicas.API.Rest.models.entity.Factura;
import com.practicas.API.Rest.models.services.dto.FacturaDTO;

@Mapper(componentModel = "spring", uses = { ClienteMapper.class })
public interface FacturaMapper extends EntityMapper<FacturaDTO, Factura>{

	@Mapping(source = "cliente.id", target = "clienteId")
	FacturaDTO toDto(Factura factura);

	@Mapping(source = "clienteId", target = "cliente")
	Factura toEntity(FacturaDTO facturaDTO);

	default Factura fromId(Long id) {
		if (id == null) {
			return null;
		}
		Factura factura = new Factura();
		factura.setId(id);
		return factura;
	}
}
