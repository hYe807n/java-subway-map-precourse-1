package subway.domain;

import java.util.Collections;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineRepositoryTest {

    @DisplayName("\"2호선\"을 노선에 추가")
    @Test
    void addLines() {
        LineRepository.addLine(new Line("2호선"));
        Assertions.assertTrue(LineRepository.lines().stream().anyMatch( line ->
            line.getName().equals("2호선")));
    }

    @DisplayName("노선 이름 중복 시 예외 처리")
    @Test
    void addLineByDuplicateName() {
        LineRepository.addLine(new Line("2호선"));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            LineRepository.addLine(new Line("2호선")));
    }

    @DisplayName("\"2호선\" 노선 삭제")
    @Test
    void deleteLineByName() {
        LineRepository.addLine(new Line("2호선"));
        LineRepository.deleteLineByName("2호선");
        Assertions.assertNull(LineRepository.searchLine("2호선"));
    }

    @DisplayName("노선 이름을 통해 \"2호선\" 노선 검색하는 기능")
    @Test
    void searchLineByName() {
        LineRepository.addLine(new Line("2호선"));
        Assertions.assertEquals(LineRepository.searchLine("2호선").getName(), "2호선");
    }

    @DisplayName("\"2호선\"에 \"신림역\" 구간 추가 기능")
    @Test
    void addSectionsByLineStation() {
        LineRepository.addLine(new Line("2호선"));
        LineRepository.addSections("2호선", "1", "신림역");
        Assertions.assertEquals(LineRepository.searchLine("2호선").getStations()
                .stream().map(Station::getName).collect(Collectors.toList()),
            Collections.singletonList("신림역"));
    }
}