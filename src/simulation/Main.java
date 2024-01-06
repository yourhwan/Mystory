package simulation;

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
            System.out.println("백수는 이런 거 원래 잘 챙긴다, 아침을 챙겨 먹는 오윤환.");
            handleAns9(sc); // 아침을 챙겨 먹는다

        } else if (answer5 == 2) {
            System.out.println("원래 아침을 잘 챙겨 먹지 않는 오윤환, 오늘도 아침을 거른다.");
            handleAns10(sc); // 아침을 거른다

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns5(sc); // 다시 질문으로 되돌아 감
        }
    }

    // 오전 9시 기상 후 씻지 않은 뒤 상황 선택
    private static void handleAns6(Scanner sc) {
        System.out.println("\n\nQ.역시 백수 오윤환, 침대에서 뒹굴거리던 중 배가 고파옵니다. 오늘의 아침 메뉴로 무엇을 먹을까요?" +
                "\n1.냉장고에 있는 반찬 아무거나 대충 먹는다    2.편의점에서 맛있는 참치 가득 유부초밥을 사와 먹는다");

        int answer6 = sc.nextInt();

        if (answer6 == 1) {
            System.out.println("통장 잔고를 보고 한숨이 나오는 오윤환, 냉장고에 있는 반찬을 아무거나 먹는다.");
            handleAns11(sc); // 냉장고 반찬 먹기

        } else if (answer6 == 2) {
            System.out.println("최근 편의점 참치 가득 유부초밥에 빠진 오윤환, 오늘도 텅장 잔고를 털어 유부초밥을 먹는다.");
            handleAns12(sc); // 유부초밥 먹기

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns6(sc); // 다시 질문으로 되돌아 감
        }
    }

    // 오후 2시 기상 후 바로 씻은 뒤 상황 선택
    private static void handleAns7(Scanner sc) {
        System.out.println("\n\nQ.비록 늦게 일어났지만 양심은 있는지 바로 씻고 나온 오윤환, 허기진 배를 채우기 위해 점심을 먹으려고 합니다. 무엇을 먹을까요?" +
                           "\n1.집에 있는 밥을 먹는다    2.배달을 시켜 먹는다");

        int answer7 = sc.nextInt();

        if (answer7 == 1) {
            System.out.println("잔고에 돈이 없는 백수 오윤환, 대충 집에 있는 반찬으로 끼니를 떼운다.");
            handleAns13(sc);

        } else if (answer7 == 2) {
            System.out.println("간당간당한 잔고지만 맛있는 밥은 먹어야 하는 백수 오윤환, 배달 어플을 켜본다.");
            handleAns14(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns7(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오후 2시 기상 후 바로 씻지 않은 뒤 상황 선택
    private static void handleAns8(Scanner sc) {
        System.out.println("\n\nQ.백수답게 늦게 일어난 후 씻지도 않은 오윤환, 무엇을 할까요?" +
                "\n1.트위치를 본다    2.오늘은 쿠팡 알바를 가는 날이었다, 밥을 먹자");

        int answer8 = sc.nextInt();

        if (answer8 == 1) {
            System.out.println("백수의 엘리트 코스, 늦잠 후 바로 트위치 보기를 시전하는 오윤환.");
            handleAns15(sc);

        } else if (answer8 == 2) {
            System.out.println("오늘은 쿠팡 알바를 가는 날이었다, 가기 전 밥을 챙겨 먹자.");
            handleAns16(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns8(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오전 9시 씻고 아침 먹은 후 상황 선택
    private static void handleAns9(Scanner sc) {
        System.out.println("\n\nQ.집밥으로 든든히 배를 채운 오윤환, 오늘의 일정을 확인 해본다. 오늘의 일정은 무엇일까?" +
                "\n1.오랜만에 밖에 나가 기분 전환을 한다    2. 언제까지 백수로 살 것인가, 공부를 하자");

        int answer9 = sc.nextInt();

        if (answer9 == 1) {
            System.out.println("알바 갈 때를 제외하고 늘 집에만 있는 방구석 백수 오윤환, 오늘은 외출을 한다.");
            handleAns17(sc); // 외출

        } else if (answer9 == 2) {
            System.out.println("백수 탈출을 기원하며 공부를 하기로 결심한 오윤환.");
            handleAns18(sc); // 공부

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns9(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오전 9시 씻고 아침 거른 후 상황 선택
    private static void handleAns10(Scanner sc) {
        System.out.println("\n\nQ.평소 아침을 안 먹는 오윤환, 오늘도 아침을 거르고 할 일을 체크 한다. 이제 무엇을 할까?" +
                           "\n1.일찍 일어났으니 부지런히 방 청소를 하자    2.집 밖을 잘 안 나가지만 오늘은 산책을 해보자");

        int answer10 = sc.nextInt();

        if (answer10 == 1) {
            System.out.println("요즘 방 청소를 부지런히 하는 오윤환, 열심히 방 청소를 한다.");
            handleAns19(sc); // 방 청소

        } else if (answer10 == 2) {
            System.out.println("부지런한 하루를 보내고 있는 오윤환, 상쾌하게 산책을 한다.");
            handleAns20(sc); // 공부

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns10(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오전 9시 안 씻고 집 밥 먹은 후 상황 선택
    private static void handleAns11(Scanner sc) {
        System.out.println("\n\nQ.근본 집 밥으로 배를 든든히 채운 오윤환, 일찍 일어난 김에 공부를 하고자 한다. 어디서 공부를 할까?" +
                           "\n1.집에서 공부를 한다    2.자주 가던 카페에 가서 공부를 한다");

        int answer11 = sc.nextInt();

        if (answer11 == 1) {
            System.out.println("더블모니터가 가능한 집에서 공부하는게 좋은 오윤환, 오늘은 집에서 공부를 하자.");
            handleAns21(sc); // 집에서 공부

        } else if (answer11 == 2) {
            System.out.println("집에 있으면 눕고싶어진다, 카페에서 공부를 하자.");
            handleAns22(sc); // 카페 공부

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns11(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오전 9시 씻지 않은 뒤 유부초밥 먹은 후 상황 선택
    private static void handleAns12(Scanner sc) {
        System.out.println("\n\nQ.역시 편의점 유부 초밥은 진리다. 배도 든든히 채운 오윤환, 이제 무엇을 할까?" +
                           "\n1.오늘은 학원을 같이 다녔던 사람들을 만나는 날, 씻고 홍대로 가자    2.오랜만에 엄마와 데이트를 하자");

        int answer12 = sc.nextInt();

        if (answer12 == 1) {
            System.out.println("취업을 한 학원사람들을 만나기로 했던 날, 홍대로 향하는 백수 오윤환.");
            handleAns23(sc); // 홍대로 간다

        } else if (answer12 == 2) {
            System.out.println("오랜만에 엄마와 데이트를 하기로 하고 나갈 준비를 마친 백수 오윤환.");
            handleAns24(sc); // 엄마와 데이트

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns12(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오후 2시 씻고 집 밥
    private static void handleAns13(Scanner sc) {
        System.out.println("\n\nQ.집에 있는 밥으로 대충 끼니를 해결한 오윤환, 이제 무엇을 할까요?" +
                           "\n1.방에 먼지가 가득 쌓였다, 방청소를 하자    2.밥은 먹었지만 입이 심심하다, 간식을 먹자");

        int answer13 = sc.nextInt();

        if (answer13 == 1) {
            System.out.println("최근 방청소는 정기적으로 하는 백수 오윤환, 방청소를 시작한다.");
            handleAns25(sc);

        } else if (answer13 == 2) {
            System.out.println("밥 배와 디저트 배는 다른 백수 오윤환, 간식이 먹고싶어 부엌을 둘러본다.");
            handleAns26(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns13(sc);
        }

    }

    // 오후 2시 씻고 배달
    private static void handleAns14(Scanner sc) {
        System.out.println("\n\nQ.배달 음식이 땡기는 백수 오윤환, 오늘은 어떤 메뉴를 주문할까?" +
                "\n1.한동안 먹고 싶었던 신전 떡볶이를 주문하자    2.첫 끼는 든든하게! 목살구이와 볶음밥 세트를 주문하자 ");

        int answer14 = sc.nextInt();

        if (answer14 == 1) {
            System.out.println("유튜브에서 떡볶이 영상을 보고 떡볶이에 꽂힌 백수 오윤환, 신전 떡볶이를 주문 한다.");
            handleAns27(sc);

        } else if (answer14 == 2) {
            System.out.println("첫 끼는 든든하게 먹어야만 하는 백수 오윤환, 목살구이와 볶음밥 세트를 주문 한다.");
            handleAns28(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns14(sc);
        }
    }



} // end of public class simulation.Main
