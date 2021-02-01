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
@Table("User")
public class User {
    @Id
    @Column("Id")
    private BigDecimal id;

    @Column("FirstName")
    private String firstName;

    @Column("LastName")
    private String lastName;
    
    @Column("Email")
    private String email;

    @Column("Password")
    private String password;

    @Column("CreatedDate")
    private Timestamp createdDate;

    @Column("ModifiedDate")
    private Timestamp modifiedDate;

}
