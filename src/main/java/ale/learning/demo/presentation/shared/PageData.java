package ale.learning.demo.presentation.shared;

import ale.learning.demo.application.shared.SortOrderEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageData {
    private Long size;
    private Long index;
    private Long totalPages;
    private SortOrderEnum direction;
}
