package demo.order.v1.core.group.v2.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 11 Feb, 2021 3:51:43 PM by Hibernate Tools 5.4.21.Final
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
