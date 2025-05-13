package pojo;
import lombok.*;

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