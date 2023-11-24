package subway.view;

import java.util.Scanner;
import subway.enums.LineForm;
import subway.enums.MainForm;
import subway.enums.SectionForm;
import subway.enums.StationForm;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readMainFeature() {
        System.out.println(MainForm.MAIN_MASSAGE.getMessage());
        System.out.println(MainForm.USER_FEATURE.getMessage());
        return scanner.nextLine().trim();
    }

    public static String readStationFeature() {
        System.out.println(StationForm.MAIN_STATION_MESSAGE.getMessage());
        System.out.println(MainForm.USER_FEATURE.getMessage());
        return scanner.nextLine().trim();
    }

    public static String readLineFeature() {
        System.out.println(LineForm.MAIN_LINE_MESSAGE.getMessage());
        System.out.println(MainForm.USER_FEATURE.getMessage());
        return scanner.nextLine().trim();
    }

    public static String readSectionFeature() {
        System.out.println(SectionForm.MAIN_SECTION_MESSAGE.getMessage());
        System.out.println(MainForm.USER_FEATURE.getMessage());
        return scanner.nextLine().trim();
    }

    public static String readAddStation() {
        OutputView.printStationAdd();
        return scanner.nextLine().trim();
    }

    public static String readDeleteStation() {
        OutputView.printStationDelete();
        return scanner.nextLine().trim();
    }

    public static String readAddLine() {
        OutputView.printLineAdd();
        return scanner.nextLine().trim();
    }

    public static String readFirst() {
        OutputView.printFirst();
        return scanner.nextLine().trim();
    }

    public static String readLast() {
        OutputView.printLast();
        return scanner.nextLine().trim();
    }

    public static String readDeleteLine( ){
        OutputView.printLineDelete();
        return scanner.nextLine().trim();
    }

    public static String readAddSectionLine( ){
        OutputView.printAddSectionLine();
        return scanner.nextLine().trim();
    }

    public static String readAddSectionStation( ){
        OutputView.printAddSectionStation();
        return scanner.nextLine().trim();
    }

    public static String readAddSectionSequence( ){
        OutputView.printAddSectionSequence();
        return scanner.nextLine().trim();
    }

    public static String readDeleteSectionLine( ){
        OutputView.printDeleteSectionLine();
        return scanner.nextLine().trim();
    }

    public static String readDeleteSectionStation( ){
        OutputView.printDeleteSectionStation();
        return scanner.nextLine().trim();
    }
}
