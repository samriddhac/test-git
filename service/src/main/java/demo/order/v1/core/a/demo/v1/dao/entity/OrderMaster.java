package demo.order.v1.core.a.demo.v1.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 12 Feb, 2021 1:36:01 PM by Hibernate Tools 5.4.21.Final
/**
 * OrderMaster generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OrderMaster")
public class OrderMaster implements java.io.Serializable {

    @PrimaryKey
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "Order_Pk")
    private String orderPk;

    @Column(name = "Order_Id")
    private String orderId;

    @Column(name = "Order_Type")
    private String orderType;

    @Column(name = "Reservation_Nbr")
    private String reservationNbr;

    @Column(name = "Seller_Order_Id")
    private String sellerOrderId;

    @Column(name = "Order_Status")
    private String orderStatus;

    @Column(name = "Service_Name")
    private String serviceName;

    @Column(name = "Created_By")
    private String createdBy;

    @Column(name = "Source_Channel")
    private String sourceChannel;
}
