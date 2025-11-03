package ale.learning.demo.presentation.shared.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page<T> {
    private List<T> data;
    private PageData page;
}
