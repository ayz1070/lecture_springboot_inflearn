package hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter @Setter
//@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="name", insertable = true, updatable = true, nullable = false, columnDefinition = "varchar(100) default='EMPTY'")
    private String username;


    private int age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    private LocalDate testLocalDate;
    private LocalDateTime textLocalDateTime;

    @Lob
    private String description;

    @Transient
    private int temp;

    public Member() {

    }
}
