package is.yyx.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Ye.Yunxi
 */
@Entity
@Table(schema = "test", name = "t_user", uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
@Data
@EqualsAndHashCode(callSuper = true)
public class UserInfo extends InfoBase {

    private static final long serialVersionUID = 316184412530980917L;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "description", length = 1024)
    private String description;
}
