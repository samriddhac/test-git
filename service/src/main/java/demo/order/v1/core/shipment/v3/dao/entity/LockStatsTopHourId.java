package demo.order.v1.core.shipment.v3.dao.entity;

// Generated 11 Feb, 2021 1:05:26 PM by Hibernate Tools 5.4.21.Final
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

/**
 * LockStatsTopHourId generated by hbm2java
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class LockStatsTopHourId implements java.io.Serializable {

    @Column(name = "INTERVAL_END")
    private Date intervalEnd;

    @Column(name = "ROW_RANGE_START_KEY")
    private byte[] rowRangeStartKey;

    @Column(name = "LOCK_WAIT_SECONDS")
    private Double lockWaitSeconds;

    @Column(name = "SAMPLE_LOCK_REQUESTS")
    private Serializable sampleLockRequests;
}
