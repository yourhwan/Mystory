package simulation;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("해당 시뮬레이션은 실화에 기반 했음을 알려 드립니다."
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
            System.out.println("백수의 엘리트 코스, 늦잠 후 바로 트위치 보기를 시전하는 백수 오윤환.");
            handleAns15(sc);

        } else if (answer8 == 2) {
            System.out.println("잊고 있었다, 오늘은 쿠팡 알바를 가는 날이다, 가기 전 밥을 챙겨 먹는 백수 오윤환.");
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
            handleAns20(sc); // 산책

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns10(sc);
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

    // 오후 2시 씻고 집 밥 이후
    private static void handleAns13(Scanner sc) {
        System.out.println("\n\nQ.집에 있는 밥으로 대충 끼니를 해결한 오윤환, 이제 무엇을 할까요?" +
                           "\n1.방에 먼지가 가득 쌓였다, 방청소를 하자    2.밥은 먹었지만 입이 심심하다, 간식을 먹자");

        int answer13 = sc.nextInt();

        if (answer13 == 1) {
            System.out.println("최근 방청소는 정기적으로 하는 백수 오윤환, 방청소를 시작한다.");
            handleAns25(sc); // 방청소

        } else if (answer13 == 2) {
            System.out.println("밥 배와 디저트 배는 다른 백수 오윤환, 간식이 먹고싶어 부엌을 둘러본다.");
            handleAns26(sc); // 간식

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns13(sc);
        }

    }

    // 오후 2시 씻고 배달메뉴 선택
    private static void handleAns14(Scanner sc) {
        System.out.println("\n\nQ.배달 음식이 땡기는 백수 오윤환, 오늘은 어떤 메뉴를 주문할까?" +
                "\n1.한동안 먹고 싶었던 신전 떡볶이를 주문하자    2.첫 끼는 든든하게! 목살구이와 볶음밥 세트를 주문하자 ");

        int answer14 = sc.nextInt();

        if (answer14 == 1) {
            System.out.println("유튜브에서 떡볶이 영상을 보고 떡볶이에 꽂힌 백수 오윤환, 신전 떡볶이를 주문 한다.");
            handleAns27(sc); // 신전 떡볶이

        } else if (answer14 == 2) {
            System.out.println("첫 끼는 든든하게 먹어야만 하는 백수 오윤환, 목살구이와 볶음밥 세트를 주문 한다.");
            handleAns28(sc); // 목살에 볶음밥

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns14(sc);
        }
    }

    // 오후 2시 안 씻고 바로 트위치 이후
    private static void handleAns15(Scanner sc) {
        System.out.println("\n\nQ.밥을 먹고 바로 침대에 누워 트위치에 들어간 백수 오윤환, 어떤 방송을 볼까?" +
                "\n1.자주 보던 예쁜 누나의 피아노 방송을 보자    2.최근 보기 시작한 노래하는 버츄얼 스트리머의 방송을 보자");

        int answer15 = sc.nextInt();

        if (answer15 == 1) {
            System.out.println("백수 오윤환은 신청곡을 잘 받아주는 예쁜 누나의 피아노 방송을 보기 시작한다.");
            handleAns29(sc);

        } else if (answer15 == 2) {
            System.out.println("최근 폭룡적으로 노래를 잘 하는 버츄얼 스트리머에 빠진 백수 오윤환, 바로 방송을 보기 시작한다.");
            handleAns30(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns15(sc);
        }
    }


    // 오후 2시 안 씻고 밥 이후
    private static void handleAns16(Scanner sc) {
        System.out.println("\n\nQ.급히 식사를 마친 백수 오윤환, 알바 출근 전까지 1시간 정도가 남았다, 출근 전까지 무엇을 할까?" +
                "\n1.일단 씻고 카페에서 음료를 사오자    2.일단 씻고 방청소를 해두자");

        int answer16 = sc.nextInt();

        if (answer16 == 1) {
            System.out.println("카페에서 음료를 사오기로 결심한 백수 오윤환, 대충 씻은 후 비교적 저렴한 컴포즈 커피로 향한다.");
            handleAns31(sc);

        } else if (answer16 == 2) {
            System.out.println("출근 전 후다닥 씻은 후 방청소를 시작하는 백수 오윤환.");
            handleAns32(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns16(sc); // 다시 질문으로 되돌아 감
        }

    }

    // 오전 9 밥 씻고 밥 기분전환 이후
    private static void handleAns17(Scanner sc) {
        System.out.println("\n\nQ.기분 전환을 위해 외출을 준비한다, 오늘은 어떤 옷을 입을까?" +
                "\n1.흑청+후드+코트+반스    2.분홍니트+연청+패딩+반스");

        int answer17 = sc.nextInt();

        if (answer17 == 1) {
            System.out.println("역시 옷은 어두운 색과 편한 옷이 좋다, 흑청+후드+코트+반스 를 입고 밖으로 나선다.");
            handleAns33(sc); // 외출

        } else if (answer17 == 2) {
            System.out.println("최근 칙칙한 옷만 입던 오윤환, 오랜만에 분홍니트+연청+패딩+반스 를 입고 밖으로 나선다.");
            handleAns34(sc); // 공부

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns17(sc); // 다시 질문으로 되돌아 감
        }

    }


    // 오전 9시 밥 씻고 공부결정 이후
    private static void handleAns18(Scanner sc) {
        System.out.println("\n\nQ.오늘은 공부를 하기로 결심한 백수 오윤환, ?" +
                "\n1.흑청+후드+코트+반스    2.분홍니트+연청+패딩+반스");

        int answer18 = sc.nextInt();

        if (answer18 == 1) {
            System.out.println("흑청+후드+코트+반스 공부할 때는 역시 편하게 후드티를 입는게 좋다. 옷을 챙겨 입고 밖으로 나선다.");
            handleAns35(sc);

        } else if (answer18 == 2) {
            System.out.println("분홍니트+연청+패딩+반스 평소 좋아하던 분홍니트를 입은 오윤환, 옷을 챙겨 입고 밖으로 나선다.");
            handleAns36(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns18(sc);
        }
    }

    private static void handleAns19(Scanner sc) {
        System.out.println("\n\nQ.방 청소를 시작한 오윤환, 오늘은 어디부터 청소를 시작할까?" +
                "\n1.개발자는 깨끗한 데스크가 필수지, 데스크 청소부터 하자    2.의문의 털(?)들과 먼지가 쌓인 바닥, 카펫이랑 바닥 청소부터 하자");

        int answer19 = sc.nextInt();

        if (answer19 == 1) {
            System.out.println("열심히 모니터와 키보드 그리고 책상 위를 닦는 백수 오윤환, 어느덧 책상 위가 깨끗해졌다.");
            handleAns37(sc); // 데스크 청소

        } else if (answer19 == 2) {
            System.out.println("청소기를 열심히 돌리는 백수 오윤환, 카펫은 돌돌이로 깔끔하게 문질러주니 어느새 깨끗해졌다.");
            handleAns38(sc); // 바닥 청소

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns19(sc); // 다시 질문으로 되돌아 감
        }

    }

    private static void handleAns20(Scanner sc) {
        System.out.println("\n\nQ.산책을 하던 중 카페 앞을 지나는 오윤환, 카페에서 커피 한 잔을 마실까?" +
                "\n1.산책 중에 마시는 커피는 달콤하다. 커피를 마시자    2.커피는 나중에 공부하러 나갈 수 있으니 참자");

        int answer20 = sc.nextInt();

        if (answer20 == 1) {
            System.out.println("카페에 들어가 커피를 주문하는 백수 오윤환, 얼죽아는 여전하다.");
            handleAns39(sc); // 카페

        } else if (answer20 == 2) {
            System.out.println("커피는 뒤로하고 집으로 돌아가는 백수 오윤환, 잔고도 아슬아슬하고 잘 참았다.");
            handleAns40(sc); // 집으로

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns20(sc);
        }

    }

    private static void handleAns21(Scanner sc) {
        System.out.println("\n\nQ.집에서 공부를 시작한 백수 오윤환, 오늘은 어떤 것을 공부할까?" +
                "\n1.솔직히 프로젝트를 시작하기엔 엄두가 안 난다, 알고리즘 공부를 하자    2.오늘은 다 까먹은 기초를 다져보자, 자바의 정석을 보며 문법 공부를 하자");

        int answer21 = sc.nextInt();

        if (answer21 == 1) {
            System.out.println("프로젝트를 하기엔 겁이 나는 백수 오윤환, 우선 알고리즘이라도 공부를 한다.");
            handleAns41(sc); // 알고리즘

        } else if (answer21 == 2) {
            System.out.println("오랜기간 공부를 제대로 안하며 기초 문법들도 까먹은 백수 오윤환, 자바의 정석 책을 보며 기초문법 공부를 한다.");
            handleAns42(sc); // 자바정석

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns21(sc);
        }

    }

    private static void handleAns22(Scanner sc) {
        System.out.println("\n\nQ.집에 있으면 자꾸 늘어진다. 씻은 뒤 집 밖을 나서는 백수 오윤환, 어느 카페로 갈까?" +
                "\n1.콘센트도 많고 눈치가 보이지 않아 오래 머무를 수 있는 엔젤리너스로 가자    2.집과 가장 가까운 거리의 카페인 스타벅스로 가자");

        int answer22 = sc.nextInt();

        if (answer22 == 1) {
            System.out.println("공부하기 좋은 카페는 엔젤리너스가 최고다, 엔젤리너스로 향하는 백수 오윤환.");
            handleAns43(sc); // 엔젤

        } else if (answer22 == 2) {
            System.out.println("날도 추우니 가깝고 공부하기 나쁘지 않은 스타벅스로 가자, 스타벅스로 향하는 백수 오윤환.");
            handleAns44(sc); // 스타벅스

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns22(sc);
        }

    }

    private static void handleAns23(Scanner sc) {
        System.out.println("\n\nQ.급하게 씻고 홍대로 향하는 백수 오윤환, 약속시간 까지 아슬하지만 역까지 가는 버스는 시간이 꽤나 남았다 어떻게 할까?" +
                "\n1.고민보다 GO, 차라리 역까지 뛰어가자    2.그냥 얌전히 버스를 기다렸다가 타자");

        int answer23 = sc.nextInt();

        if (answer23 == 1) {
            System.out.println("아무것도 안 하는 백수 주제에 늦을 수 없다, 역까지 달려가는 백수 오윤환.");
            handleAns45(sc); // 역까지 달리기

        } else if (answer23 == 2) {
            System.out.println("추위에 굴복하고 얌전히 버스를 기다렸다 타는 백수 오윤환, 힘든 것은 절대 못참나보다.");
            handleAns46(sc); // 버스 타기

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns23(sc); // 다시 질문으로 되돌아 감
        }

    }

    private static void handleAns24(Scanner sc) {
        System.out.println("\n\nQ.엄마와의 데이트는 오랜만이다, 오늘의 데이트 장소는 어디가 좋을까?" +
                "\n1.솔직히 동네를 벗어나기는 귀찮다, 집 앞 스타벅스로 가자    2.오랜만에 엄마와 데이트니까 백화점에 가서 아이쇼핑도 하고 커피도 마시자");

        int answer24 = sc.nextInt();

        if (answer24 == 1) {
            System.out.println("만사가 귀찮은 백수 오윤환, 엄마와 집 앞 스타벅스로 향한다.");
            handleAns47(sc); // 집 앞 스타벅스

        } else if (answer24 == 2) {
            System.out.println("동네를 벗어나긴 귀찮지만, 엄마와의 데이트 장소로 백화점만한 곳이 없다, 백화점으로 향하는 백수 오윤환.");
            handleAns48(sc); // 백화점으로

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns24(sc); // 다시 질문으로 되돌아 감
        }
    }

    private static void handleAns25(Scanner sc) {
        System.out.println("\n\nQ.방청소를 시작한 백수 오윤환, 갑자기 청소병이 도진다, 거실까지 같이 청소를 할까?" +
                "\n1.쓸데없이 시간 낭비 말고 방청소나 제대로 하자     2.청소하는 김에 거실까지 청소하자");

        int answer25 = sc.nextInt();

        if (answer25 == 1) {
            System.out.println("오늘은 해야 할 일이 많을 수도 있으니 방청소만 제대로 하자, 방청소를 하는 백수 오윤환.");
            handleAns49(sc); // 방청소만

        } else if (answer25 == 2) {
            System.out.println("꼭 할 일 없는 애들이 청소를 하면 일을 벌린다, 거실청소까지 해버리는 백수 오윤환.");
            handleAns50(sc); // 거실청소까지

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns25(sc);
        }
    }

    private static void handleAns26(Scanner sc) {
        System.out.println("\n\nQ.간식이 먹고싶어 부엌을 둘러보는 백수 오윤환, 포카칩과 촉촉한 초코칩이 있다. 무엇을 먹을까?" +
                "\n1.요즘 최애 과자인 촉촉한 초코칩을 먹자    2.과자의 근본, 포카칩을 먹자");

        int answer26 = sc.nextInt();

        if (answer26 == 1) {
            System.out.println("부드럽고 달콤한 촉촉한 초코칩을 집어들고 방으로 들어온 백수 오윤환, 야무지게 먹는다.");
            handleAns51(sc); // 초코칩

        } else if (answer26 == 2) {
            System.out.println("짭쪼름한 근본 포카칩을 집어들고 방으로 들어온 백수 오윤환, 야무지게 먹는다.");
            handleAns52(sc); // 포카칩

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns26(sc);
        }
    }

    private static void handleAns27(Scanner sc) {
        System.out.println("\n\nQ.배달 온 신전 떡볶이를 야무지게 먹은 백수 오윤환, 씻고 밥도 먹었다. 이제 무엇을 할까?" +
                "\n1.오늘은 오랜만에 친구가 운영하는 가게에 놀러가자    2.어느덧 4시가 되었다, 집에만 있기엔 눈치가 보이고 공부하기엔 귀찮다. 코인노래방에 가자");

        int answer27 = sc.nextInt();

        if (answer27 == 1) {
            System.out.println("오랜만에 친구도 볼 겸 친구가 운영하는 가게로 놀러가는 백수 오윤환.");
            handleAns53(sc); // 친구가게 놀러가기

        } else if (answer27 == 2) {
            System.out.println("오후 4시, 집에만 있기엔 눈치가 보이는 백수 오윤환, 간다는 곳이 코인노래방이다.");
            handleAns54(sc); // 코인노래방

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns27(sc);
        }
    }
    private static void handleAns28(Scanner sc) {
        System.out.println("\n\nQ.목살구이와 볶음밥을 야무지게 먹어치운 백수 오윤환, 어느덧 오후 4시다. 이제 무엇을 할까?" +
                "\n1.양심이 있다면 공부를 하자    2.오늘은 공부를 쉬고(사실 자주 쉼;;), 퇴근한 엄마와 같이 장을 보러 가자");

        int answer28 = sc.nextInt();

        if (answer28 == 1) {
            System.out.println("생각이 아예 없진 않은가보다, 공부를 하기 위해 책상에 앉은 백수 오윤환.");
            handleAns55(sc);

        } else if (answer28 == 2) {
            System.out.println("공부는 내일하자는 마인드... 얘는 그냥 답이 없다, 공부를 제쳐두고 퇴근한 엄마와 장을 보러 가는 백수 오윤환.");
            handleAns56(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns28(sc);
        }
    }
    private static void handleAns29(Scanner sc) {
        System.out.println("\n\nQ.피아노 방송을 보기 시작한 백수 오윤환, 오늘은 듣고싶은 곡을 신청하려고 한다, 어떤 노래를 신청할까?" +
                "\n1.역시 피아노는 재즈가 제 맛이지, Cheek To Cheek을 신청하자    2.근본 이루마의 river flows in you를 신청하자");

        int answer29 = sc.nextInt();

        if (answer29 == 1) {
            System.out.println("백수 주제에 취향은 나름 고급진 백수 오윤환, Cheek To Cheek을 신청 후 감상한다.");
            handleAns57(sc);

        } else if (answer29 == 2) {
            System.out.println("트수(트위치 백수)라면 이루마의 river flows in you를 참을 수 없다, 신청곡에 심취한 백수 오윤환.");
            handleAns58(sc);

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns29(sc);
        }
    }

    private static void handleAns30(Scanner sc) {
        System.out.println("\n\nQ.열심히 노래를 부르고 있는 스트리머, 오늘도 신청곡을 보내고싶다. 어떤 곡을 신청할까?" +
                "\n1.박정현의 꿈에는 못참는다, 바로 신청하자    2.트수라면 못참는다, 유우리의 베텔기우스를 신청하자");

        int answer30 = sc.nextInt();

        if (answer30 == 1) {
            System.out.println("박정현의 꿈에를 신청 후 열심히 감상하는 백수 오윤환, 눈물이 또르르 흐른다.");
            handleAns59(sc); // 박정현 꿈에

        } else if (answer30 == 2) {
            System.out.println("역시 일본의 락은 언제 들어도 좋다, 백수 오윤환은 오늘도 트수력이 증가했다.");
            handleAns60(sc); // 유우리 베텔기우스

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns30(sc);
        }
    }
    private static void handleAns31(Scanner sc) {
        System.out.println("\n\nQ.컴포즈 커피에 도착했다, 아이스 아메리카노와 아이스 흑당라떼 중 고민이 된다 무엇을 마실까?" +
                "\n1.깔끔한 근본 아이스 아메리카노를 마시자    2.달달한 아이스 흑당라떼를 마시자");

        int answer31 = sc.nextInt();

        if (answer31 == 1) {
            System.out.println("근본 아이스 아메리카노를 사와 맛있게 마신 오윤환, 출근시간이 되어, 셔틀버스를 타고 쿠팡 물류센터에 도착했다.");
            handleAns61(sc); // 아메리카노, 쿠팡

        } else if (answer31 == 2) {
            System.out.println("달달한 아이스 흑당라떼를 사와 맛있게 마신 오윤환, 출근시간이 되어, 셔틀버스를 타고 쿠팡 물류센터에 도착했다.");
            handleAns62(sc); // 흑당라떼, 쿠팡

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns31(sc);
        }
    }

    private static void handleAns32(Scanner sc) {
        System.out.println("\n\nQ.방청소를 시작한 백수 오윤환, 출근 전까지 제대로 청소하기엔 시간이 촉박해서 간단히 청소를 해야할 거 같다. 어떻게 청소를 할까?" +
                "\n1.데스크 청소만 하고 출근하자    2.바닥이랑 카펫만 청소하고 출근하자");

        int answer32 = sc.nextInt();

        if (answer32 == 1) {
            System.out.println("시간이 촉박한 관계로 데스크 청소만 한 뒤 쿠팡 물류센터로 출근한 백수 오윤환.");
            handleAns63(sc); // 데스크 청소 후 쿠팡

        } else if (answer32 == 2) {
            System.out.println("시간이 촉박한 관계로 바닥과 카펫 청소만 한 뒤 쿠팡 물류센터로 출근한 백수 오윤환.");
            handleAns64(sc); // 바닥, 카펫 청소 후 쿠팡

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns32(sc); // 다시 질문으로 되돌아 감
        }
    }

    private static void handleAns33(Scanner sc) {
        System.out.println("\n\nQ.흑청+후드+코트+반스를 입고 나온 백수 오윤환, 오늘 옷에 나름 만족 중이다. 무계획으로 나왔기 때문에 행선지를 정해야 한다. 어디로 갈까?" +
                "\n1.솔직히 갈 곳이 없다, 일단 카페로 가자    2.오랜만에 스트레스나 풀자, 코인노래방으로 간다");

        int answer33 = sc.nextInt();

        if (answer33 == 1) {
            System.out.println("백수가 가봤자 어딜 갈까... 일단 카페로 향하는 백수 오윤환.");
            handleAns65(sc); // 일단 카페

        } else if (answer33 == 2) {
            System.out.println("백수 오윤환이 유일하게 좋아하는 유흥(?)인 코인노래방으로 향한다.");
            handleAns66(sc); // 코인노래방

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns33(sc); // 다시 질문으로 되돌아 감
        }
    }

    private static void handleAns34(Scanner sc) {
        System.out.println("\n\nQ.분홍니트+연청+패딩+반스를 입고 밖으로 나선 백수 오윤환, 행선지를 정하지 못했는데 어디로 갈까?" +
                "\n1.오랜만에 좋아하는 장소인 서촌이나 가보자    2.소방관 발령 대기 중인 친구가 자취방에 놀러오라고 한다, 친구의 자취방으로 놀러가자");

        int answer34 = sc.nextInt();

        if (answer34 == 1) {
            System.out.println("고즈넉한 분위기를 좋아하는 백수 오윤환, 서촌으로 향한다.");
            handleAns67(sc); // 서촌

        } else if (answer34 == 2) {
            System.out.println("발령 대기 중이라 한가한 친구의 연락을 받고 친구의 자취방으로 향하는 백수 오윤환.");
            handleAns68(sc); // 친구 자취방

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns34(sc);
        }
    }

    private static void handleAns35(Scanner sc) {
        System.out.println("\n\nQ.오늘 착장이 꽤나 마음에 든 백수 오윤환, 공부를 하기 위해 카페를 가려고 한다. 어디서 공부를 할까?" +
                "\n1.집에서 가까운 동네 엔젤리너스로 가자    2.기분전환 겸 학원 다닐 때 자주 갔던 홍대입구역 엔젤리너스로 가자");

        int answer35 = sc.nextInt();

        if (answer35 == 1) {
            System.out.println("공부는 역시 집 앞 엔젤리너스가 제일 잘 된다, 동네 엔젤리너스로 향하는 백수 오윤환.");
            handleAns69(sc); // 집 앞 엔젤리너스

        } else if (answer35 == 2) {
            System.out.println("기분전환 겸 동네를 벗어나 홍대 엔젤리너스로 향하는 백수 오윤환.");
            handleAns70(sc); // 홍대 엔젤리너스

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns35(sc);
        }
    }

    private static void handleAns36(Scanner sc) {
        System.out.println("\n\nQ.오랜만에 좋아하는 옷도 입고 기분이 좋은 백수 오윤환, 오늘은 어디서 공부를 할까?" +
                "\n1.오랜만에 좋아하는 옷도 입었으니, 분위기 좋은 동네 카페에서 공부를 하자    2.늘 가던 공부하기 좋은 동네 엔젤리너스로 가자");

        int answer36 = sc.nextInt();

        if (answer36 == 1) {
            System.out.println("커피와 노래에 진심인 사장님이 운영하는 카페로 향하는 백수 오윤환, 좋은 노래를 들으며 공부할 생각에 설렌다.");
            handleAns71(sc); // 분위기 좋은 카페

        } else if (answer36 == 2) {
            System.out.println("공부하기엔 동네 엔젤리너스가 최고다, 공부 맛집인 동네 엔젤리너스로 향하는 백수 오윤환.");
            handleAns72(sc); // 동네 엔젤리너스

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns36(sc);
        }
    }

    private static void handleAns37(Scanner sc) {
        System.out.println("\n\nQ.열심히 데스크 청소부터 시작해 바닥과 카펫 청소까지 끝낸 백수 오윤환, 어느덧 점심시간이다. 뭘 먹을까?" +
                "\n1.오늘은 라면으로 간단히 해결하자    2.어차피 밖에 나갈 예정이다 밖에서 사먹자");

        int answer37 = sc.nextInt();

        if (answer37 == 1) {
            System.out.println("백수의 주식인 라면으로 점심을 해결한 백수 오윤환, 이제 무엇을 할지 고민한다.");
            handleAns73(sc); // 라면 먹음

        } else if (answer37 == 2) {
            System.out.println("밖에 나갈 예정이었기에 나가서 사먹기로 결심한 백수 오윤환, 집 밖으로 나선다.");
            handleAns74(sc); // 집밖에서 사먹기

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns37(sc); // 다시 질문으로 되돌아 감
        }
    }

    private static void handleAns38(Scanner sc) {
        System.out.println("\n\nQ.바닥에 있는 의문의 털들과 책상 위 먼지까지 모두 청소한 백수 오윤환, 점심까지 간단히 챙겨먹었다. 이제 무엇을 할까?" +
                "\n1.이제는 취업을 위해 공부를 해야할 때, 집에서 공부를 하자    2.이제는 취업을 위해 공부를 해야할 때, 카페에 가서 공부를 하자");

        int answer38 = sc.nextInt();

        if (answer38 == 1) {
            System.out.println("그래도 취업 생각은 있는지 공부를 시작하는 백수 오윤환, 책상에 앉아 노트북을 켠다.");
            handleAns75(sc); // 집에서 공부

        } else if (answer38 == 2) {
            System.out.println("그래도 취업 생각은 있는지 카페에서 공부를 하기로 결심한 백수 오윤환, 짐을 챙겨 밖으로 나간다.");
            handleAns76(sc); // 카페 공부

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns38(sc); // 다시 질문으로 되돌아 감
        }
    }

    private static void handleAns39(Scanner sc) {
        System.out.println("\n\nQ.벌벌 떨며 아이스 아메리카노를 가지고 집으로 돌아온 백수 오윤환, 배가 고픈지 집에 있는 밥도 챙겨 먹고 커피까지 야무지게 마신다. 이제 무엇을 할까?" +
                "\n1.오늘은 여유로운 하루를 보내고싶다, 오랜만에 보고싶던 애니를 보자    2.부지런한 하루를 보내는 만큼 공부도 하는 갓생을 살자");

        int answer39 = sc.nextInt();

        if (answer39 == 1) {
            System.out.println("꽤 오랜 시간 참았던 애니를 보려는 백수 오윤환, 라프텔에 들어간다.");
            handleAns77(sc); // 애니 보기

        } else if (answer39 == 2) {
            System.out.println("갓생을 살기로 결심한 백수 오윤환, 공부를 하기 위해 짐을 챙겨 집 앞 카페로 향한다.");
            handleAns78(sc); // 공부, 집 앞 카페

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns39(sc);
        }
    }

    private static void handleAns40(Scanner sc) {
        System.out.println("\n\nQ.산책을 마치고 집으로 돌아온 백수 오윤환, 배가 고팠는지 허겁지겁 아점까지 챙겨 먹었다. 이제 무엇을 할까?" +
                "\n1.소방관 발령대기 중인 친구에게 연락이 왔다, 친구의 자취방으로 놀러간다.    2.부지런한 하루를 보내는 만큼 공부도 하는 갓생을 살자");

        int answer40 = sc.nextInt();

        if (answer40 == 1) {
            System.out.println("소방관 발령대기 중이라 한가한 친구의 연락을 받고 친구의 자취방으로 향하는 백수 오윤환.");
            handleAns68(sc); // 친구 자취방

        } else if (answer40 == 2) {
            System.out.println("갓생을 살기로 결심한 백수 오윤환, 공부를 하기 위해 짐을 챙겨 집 앞 카페로 향한다.");
            handleAns78(sc); // 공부, 집 앞 카페

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns40(sc); // 다시 질문으로 되돌아 감
        }
    }

    private static void handleAns41(Scanner sc) {
        System.out.println("\n\nQ.나름대로 열심히 알고리즘 공부를 하는 백수 오윤환, 어느덧 시간이 꽤나 흘렀다. 곧 엄마가 장을 보러가는데 같이 갈까?" +
                "\n1.엄마가 늘 혼자 무거운 짐을 들고 오는게 마음에 걸린다, 같이 가자    2.오늘은 집중이 잘 되는 날이다, 엄마에게 미안하지만 더 공부하자");

        int answer41 = sc.nextInt();

        if (answer41 == 1) {
            System.out.println("늘 엄마가 마음에 걸렸던 백수 오윤환, 대충 씻고 오늘은 엄마의 장보기를 도와준다.");
            handleAns56(sc); // 엄마와 장보기

        } else if (answer41 == 2) {
            System.out.println("오늘따라 공부가 잘 되는 백수 오윤환, 잠시 쉬는 시간 동안 빠르게 씻고 공부를 더 한다.");
            handleAns79(sc); // 공부 더 하기

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns41(sc);
        }
    }

    private static void handleAns42(Scanner sc) {
        System.out.println("\n\nQ.자바의 정석을 보며 공부했던 기초문법을 복기하는 백수 오윤환, 어느덧 점심시간이다. 밥으로 뭘 먹을까?" +
                "\n1.라면으로 간단히 해결하자    2.공부 후 밖에 나갈 예정이었다. 밖에서 사먹자");

        int answer42 = sc.nextInt();

        if (answer42 == 1) {
            System.out.println("백수의 주식인 라면으로 점심을 해결한 백수 오윤환, 이제 무엇을 할지 고민한다.");
            handleAns73(sc); // 라면 먹음

        } else if (answer42 == 2) {
            System.out.println("공부 후 밖에 나갈 예정이었기에 나가서 사먹기로 결심한 백수 오윤환, 집 밖으로 나선다.");
            handleAns74(sc); // 집밖에서 사먹기

        } else {
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 올바른 답변을 입력 해주세요.");
            handleAns42(sc);
        }
    }



} // end of public class simulation.Main
