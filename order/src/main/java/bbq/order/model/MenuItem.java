package bbq.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
    private UUID id;
    private BigDecimal price;
    private String title;
    private String description;
    private String imageUrl;
}
