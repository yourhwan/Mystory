package simulation;

import java.util.*;

public class Ohday {
    public static void main(String[] args) {

        System.out.println("✓ 해당 시뮬레이션은 실화에 기반한 픽션임을 알려 드립니다."
                + "\n✓ 모든 답변은 주어지는 보기의 번호를 입력해 주시면 됩니다."
                + "\n✓ 프로그램 진행 중 종료를 원하시면 언제든지 숫자 0 을 입력 해주시면 됩니다.");

        Scanner sc = new Scanner(System.in);

        // 프로그램 시작 여부 질문
        System.out.println("\n본격적으로 오윤환의 하루를 시작하기 원하신다면 숫자 1을 입력해 주세요. 2를 입력할 경우 해당 프로그램은 종료되며, 1 또는 2 이외의 것을 입력시 프로그램은 종료 됩니다.");

        int answer1 = sc.nextInt();

        // 이어서 스토리 진행
        // 기상시간 선택
        if (answer1 == 1) {
            System.out.println("본격 백수 오윤환의 하루를 시작합니다.");
            System.out.println("\n\nQ.생활 패턴이 뒤죽박죽인 백수 오윤환의 기상시간은 늘 다릅니다. 몇시에 기상을 할까요?" +
                    "\n1.오전 9시    2.오후 12시    3.오후 5시");

            int answer2 = sc.nextInt();

            for (;;) {

                if (answer2 >= 1 && answer2 <= 3) {
                    break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                }
                else if (answer2 == 0) {
                    System.out.println(answer2+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                    sc.close();
                    return;
                }
                else {
                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                    answer2 = sc.nextInt();
                }
            }

            // 오전 9시 기상
            if (answer2 == 1) {
                System.out.println("오전 9시 기상을 한 백수 오윤환, 나름 갓생을 살기로 결심한 것 같습니다.");
                System.out.println("\nQ.침대에서 힘겹게 눈을 뜬 백수 오윤환, 눈을 뜨자마자 무엇을 할까요?" +
                        "\n1.다시 취침    2.씻기    3.아침 식사");

                int answer3 = sc.nextInt();

                for (;;) {

                    if (answer3 >= 1 && answer3 <= 3) {
                        break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                    }
                    else if (answer3 == 0) {
                        System.out.println(answer3+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                        sc.close();
                        return;
                    }
                    else {
                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                        answer3 = sc.nextInt();
                    }
                }

                // 오전 9시 기상 직후 다음 행동 제시
                if (answer3 == 1) { // 다시 취침
                    System.out.println("역시나 조금 일찍 일어났다고 생각한 것일까? 조금은 더 잠을 청하는 백수 오윤환.");
                    System.out.println("\nQ.시간이 흘러 다시 일어나야 할 시간이 되었다. 백수 오윤환은 몇시에 재기상 할까?" +
                            "\n1.오전 10시    2.오후 12시    3.오후 2시");

                    int answer6 = sc.nextInt();

                    for (;;) {

                        if (answer6 >= 1 && answer6 <= 3) {
                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer6 == 0) {
                            System.out.println(answer6+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer6 = sc.nextInt();
                        }
                    }

                    // 재기상 시간 선택
                    if (answer6 == 1) { // 오전 10시 재기상
                        System.out.println("1시간 더 자서 그런지 피로가 싹 풀렸다, 이불을 박차고 나와 본격적인 하루를 시작하는 백수 오윤환.");
                        System.out.println("\nQ.현재 시간은 오전 10시, 배가 고픈 백수 오윤환은 습관처럼 주섬주섬 휴대폰 켜고 트위치에 들어간다. 팔로우 해 두었던 예쁜 피아노 스트리머가 스트리밍 중이다." +
                                "\n트위치 방송을 볼 것인지 씻고 밥을 먹을 것인지 고민을 하는 백수 오윤환. 그의 선택은?" +
                                "\n1.트위치 보기    2.씻고 밥 먹기");

                        int answer12 = sc.nextInt();

                        for (;;) {

                            if (answer12 >= 1 && answer12 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer12 == 0) {
                                System.out.println(answer12+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer12 = sc.nextInt();
                            }
                        }

                        if (answer12 == 1) { // 트위치 보기
                            System.out.println("역시 단련된 트수 오윤환, 아침을 깨워주는 피아노 방송을 감상한다. 피아노 연주가 잘 들리지 않는지 안경을 쓴다." +
                                    "\n다른 방송도 기웃거리다보니 어느덧 점심시간이 되었다. 방구석에만 있으면 안되겠다는 생각이 들었는지 몸을 일으켜 세운다.");
                            System.out.println("\nQ.한껏 이불 속에서 트위치를 보며 여유를 즐긴 백수 오윤환, 점심을 먹으려고 한다. 무엇을 먹을까?" +
                                    "\n1.신전 떡볶이    2.간장계란밥");

                            int answer27 = sc.nextInt();

                            for (;;) {

                                if (answer27 >= 1 && answer27 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer27 == 0) {
                                    System.out.println(answer27+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer27 = sc.nextInt();
                                }
                            }

                            if (answer27 == 1) { // 신전 떡볶이
                                System.out.println("최근 떡볶이가 계속 먹고싶었던 백수 오윤환, 배달의 민족에 들어가 신전 떡볶이를 주문한다.");

                            }
                            else { // 간장계란밥
                                System.out.println("집에서 간단하게 그리고 맛있게 먹을 수 있는 간장계란밥을 만들어서 먹는 백수 오윤환.");

                            }
                        }
                        else { // 씻고 밥 먹기
                            System.out.println("방송은 안 봐도 그만이다, 멀끔히 씻고 나와 엄마가 차려준 밥을 먹는 백수 오윤환. 왠지 모르겠지만 스스로를 나름 부지런하다고 생각하는 것 같다.");
                            System.out.println("\nQ.오전을 알차게 보내고 있는 백수 오윤환, 오늘은 엄마와 데이트를 하려고 한다. 엄마와 어디를 갈까?" +
                                    "\n1.동네 카페    2.백화점");

                            int answer28 = sc.nextInt();

                            for (;;) {

                                if (answer28 >= 1 && answer28 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer28 == 0) {
                                    System.out.println(answer28+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer28 = sc.nextInt();
                                }
                            }

                            if (answer28 == 1) { // 동네 카페
                                System.out.println("오늘은 엄마와 집 앞에 스타벅스로 데이트를 가기로 한 백수 오윤환, 엄마와 함께 스타벅스로 향한다.");

                            }
                            else { // 백화점
                                System.out.println("오랜만에 엄마와 함께 백화점에 가기로한 백수 오윤환, 버스를 타고 백화점으로 향한다.");

                            }
                        }

                    }
                    else if (answer6 == 2) { // 오후 12시 재기상
                        System.out.println("시간대가 오후로 넘어가버렸다. 약간은 조급한 마음 때문인지 곧장 이불을 박차고 나와 본격적인 하루를 시작하는 백수 오윤환");
                        System.out.println("\nQ.오후 12시인 것을 확인한 백수 오윤환. 동생이 라면을 끓이려는 것을 보고 배가 고파온다. 라면부터 먹을지 아니면 씻을지 고민하는데, 백수 오윤환의 선택은?" +
                                "\n1.라면 끓여 먹기    2.씻기");

                        int answer13 = sc.nextInt();

                        for (;;) {

                            if (answer13 >= 1 && answer13 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer13 == 0) {
                                System.out.println(answer13+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer13 = sc.nextInt();
                            }
                        }

                        if (answer13 == 1) { // 라면 끓여 먹기
                            System.out.println("직접 끓이기 귀찮은 백수 오윤환, 기회라고 생각했는지 동생에게 자신의 것도 같이 끓여달라고 부탁한다.");
                            System.out.println("\nQ.동생과 함께 야무지게 라면을 해치운 백수 오윤환, 설거지를 해야하는데 살짝 고민이 된다. 설거지는 직접 할까?" +
                                    "\n1.설거지 하기    2.동생 시키기");

                            int answer30 = sc.nextInt();

                            for (;;) {

                                if (answer30 >= 1 && answer30 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer30 == 0) {
                                    System.out.println(answer30+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer30 = sc.nextInt();
                                }
                            }

                            if (answer30 == 1) { // 설거지 하기
                                System.out.println("라면도 맛있게 끓였으니 설거지도 깨끗하게 해달라고 부탁하는 백수 오윤환, 그의 인성이 드러나는 대목이다.");

                            }
                            else { // 동생 시키기
                                System.out.println("양심은 있는지 동생에게 설거지는 자신이 하겠다고 말하는 백수 오윤환, 주섬주섬 설거지를 한다.");

                            }
                        }
                        else { // 씻기
                            System.out.println("일어나면 무조건 씻어야만 다른 무언가를 맘 편히 할 수 있는 백수 오윤환, 정신이 번쩍 들게 샤워를 한다.");
                            System.out.println("\nQ.상쾌하게 샤워를 마치고 나온 백수 오윤환, 오늘은 쿠팡 알바를 가는 날이다. 출근 전까지 3시간 정도가 남았다. 무엇을 할까?" +
                                    "\n1.방청소    2.빨래");

                            int answer31 = sc.nextInt();

                            for (;;) {

                                if (answer31 >= 1 && answer31 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer31 == 0) {
                                    System.out.println(answer31+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer31 = sc.nextInt();
                                }
                            }

                            if (answer31 == 1) { // 방청소
                                System.out.println("출근 전, 밀린 방청소를 시작하는 백수 오윤환. 한동안 청소를 미뤄서인지 방 구석구석 먼지가 상당하다.");

                            }
                            else { // 빨래
                                System.out.println("속옷과 양말이 수북히 쌓여있는 빨래통을 보니 빨래를 해야겠다는 생각이 든 백수 오윤환, 색깔별로 구분해서 빨래를 돌린다.");

                            }
                        }
                    }
                    else { // 오후 2시 재기상
                        System.out.println("마사카... 눈을 뜨니 오후 2시다. 화들짝 놀라 이불을 박차고 나오는 백수 오윤환.");
                        System.out.println("\nQ.생각보다 시간이 많이 흘러가 당황한 것 같다. 오늘은 미뤄뒀던 공부를 하기로 결심했던 날, 집에서 공부를 할지 밖에 나가서 공부를 할지 고민하는 백수 오윤환, 그의 선택은?" +
                                "\n1.집에서 공부    2.밖에서 공부");

                        int answer14 = sc.nextInt();

                        for (;;) {

                            if (answer14 >= 1 && answer14 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer14 == 0) {
                                System.out.println(answer14+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer14 = sc.nextInt();
                            }
                        }

                        if (answer14 == 1) { // 집에서 공부
                            System.out.println("늦게 일어난 만큼 시간을 아껴야겠다는 생각이 든 백수 오윤환, 얼른 책상에 앉아 컴퓨터를 켜고 웬일인지 진득하게 앉아 알고리즘 공부를 한다.");
                            System.out.println("\nQ.시간이 꽤나 흘렀다. 집중력이 흐트러지기 시작한 백수 오윤환, 밖에 나가서 공부를 더 할지 고민이 된다. 어떻게 할까?" +
                                    "\n1.카페에서 공부    2.휴식");

                            int answer32 = sc.nextInt();

                            for (;;) {

                                if (answer32 >= 1 && answer32 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer32 == 0) {
                                    System.out.println(answer32+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer32 = sc.nextInt();
                                }
                            }

                            if (answer32 == 1) { // 카페에서 공부
                                System.out.println("오늘은 공부가 꽤나 잘 되는지 흐름을 이어가고싶은 백수 오윤환, 카페에 가서 공부를 더 하기 위해 집 밖으로 나선다.");

                            }
                            else { // 잠시 휴식
                                System.out.println("집중력이 떨어졌을 때는 잠시 쉬는 것도 도움이 될 수 있다. 잠시 휴식을 취하는 백수 오윤환.");

                            }
                        }
                        else { // 밖에서 공부
                            System.out.println("집에 있으면 어영부영 늦장을 부려 시간을 낭비할 것 같다는 생각이 든 백수 오윤환, 재빠르게 씻은 뒤 아무 옷이나 주워 입고 집 밖으로 나선다.");
                            System.out.println("\nQ.공부할 카페를 두고 고민하는 백수 오윤환, 선택지엔 두 곳이 있다. 거리가 가까운 스타벅스 그리고 자리도 콘센트도 널널한 엔젤리너스. 어디로 갈까?" +
                                    "\n1.스타벅스    2.엔젤리너스");

                            int answer33 = sc.nextInt();

                            for (;;) {

                                if (answer33 >= 1 && answer33 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer33 == 0) {
                                    System.out.println(answer33+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer33 = sc.nextInt();
                                }
                            }

                            if (answer33 == 1) { // 스타벅스
                                System.out.println("횡단보도 하나만 건너면 바로 나오는 스타벅스로 향하는 백수 오윤환, 역시 가까운게 최고다.");

                            }
                            else { // 엔젤리너스
                                System.out.println("스타벅스보다 조금 더 멀지만 공부환경으로 최적화 되어있는 엔젤리너스로 향하는 백수 오윤환, 공부하러 자주 가던 곳이 최고다.");

                            }
                        }
                    }

                }
                else if (answer3 == 2) { // 씻기
                    System.out.println("현재 시간은 오전 9시, 다시 잠에 들지 않기 위해 곧장 화장실로 가서 개운하게 씻고 나온 백수 오윤환. 일찍 일어나 세면까지 마치니 상쾌함과 뿌듯함이 몰려 온다.");
                    System.out.println("\nQ.부지런한 하루를 보내기 위해 무엇을 할지 고민하는 백수 오윤환, 그에겐 두 가지 선택지가 떠올랐다. 무엇을 할까요?" +
                            "\n1.아침식사    2.오전 공부");

                    int answer7 = sc.nextInt();

                    for (;;) {

                        if (answer7 >= 1 && answer7 <= 2) {
                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer7 == 0) {
                            System.out.println(answer7+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer7 = sc.nextInt();
                        }
                    }


                    if (answer7 == 1) { // 아침식사
                        System.out.println("금강산도 식후경! 우선 아침까지 해결한 후 일정을 소화하고자 마음을 먹은 백수 오윤환. 부엌으로 향한다.");
                        System.out.println("\nQ.집에 있는 반찬은 미역국과 장조림, 집밥을 먹을지 또는 아침을 굶고 점심을 먹을지 고민하는 백수 오윤환. 그의 선택은?" +
                                "\n1.집밥 먹기    2.굶기");

                        int answer15 = sc.nextInt();

                        for (;;) {

                            if (answer15 >= 1 && answer15 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer15 == 0) {
                                System.out.println(answer15+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer15 = sc.nextInt();
                            }
                        }

                        if (answer15 == 1) { // 집밥 먹기
                            System.out.println("미역국과 장조림은 못참지! 아침부터 든든히 밥을 챙겨먹는 백수 오윤환, 맛있는 집밥을 먹어서인지 아침부터 기분이 좋아보인다.");
                            System.out.println("\nQ.부지런한 아침을 보내고 있는 백수 오윤환은 후식으로 커피를 마시고싶다. 테이크아웃을 하려고 하는데, 어디 카페로 갈까?" +
                                    "\n1.컴포즈커피    2.메가커피");

                            int answer34 = sc.nextInt();

                            for (;;) {

                                if (answer34 >= 1 && answer34 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer34 == 0) {
                                    System.out.println(answer34+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer34 = sc.nextInt();
                                }
                            }

                            if (answer34 == 1) { // 컴포즈커피
                                System.out.println("테이크아웃은 역시 가격이 저렴한 카페가 최고다. 심지어 컴포즈의 흑당라떼는 다른 곳보다 훨씬 달달하고 원두향이 진하다. 최애 커피 중 하나인 흑당라떼를 사오기 위해 컴포즈로 향하는 백수 오윤환.");

                            }
                            else { // 메가커피
                                System.out.println("테이크아웃은 역시 가격이 저렴한 카페가 최고다. 심지어 메가커피는 4분 거리에 위치해있다. 가성비와 접근성 모두 챙긴 메가커피로 향하는 백수 오윤환.");

                            }
                        }
                        else { // 굶기
                            System.out.println("오늘은 아침을 먹으면 속이 불편할 것만 같다. 아침을 건너뛰는 백수 오윤환, 그의 안식처인 방으로 다시 들어간다.");
                            System.out.println("\nQ.일찍 일어나 하루를 시작한 백수 오윤환, 오늘따라 오랜만에 서울로 나가 여가생활을 즐기고싶다. 어디로 갈까?" +
                                    "\n1.한남동    2.서촌");

                            int answer35 = sc.nextInt();

                            for (;;) {

                                if (answer35 >= 1 && answer35 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer35 == 0) {
                                    System.out.println(answer35+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer35 = sc.nextInt();
                                }
                            }

                            if (answer35 == 1) { // 한남동
                                System.out.println("오랜만에 COS에서 일하며 추억이 쌓인 한남동에 가보려는 백수 오윤환, 평소와 달리 츄리닝이 아닌 데님과 니트 그리고 코드를 입고 한남동으로 향한다.");

                            }
                            else { // 서촌
                                System.out.println("예전부터 서촌의 고즈넉한 분위기를 좋아했던 백수 오윤환, 오랜만에 그 분위기를 즐기기 위해 서촌으로 향한다.");

                            }
                        }
                    }
                    else { // 오전 공부
                        System.out.println("현재 시간은 오전 9시, 그의 변화는 진심인 걸까? 웬일인지 공부의욕이 불타는 백수 오윤환, 방으로 돌아와 컴퓨터를 켠다.");
                        System.out.println("\nQ.간만에 아침부터 공부를 하려는 백수 오윤환, 오늘은 어떤 공부를 할까?" +
                                "\n1.알고리즘    2.인프런 강의 보기");

                        int answer16 = sc.nextInt();

                        for (;;) {

                            if (answer16 >= 1 && answer16 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer16 == 0) {
                                System.out.println(answer16+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer16 = sc.nextInt();
                            }
                        }

                        if (answer16 == 1) { // 알고리즘
                            System.out.println("학원을 마친 후 제대로 공부를 하지 않아 까먹은 문법이 많은 백수 오윤환, 취준에는 알고리즘이 필수라는 이야기를 많이 들어왔을 뿐더러 까먹은 문법들을 복기할 겸 알고리즘을 공부한다.");
                            System.out.println("\nQ.알고리즘을 공부하며 몰랐던 문제들이 꽤나 있었던 백수 오윤환, 해당 문제들을 블로그에 정리하여 업로드 할지 고민이다. 어떻게 할까?" +
                                    "\n1.블로그 게시    2.깃허브에 커밋");

                            int answer36 = sc.nextInt();

                            for (;;) {

                                if (answer36 >= 1 && answer36 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer36 == 0) {
                                    System.out.println(answer36+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer36 = sc.nextInt();
                                }
                            }

                            if (answer36 == 1) { // 블로그 게시
                                System.out.println("알고리즘을 풀며 공부가 되었던 것들을 블로그에 업로드 하는 백수 오윤환, 공부했던 것들을 정리하니 더욱 각인되는 것 같다.");

                            }
                            else { // 깃허브에 커밋
                                System.out.println("블로그까지 올릴 필요성은 느끼지 못한 백수 오윤환, 브로그에 올리지 않는 대신 주석을 열심히 달아두고 연동해두었던 깃허브에 커밋을 한다.");

                            }
                        }
                        else { // 인프런 강의 보기
                            System.out.println("구매해두었던 김영한의 Spring 강의를 보며 공부를 시작한 백수 오윤환, 열심히 공부를 하는데 강의가 꽤나 마음에 든 것 같다.");
                            System.out.println("\nQ.어느덧 점시시간이 되었고, 식사를 할 겸 휴식을 갖던 중 점심 메뉴를 고민한다. 오늘의 점심은 무엇을 먹을까?" +
                                    "\n1.돈카츠    2.마라탕");

                            int answer37 = sc.nextInt();

                            for (;;) {

                                if (answer37 >= 1 && answer37 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer37 == 0) {
                                    System.out.println(answer37+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer37 = sc.nextInt();
                                }
                            }

                            if (answer37 == 1) { // 돈카츠
                                System.out.println("동네에 꽤나 괜찮은 돈카츠 집이 생긴 것이 생각 난 백수 오윤환, 마침 오후에는 밖에서 공부를 할 예정이었기에 짐을 챙겨 돈카츠 집으로 향한다.");

                            }
                            else { // 마라탕
                                System.out.println("얼큰한 국물과 각종 채소 그리고 고기가 들어간 마라탕이 땡기는 백수 오윤환, 마침 오후에는 밖에서 공부를 할 예정이었기에 짐을 챙겨 엔젤리너스 앞 마라탕 가게로 향한다.");

                            }
                        }
                    }
                }
                else { // 아침식사
                    System.out.println("현재 시간은 오전 9시, 일어나자마자 배가 고픈 백수 오윤환. 아침 식사를 위해 부엌으로 향한다.");
                    System.out.println("\nQ.아침 메뉴 선택에 신중을 기하는 백수 오윤환, 집밥과 편의점에서 도시락 사이에서 고민을 한다. 무엇을 먹을까?" +
                            "\n1.집밥    2.편의점 도시락");

                    int answer8 = sc.nextInt();

                    for (;;) {

                        if (answer8 >= 1 && answer8 <= 2) {
                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer8 == 0) {
                            System.out.println(answer8+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer8 = sc.nextInt();
                        }
                    }

                    // 아침식사 메뉴 선택
                    if (answer8 == 1) { // 집밥
                        System.out.println("집에 있는 반찬이면 충분히 맛있고 든든한 아침을 먹을 수 있다. 간단히 집밥으로 아침을 해결하는 백수 오윤환.");
                        System.out.println("\nQ.맛있게 아침을 먹은 백수 오윤환, 오늘은 아침 샤워를 할 것인지 아니면 그냥 씻을 것인지 고민이 된다. 어떻게 할까?" +
                                "\n1.아침 샤워    2.그냥 씻기");

                        int answer17 = sc.nextInt();

                        for (;;) {

                            if (answer17 >= 1 && answer17 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer17 == 0) {
                                System.out.println(answer17+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer17 = sc.nextInt();
                            }
                        }

                        if (answer17 == 1) { // 아침 샤워
                            System.out.println("일찍 일어나 밥도 먹었으니 개운하게 샤워를 해보자! 콧노래를 흥얼거리며 샤워를 하러 화장실로 들어가는 백수 오윤환.");

                        }
                        else { // 그냥 씻기
                            System.out.println("어제 밤에 샤워를 하고 잤으니 그냥 씻는게 좋겠다. 간단히 세면을 마치고 나온 백수 오윤환.");

                        }
                    }
                    else { // 편의점 도시락
                        System.out.println("왠지 집밥은 먹고싶지 않다. 편의점에서 도시락을 사오기로 결심한 백수 오윤환. 편의점으로 향한다.");
                        System.out.println("\nQ.편의점에 도착하니 맛있는 도시락이 많이 보인다 어떤 도시락으로 먹을까?" +
                                "\n1.제육 도시락    2.참치 유부초밥 도시락");

                        int answer18 = sc.nextInt();

                        for (;;) {

                            if (answer18 >= 1 && answer18 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer18 == 0) {
                                System.out.println(answer18+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer18 = sc.nextInt();
                            }
                        }

                        if (answer18 == 1) { // 제육 도시락
                            System.out.println("역시 남자라면 근본 제육을 먹어야지, 고기가 가장 많이 들어있는 것 같은 제육 도시락을 구매한 후 집으로 돌아가는 백수 오윤환.");

                        }
                        else { // 참치 유부도시락
                            System.out.println("새콤달콤 유부에 언제 먹어도 맛있는 참치가 가득 올라간 참치 유부도시락을 구매하는 백수 오윤환, 즐거운 마음으로 집으로 돌아간다.");

                        }
                    }
                }

            }
            // 오후 12시 기상
            else if (answer2 == 2) {
                System.out.println("백수 오윤환, 역시나 백수 답게 늦잠을 잤습니다, 오후 12시가 되어서야 기상합니다.");
                System.out.println("\nQ.침대에서 힘겹게 눈을 뜬 백수 오윤환, 눈을 뜨자마자 무엇을 할까요?" +
                        "\n1.씻기    2.점심식사");

                int answer29 = sc.nextInt();

                for (;;) {

                    if (answer29 >= 1 && answer29 <= 2) {
                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                    }
                    else if (answer29 == 0) {
                        System.out.println(answer29+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                        sc.close();
                        return;
                    }
                    else {
                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                        answer29 = sc.nextInt();
                    }
                }

                // 12시 기상 선택 후
                if (answer29 == 1) { // 씻기
                    System.out.println("조금 늦게 일어났기 때문에 화장실로 가서 곧장 씻고 나오는 백수 오윤환.");
                    System.out.println("\nQ.개운하게 씻고 나온 백수 오윤환, 오늘은 맛있는 점심이 먹고싶다. 배달음식과 외식 중 백수 오윤환의 선택은?" +
                            "\n1.배달음식    2.외식");

                    int answer10 = sc.nextInt();

                    for (;;) {

                        if (answer10 >= 1 && answer10 <= 2) {
                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer10 == 0) {
                            System.out.println(answer10+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer10 = sc.nextInt();
                        }
                    }

                    // 씻은 후 점심 무엇을 먹을지 선택
                    if (answer10 == 1) { // 배달음식
                        System.out.println("오늘은 왠지 모르게 제대로 된 한 끼의 밥이 먹고싶다, 배달의 민족에 들어가 무엇을 먹을지 살펴보는 중인 백수 오윤환.");
                        System.out.println("\nQ.맛있어 보이는 메뉴들이 많지만 그의 눈에 들어온 것은 삼겹살&볶음밥 그리고 수제버거, 백수 오윤환은 어떤 것을 주문할까?" +
                                "\n1.삼겹살&볶음밥    2.수제버거");

                        int answer19 = sc.nextInt();

                        for (;;) {

                            if (answer19 >= 1 && answer19 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer19 == 0) {
                                System.out.println(answer19+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer19 = sc.nextInt();
                            }
                        }

                        if (answer19 == 1) { // 삼겹살&볶음밥
                            System.out.println("오랜만에 삼겹살과 볶음밥이 먹고싶은 백수 오윤환, 리뷰 이벤트 참여로 뚱캔 콜라까지 챙기며 야무지게 주문을 한다.");

                        }
                        else { // 수제버거
                            System.out.println("오랜만에 수제버거가 먹고싶은 백수 오윤환, 리뷰 이벤트 참여로 양념감자 업그레이드까지 챙기며 야무지게 주문을 한다.");

                        }
                    }
                    else { // 외식
                        System.out.println("오늘은 외출할 계획이었으니 외식을 하기로 결심했다. 간단히 옷을 챙겨입고 짐을 챙겨 집 밖으로 나서는 백수 오윤환.");
                        System.out.println("\nQ.자주 가던 식당 두 곳 중에서 고민을 하는 백수 오윤환, 제육 맛집인 김밥천국과 들깨 수제비 맛집인 국수골목 중 어디로 갈까?" +
                                "\n1.김밥천국    2.국수골목");

                        int answer20 = sc.nextInt();

                        for (;;) {

                            if (answer20 >= 1 && answer20 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer20 == 0) {
                                System.out.println(answer20+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer20 = sc.nextInt();
                            }
                        }

                        if (answer20 == 1) { // 김밥천국
                            System.out.println("최근 새로 생긴 김밥천국이 제육 맛집이라는 사실을 알게 된 후로 단골이 된 백수 오윤환, 김밥천국에 들어가 제육을 주문하고 맛있게 먹는다.");

                        }
                        else { // 국수골목
                            System.out.println("오래 전부터 동네에 맛집으로 유명한 국수골목, 백수 오윤환도 대학생 시절 시험기간에 자주 갔던 곳이다. 국수골목에 들어가 들깨수제비를 주문하고 맛있게 먹는다.");

                        }
                    }
                }
                else { // 점심식사 선택
                    System.out.println("점심 시간에 맞춰 일어나서인지 배가 고프다, 점심을 먹기 위해 부엌으로 가는 백수 오윤환.");
                    System.out.println("\nQ.엄마가 해두고 간 반찬을 빤히 쳐다보는 백수 오윤환, 밥을 먹을지 라면을 끓여서 먹을지 고민을 한다. 백수 오윤환의 선택은?" +
                            "\n1.집밥    2.라면");

                    int answer11 = sc.nextInt();

                    for (;;) {

                        if (answer11 >= 1 && answer11 <= 2) {
                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer11 == 0) {
                            System.out.println(answer11+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer11 = sc.nextInt();
                        }
                    }

                    // 점심식사 선택 후 메뉴
                    if (answer11 == 1) { // 집밥
                        System.out.println("엄마가 맛있게 만들어 둔 집밥을 맛있었는지 두 그릇이나 먹어치우는 백수 오윤환. 이런게 식충이일까...?");
                        System.out.println("\nQ.맛있게 밥을 먹은 후 씻기 위해 화장실로 들어간 백수 오윤환, 샤워를 할지 그냥 씻을지 고민을 한다. 그의 선택은?" +
                                "\n1.샤워    2.그냥 씻기");

                        int answer21 = sc.nextInt();

                        for (;;) {

                            if (answer21 >= 1 && answer21 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer21 == 0) {
                                System.out.println(answer21+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer21 = sc.nextInt();
                            }
                        }

                        if (answer21 == 1) { // 샤워
                            System.out.println("샤워를 하고나면 정신이 맑아지는 백수 오윤환, 조금 늦은 하루를 시작한 만큼 정신을 바짝 차리고자 찬물샤워를 한다.");

                        }
                        else { // 그냥 씻기
                            System.out.println("점심까지 먹고나니 샤워까지 하기엔 시간이 아까운 기분이 드는 백수 오윤환, 간단히 세면을 한다.");

                        }
                    }
                    else { // 라면
                        System.out.println("평소에도 라면을 즐겨 먹던 백수 오윤환, 라면이 종류별로 가득 쌓인 바구니에서 어떤 라면을 먹을지 고민한다.");
                        System.out.println("\nQ.국물 라면인 너구리와 짜장라면인 짜파게티 중에서 사뭇 진지하게 고민중인 백수 오윤환, 파김치와 함께 먹을 최고의 조합인 라면은?" +
                                "\n1.너구리    2.짜파게티");

                        int answer22 = sc.nextInt();

                        for (;;) {

                            if (answer22 >= 1 && answer22 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer22 == 0) {
                                System.out.println(answer22+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer22 = sc.nextInt();
                            }
                        }

                        if (answer22 == 1) { // 너구리
                            System.out.println("얼큰한 국물로 속을 뜨끈히 데워주고 밥까지 말아서 먹을 수 있는 너구리는 못참지, 너구리를 끓여서 먹고 밥까지 말아먹는 백수 오윤환.");

                        }
                        else { // 짜파게티
                            System.out.println("짜파게티에 파김치? 이 조합은 치트키지, 계란후라이까지 얹어서 야무지게 먹어버리는 백수 오윤환.");

                        }
                    }
                }

            }
            // 오후 5시 기상
            else {
                System.out.println("백수 오윤환, 그는 역시나 백수들의 백수 입니다. 오후 5시가 되어서야 기상을 합니다.");
                System.out.println("\nQ.무언가 이상함을 감지한 백수 오윤환, 슬며시 눈을 떠 시간을 확인한다. 양심은 있는지 시간을 보고 화들짝 놀란다. 백수 오윤환은 이제 무엇을 할까?" +
                        "\n1.씻기    2.저녁 식사");

                int answer4 = sc.nextInt();

                for (;;) {

                    if (answer4 >= 1 && answer4 <= 2) {
                        break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                    }
                    else if (answer4 == 0) {
                        System.out.println(answer4+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                        sc.close();
                        return;
                    }
                    else {
                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                        answer4 = sc.nextInt();
                    }
                }

                // 씻기 선택
                if (answer4 == 1) { // 씻기
                    System.out.println("화들짝 놀라 일어난 백수 오윤환, 자신의 기상시간에 놀랐는지 곧장 화장실로 가서 씻는다.");
                    System.out.println("\nQ.하루를 날렸다는 생각에 마음이 조급한 백수 오윤환. 자고 일어난지 얼마 되지 않아 허둥지둥 한다. 이제 무엇을 할까?" +
                            "\n1.공부    2.저녁 식사");

                    int answer5 = sc.nextInt();

                    for (;;) {

                        if (answer5 >= 1 && answer5 <= 2) {
                            break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer5 == 0) {
                            System.out.println(answer5+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer5 = sc.nextInt();
                        }
                    }

                    // 오후 5시 기상 직후 행동 선택
                    if (answer5 == 1) { // 공부
                        System.out.println("이대로 하루를 무의미하게 버릴 수 없기에 재빨리 컴퓨터를 킨 후 공부를 시작하는 백수 오윤환.");
                        System.out.println("\nQ.오늘은 마음을 다잡고 열심히 공부를 하려고 하는 백수 오윤환, 어떤 공부를 할까?" +
                                "\n1.알고리즘    2.인프런 강의");

                        int answer23 = sc.nextInt();

                        for (;;) {

                            if (answer23 >= 1 && answer23 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer23 == 0) {
                                System.out.println(answer23+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer23 = sc.nextInt();
                            }
                        }

                        if (answer23 == 1) { // 알고리즘
                            System.out.println("혼자 개발하면서 무언가 만들기엔 부담을 느껴왔던 백수 오윤환, 비록 낮은 난이도의 알고리즘 문제지만 열심히 풀어본다.");

                        }
                        else { // 인프런 강의
                            System.out.println("비싼 돈을 주고 결제했지만 그동안 보지 않았던 김영한의 인프런 강의를 보며 공부하는 백수 오윤환, 세심한 강의 자료와 설명에 돈값을 한다고 느끼는 것 같다.");

                        }
                    }
                    else { // 저녁 식사
                        System.out.println("일단 하루종일 아무것도 먹지 않았기 때문에 밥 부터 먹고 생각하기로 결심한 백수 오윤환 부엌에서 허겁지겁 밥을 먹는다.");
                        System.out.println("\nQ.식사를 마치고 남은 하루를 어떻게 보내야 할지 고민하는 백수 오윤환, 이제 무엇을 할까?" +
                                "\n1.트위치 시청    2.친구 만나기");

                        int answer24 = sc.nextInt();

                        for (;;) {

                            if (answer24 >= 1 && answer24 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer24 == 0) {
                                System.out.println(answer24+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer24 = sc.nextInt();
                            }
                        }

                        if (answer24 == 1) { // 트위치 시청
                            System.out.println("늘 이런식이다...오늘은 늦게 일어난 김에 그냥 뒹굴거리며 쉬기로 한 백수 오윤환, 전기장판으로 데운 침대에 들어가 트위치를 켠다.");

                        }
                        else { // 친구 만나기
                            System.out.println("오랜만에 친구를 만나기로 결심한 백수 오윤환, 친구들에게 연락을 돌리고 답장이 온 대학 동기의 자취방에 놀러가기로 한다.");

                        }
                    }
                }
                else { // 저녁 식사
                    System.out.println("늦게 일어났기 때문에 배가 고픈 백수 오윤환, 저녁을 먹기 위해 부엌으로 간다.");
                    System.out.println("\nQ.부엌을 여기저기 살펴보는 백수 오윤환, 집밥을 먹을지 그냥 굶을지 고민을 한다. 백수 오윤환의 선택은?" +
                            "\n1.집밥    2.굶기");

                    int answer9 = sc.nextInt();

                    for (;;) {

                        if (answer9 >= 1 && answer9 <= 2) {
                            break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                        }
                        else if (answer9 == 0) {
                            System.out.println(answer9+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                            sc.close();
                            return;
                        }
                        else {
                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                            answer9 = sc.nextInt();
                        }
                    }

                    // 오후 5시 기상 직후 행동 선택
                    if (answer9 == 1) { // 집밥
                        System.out.println("금강산도 식후경이라 했다. 대충 집밥으로 배를 채운 후 무엇이라도 해야겠다는 생각이 든 백수 오윤환, 놀라운 속도로 밥을 먹어 치운다.");
                        System.out.println("\nQ.저녁을 먹고난 후 본격적으로 남은 하루를 어떻게 해야 알차게 보낼 수 있을지 고민하는 백수 오윤환, 무엇을 할까?" +
                                "\n1.카페에서 공부하기    2.영어 스피킹 공부");

                        int answer25 = sc.nextInt();

                        for (;;) {

                            if (answer25 >= 1 && answer25 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer25 == 0) {
                                System.out.println(answer25+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer25 = sc.nextInt();
                            }
                        }

                        if (answer25 == 1) { // 카페에서 공부하기
                            System.out.println("집에 있으면 자꾸 눕고싶어지는 백수 오윤환, 카페에 가서 공부하기로 결심을 했다. 대충 씻을 뒤 짐을 챙겨 밖으로 나선다.");

                        }
                        else { // 영어 스피킹 공부
                            System.out.println("평소 영어로 말하는 것에 흥미가 많았던 백수 오윤환, 종종 이용하던 해외 화상채팅 사이트에 접속을 해서 외국인 친구들과 영어로 대화를 나눈다.");

                        }
                    }
                    else { // 굶기
                        System.out.println("늦게 일어난 자신에게 실망감이 든 백수 오윤환, 자책감 때문에 스스로에 대한 벌로써 밥을 굶기로 결심한다.");
                        System.out.println("\nQ.남은 하루를 어떻게 보낼지 고민하는 백수 오윤환, 때마침 퇴근한 엄마가 같이 장을 보자고 제안한다. 어떻게 할까?" +
                                "\n1.엄마와 장 보기    2.미뤄뒀던 방청소 하기");

                        int answer26 = sc.nextInt();

                        for (;;) {

                            if (answer26 >= 1 && answer26 <= 2) {
                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                            }
                            else if (answer26 == 0) {
                                System.out.println(answer26+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                sc.close();
                                return;
                            }
                            else {
                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                answer26 = sc.nextInt();
                            }
                        }

                        if (answer26 == 1) { // 엄마와 장 보기
                            System.out.println("퇴근 후 피곤하지만 늘 장을 봐오는 엄마에게 미안했는지 오늘은 같이 장을 보기로 한 백수 오윤환, 대충 씻고 엄마가 있는 마트로 향한다.");

                        }
                        else { // 미뤄뒀던 방청소
                            System.out.println("며칠 동안 방청소를 못한 백수 오윤환, 본인이 보기에도 방이 너무 더러웠던 것일까? 열심히 방청소를 시작한다.");

                        }
                    }
                }

            }


        // 프로그램 종료 및 경고알림
        }
        else if (answer1 == 2) { // 프로그램 종료
            System.out.println("프로그램을 종료합니다. 다음에 만나요!");
            sc.close();
        }
        else { // 보기 이외의 입력값을 입력 했을 경우
            System.out.println("⚠︎알림: 1 또는 2를 선택해야 합니다. 잘못된 입력으로 프로그램을 종료합니다.");
            sc.close();
        }
        sc.close();
    }// public static void main(String[] args)

}// public class
