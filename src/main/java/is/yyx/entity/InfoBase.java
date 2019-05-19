package is.yyx.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Ye.Yunxi
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
class InfoBase implements Serializable {

    private static final long serialVersionUID = 6992589923026558563L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time", nullable = false)
    @CreatedDate
    private LocalDateTime createTime;

    @Column(name = "update_time", nullable = false)
    @LastModifiedDate
    private LocalDateTime updateTime;

}
