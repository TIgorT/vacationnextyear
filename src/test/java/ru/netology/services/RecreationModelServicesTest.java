package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class RecreationModelServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/model.csv")
    void numberMonthsNextYearFirstOption(long expected, int income, int expenses, int threshold) {
        RecreationModelServices service = new RecreationModelServices();
        // вызываем целевой метод:
        long actual = service.calculation(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}