package ale.learning.demo.presentation.shared.domain;

import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Page<T> {
    private List<T> data;
    private PageData page;

    public <R> Page<R> map(Function<T, R> mapper) {
        List<R> newData = this.data.stream()
                .map(mapper)
                .toList();

        return Page.<R>builder().data(newData).page(this.page).build();
    }
}
