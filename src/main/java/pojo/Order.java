package pojo;
import lombok.*;
import java.sql.Timestamp;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
public class Order {
    private Long orderId;
    private Long userId;
    private Timestamp createdAt;
    private String deliveryAddress;
    private String contactPhone;
    private String deliveryMethod;
    private String status;
    private Timestamp updatedAt;
}