CREATE TABLE IF NOT EXISTS User
(
    "Id" bigint NOT NULL auto_increment,
    "FirstName" VARCHAR(80) NOT NULL,
    "LastName" VARCHAR(80) NOT NULL,
    "FirstName" VARCHAR(80) NOT NULL,
    "Email" VARCHAR(256) NOT NULL,
    "Password" VARCHAR(256) NOT NULL,
    "SecurityToken" VARCHAR(256) ,
    "CreatedDate" NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "ModifiedDate" NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    "IsDeleted" boolean,
    PRIMARY KEY(Id)
)