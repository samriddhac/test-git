package demo.order.v1.core.shipment.v3.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 11 Feb, 2021 1:05:26 PM by Hibernate Tools 5.4.21.Final
/**
 * LockStatsTotalMinute generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "LOCK_STATS_TOTAL_MINUTE")
public class LockStatsTotalMinute implements java.io.Serializable {

    private LockStatsTotalMinuteId id;
}
