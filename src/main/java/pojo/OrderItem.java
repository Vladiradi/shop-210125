package pojo;
import lombok.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
public class OrderItem {
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private Integer quantity;
    private BigDecimal priceAtPurchase;
}
