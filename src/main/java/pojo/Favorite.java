package pojo;
import lombok.*;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
public class Favorite {
    private Long favoriteId;
    private Long userId;
    private Long productId;
}