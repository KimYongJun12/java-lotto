package lotto;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        isSixNumbers(numbers);
        isDuplicated(numbers);
        isInRange(numbers);
    }

    // TODO: 추가 기능 구현

    private void isSixNumbers(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
    private void isDuplicated(List<Integer> numbers) {
        HashSet<Integer> NOT_DUPLICATED_NUMBERS = new HashSet<>();
        for (int i : numbers) {
            NOT_DUPLICATED_NUMBERS.add(i);
        }
        if (NOT_DUPLICATED_NUMBERS.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void isInRange(List<Integer> numbers) {
        for (int i : numbers) {
            if (i < 1 || i > 45) {
                throw new IllegalArgumentException();
            }
        }
    }

    public List<Integer> lottoNumbers() {
        return Collections.unmodifiableList(this.numbers);
    }
}
