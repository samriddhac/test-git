package demo.order.v1.core.aaaa.dao.entity;

// Generated 12 Feb, 2021 7:35:48 PM by Hibernate Tools 5.4.21.Final
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

/**
 * LockStatsTotalHourId generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
public class LockStatsTotalHourId implements java.io.Serializable {

    @Column(name = "INTERVAL_END")
    private Date intervalEnd;

    @Column(name = "TOTAL_LOCK_WAIT_SECONDS")
    private Double totalLockWaitSeconds;
}
