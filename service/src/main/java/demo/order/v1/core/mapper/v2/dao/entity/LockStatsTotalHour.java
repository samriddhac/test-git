package demo.order.v1.core.mapper.v2.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 12 Feb, 2021 10:06:29 PM by Hibernate Tools 5.4.21.Final
/**
 * LockStatsTotalHour generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "LOCK_STATS_TOTAL_HOUR")
public class LockStatsTotalHour implements java.io.Serializable {

    private LockStatsTotalHourId id;
}
