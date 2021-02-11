package demo.order.v1.core.shipment.v6.dao.entity;

// Generated 11 Feb, 2021 4:00:55 PM by Hibernate Tools 5.4.21.Final
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * LockStatsTopHour generated by hbm2java
 */
@Entity
@Table(name = "LOCK_STATS_TOP_HOUR", schema = "SPANNER_SYS")
@Getter
@Setter
@NoArgsConstructor
public class LockStatsTopHour implements java.io.Serializable {

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "intervalEnd", column = @Column(name = "INTERVAL_END", length = 35)), @AttributeOverride(name = "rowRangeStartKey", column = @Column(name = "ROW_RANGE_START_KEY")), @AttributeOverride(name = "lockWaitSeconds", column = @Column(name = "LOCK_WAIT_SECONDS", precision = 15, scale = 16)), @AttributeOverride(name = "sampleLockRequests", column = @Column(name = "SAMPLE_LOCK_REQUESTS")) })
    private LockStatsTopHourId id;
}
