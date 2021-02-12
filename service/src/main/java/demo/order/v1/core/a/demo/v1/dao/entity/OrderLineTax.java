package demo.order.v1.core.a.demo.v1.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 12 Feb, 2021 1:36:01 PM by Hibernate Tools 5.4.21.Final
/**
 * OrderLineTax generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "OrderLineTax")
public class OrderLineTax implements java.io.Serializable {

    @PrimaryKey
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "Order_Pk")
    private String orderPk;

    @Column(name = "Order_Id")
    private String orderId;

    @Column(name = "Line_Id")
    private Long lineId;

    @Column(name = "Tax_Type")
    private String taxType;

    @Column(name = "Tax_Value")
    private String taxValue;

    @Column(name = "Tax_Fee")
    private String taxFee;

    @Column(name = "Tax_Date")
    private String taxDate;
}
