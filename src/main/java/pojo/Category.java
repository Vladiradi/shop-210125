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
public class Category {
    private Long categoryId;
    private String name;
}