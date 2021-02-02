package demo.v33.core.avc.v5.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 2 Feb, 2021 8:07:49 PM by Hibernate Tools 5.4.21.Final
/**
 * LockStatsTop10minute generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "LOCK_STATS_TOP_10MINUTE")
public class LockStatsTop10minute implements java.io.Serializable {

    private LockStatsTop10minuteId id;
}
