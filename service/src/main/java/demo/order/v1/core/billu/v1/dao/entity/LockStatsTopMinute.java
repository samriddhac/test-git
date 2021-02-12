package demo.order.v1.core.billu.v1.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 12 Feb, 2021 6:19:02 PM by Hibernate Tools 5.4.21.Final
/**
 * LockStatsTopMinute generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "LOCK_STATS_TOP_MINUTE")
public class LockStatsTopMinute implements java.io.Serializable {

    private LockStatsTopMinuteId id;
}
