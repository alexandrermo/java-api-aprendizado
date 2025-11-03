package ale.learning.demo.presentation.shared.domain;

import lombok.Data;

@Data
public class Pageable {
    private Long page;
    private Long pageSize;
}
