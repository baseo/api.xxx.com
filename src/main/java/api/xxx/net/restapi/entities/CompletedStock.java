package api.xxx.net.restapi.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Entity
@Table("CompletedStock")
public class CompletedStock {
    @Id
    @Column("Id")
    BigDecimal id;

    @Column("ItemKey")
    BigDecimal itemKey;

    @Column("Quantity")
    BigDecimal quantity;

    @Column("Location")
    String location;

    @Column("CreatedDate")
    Timestamp createdDate;

    @Column("ModifiedDate")
    Timestamp modifiedDate;

}
