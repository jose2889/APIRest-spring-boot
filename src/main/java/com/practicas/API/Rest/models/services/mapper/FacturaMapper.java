package com.practicas.API.Rest.models.services.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.practicas.API.Rest.models.entity.Factura;
import com.practicas.API.Rest.models.services.dto.FacturaDTO;

@Mapper(componentModel = "spring", uses = {FacturaMapper.class})
public interface FacturaMapper {

	 @Mapping(source = "cliente.id", target = "clienteId")
	    FacturaDTO facturaToFacturaDTO(Factura factura);
	 
	 List<FacturaDTO> facturasToFacturaDTOs(List<Factura> factura);

	    @Mapping(source = "clienteId", target = "cliente")
	    Factura bitacoraDTOToBitacora(FacturaDTO facturaDTO);
}
