package demo.v33.core.avc.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 2 Feb, 2021 7:55:19 PM by Hibernate Tools 5.4.21.Final
/**
 * LineQuantityStatus generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "LineQuantityStatus")
public class LineQuantityStatus implements java.io.Serializable {

    @PrimaryKey
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "Order_Pk")
    private String orderPk;

    @Column(name = "Order_Id")
    private String orderId;

    @Column(name = "Line_Id")
    private Long lineId;

    @Column(name = "Fulfilment_Location")
    private String fulfilmentLocation;

    @Column(name = "Fulfilment_Divison")
    private String fulfilmentDivison;

    @Column(name = "Fulfilment_Store")
    private String fulfilmentStore;

    @Column(name = "Status_Quantity")
    private String statusQuantity;

    @Column(name = "Status")
    private String status;
}
