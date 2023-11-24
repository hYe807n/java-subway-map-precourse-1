package subway.domain;

public class Station {
    private String name;

    public Station(String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isLine() {
        return LineRepository.lines().stream().anyMatch(
            line -> line.stations.contains(this.name)
        );
    }

    private void validate(String name) {
        if (StationRepository.searchStation(name) != null) {
            throw new IllegalArgumentException("지하철 역 이름이 중복되었습니다.");
        }
    }
}
