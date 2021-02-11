package demo.order.v1.core.shipment.v6.dao.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.PersistenceContext;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import demo.order.v1.core.shipment.v6.dao.repository.*;
import demo.order.v1.core.shipment.v6.dao.mapper.*;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.shipment.v6.dao")
// @EnableJpaRepositories(basePackages = { "demo.order.v1.core.shipment.v6.dao" })
@EntityScan(basePackages = {"demo.order.v1.core.shipment.v6.dao"})
public class TestConfiguration {
  @MockBean public EntityManager entityManager;

  @MockBean public EntityManagerFactory entityManagerFactory;

  @MockBean public OrderMasterRepository orderMasterRepository;
  @MockBean public Object object;

  @MockBean public OrderToOrderMapper orderToOrderMapper;

  @MockBean public ReturnOrderToReturnOrderMapper returnOrderToReturnOrderMapper;

  @MockBean public BadOrderToBadOrderMapper badOrderToBadOrderMapper;
}
