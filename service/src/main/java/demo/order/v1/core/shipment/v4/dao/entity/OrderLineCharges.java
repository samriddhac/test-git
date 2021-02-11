package demo.order.v1.core.shipment.v4.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 11 Feb, 2021 2:31:37 PM by Hibernate Tools 5.4.21.Final
/**
 * OrderLineCharges generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OrderLineCharges")
public class OrderLineCharges implements java.io.Serializable {

    @PrimaryKey
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "Order_Pk")
    private String orderPk;

    @Column(name = "Order_Id")
    private String orderId;

    @Column(name = "Line_Id")
    private Long lineId;

    @Column(name = "Charge_Type")
    private String chargeType;

    @Column(name = "Charge_Value")
    private String chargeValue;

    @Column(name = "Charge_Fee")
    private String chargeFee;

    @Column(name = "Charge_Date")
    private String chargeDate;
}
