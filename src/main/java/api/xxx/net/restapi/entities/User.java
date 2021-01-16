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
    BigDecimal id;

    @Column("FirstName")
    String firstName;

    @Column("LastName")
    String lastName;
    
    @Column("Email")
    String email;

    @Column("Password")
    String password;

    @Column("CreatedDate")
    Timestamp createdDate;

    @Column("ModifiedDate")
    Timestamp modifiedDate;

    @Column("IsDeleted")
    String isDeleted;
}
