package com.practicas.API.Rest.models.services.mapper;

import com.practicas.API.Rest.models.entity.Movimiento;
import com.practicas.API.Rest.models.services.dto.MovimientoDTO;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface MovimientoMapper extends EntityMapper<MovimientoDTO, Movimiento>{

	MovimientoMapper INSTANCE = Mappers.getMapper( MovimientoMapper.class );
	 
	MovimientoDTO toDto(Movimiento movimiento);

	Movimiento toEntity(MovimientoDTO movimientoDTO);

	default Movimiento fromId(Long id) {
		if (id == null) {
			return null;
		}
		Movimiento movimiento = new Movimiento();
		movimiento.setId(id);
		return movimiento;
	}
}
