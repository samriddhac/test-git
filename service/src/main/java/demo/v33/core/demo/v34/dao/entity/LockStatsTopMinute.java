package demo.v33.core.demo.v34.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 2 Feb, 2021 11:47:57 AM by Hibernate Tools 5.4.21.Final
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
