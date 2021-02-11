package demo.order.v1.core.shipment.v6.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import demo.order.v1.core.shipment.v6.dao.entity.LockStatsTotal10minuteId;

public interface LockStatsTotal10minuteIdRepository
    extends JpaRepository<LockStatsTotal10minuteId, Long>,
        JpaSpecificationExecutor<LockStatsTotal10minuteId> {}
