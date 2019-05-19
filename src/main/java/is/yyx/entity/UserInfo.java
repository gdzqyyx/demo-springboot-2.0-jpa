package is.yyx.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Ye.Yunxi
 */
@Entity
@Table(schema = "test", name = "t_user", uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserInfo extends InfoBase {

    private static final long serialVersionUID = 316184412530980917L;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "description", length = 2048)
    private String description;
}
