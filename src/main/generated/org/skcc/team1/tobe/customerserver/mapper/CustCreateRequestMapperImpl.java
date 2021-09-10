package org.skcc.team1.tobe.customerserver.mapper;

import javax.annotation.Generated;
import org.skcc.team1.tobe.customerserver.domain.Cust;
import org.skcc.team1.tobe.customerserver.dto.CustCreateRequestDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-10T11:02:24+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustCreateRequestMapperImpl implements CustCreateRequestMapper {

    @Override
    public Cust dtoToEntity(CustCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Cust cust = new Cust();

        cust.setCustNm( dto.getCustNm() );
        cust.setCustRgstDt( dto.getCustRgstDt() );
        cust.setBirthDt( dto.getBirthDt() );
        cust.setCustTypCd( dto.getCustTypCd() );

        return cust;
    }
}
