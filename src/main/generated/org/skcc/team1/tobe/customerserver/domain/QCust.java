package org.skcc.team1.tobe.customerserver.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCust is a Querydsl query type for Cust
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCust extends EntityPathBase<Cust> {

    private static final long serialVersionUID = 1930291098L;

    public static final QCust cust = new QCust("cust");

    public final org.caltech.miniswing.domain.QBaseEntity _super = new org.caltech.miniswing.domain.QBaseEntity(this);

    public final DatePath<java.time.LocalDate> birthDt = createDate("birthDt", java.time.LocalDate.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath custNm = createString("custNm");

    public final DatePath<java.time.LocalDate> custRgstDt = createDate("custRgstDt", java.time.LocalDate.class);

    public final EnumPath<org.skcc.team1.tobe.customerserver.dto.CustTypCd> custTypCd = createEnum("custTypCd", org.skcc.team1.tobe.customerserver.dto.CustTypCd.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public QCust(String variable) {
        super(Cust.class, forVariable(variable));
    }

    public QCust(Path<? extends Cust> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCust(PathMetadata metadata) {
        super(Cust.class, metadata);
    }

}

