import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("해당 시뮬레이션은 픽션이 아닌 실화에 기반 했음을 알려 드립니다."
                         + "\n모든 답변은 주어지는 보기의 번호를 입력해 주시면 됩니다.\n");

        Scanner sc = new Scanner(System.in);
        handleAns1(sc);
        sc.close();
    }

    // 프로그램 시작 여부
    private static void handleAns1(Scanner sc) {
        System.out.println("본격적으로 오윤환의 하루를 시작하기 원하신다면 숫자 1을 입력해 주세요. 2를 입력할 경우 해당 프로그램은 종료 됩니다.");

        int answer1 = sc.nextInt();

        if (answer1 == 1) {
            System.out.println("본격 백수 오윤환의 하루를 시작합니다.");
            handleAns2(sc); // 1번 선택에 대한 다음 질문으로 넘어감

        } else if (answer1 == 2) {
            System.out.println("프로그램을 종료합니다. 다음에 만나요!");
            sc.close();

          // 올바른 답변이 입력되지 않았을 경우
        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns1(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 기상시간 선택
    private static void handleAns2(Scanner sc) {
        System.out.println("\n\nQ.백수 오윤환의 하루의 시작은 늘 뒤죽박죽 입니다. 오늘은 몇시에 기상을 할까요?" +
                           "\n1.오전 9시    2.오후 2시");

        int answer2 = sc.nextInt();

        if (answer2 == 1) {
            System.out.println("오전 9시에 기상을 합니다.");
            handleAns3(sc); // 오전 9시에 기상을 합니다

        } else if (answer2 == 2) {
            System.out.println("오후 2시에 기상을 합니다.");
              handleAns4(sc); // 오후 2시에 기상을 합니다

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns2(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오전 9시 기상 후 상황 선택
    private static void handleAns3(Scanner sc) {
        System.out.println("\n\nQ.오늘은 웬일인지 오전 9시에 일어난 오윤환, 진짜 백수는 기상 후 바로 씻을까요?" +
                           "\n1.아무리 백수여도 그렇지 사람이면 바로 씻는다    2.백수는 그런 거 모른다. 나중에 씻자");

        int answer3 = sc.nextInt();

        if (answer3 == 1) {
            System.out.println("백수지만 그래도 아직 사람입니다. 오윤환은 곧장 씻습니다.");
            handleAns5(sc); // 백수지만 그래도 아직 사람입니다. 오윤환은 곧장 씻습니다

        } else if (answer3 == 2) {
            System.out.println("역시 백수는 사람 취급을 하면 안 됩니다. 오윤환은 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다.");
            handleAns6(sc); // 오윤환은 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns3(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오후 2시에 기상 후 상황 선택
    private static void handleAns4(Scanner sc) {
        System.out.println("\n\nQ.역시 백수 답게 오후 2시에 일어난 오윤환, 진짜 백수는 기상 후 바로 씻을까요?" +
                "\n1.아무리 백수여도 늦게 일어나면 바로 씻는다    2.백수 답게 이왕 늦게 일어난 거 나중에 씻자");

        int answer4 = sc.nextInt();

        if (answer4 == 1) {
            System.out.println("백수지만 그래도 아직 사람입니다. 오윤환은 곧장 씻습니다.");
            handleAns7(sc); // 오윤환은 곧장 씻습니다

        } else if (answer4 == 2) {
            System.out.println("역시 백수는 사람 취급을 하면 안 됩니다. 오윤환은 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다.");
            handleAns8(sc); // 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns4(sc); // 다시 질문으로 되돌아 감
        }

    }


    // 오전 9시 기상 후 바로 씻은 뒤 상황 선택
    private static void handleAns5(Scanner sc) {
        System.out.println("\n\nQ.부지런히 아침을 맞이한 오윤환, 오늘은 아침을 챙겨 먹을까요?" +
                "\n1.원래 백수는 이런 거 잘 챙겨 먹는다     2.오늘은 아침을 먹지 않는다");

        int answer5 = sc.nextInt();

        if (answer5 == 1) {
            System.out.println("백수지만 그래도 아직 사람입니다. 오윤환은 곧장 씻습니다.");
            handleAns9(sc); // 오윤환은 곧장 씻습니다

        } else if (answer5 == 2) {
            System.out.println("역시 백수는 사람 취급을 하면 안 됩니다. 오윤환은 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다.");
            handleAns10(sc); // 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns5(sc); // 다시 질문으로 되돌아 감
        }
    }

    // 오전 9시 기상 후 바로 씻지 않은 뒤 상황 선택
    private static void handleAns6(Scanner sc) {
        System.out.println("\n\nQ.역시 백수 오윤환, 침대에서 뒹굴거리던 중 배가 고파옵니다. 오늘의 아침 메뉴로 무엇을 먹을까요?" +
                "\n1.냉장고에 있는 반찬 아무거나 대충 먹는다    2.편의점에서 맛있는 참치 가득 유부초밥을 사와 먹는다");

        int answer6 = sc.nextInt();

        if (answer6 == 1) {
            System.out.println("백수지만 그래도 아직 사람입니다. 오윤환은 곧장 씻습니다.");
            handleAns11(sc); // 1번 선택에 대한 다음 질문으로 이동

        } else if (answer6 == 2) {
            System.out.println("역시 백수는 사람 취급을 하면 안 됩니다. 오윤환은 바로 씻지 않고 밍기적 침대에서 뒹굴거립니다.");
            handleAns12(sc); // 2번 선택에 대한 질문으로 이동

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns6(sc); // 다시 질문으로 되돌아 감
        }
    }

    // 오후 2시 기상 후 바로 씻은 뒤 상황 선택
    private static void handleAns7(Scanner sc) {

    }

    // 오후 2시 기상 후 바로 씻지 않은 뒤 상황 선택
    private static void handleAns8(Scanner sc) {
    }


} // end of public class Main