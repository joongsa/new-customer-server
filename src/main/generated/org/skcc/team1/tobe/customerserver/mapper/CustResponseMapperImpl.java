package org.skcc.team1.tobe.customerserver.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.skcc.team1.tobe.customerserver.domain.Cust;
import org.skcc.team1.tobe.customerserver.dto.CustResponseDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-10T11:02:24+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustResponseMapperImpl implements CustResponseMapper {

    @Override
    public CustResponseDto entityToDto(Cust entity) {
        if ( entity == null ) {
            return null;
        }

        CustResponseDto custResponseDto = new CustResponseDto();

        custResponseDto.setCustNum( entity.getCustNum() );
        custResponseDto.setCustNm( entity.getCustNm() );
        custResponseDto.setCustRgstDt( entity.getCustRgstDt() );
        custResponseDto.setBirthDt( entity.getBirthDt() );
        custResponseDto.setCustTypCd( entity.getCustTypCd() );

        return custResponseDto;
    }

    @Override
    public List<CustResponseDto> entityListToDtoList(List<Cust> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustResponseDto> list = new ArrayList<CustResponseDto>( entities.size() );
        for ( Cust cust : entities ) {
            list.add( entityToDto( cust ) );
        }

        return list;
    }
}
