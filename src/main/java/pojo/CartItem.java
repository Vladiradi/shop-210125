package pojo;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
public class CartItem {
    private Long cartItemId;
    private Long cartId;
    private Long productId;
    private Integer quantity;
}