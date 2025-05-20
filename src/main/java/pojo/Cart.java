package pojo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder

public class Cart {
    private Long cardId;
    private Long userId;
}