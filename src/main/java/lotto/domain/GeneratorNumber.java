package lotto.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratorNumber {

    private static final int LIMIT_MINIMUM_NUMBER = 1;
    private static final int LIMIT_MAXIMUM_NUMBER = 45;
    private static final List<Integer> numbers
        = IntStream.range(LIMIT_MINIMUM_NUMBER, LIMIT_MAXIMUM_NUMBER + 1)
        .boxed().collect(Collectors.toList());

    public static List<Integer> generateLottoNumbers() {
        Collections.shuffle(numbers);
        final List<Integer> lottoNumbers = numbers.subList(0, 6);
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }
}