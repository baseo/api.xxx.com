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
    private BigDecimal id;

    @Column("ItemKey")
    private BigDecimal itemKey;

    @Column("Quantity")
    private BigDecimal quantity;

    @Column("Location")
    private String location;

    @Column("CreatedDate")
    private Timestamp createdDate;

    @Column("ModifiedDate")
    private Timestamp modifiedDate;

    @Column("IsDeleted")
    private boolean isDeleted;

}
