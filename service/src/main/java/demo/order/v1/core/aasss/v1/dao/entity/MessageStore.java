package demo.order.v1.core.aasss.v1.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

// Generated 12 Feb, 2021 8:07:36 PM by Hibernate Tools 5.4.21.Final
/**
 * MessageStore generated by hbm2java
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "MessageStore")
public class MessageStore implements java.io.Serializable {

    @PrimaryKey
    @Column(name = "MessageId", nullable = false)
    private String messageId;

    @Column(name = "Message")
    private String message;
}
