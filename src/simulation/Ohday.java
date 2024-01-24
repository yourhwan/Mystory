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
                                System.out.println("\nQ.포장마차 떡볶이와는 또 다른 매력이 있는 프렌차이즈 떡볶이의 맛, 맛있게 먹은 백수 오윤환. 이제는 생상적인 무언가를 해야할 것 같은 기분이다. 무엇을 할까?" +
                                        "\n1.카페에서 공부    2.집에서 간단한 운동");

                                int answer58= sc.nextInt();

                                for (;;) {

                                    if (answer58 >= 1 && answer58 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer58 == 0) {
                                        System.out.println(answer58+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer58 = sc.nextInt();
                                    }
                                }

                                if (answer58 == 1) { // 카페에서 공부
                                    System.out.println("오늘은 조금이라도 공부를 하려고 마음을 먹은 백수 오윤환, 카페에서 공부를 하기 위해 씻은 뒤 집 밖으로 나선다.");

                                }
                                else { // 집에서 간단한 운동
                                    System.out.println("운동을 하지 않은지 1년이 되어가는 백수 오윤환, 이전과 몸이 많이 달라졌음을 느끼고 천천히 간단한 운동부터 하려고 한다.");

                                }
                            }
                            else { // 간장계란밥
                                System.out.println("집에서 간단하게 그리고 맛있게 먹을 수 있는 간장계란밥을 만들어서 먹는 백수 오윤환.");
                                System.out.println("\nQ.역시 간장계란밥은 만들어 먹기도 편하고 맛까지 있다. 식사까지 마친 백수 오윤환, 이제 무엇을 할까?" +
                                        "\n1.독서    2.공부");

                                int answer59 = sc.nextInt();

                                for (;;) {

                                    if (answer59 >= 1 && answer59 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer59 == 0) {
                                        System.out.println(answer59+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer59 = sc.nextInt();
                                    }
                                }

                                if (answer59 == 1) { // 독서
                                    System.out.println("의외로 어린시절 부터 책을 꽤나 많이 읽고 아직도 좋아하는 편이라 독서를 좋아하는 백수 오윤환, 예전에 사두고 읽지 않은 책 '코스모스' 를 읽는다.");

                                }
                                else { // 공부
                                    System.out.println("오늘만큼은 공부를 해야겠다는 의지를 불태우는 백수 오윤환, 책상 앞에 앉아 공부할 준비를 한다.");

                                }
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
                                System.out.println("\nQ.엄마와 함께 스타벅스에 도착한 백수 오윤환, 커피를 마실지 음료수를 마실지 고민이다. 무엇을 마실까?" +
                                        "\n1.커피    2.음료수");

                                int answer60 = sc.nextInt();

                                for (;;) {

                                    if (answer60 >= 1 && answer60 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer60 == 0) {
                                        System.out.println(answer60+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer60 = sc.nextInt();
                                    }
                                }

                                if (answer60 == 1) { // 커피
                                    System.out.println("카페인은 포기할 수없는 백수 오윤환, 엄마와 같은 메뉴인 아이스 바닐라 라떼를 주문한다.");

                                }
                                else { // 음료수
                                    System.out.println("카페에 가면 항상 커피를 마시니 오늘은 자몽허니 블랙티를 주문하는 백수 오윤환.");

                                }
                            }
                            else { // 백화점
                                System.out.println("오랜만에 엄마와 함께 백화점에 가기로한 백수 오윤환, 버스를 타고 백화점으로 향한다.");
                                System.out.println("\nQ.엄마와 백화점에 도착한 백수 오윤환, 엄마가 커피를 먼저 마실 것인지, 구경을 먼저 할 것인지 물어본다. 무엇을 먼저 할까?" +
                                        "\n1.커피    2.쇼핑");

                                int answer61 = sc.nextInt();

                                for (;;) {

                                    if (answer61 >= 1 && answer61 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer61 == 0) {
                                        System.out.println(answer61+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer61 = sc.nextInt();
                                    }
                                }

                                if (answer61 == 1) { // 커피
                                    System.out.println("달달한 커피가 마시고싶던 백수 오윤환, 지하에 있는 스타벅스로 향한다.");

                                }
                                else { // 쇼핑
                                    System.out.println("오랜만에 백화점에 온 백수 오윤환, 살 것은 없지만 엄마와 아이쇼핑 하는 것을 좋아하기 때문에 백화점 구경을 먼저 하기로 한다.");

                                }
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
                                    "\n1.동생 시키기    2.설거지 하기");

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

                            if (answer30 == 1) { // 동생 시키기
                                System.out.println("라면도 맛있게 끓였으니 설거지도 깨끗하게 해달라고 부탁하는 백수 오윤환, 그의 인성이 드러나는 대목이다.");
                                System.out.println("\nQ.동생에게 설거지를 시키고 방으로 들어가는 백수 오윤환, 공부는 하기 싫고 할만한 것이 없나 생각해본다. 무엇을 할까?" +
                                        "\n1.휴대폰 게임    2.침대에 눕기");

                                int answer62 = sc.nextInt();

                                for (;;) {

                                    if (answer62 >= 1 && answer62 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer62 == 0) {
                                        System.out.println(answer62+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer62 = sc.nextInt();
                                    }
                                }

                                if (answer62 == 1) { // 휴대폰 게임
                                    System.out.println("휴대폰에 설치해둔 축구게임이 하고싶어진 백수 오윤환, 침대에 자리를 잡고 모바일 축국 게임을 한다.");

                                }
                                else { // 침대에 눕기
                                    System.out.println("딱히 하고싶은 것이 없는 백수 오윤환, 백수의 표본답게 일단 침대에 눕는다.");

                                }
                            }
                            else { // 설거지 하기
                                System.out.println("양심은 있는지 동생에게 설거지는 자신이 하겠다고 말하는 백수 오윤환, 주섬주섬 설거지를 한다.");
                                System.out.println("\nQ.쌓여있던 그릇들까지 설거지를 마친 백수 오윤환, 설거지를 한김에 집안일을 좀 더 하려고 한다. 무엇을 할까?" +
                                        "\n1.빨래    2.청소기 돌리기 ");

                                int answer63 = sc.nextInt();

                                for (;;) {

                                    if (answer63 >= 1 && answer63 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer63 == 0) {
                                        System.out.println(answer63+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer63 = sc.nextInt();
                                    }
                                }

                                if (answer63 == 1) { // 빨래
                                    System.out.println("평소 엄마와 아빠가 돌려주는 빨래, 오늘은 직접 빨래를 하는 오윤환, 좋아하는 섬유유연제도 넣고 세탁기를 돌린다.");

                                }
                                else { // 청소기 돌리기
                                    System.out.println("최근 새로 산 청소기가 매우 마음에 든 백수 오윤환, 청소기를 집어들고 온 집안을 돌아다니며 청소기를 돌린다.");

                                }
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
                                System.out.println("한동안 청소를 미뤄서인지 방 구석구석 먼지가 상당하다. 출근 전 밀린 방청소를 하는 백수 오윤환.");
                                System.out.println("\nQ.방청소를 마치고 출근 전 해야할 것이 더 있는지 살펴보는 백수 오윤환, 무엇을 더 할까?" +
                                        "\n1.휴식    2.빨래 개기");

                                int answer64 = sc.nextInt();

                                for (;;) {

                                    if (answer64 >= 1 && answer64 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer64 == 0) {
                                        System.out.println(answer64+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer64 = sc.nextInt();
                                    }
                                }

                                if (answer64 == 1) { // 휴식
                                    System.out.println("출근하면 힘들테니 쉬었다가 가려는 백수 오윤환, 오랜만에 LP를 감상하려고 한다.");

                                }
                                else { // 빨래 개기
                                    System.out.println("어제 세탁한 빨래를 개는 백수 오윤환, 집안일을 해치우니 왠지 모를 뿌듯함이 든다.");

                                }
                            }
                            else { // 빨래
                                System.out.println("속옷과 양말이 수북히 쌓여있는 빨래통을 보니 빨래를 해야겠다는 생각이 든 백수 오윤환, 색깔별로 구분해서 세탁기를 돌린다.");
                                System.out.println("\nQ.세탁기까지 돌리고 더 할 것이 없는지 살펴보는 백수 오윤환, 이제 무엇을 할까?" +
                                        "\n1.동생과 대화    2.간식 먹기 ");

                                int answer65 = sc.nextInt();

                                for (;;) {

                                    if (answer65 >= 1 && answer65 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer65 == 0) {
                                        System.out.println(answer65+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer65 = sc.nextInt();
                                    }
                                }

                                if (answer65 == 1) { // 동생과 대화
                                    System.out.println("평소 동생과 해외축구 이야기를 자주 나누는 백수 오윤환, 며칠간 있었던 해외축구 이슈들을 동생과 나누며 오랜만에 우애(?)를 다진다.");

                                }
                                else { // 간식 먹기
                                    System.out.println("당이 떨어졌는지 간식이 먹고싶은 백수 오윤환, 식탁에 있는 과자를 가지고와서 먹는다.");

                                }
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
                                System.out.println("\nQ.카페로 가던 중 고등학교 친구에게 연락을 받은 백수 오윤환, 친구가 시간이 되면 만나자고 한다. 어떻게 할까?" +
                                        "\n1.카페로 오라고 한다    2.다음에 보자고 한다");

                                int answer66 = sc.nextInt();

                                for (;;) {

                                    if (answer66 >= 1 && answer66 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer66 == 0) {
                                        System.out.println(answer66+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer66 = sc.nextInt();
                                    }
                                }

                                if (answer66 == 1) { // 카페로 오라고 한다
                                    System.out.println("공부를 하러 가던 중이었으니 카페로 오라고 말하는 백수 오윤환, 친구는 알겠다며 자신도 작업할 것을 가지고 오겠다고 한다.");

                                }
                                else { // 다음에 보자고 한다
                                    System.out.println("공부흐름을 제대로 이어가고싶은 백수 오윤환, 친구에겐 미안하지만 다음에 보자고 말한 뒤 카페로 간다.");

                                }
                            }
                            else { // 잠시 휴식
                                System.out.println("집중력이 떨어졌을 때는 잠시 쉬는 것도 도움이 될 수 있다. 잠시 휴식을 취하는 백수 오윤환.");
                                System.out.println("\nQ.휴식을 취하며 잠시 휴대폰을 집어든 백수 오윤환, 문득 학원을 다닐 때 친했던 형이 취업을 했다는 얘기가 떠오른다. 형에게 연락을 해볼까?" +
                                        "\n1.연락을 해본다    2.연락하지 않는다");

                                int answer67 = sc.nextInt();

                                for (;;) {

                                    if (answer67 >= 1 && answer67 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer67 == 0) {
                                        System.out.println(answer67+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer67 = sc.nextInt();
                                    }
                                }

                                if (answer67 == 1) { // 연락을 해본다
                                    System.out.println("형에게 연락을 해보는 백수 오윤환, 얼마 지나지 않아 답장이 오고 서로의 안부를 물으며 여러 이야기를 주고 받는다.");

                                }
                                else { // 연락하지 않는다
                                    System.out.println("자신의 현재 모습이 부끄러운지 연락하기가 고민스러운 백수 오윤환, 결국 연락을 하지 않고 홀린듯 침대로 기어 들어간다.");

                                }
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
                                System.out.println("\nQ.스타벅스에 도착해서 음료 주문 후 자리를 잡은 백수 오윤환, 노트북을 열고 공부를 하려고 하는데 반대편에서 이야기 중인 고등학교 친구들이 보인다. 인사를 할까?" +
                                        "\n1.인사를 한다    2.모른척 한다");

                                int answer68 = sc.nextInt();

                                for (;;) {

                                    if (answer68 >= 1 && answer68 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer68 == 0) {
                                        System.out.println(answer68+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer68 = sc.nextInt();
                                    }
                                }

                                if (answer68 == 1) { // 인사를 한다
                                    System.out.println("성격상 먼저 인사를 잘 안 하는 백수 오윤환, 사람이 그리웠는지 친구들에게 다가가 먼저 인사를 건넨다.");

                                }
                                else { // 모른척 한다
                                    System.out.println("굳이 인사할 필요가 없다고 생각이 든 백수 오윤환, 원래 성격대로 그냥 모른체하며 공부를 시작한다.");

                                }
                            }
                            else { // 엔젤리너스
                                System.out.println("스타벅스보다 조금 더 멀지만 공부환경으로 최적화 되어있는 엔젤리너스로 향하는 백수 오윤환, 공부하러 자주 가던 곳이 최고다.");
                                System.out.println("\nQ.엔젤리너스에 도착해서 자리를 잡고 주문한 커피를 받은 백수 오윤환, 본격적으로 다시 공부를 시작한다. 어떤 공부를 할까?" +
                                        "\n1.알고리즘    2.인프런 강의 듣기");

                                int answer69 = sc.nextInt();

                                for (;;) {

                                    if (answer69 >= 1 && answer69 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer69 == 0) {
                                        System.out.println(answer69+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer69 = sc.nextInt();
                                    }
                                }

                                if (answer69 == 1) { // 알고리즘
                                    System.out.println("오늘 공부하던 알고리즘을 이어서 공부하는 백수 오윤환, 오늘은 알고리즘의 날이다.");

                                }
                                else { // 인프런 강의 듣기
                                    System.out.println("집에서는 알고리즘 공부를 많이 했으니 인프런 강의를 들으며 공부를 하는 백수 오윤환, 다시 집중을 해서 열심히 공부를 한다.");

                                }
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
                                System.out.println("\nQ.컴포즈에서 커피를 테이크아웃 한 뒤 집으로 돌아가는 길 붕어빵 점포를 발견한 백수 오윤환, 붕어빵도 사갈까?" +
                                        "\n1.사간다    2.그냥 간다");

                                int answer70 = sc.nextInt();

                                for (;;) {

                                    if (answer70 >= 1 && answer70 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer70 == 0) {
                                        System.out.println(answer70+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer70 = sc.nextInt();
                                    }
                                }

                                if (answer70 == 1) { // 사간다
                                    System.out.println("역시 겨울엔 붕어빵이지, 슈크림과 팥 반반을 사서 집에 도착한 백수 오윤환. 커피와 함께 붕어빵을 맛있게 먹는다.");

                                }
                                else { // 그냥 간다
                                    System.out.println("오늘은 커피로만 만족하자, 아쉽지만 붕어빵을 사지 않고 집으로 돌아온 백수 오윤환, 사온 커피를 마시며 여유를 즐긴다.");

                                }
                            }
                            else { // 메가커피
                                System.out.println("테이크아웃은 역시 가격이 저렴한 카페가 최고다. 심지어 메가커피는 4분 거리에 위치해있다. 가성비와 접근성 모두 챙긴 메가커피로 향하는 백수 오윤환.");
                                System.out.println("\nQ.메가커피에서 커피를 테이크아웃 한 뒤 집으로 돌아가는 길 붕어빵 점포를 발견한 백수 오윤환, 붕어빵도 사갈까?" +
                                        "\n1.사간다    2.그냥 간다");

                                int answer71 = sc.nextInt();

                                for (;;) {

                                    if (answer71 >= 1 && answer71 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer71 == 0) {
                                        System.out.println(answer71+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer71 = sc.nextInt();
                                    }
                                }

                                if (answer71 == 1) { // 사간다
                                    System.out.println("역시 겨울엔 붕어빵이지, 슈크림과 팥 반반을 사서 집에 도착한 백수 오윤환. 커피와 함께 붕어빵을 맛있게 먹는다.");

                                }
                                else { // 그냥 간다
                                    System.out.println("오늘은 커피로만 만족하자, 아쉽지만 붕어빵을 사지 않고 집으로 돌아온 백수 오윤환, 사온 커피를 마시며 여유를 즐긴다.");

                                }
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
                                System.out.println("\nQ.지하철을 타고 한남동에 도착한 백수 오윤환, COS에 들려 같이 일했던 직원들과 인사를 나눌지 고민이 된다. 어떻게 할까?" +
                                        "\n1.인사를 나눈다    2.다른 곳에 간다");

                                int answer72 = sc.nextInt();

                                for (;;) {

                                    if (answer72 >= 1 && answer72 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer72 == 0) {
                                        System.out.println(answer72+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer72 = sc.nextInt();
                                    }
                                }

                                if (answer72 == 1) { // 인사를 나눈다
                                    System.out.println("정말 오랜만에 COS에 간 백수 오윤환, 같이 일 했던 직원들과 오랜만에 인사를 나눈다.");

                                }
                                else { // 다른 곳에 간다
                                    System.out.println("같이 일 했던 직원들이 보고싶지만 들어가서 인사하기는 부담스러운 백수 오윤환, 그대로 COS를 지나쳐 간다.");

                                }
                            }
                            else { // 서촌
                                System.out.println("예전부터 서촌의 고즈넉한 분위기를 좋아했던 백수 오윤환, 오랜만에 그 분위기를 즐기기 위해 서촌으로 향한다.");
                                System.out.println("\nQ.서촌에 도착한 백수 오윤환, 오랜만에 방문한 서촌은 여전히 고즈넉하다. 어디부터 가볼까?" +
                                        "\n1.아키비스트(카페)    2.책방 이라선");

                                int answer73 = sc.nextInt();

                                for (;;) {

                                    if (answer73 >= 1 && answer73 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer73 == 0) {
                                        System.out.println(answer73+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer73 = sc.nextInt();
                                    }
                                }

                                if (answer73 == 1) { // 아키비스트(카페)
                                    System.out.println("가장 좋아하는 카페 중 한 곳인 아키비스트로 발걸음을 옮기는 백수 오윤환, 이곳은 여전히 사람이 많다.");

                                }
                                else { // 책방 이라선
                                    System.out.println("걷고 걸어 어느덧 이라선에 도착한 백수 오윤환, 다양한 종류의 책이 많은 책방이지만 특히나 이곳에 있는 많은 사진집을 좋아하는 백수 오윤환이다.");

                                }
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
                                System.out.println("\nQ.오랜만에 시간 가는 줄 모르고 공부에 열중한 백수 오윤환, 어느덧 점심시간이 훌쩍 지났다. 밥을 먹으려는데 무엇을 먹을까?" +
                                        "\n1.집밥    2.컵밥");

                                int answer74 = sc.nextInt();

                                for (;;) {

                                    if (answer74 >= 1 && answer74 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer74 == 0) {
                                        System.out.println(answer74+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer74 = sc.nextInt();
                                    }
                                }

                                if (answer74 == 1) { // 집밥
                                    System.out.println("냉장고를 열어보니 엄마가 맛있게 해둔 반찬들이 많다. 맛있는 집밥을 먹으며 끼니를 해결하는 백수 오윤환.");

                                }
                                else { // 컵밥
                                    System.out.println("배는 고프지만 딱히 입맛은 없는 백수 오윤환, 지난번 엄마와 함께 장을 볼 때 사왔던 컵밥을 먹는다.");

                                }
                            }
                            else { // 깃허브에 커밋
                                System.out.println("블로그까지 올릴 필요성은 느끼지 못한 백수 오윤환, 브로그에 올리지 않는 대신 주석을 열심히 달아두고 연동해두었던 깃허브에 커밋을 한다.");
                                System.out.println("\nQ.오랜만에 시간 가는 줄 모르고 공부에 열중한 백수 오윤환, 어느덧 점심시간이 훌쩍 지났다. 밥을 먹으려는데 무엇을 먹을까?" +
                                        "\n1.집밥    2.컵밥");

                                int answer75 = sc.nextInt();

                                for (;;) {

                                    if (answer75 >= 1 && answer75 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer75 == 0) {
                                        System.out.println(answer75+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer75 = sc.nextInt();
                                    }
                                }

                                if (answer75 == 1) { // 집밥
                                    System.out.println("냉장고를 열어보니 엄마가 맛있게 해둔 반찬들이 많다. 맛있는 집밥을 먹으며 끼니를 해결하는 백수 오윤환.");

                                }
                                else { // 컵밥
                                    System.out.println("배는 고프지만 딱히 입맛은 없는 백수 오윤환, 지난번 엄마와 함께 장을 볼 때 사왔던 컵밥을 먹는다.");

                                }
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
                                System.out.println("동네에 꽤나 괜찮은 돈카츠 집이 생긴 것이 생각 난 백수 오윤환, 마침 오후에는 밖에서 공부를 할 예정이기에 짐을 챙겨 돈카츠 집으로 향한다.");
                                System.out.println("\nQ.돈카츠 집에 도착한 백수 오윤환, 주문을 하려는데 안심카츠와 등심카츠 중에서 고민이 된다. 어떤 것을 먹을까?" +
                                        "\n1.안심카츠    2.등심카츠");

                                int answer76 = sc.nextInt();

                                for (;;) {

                                    if (answer76 >= 1 && answer76 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer76 == 0) {
                                        System.out.println(answer76+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer76 = sc.nextInt();
                                    }
                                }

                                if (answer76 == 1) { // 안심카츠
                                    System.out.println("부드럽고 육즙이 좌르르 흐르는 안심카츠를 주문한 백수 오윤환, 겉바속촉의 안심카츠를 빠르게 먹어치운다.");

                                }
                                else { // 등심카츠
                                    System.out.println("근본은 등심카츠지! 등심카츠를 주문한 백수 오윤환, 빠르게 등심카츠를 먹어치운다.");

                                }
                            }
                            else { // 마라탕
                                System.out.println("얼큰한 국물과 각종 채소 그리고 고기가 들어간 마라탕이 땡기는 백수 오윤환, 마침 오후에는 밖에서 공부를 할 예정이었기에 짐을 챙겨 엔젤리너스 앞 마라탕 가게로 향한다.");
                                System.out.println("\nQ.마라탕 가게에 도착한 뒤 각종 채소와 토핑들을 담고 결제를 하러 간다. 이 때 고기 추가를 할지 말지 고민하는 백수 오윤환, 어떻게 할까?" +
                                        "\n1.고기추가    2.그냥 먹기");

                                int answer77 = sc.nextInt();

                                for (;;) {

                                    if (answer77 >= 1 && answer77 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer77 == 0) {
                                        System.out.println(answer77+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer77 = sc.nextInt();
                                    }
                                }

                                if (answer77 == 1) { // 고기추가
                                    System.out.println("채소도 좋지만 고기가 더 좋은 백수 오윤환, 지갑 사정이 좋지 않지만 고기추가를 자행한 뒤 야무지게 식사를 한다.");

                                }
                                else { // 그냥 먹기
                                    System.out.println("고기추가가 너무나 하고싶었지만 지갑 사정이 좋지 않다. 고기를 추가하지 않았지만 맛있게 식사를 한다.");

                                }
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
                            System.out.println("일찍 일어나 밥도 먹었으니 개운하게 샤워를 해보자! 좋아하는 플레이리스트를 틀어두고 콧노래를 흥얼거리며 샤워를 하는 백수 오윤환.");
                            System.out.println("\nQ.상쾌하게 샤워를 마치고 나오니 오늘 하루는 좋은 일만 가득할 것만 같은 예감이 드는 백수 오윤환, 오늘 그에게는 어떤 일정이 있을까?" +
                                    "\n1.콘서트 관람    2.결혼식 참석");

                            int answer38 = sc.nextInt();

                            for (;;) {

                                if (answer38 >= 1 && answer38 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer38 == 0) {
                                    System.out.println(answer38+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer38 = sc.nextInt();
                                }
                            }

                            if (answer38 == 1) { // 콘서트 관람
                                System.out.println("오늘은 지난번 예매를 해두었던 콘서트를 보러가는 날이다. 왠지 오늘따라 부지런히 움직이는 이유가 있었던 백수 오윤환, 어느새 나갈 준비까지 마치고 출발한다.");
                                System.out.println("\nQ.콘서트가 열리는 YES24홀에 도착한 백수 오윤환, 콘서트 시작까지는 아직 시간이 남아 주변을 둘러보던 중 굿즈 판매처를 발견했다. 굿즈를 살까?" +
                                        "\n1.굿즈를 산다    2.굿즈를 사지 않는다");

                                int answer78 = sc.nextInt();

                                for (;;) {

                                    if (answer78 >= 1 && answer78 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer78 == 0) {
                                        System.out.println(answer78+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer78 = sc.nextInt();
                                    }
                                }

                                if (answer78 == 1) { // 굿즈를 산다
                                    System.out.println("사전에 공개되었던 굿즈 중 티셔츠를 눈여겨 보고 있었던 백수 오윤환, 긋즈 판매처에서 그 티셔츠를 발견하곤 홀린듯 구매해버린다.");

                                }
                                else { // 굿즈를 사지 않는다
                                    System.out.println("사고싶었던 굿즈가 있었지만 구경만 한 뒤 돌아서는 백수 오윤환, 사실 현재 그의 지갑사정은 상당히 좋지 않다...");

                                }
                            }
                            else { // 결혼식 참석
                                System.out.println("오늘은 대학교 과 선배의 결혼식이 있는 날, 수원으로 가야하기에 부지런히 움직였던 백수 오윤환. 빠르게 나갈 준비를 마친 뒤 밖으로 나선다.");
                                System.out.println("\nQ.대중교통을 타고 결혼식장에 도착한 백수 오윤환, 축의금을 내고 아는 사람이 있는지 확인해보는데 아무도 보이지 않는다. 친구들에게 연락을 해볼까?" +
                                        "\n1.연락을 한다    2.연락을 하지 않는다");

                                int answer79 = sc.nextInt();

                                for (;;) {

                                    if (answer79 >= 1 && answer79 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer79 == 0) {
                                        System.out.println(answer79+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer79 = sc.nextInt();
                                    }
                                }

                                if (answer79 == 1) { // 연락을 한다
                                    System.out.println("많은 사람들이 인사를 주고 받는 가운데 홀로 쓸쓸히 있기가 민망했던 백수 오윤환, 같이 오기로 했던 동기들에게 연락을 한 뒤 합류한다.");

                                }
                                else { // 연락을 하지 않는다
                                    System.out.println("무리지어 있는 사람들 사이에서 홀로 민망하지만, 굳이 먼저 연락하기는 귀찮은 백수 오윤환. 다행히 동기들에게 먼저 연락이 와서 합류한다.");

                                }
                            }
                        }
                        else { // 그냥 씻기
                            System.out.println("어제 밤에 샤워를 하고 잤으니 그냥 씻는게 좋겠다. 세수와 양치를 하고 머리를 감은 뒤 나온 백수 오윤환.");
                            System.out.println("\nQ.오늘은 고등학교 동창의 연극무대가 있는 날이다. 나가기 전 옷을 고르는 백수 오윤환, 어떤 것을 입을까? " +
                                    "\n1.데님과 후드티 그리고 패딩 조합의 캐주얼한 착장    2.슬랙스와 니트 그리고 코트 조합의 미니멀한 착장");

                            int answer39 = sc.nextInt();

                            for (;;) {

                                if (answer39 >= 1 && answer39 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer39 == 0) {
                                    System.out.println(answer39+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer39 = sc.nextInt();
                                }
                            }

                            if (answer39 == 1) { // 데님과 후드티
                                System.out.println("데님과 후드티 그리고 패딩 조합의 캐주얼한 착장을 입은 백수 오윤환, 실용성 있으면서 예쁜 옷을 입으니 기분이 좋다. 같이 가기로 한 친구를 만나러 약속 장소로 나간다.");
                                System.out.println("\nQ.친구가 가져온 차에 탑승한 백수 오윤환, 가는 동안 목이 마를 것 같아 드라이브 스루로 향하는데, 친구가 결제를 하려고 한다. 어떻게 할까?" +
                                        "\n1.넙죽 얻어 먹는다   2.직접 결제한다");

                                int answer80 = sc.nextInt();

                                for (;;) {

                                    if (answer80 >= 1 && answer80 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer80 == 0) {
                                        System.out.println(answer80+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer80 = sc.nextInt();
                                    }
                                }

                                if (answer80 == 1) { // 넙죽 얻어 먹는다
                                    System.out.println("백수 오윤환의 지갑사정을 아는 친구의 선의에 감동의 눈빛을 보내는 오윤환, 고맙다는 말은 건네며 감사히 얻어먹는다.");

                                }
                                else { // 직접 결제한다
                                    System.out.println("지갑사정이 여유롭지 않지만 만나면 늘 무언가 해주려는 친구이기에 작게나마 고마움의 표현을 하려고 한다. 본인의 카드로 결제한다.");

                                }
                            }
                            else { // 슬랙스와 니트
                                System.out.println("슬랙스와 니트 그리고 코트 조합의 미니멀한 착장을 입은 백수 오윤환, 예쁘게 떨어지는 실루엣의 입으니 기분이 좋다. 같이 가기로 한 친구를 만나러 약속 장소로 나간다.");
                                System.out.println("\nQ.친구가 가져온 차에 탑승한 백수 오윤환, 가는 동안 목이 마를 것 같아 드라이브 스루로 향하는데, 친구가 결제를 하려고 한다. 어떻게 할까?" +
                                        "\n1.넙죽 얻어 먹는다   2.직접 결제한다");

                                int answer81 = sc.nextInt();

                                for (;;) {

                                    if (answer81 >= 1 && answer81 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer81 == 0) {
                                        System.out.println(answer81+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer81 = sc.nextInt();
                                    }
                                }

                                if (answer81 == 1) { // 넙죽 얻어 먹는다
                                    System.out.println("백수 오윤환의 지갑사정을 아는 친구의 선의에 감동의 눈빛을 보내는 오윤환, 고맙다는 말은 건네며 감사히 얻어먹는다.");

                                }
                                else { // 직접 결제한다
                                    System.out.println("지갑사정이 여유롭지 않지만 만나면 늘 무언가 해주려는 친구이기에 작게나마 고마움의 표현을 하려고 한다. 본인의 카드로 결제한다.");

                                }
                            }
                        }
                    }
                    else { // 편의점 도시락
                        System.out.println("왠지 집밥은 먹고싶지 않다. 편의점에서 도시락을 사오기로 결심한 백수 오윤환. 편의점으로 향한다.");
                        System.out.println("\nQ.편의점에 도착하니 맛있는 도시락이 많이 보인다 어떤 도시락으로 먹을까?" +
                                "\n1.제육 도시락    2.참치 유부초밥");

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
                            System.out.println("역시 남자라면 근본 제육을 먹어야지, 고기가 가장 많이 들어있는 것 같은 제육 도시락을 구매한 후 집으로 돌아간다.");
                            System.out.println("\nQ.집에 돌아와 야무지게 도시락을 먹어치운 뒤 그대로 소파에 드러누운 , 며칠 연속 알바를 했기 때문에 많이 지쳤다. 오늘은 푹 쉬고려고 하는데 우선 무엇을 할까?" +
                                    "\n1.애니메이션 시청    2.웹툰 시청");

                            int answer40 = sc.nextInt();

                            for (;;) {

                                if (answer40 >= 1 && answer40 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer40 == 0) {
                                    System.out.println(answer40+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer40 = sc.nextInt();
                                }
                            }

                            if (answer40 == 1) { // 애니메이션 시청
                                System.out.println("오랜만에 보고싶었던 애니메이션을 시청하려는 백수 오윤환, 라프텔에 들어가 어떤 애니메이션을 볼 지 고민을 한다.");
                                System.out.println("\nQ.오랜만에 보는 애니메이션인 만큼 신중에 신중을 기하는 백수 오윤환, 주술회전과 바이올렛 에버가든 중 어떤 것을 볼까?" +
                                        "\n1.주술회전    2.바이올렛 에버가든");

                                int answer82 = sc.nextInt();

                                for (;;) {

                                    if (answer82 >= 1 && answer82 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer82 == 0) {
                                        System.out.println(answer82+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer82 = sc.nextInt();
                                    }
                                }

                                if (answer82 == 1) { // 주술회전
                                    System.out.println("놀라운 집중력으로 주술회전을 정주행하는 백수 오윤환, 그 집중력은 가히 상상을 초월한다.");

                                }
                                else { // 바이올렛 에버가든
                                    System.out.println("예전부터 자주 추천을 받았던 바이올렛 에버가든을 정주행하는 백수 오윤환, 감동적인 스토리와 연출에 빠져들어 감상한다.");

                                }
                            }
                            else { // 웹툰 시청
                                System.out.println("웹툰을 몰아서 보는 성향인 백수 오윤환, 그동안 가득 쌓인 웹툰을 보기 위해 웹툰 사이트로 들어간다.");

                            }
                        }
                        else { // 참치 유부초밥
                            System.out.println("새콤달콤 유부에 언제 먹어도 맛있는 참치가 가득 올라간 참치 유부초밥을 구매하는 백수 오윤환, 즐거운 마음으로 집으로 돌아간다.");
                            System.out.println("\nQ.하루에 한개만 들어오기 때문에 은근히 찾기 힘든 도시락... 그래서인지 더욱 맛있게 느껴진다. 든든히 배를 채웠으니 이제 무엇을 할까?" +
                                    "\n1.안경 렌즈 맞추기    2.앨범 디깅");

                            int answer41 = sc.nextInt();

                            for (;;) {

                                if (answer41 >= 1 && answer41 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer41 == 0) {
                                    System.out.println(answer41+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer41 = sc.nextInt();
                                }
                            }

                            if (answer41 == 1) { // 안경 렌즈 맞추기
                                System.out.println("지난번 구매했던 안경테를 빨리 쓰고싶지만 렌즈를 맞추지 않아서 쓰지 못하고 있었던 백수 오윤환,동네에 잘 아는 안경원으로 향한다.");
                                System.out.println("\nQ.안경원에 도착한 백수 오윤환, 시력을 재측정하고 렌즈 선택만 남았다. 국내 생산렌즈와 독일생산 렌즈 중 어떤 것을 선택할까?" +
                                        "\n1.국내생산 렌즈    2.독일생산 렌즈");

                                int answer83 = sc.nextInt();

                                for (;;) {

                                    if (answer83 >= 1 && answer83 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer83 == 0) {
                                        System.out.println(answer83+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer83 = sc.nextInt();
                                    }
                                }

                                if (answer83 == 1) { // 국내생산 렌즈
                                    System.out.println("국내생산 렌즈를 선택한 백수 오윤환, 직원분의 말씀에 따르면 둘 사이의 큰 차이는 없지만 독일생산 렌즈의 시야가 더 깨끗하게 보인다고는 한다.");

                                }
                                else { //
                                    System.out.println("독일생산 렌즈를 선택한 백수 오윤환, 직원분의 말씀에 따르면 둘 사이의 큰 차이는 없지만 독일생산 렌즈의 시야가 더 깨끗하게 보인다고는 한다. 물론 가격도 조금 더 비싸다.");

                                }
                            }
                            else { // 앨범 디깅
                                System.out.println("평소 앨범 디깅을 통해 플레이리스트를 정리하는 것이 취미였지만, 이런저런 이유로 하지 못했던 백수 오윤환. 오랜만에 각을 잡고 앨범 디깅을 시작한다. 늘 그랬듯 한번 디깅을 하면 서너시간은 기본이다.");
                                System.out.println("\nQ.미친듯이 앨범들을 디깅한 백수 오윤환, 오랜만에 좋은 노래들을 많이 찾았다. 여가생활에 탄력을 받은 김에 다른 것들도 하려고 한다. 무엇을 할까?" +
                                        "\n1.옷 디깅    2.안경테 디깅");

                                int answer84 = sc.nextInt();

                                for (;;) {

                                    if (answer84 >= 1 && answer84 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer84 == 0) {
                                        System.out.println(answer84+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer84 = sc.nextInt();
                                    }
                                }

                                if (answer84 == 1) { // 옷 디깅
                                    System.out.println("한동안 옷 구경조차 못한 백수 오윤환, 탄력 받은 김에 미친듯이 옷 딩깅도 시작한다.");

                                }
                                else { // 안경테 디깅
                                    System.out.println("쓰고 있던 안경테 이외의 번갈아가며 쓸 안경테가 필요했던 백수 오윤환, 탄력 받은 김에 미친듯이 안경테 디깅도 시작한다.");

                                }
                            }
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
                            System.out.println("\nQ.맛과 양까지 모두 챙긴 알찬 점심식사를 마친 백수 오윤환, 이제 무엇을 할까?" +
                                    "\n1.미용실 방문    2.코인 노래방");

                            int answer42 = sc.nextInt();

                            for (;;) {

                                if (answer42 >= 1 && answer42 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer42 == 0) {
                                    System.out.println(answer42+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer42 = sc.nextInt();
                                }
                            }

                            if (answer42 == 1) { // 미용실 방문
                                System.out.println("예약시간에 늦지 않기 위해 서둘러 나가는 백수 오윤환, 대중교통을 타고 미용실에 도착한다.");
                                System.out.println("\nQ.머리를 하던 중 뒷머리 다운펌을 할 것인지 물어보는 디자이너, 백수 오윤환의 선택은?" +
                                        "\n1.뒷머리 다운펌을 한다    2.뒷머리 다운펌을 하지 않는다");

                                int answer85 = sc.nextInt();

                                for (;;) {

                                    if (answer85 >= 1 && answer85 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer85 == 0) {
                                        System.out.println(answer85+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer85 = sc.nextInt();
                                    }
                                }

                                if (answer85 == 1) { // 뒷머리 다운펌을 한다
                                    System.out.println("뒷머리 다운펌까지 시술을 받은 백수 오윤환, 뒷머리 다운펌은 처음 해보는데 굉장히 깔끔해진다. 예쁘게 된 머리를 보며 만족스러움을 안고 집으로 되돌아 간다.");

                                }
                                else { // 뒷머리 다운펌을 하지 않는다
                                    System.out.println("뒷머리 다운펌은 사치다. 뒷머리 다운펌을 하지 않아도 예쁘게 된 머리를 보며 만족스러움을 안고 집으로 되돌아 간다.");

                                }
                            }
                            else { // 코인 노래방
                                System.out.println("대학생 시절 시험기간이면 카페에서 공부 후 집에 들어가기 전, 꼭 코인 노래방을 들렸다가 갔던 추억이 있다. 코인 노래방으로 향하는 백수 오윤환.");
                                System.out.println("\nQ.코인 노래방에 도착한 백수 오윤환, 얼마를 결제할지 고민하는데 늘 최소 3000원은 했었다. 오늘은 얼마나 할까?" +
                                        "\n1.3000원    2.4000원");

                                int answer86 = sc.nextInt();

                                for (;;) {

                                    if (answer86 >= 1 && answer86 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer86 == 0) {
                                        System.out.println(answer86+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer86 = sc.nextInt();
                                    }
                                }

                                if (answer86 == 1) { // 3000원
                                    System.out.println("늘 그랬듯 3000원을 결제하고 부스로 들어가는 백수 오윤환, 혼자만의 콘서트를 연다.");

                                }
                                else { // 4000원
                                    System.out.println("오랜만에 왔기 때문에 더 많이 즐기고싶은 백수 오윤환, 4000원을 결제하고 부스에 들어가 혼자만의 콘서트를 연다.");

                                }
                            }
                        }
                        else { // 수제버거
                            System.out.println("오랜만에 수제버거가 먹고싶은 백수 오윤환, 리뷰 이벤트 참여로 양념감자 업그레이드까지 챙기며 야무지게 주문을 한다.");
                            System.out.println("\nQ.먹어본 수제버거 중 원탑이다. 맛있게 먹은 뒤 리뷰까지 열심히 작성한 백수 오윤환, 이제 무엇을 할까?" +
                                    "\n1.미용실 방문    2.코인 노래방");

                            int answer43 = sc.nextInt();

                            for (;;) {

                                if (answer43 >= 1 && answer43 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer43 == 0) {
                                    System.out.println(answer43+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer43 = sc.nextInt();
                                }
                            }

                            if (answer43 == 1) { // 미용실 방문
                                System.out.println("예약시간에 늦지 않기 위해 서둘러 나가는 백수 오윤환, 대중교통을 타고 미용실에 도착한다.");
                                System.out.println("\nQ.머리를 하던 중 뒷머리 다운펌을 할 것인지 물어보는 디자이너, 백수 오윤환의 선택은?" +
                                        "\n1.뒷머리 다운펌을 한다    2.뒷머리 다운펌을 하지 않는다");

                                int answer87 = sc.nextInt();

                                for (;;) {

                                    if (answer87 >= 1 && answer87 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer87 == 0) {
                                        System.out.println(answer87+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer87 = sc.nextInt();
                                    }
                                }

                                if (answer87 == 1) { // 뒷머리 다운펌을 한다
                                    System.out.println("뒷머리 다운펌까지 시술을 받은 백수 오윤환, 뒷머리 다운펌은 처음 해보는데 굉장히 깔끔해진다. 예쁘게 된 머리를 보며 만족스러움을 안고 집으로 되돌아 간다.");

                                }
                                else { // 뒷머리 다운펌을 하지 않는다
                                    System.out.println("뒷머리 다운펌은 사치다. 뒷머리 다운펌을 하지 않아도 예쁘게 된 머리를 보며 만족스러움을 안고 집으로 되돌아 간다.");

                                }
                            }
                            else { // 코인 노래방
                                System.out.println("대학생 시절 시험기간이면 카페에서 공부 후 집에 들어가기 전, 꼭 코인 노래방을 들렸다가 갔던 추억이 있다. 코인 노래방으로 향하는 백수 오윤환.");
                                System.out.println("\nQ.코인 노래방에 도착한 백수 오윤환, 얼마를 결제할지 고민하는데 늘 최소 3000원은 했었다. 오늘은 얼마나 할까?" +
                                        "\n1.3000원    2.4000원");

                                int answer88 = sc.nextInt();

                                for (;;) {

                                    if (answer88 >= 1 && answer88 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer88 == 0) {
                                        System.out.println(answer88+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer88 = sc.nextInt();
                                    }
                                }

                                if (answer88 == 1) { //
                                    System.out.println("늘 그랬듯 3000원을 결제하고 부스로 들어가는 백수 오윤환, 혼자만의 콘서트를 연다.");

                                }
                                else { //
                                    System.out.println("오랜만에 왔기 때문에 더 많이 즐기고싶은 백수 오윤환, 4000원을 결제하고 부스에 들어가 혼자만의 콘서트를 연다.");

                                }
                            }
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
                            System.out.println("\nQ.제육은 언제 먹어도 질리지 않고 맛있다. 든든히 배를 채웠으니 카페에 가려는 백수 오윤환, 어디로 갈까?" +
                                    "\n1.엔젤리너스    2.브라운띠어리");

                            int answer44 = sc.nextInt();

                            for (;;) {

                                if (answer44 >= 1 && answer44 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer44 == 0) {
                                    System.out.println(answer44+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer44 = sc.nextInt();
                                }
                            }

                            if (answer44 == 1) { // 엔젤리너스
                                System.out.println("진짜 이만한 카페가 없다. 공부하기도 좋고 책을 읽기도 좋은 2층 좌석 그리고 전좌석 콘센트까지! 엔젤리너스로 향하는 백수 오윤환. 도착 하자마자 공부를 시작한다.");
                                System.out.println("\nQ.지난번 공부하던 알고리즘 공부를 이어서 하려는 백수 오윤환, 난이도를 올려볼까 고민 중이다. 어떻게 할까?" +
                                        "\n1.난이도를 올린다    2.난이도를 올리지 않는다");

                                int answer89 = sc.nextInt();

                                for (;;) {

                                    if (answer89 >= 1 && answer89 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer89 == 0) {
                                        System.out.println(answer89+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer89 = sc.nextInt();
                                    }
                                }

                                if (answer89 == 1) { // 난이도를 올린다
                                    System.out.println("지난번 공부했던 알고리즘 문제의 난이도는 할만했기 때문에 난이도를 올려서 공부를 시작한 백수 오윤환, 고도의 집중력을 보여주며 장시간 공부를 한다.");

                                }
                                else { // 난이도를 올리지 않는다
                                    System.out.println("지난번 공부했던 알고리즘 문제의 난이도도 조금 어려운 부분이 있었다. 기존의 난이도를 유지하여 공부를 시작한 백수 오윤환, 고도의 집중력을 보여주며 공부를 한다.");

                                }
                            }
                            else { // 브라운띠어리
                                System.out.println("최고급 스피커와 각종 음반, 그리고 멋진 인테리어와 사장님의 바리스타로서의 인지도까지! 모든 것을 갖춘 완벽한 카페인 브라운 띠어리로 향하는 백수 오윤환.");
                                System.out.println("\nQ.카페에 도착해 밖에서도 같이 놀았던 적이 있는 사장님과 인사를 나눈 뒤 공부를 시작하려는 백수 오윤환, 막상 카페에 오니 집중이 되지 않는다. 어떻게 할까? " +
                                        "\n1.카페에서 여유를 즐기자    2.마음을 다잡고 공부를 한다");

                                int answer90 = sc.nextInt();

                                for (;;) {

                                    if (answer90 >= 1 && answer90 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer90 == 0) {
                                        System.out.println(answer90+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer90 = sc.nextInt();
                                    }
                                }

                                if (answer90 == 1) { // 카페에서 여유를 즐기자
                                    System.out.println("좋아하는 LP와 CD 그리고 각종 음향장비가 있는 이곳은 음악을 좋아하는 백수 오윤환에게 천국이다. 결국 카페에서 여유를 즐기다 가기로 마음 먹은 백수 오윤환... 노답이다");

                                }
                                else { // 마음을 다잡고 공부를 한다
                                    System.out.println("좋아하는 LP와 CD 그리고 각종 음향장비가 있는 이곳은 음악을 좋아하는 백수 오윤환에게 천국과 같지만 오늘은 공부를 하러 나왔으니 마음을 다잡고 공부를 한다.");

                                }
                            }
                        }
                        else { // 국수골목
                            System.out.println("오래 전부터 동네에 맛집으로 유명한 국수골목, 백수 오윤환도 대학생 시절 시험기간에 자주 갔던 곳이다. 국수골목에 들어가 들깨수제비를 주문하고 맛있게 먹는다.");
                            System.out.println("\nQ.걸쭉하고 진한 육수와 저렴한 가격에 비해 많은 수제비의 양! 든든히 배를 채웠으니 자리를 옮기려는 백수 오윤환 이제 어디로 갈까?" +
                                    "\n1.코인 노래방    2.카페");

                            int answer45 = sc.nextInt();

                            for (;;) {

                                if (answer45 >= 1 && answer45 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer45 == 0) {
                                    System.out.println(answer45+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer45 = sc.nextInt();
                                }
                            }

                            if (answer45 == 1) { //코인 노래방
                                System.out.println("식당 바로 앞에 자주 가던 코인 노래방이 있다. 참새가 방앗간을 지나치랴, 냉큼 코인 노래방으로 들어가는 백수 오윤환.");
                                System.out.println("\nQ.평소 코인 노래방에 오면 기본 3000원은 했던 백수 오윤환, 오늘은 얼마나 할까?" +
                                        "\n1.3000원    2.4000원");

                                int answer91 = sc.nextInt();

                                for (;;) {

                                    if (answer91 >= 1 && answer91 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer91 == 0) {
                                        System.out.println(answer91+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer91 = sc.nextInt();
                                    }
                                }

                                if (answer91 == 1) { // 3000원
                                    System.out.println("늘 그랬듯 3000원을 결제하고 부스로 들어가는 백수 오윤환, 혼자만의 콘서트를 연다.");

                                }
                                else { // 4000원
                                    System.out.println("오랜만에 왔기 때문에 더 많이 즐기고싶은 백수 오윤환, 4000원을 결제하고 부스에 들어가 혼자만의 콘서트를 연다.");

                                }
                            }
                            else { // 카페
                                System.out.println("식사 후에는 바로 커피를 마셔줘야 뭔가 기분이 좋다. 바로 옆 건물에 있는 엔젤리너스로 들어가는 백수 오윤환.");
                                System.out.println("\nQ.주문한 커피를 가지고 자리로 돌아와 공부를 하기로 마음 먹은 백수 오윤환, 오늘은 몇시간 공부를 할지 정하고 시작하려고 한다. 몇시간 공부를 할까?" +
                                        "\n1.7시간    2.9시간");

                                int answer92 = sc.nextInt();

                                for (;;) {

                                    if (answer92 >= 1 && answer92 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer92 == 0) {
                                        System.out.println(answer92+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer92 = sc.nextInt();
                                    }
                                }

                                if (answer92 == 1) { // 7시간
                                    System.out.println("7시간은 무조건 채우고 가기로 결심한 백수 오윤환, 노트북을 열고 고도의 집중력을 발휘해 공부를 한다.");

                                }
                                else { // 9시간
                                    System.out.println("9시간은 무조건 채우고 가기로 결심한 백수 오윤환, 노트북을 열고 고도의 집중력을 발휘해 공부를 한다.");

                                }
                            }
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
                        System.out.println("엄마가 맛있게 만들어 둔 집밥이 맛있었는지 두 그릇이나 먹어치우는 백수 오윤환. 늦게 일어나고 밥은 왕창 먹어치우는... 이런게 식충이일까...?");
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
                            System.out.println("샤워를 해서 아직 덜 깬 잠을 깨려는 백수 오윤환, 조금 늦은 하루를 시작한 만큼 정신을 바짝 차리고자 찬물샤워를 하고 나온다.");
                            System.out.println("\nQ.어느덧 점심시간을 훌쩍 넘긴 시간대, 백수 오윤환은 하루의 절반을 흘려보내고 있는 중이다. 이제 무엇을 할까?" +
                                    "\n1.그냥 쉬자    2.공부하자");

                            int answer46 = sc.nextInt();

                            for (;;) {

                                if (answer46 >= 1 && answer46 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer46 == 0) {
                                    System.out.println(answer46+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer46 = sc.nextInt();
                                }
                            }

                            if (answer46 == 1) { // 그냥 쉬자
                                System.out.println("요새 주 5일 알바를 하느라 제대로 쉬지 못했다, 이럴 때 그냥 푹 쉬는게 좋을 것 같다는 생각이 든 백수 오윤환. 편히 쉬어가는 하루를 보내기로 결심한다.");
                                System.out.println("\nQ.오랜만에 애니를 정주행하기로 결심한 백수 오윤환, 라프텔에 들어가, 고블린 슬레이어와 스파이 패밀리 중 어떤 것을 볼까 고민한다. 백수 오윤환의 선택은?" +
                                        "\n1.고블린 슬레이어    2.스파이 패밀리");

                                int answer93 = sc.nextInt();

                                for (;;) {

                                    if (answer93 >= 1 && answer93 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer93 == 0) {
                                        System.out.println(answer93+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer93 = sc.nextInt();
                                    }
                                }

                                if (answer93 == 1) { // 고블린 슬레이어
                                    System.out.println("고블린 슬레이어 전편을 정주행하기 시작한 백수 오윤환, 애니에 상당히 진심인 모습을 보이며 고도의 집중력을 발휘해 시청을 한다.");

                                }
                                else { // 스파이 패밀리
                                    System.out.println("스파이 패밀리 전편을 정주행하기 시작한 백수 오윤환, 애니에 상당히 진심인 모습을 보이며 고도의 집중력을 발휘해 시청을 한다.");

                                }
                            }
                            else { // 나가서 공부하자
                                System.out.println("이렇게 하루를 낭비할 수 없다. 집에 있으면 또 빈둥댈게 뻔하니 나가서 조금이라도 공부를 하자! 짐을 챙겨 카페로 향하는 백수 오윤환.");
                                System.out.println("\nQ.카페에 도착해 공부를 시작하는 백수 오윤환, 한다면 한다! 오늘은 무조건 할당량을 채우고 간다. 몇시간 동안 공부를 할까?" +
                                        "\n1.8시간    2.9시간");

                                int answer94 = sc.nextInt();

                                for (;;) {

                                    if (answer94 >= 1 && answer94 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer94 == 0) {
                                        System.out.println(answer94+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer94 = sc.nextInt();
                                    }
                                }

                                if (answer94 == 1) { // 8시간
                                    System.out.println("카페에 오면 기본 5시간 이상은 공부하던 백수 오윤환, 오늘은 8시간을 하기로 결심하고 고도의 집중력을 발휘하여 공부를 한다.");

                                }
                                else { // 9시간
                                    System.out.println("카페에 오면 기본 5시간 이상은 공부하던 백수 오윤환, 오늘은 9시간을 하기로 결심하고 고도의 집중력을 발휘하여 공부를 한다.");

                                }
                            }
                        }
                        else { // 그냥 씻기
                            System.out.println("점심까지 먹고나니 샤워까지 하기엔 시간이 아까운 기분이 드는 백수 오윤환, 간단히 세면을 한다.");
                            System.out.println("\nQ.꼬질꼬질 했지만 씻고나니 나름 봐줄만한 백수 오윤환. 이제 무엇을 할까?" +
                                    "\n1.유튜브 보기    2.친구 만나기");

                            int answer47 = sc.nextInt();

                            for (;;) {

                                if (answer47 >= 1 && answer47 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer47 == 0) {
                                    System.out.println(answer47+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer47 = sc.nextInt();
                                }
                            }

                            if (answer47 == 1) { // 유튜브 보기
                                System.out.println("최근 룩삼의 음감회 컨텐츠가 보고싶었던 백수 오윤환, 백수지만 나름 바쁜 삶을 보내느라 보지 못했던 음감회 컨텐츠를 몰아본다.");
                                System.out.println("\nQ.편당 기본 30분은 넘기는 상당히 긴 분량의 컨텐츠지만 시간 가는지 모르고 집중해서 보는 백수 오윤환" +
                                        "\n현타가 오지만 도파민에 중독 되어버렸다, 홀린듯 끊임 없이 유튜브를 보는 백수 오윤환은 스르르 잠들어버린다... 이상한 느낌에 정신을 차리고 시계를 본 지금의 시간은?" +
                                        "\n1.오후 8시    2.오후 9시");

                                int answer95 = sc.nextInt();

                                for (;;) {

                                    if (answer95 >= 1 && answer95 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer95 == 0) {
                                        System.out.println(answer95+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer95 = sc.nextInt();
                                    }
                                }

                                if (answer95 == 1) { // 오후 8시
                                    System.out.println("휴대폰 시계를 확인해보니 오후 8시다... 화들짝 놀란 백수 오윤환, 하지만 이런 경험이 한두번은 아닌듯 금방 아무렇지 않아한다.");

                                }
                                else { // 오후 9시
                                    System.out.println("휴대폰 시계를 확인해보니 오후 9시다... 화들짝 놀란 백수 오윤환, 하지만 이런 경험이 한두번은 아닌듯 금방 아무렇지 않아한다.");

                                }
                            }
                            else { // 친구 만나기
                                System.out.println("대학교 기절 가장 친한 친구 중 한명과 만나기로 약속을 한 백수 오윤환, 오랜만에 친구를 만날 생각에 설레며 나갈 준비를 마치고 친구의 자취방으로 출발한다.");
                                System.out.println("\nQ.친구의 자취방에 도착한 백수 오윤환, 늘 붙어다니던 15학번 남자 동기 5인방이 뭉쳤다. 그대로 술을 마시기 시작하는데, 이때 마시는 술의 종류는?" +
                                        "\n1.소맥    2.양주");

                                int answer96 = sc.nextInt();

                                for (;;) {

                                    if (answer96 >= 1 && answer96 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer96 == 0) {
                                        System.out.println(answer96+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer96 = sc.nextInt();
                                    }
                                }

                                if (answer96 == 1) { // 소맥
                                    System.out.println("항상 모이기만 하면 끝장을 봤던 모임, 오늘도 쉴새 없이 소맥을 들이부어 마신다.");
                                    System.out.println("\nQ.그동안의 회포를 풀며 술을 마시다보니 집에 가야할 시간이 다가왔다. 백수 오윤환은 얌전히 집에 돌아갈까?" +
                                            "\n1.얌전히 돌아간다    2.얌전히 돌아가지 않는다");

                                    int answer97 = sc.nextInt();

                                    for (;;) {

                                        if (answer97 >= 1 && answer97 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer97 == 0) {
                                            System.out.println(answer97+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer97 = sc.nextInt();
                                        }
                                    }

                                    if (answer97 == 1) { // 얌전히 돌아간다
                                        System.out.println("얌전히 집에 돌아가기 위해 주섬주섬 옷을 챙겨입고 인사를 하는 백수 오윤환, 그 녀석들이 도발을 한다." +
                                                "\n그렇다, 백수 오윤환은 그들이 도발 해주길 기다렸다. 다시 착석해 미친듯이 술을 마신다.");
                                        System.out.println("\n그렇게 백수 오윤환과 그의 친구들은 그대로 쓰러져 잠들어버렸다... 나름 알찬 하루를 보내려고 노력했던 백수 오윤환," +
                                                "\n착실한 하루를 보내지는 못했지만 오랜만에 만난 친구들과 우정을 나누며 즐거운 시간을 보냈기에 이 또한 나름대로 의미가 있던 시간이 아닐까...?" +
                                                "\n-THE END- ");
                                        sc.close();
                                    }
                                    else { // 얌전히 돌아가지 않는다
                                        System.out.println("백수 오윤환은 만취했다. 이 친구들과 함께라면 늘 끝장을 봤기에 오늘도 끝장을 보기위해 다시 달린다.");
                                        System.out.println("\n그렇게 백수 오윤환과 그의 친구들은 그대로 쓰러져 잠들어버렸다... 나름 알찬 하루를 보내려고 노력했던 백수 오윤환," +
                                                "\n착실한 하루를 보내지는 못했지만 오랜만에 만난 친구들과 우정을 나누며 즐거운 시간을 보냈기에 이 또한 나름대로 의미가 있던 시간이 아닐까...?" +
                                                "\n-THE END- ");
                                        sc.close();
                                    }
                                }
                                else { // 양주
                                    System.out.println("그동안 해외여행을 다니며 온갖 양주를 모아온 친구, 오늘 모든 양주를 대방출 해버린다. 언제나 코가 삐뚤어질 때까지 마셨던 사나이들, 양주를 보고 흥분을 해버려 달리기 시작한다.");
                                    System.out.println("\nQ.그동안의 회포를 풀며 술을 마시다보니 집에 가야할 시간이 다가왔다. 백수 오윤환은 얌전히 집에 돌아갈까?" +
                                            "\n1.얌전히 돌아간다    2.얌전히 돌아가지 않는다");

                                    int answer98 = sc.nextInt();

                                    for (;;) {

                                        if (answer98 >= 1 && answer98 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer98 == 0) {
                                            System.out.println(answer98+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer98 = sc.nextInt();
                                        }
                                    }

                                    if (answer98 == 1) { // 얌전히 돌아간다
                                        System.out.println("얌전히 집에 돌아가기 위해 주섬주섬 옷을 챙겨입고 인사를 하는 백수 오윤환, 그 녀석들이 도발을 한다." +
                                                "\n그렇다, 백수 오윤환은 그들이 도발 해주길 내심 기다렸다. 다시 착석한 백수 오윤환.");
                                        System.out.println("\n잠시만 쉬겠다던 백수 오윤환, 그대로 쓰러져 잠들어버린다..." +
                                                "\n사실은 자고싶은데 집까지 가기가 귀찮아서 그랬던 것일까...? 무기력하게 잠든 백수 오윤환을 안주 삼은 친구들의 밤은 깊어간다." +
                                                "\n-THE END- ");
                                        sc.close();
                                    }
                                    else { // 얌전히 돌아가지 않는다
                                        System.out.println("백수 오윤환은 만취했다. 이 친구들과 함께라면 늘 끝장을 봤기에 오늘도 끝장을 보기위해 다시 달린다.");
                                        System.out.println("\nQ.모두가 술에 취해 힘든지 서로 눈치를 보기 시작했다. 이때 광역 도발을 시전하는 백수 오윤환, 친구들의 반응은?" +
                                                "\n1.도발에 넘어간다    2.도발에 넘어가지 않는다    3.패배를 인정한다");

                                        int answer104 = sc.nextInt();

                                        for (;;){

                                            if (answer104 >= 1 && answer104 <= 3) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer104 == 0) {
                                                System.out.println(answer104+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer104 = sc.nextInt();
                                            }
                                        }

                                        if (answer104 == 1) { // 도발에 넘어간다
                                            System.out.println("백수 오윤환의 광역 도발에 친구들이 분노를 하며 술이 가득 든 잔을 원샷한다. 승기를 가져갈 것이라고 예상을 하고 도발을 했지만 예상과는 다른 반응에 공포가 엄습하는 백수 오윤환.");
                                            System.out.println("\nQ.백수 오윤환의 광역 도발로 인해 과열이 되어버린 그들은 n차전을 시작한다. 안주가 바닥난 지금, 집주인 친구가 미소를 지으며 술을 한참 더 먹어야하니 먹고싶은 안주를 만들어주겠다고 한다. 어떤 안주를 요청할까?" +
                                                    "\n1.과자    2.라면    3.먹지 않는다");

                                            int answer105 = sc.nextInt();

                                            for (;;) {

                                                if (answer105 >= 1 && answer105 <= 3) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer105 == 0) {
                                                    System.out.println(answer105+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer105 = sc.nextInt();
                                                }
                                            }

                                            if (answer105 == 1) { // 과자
                                                System.out.println("어디선가 과자를 가져오는 친구. 아무래도 술자리가 끝나려면 아직 멀었나보다. 어디선가 자꾸만 나오는 안주를 보며 공포에 휩싸인 백수 오윤환.");
                                                System.out.println("\nQ.결국 과자 안주를 더 가져왔다. 백수 오윤환은 울고싶다, 아니 어쩌면 이미 울고 있는 것 같다. 술을 그만 먹고싶은 백수 오윤환, 친구들에게 솔직히 말할까?" +
                                                        "\n1.솔직히 말한다    2.핑계를 대며 말한다");

                                                int answer107 = sc.nextInt();

                                                for (;;) {

                                                    if (answer107 >= 1 && answer107 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer107 == 0) {
                                                        System.out.println(answer107+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer107 = sc.nextInt();
                                                    }
                                                }

                                                if (answer107 == 1) { // 솔직히 말한다
                                                    System.out.println("친구들에게 더 이상 술을 먹지 못하겠다고 솔직히 말하는 백수 오윤환, 친구들은 그런 그가 귀여운듯 바라보며 쉬라고 권한 뒤 술을 마신다. 안심하는 백수 오윤환" +
                                                            "\n구석에 기대어 잠시 눈을 감는 백수 오윤환. 그대로 잠들어버린다...zZzZ" +
                                                            "\n그렇게 백수 오윤환의 하루는 마무리 되었다." +
                                                            "-THE END-.");

                                                }
                                                else { // 핑계를 대며 말한다
                                                    System.out.println("아마도 술을 먹지 못하겠다고 솔직히 이야기 한다면, 그동안 친구들의 반응을 미루어 보았을 때 온갖 조롱과 치욕만이 돌아올 것을 예상한 백수 오윤환." +
                                                            "\n괜시리 다른 친구가 많이 취한 것 같다며 그만 마시자고 핑계를 댄다. 그런 백수 오윤환에게 나지막히 '쫄?'을 선사하는 친구들." +
                                                            "\n도발에 넘어간 백수 오윤환은 홀로 술잔을 원샷한 뒤 기억을 잃는다." +
                                                            "\n-THE END-");
                                                    sc.close();

                                                }

                                            }
                                            else if (answer105 == 2) { // 라면
                                                System.out.println("친구들은 얼큰한 국물이 먹고싶은가보다. 친구가 라면을 끓이려는 것을 본 백수 오윤환, 좀비처럼 기어가 그의 바짓가랑이를 붙잡으며 끓이지 말라고 애원한다." +
                                                        "\n안주가 리필되면 술을 무조건 더 마셔야하기 때문이다... 사실 이 중에서 가장 술을 못마시는 백수 오윤환이다...");
                                                System.out.println("\nQ.애원하는 백수 오윤환을 귀여운듯 바라보며 라면을 끓인 친구, 잔혹하다. 막상 냄새를 맡으니 라면이 땡기는 백수 오윤환, 라면맛 좀 봐볼까?" +
                                                        "\n1.먹어본다    2.먹지 않는다");

                                                int answer108 = sc.nextInt();

                                                for (;;) {

                                                    if (answer108 >= 1 && answer108 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer108 == 0) {
                                                        System.out.println(answer108+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer108 = sc.nextInt();
                                                    }
                                                }

                                                if (answer108 == 1) { // 먹어 본다
                                                    System.out.println("홀린듯 라면을 먹어보는 백수 오윤환, 예견된 상황이다. 화장실로 달려가 오늘 하루를 비워내는 백수 오윤환." +
                                                            "\n아무렇지 않은 척 다시 돌아와 자리에 착석하지만, 친구들이 극구 말린다." +
                                                            "\n본인은 괜찮지만 친구들 때문에 어쩔 수 없다는 듯이 휴식을 취하던 백수 오윤환은 그대로 숙면을 취한다." +
                                                            "\n-THE END-");
                                                    sc.close();

                                                }
                                                else { // 먹지 않는다
                                                    System.out.println("홀린듯 라면을 먹어보는 백수 오윤환, 예견된 상황이다. 화장실로 달려가 오늘 하루를 비워내는 백수 오윤환." +
                                                            "\n아무렇지 않은 척 다시 돌아와 자리에 착석하지만, 친구들이 극구 말린다." +
                                                            "\n본인은 괜찮지만 친구들 때문에 어쩔 수 없다는 듯이 휴식을 취하던 백수 오윤환은 그대로 숙면을 취한다." +
                                                            "\n-THE END-");
                                                    sc.close();

                                                }
                                            }
                                            else { // 먹지 않는다.
                                                System.out.println("뱃속에 무언가 조금이라도 들어가면 곧장 모든 것을 보여줄 것만 같은 백수 오윤환, 안주도 술도 더이상 먹지 못하겠다고 친구들에게 솔직히 말한다" +
                                                        "\n어림도 없다. 그런 백수 오윤환을 보며 미소를 짓는 친구들. 안주 후보로 나왔던 과자와 라면 추가로 냉동피자까지 가져온다.");
                                                System.out.println("\nQ.호화로운 안주들을 보며 눈물을 흘리는 백수 오윤환, 이 술자리는 절대 끝나지 않을 것 같다. 친구들에게 더는 먹지 못하겠다고 솔직히 말할까?" +
                                                        "\n1.솔직히 말을 한다.    2.어느 때보다 솔직하게 진심을 다 해서 말한다.");

                                                int answer109 = sc.nextInt();

                                                for (;;) {

                                                    if (answer109 >= 1 && answer109 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer109 == 0) {
                                                        System.out.println(answer109+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer109 = sc.nextInt();
                                                    }
                                                }

                                                if (answer109 == 1) { // 솔직히 말을 한다
                                                    System.out.println("패배를 인정하며 광역 도발에 대한 사과를 올리는 백수 오윤환, 더 이상은 무리라고 솔직하게 말을 한다. 그들의 의리는 여전하다. 너그러운 마음으로 봐주는 친구들." +
                                                            "\n대신 만들어 온 안주를 한 입씩 먹으라고 권유한다. 백수 오윤환은 술보다 나은 조건이니 순순히 받아들이고 새로운 안주들을 맛본다. 그렇게 백수 오윤환은 자신의 모든 것을 친구들에게 보여준 뒤 작렬히 전사한다." +
                                                            "-THE END-");
                                                    sc.close();

                                                }
                                                else { // 어느 때보다 솔직하게 진심을 다 해서 말한다
                                                    System.out.println("대역 죄인과 같이 무릎을 꿇고 살려달라고 애원하는 백수 오윤환. 흐뭇한 표정을 지으며 친구들은 죄인 오윤환을 용서한다. 단 조건은 마지막 한 잔을 원샷하는 것이다." +
                                                            "\n겸허히 자신의 운명을 받아들이는 백수 오윤환. 잔을 비운 뒤 그 자리에서 기억을 잃는다. 아아... 즐거운 하루였다..." +
                                                            "-THE END-");
                                                    sc.close();

                                                }

                                            }
                                        }
                                        else if (answer104 == 2) { // 도발에 넘어가지 않는다
                                            System.out.println("광역 도발에도 평정심을 유지하는 친구들, 오랜만에 만났으니 이야기를 하면서 천천히 조금만 더 마시자고 한다. 백수 오윤환은 내심 안심한 듯 하다. 사실 한 잔만 더 마시면 위험할 것 같았던 백수 오윤환이다.");
                                            System.out.println("\nQ.백수 오윤환은 자신이 끝났음을 직감하며 현재 상황을 겸허히 받아들인다. 친구들이 술잔에 술을 채워주고 잔을 든다. 백수 오윤환은 마실까?" +
                                                    "\n1.마신다    2.마시지 않는다");

                                            int answer106 = sc.nextInt();

                                            for (;;) {

                                                if (answer106 >= 1 && answer106 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer106 == 0) {
                                                    System.out.println(answer106+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer106 = sc.nextInt();
                                                }
                                            }

                                            if (answer106 == 1) { // 마신다
                                                System.out.println("이 녀석들 강하다... 백수 오윤환은 겸허히 상황을 받아들이며 가득 찬 술잔을 비운다. 그리고 그대로 쓰러진다." +
                                                        "\n흐뭇한 미소를 짓는 친구들, 아무래도 이 상황을 예상하고 있던 것 같다." +
                                                        "\n오랜만에 만난 친구들과 대학교 시절로 돌아간 듯 즐겁게 시간을 보낸 백수 오윤환, 쓰러진 그의 표정에도 옅은 미소가 번져있다." +
                                                        "\n-THE END-.");
                                                sc.close();

                                            }
                                            else { // 마시지 않는다.
                                                System.out.println("도발을 해가며 승기를 잡으려 했던 백수 오윤환이지만 이 모든 것은 가오였다. 황급히 화제를 전환하며 위기를 모면하려는 백수 오윤환." +
                                                        "\n어림도 없었다. 기어코 술을 마시게 되었고, 백수 오윤환의 시야는 페이드 아웃이 된다." +
                                                        "\n오랜만에 만난 친구들과 대학교 시절로 돌아간 듯 시간을 보낸 백수 오윤환, 쓰러진 그의 표정에도 옅은 미소가 번져있다." +
                                                        "\n-THE END-");
                                                sc.close();

                                            }
                                        }
                                        else { // 패배를 인정한다
                                            System.out.println("백수 오윤환의 광역 도발에 소스라치게 놀라며 패배를 인정하는 친구들, 더 이상은 마시지 못하겠다며 살려달라고 애원한다." +
                                                    "\n승리의 기쁨에 취한 백수 오윤환은 세레모니로 혼자 한 잔을 더 마시며 친구들에게 다시 한번 본인의 승리임을 과시한다." +
                                                    "\n.\n.\n.\n.\n는 꿈이었다. 백수 오윤환은 진작에 낙오되어 잠들었고, 친구들은 그런 백수 오윤환을 바라보며 조용히 이불을 덮어주는 스윗함까지 발휘했다고 한다." +
                                                    "\n-THE END-");
                                            sc.close();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else { // 라면
                        System.out.println("평소에도 라면을 즐겨 먹던 백수 오윤환, 라면이 종류별로 가득 쌓인 바구니에서 어떤 라면을 먹을지 고민한다.");
                        System.out.println("\nQ.국물 라면인 너구리와 짜장라면인 짜파게티 중에서 사뭇 진지하게 고민 중인 백수 오윤환, 파김치와 함께 먹을 최고의 조합인 라면은?" +
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
                            System.out.println("얼큰한 국물로 속을 뜨끈히 데워주고 밥까지 말아서 먹을 수 있는 너구리는 못참지, 너구리를 끓여서 먹고 밥까지 말아서 먹는 백수 오윤환.");
                            System.out.println("\nQ.역시 라면은 언제 먹어도 맛있다. 든든히 속을 채운 백수 오윤환, 여유로운 오후 시간을 보내는 중이다. 오랜만에 여가생활을 즐기고싶은데 무엇을 할까?" +
                                    "\n1.LP감상    2.인터넷 쇼핑");

                            int answer48 = sc.nextInt();

                            for (;;) {

                                if (answer48 >= 1 && answer48 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer48 == 0) {
                                    System.out.println(answer48+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer48 = sc.nextInt();
                                }
                            }

                            if (answer48 == 1) { // LP감상
                                System.out.println("방 한켠에는 꾸준히 모아온 LP들이 많다, 가끔씩 아무것도 하지 않은 채로 노래 듣기를 좋아하는 백수 오윤환, 오랜만에 음악감상을 한다.");
                                System.out.println("\nQ.첫 번째로 들을 앨범을 고르는 백수 오윤환, 늘 시작은 R&B soul로 고르는데 세 개의 앨범이 눈에 들어온다. 어떤 앨범을 들을까?" +
                                        "\n1.D'angelo의 1집    2.Maxwell의 1집    3.Michael Jackson의 5집");

                                int answer99 = sc.nextInt();

                                    for (;;) {

                                        if (answer99 >= 1 && answer99 <= 3) {
                                            break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer99 == 0) {
                                            System.out.println(answer99+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer99 = sc.nextInt();
                                        }
                                    }

                                if (answer99 == 1) { // D'angelo의 1집
                                    System.out.println("네오소울의 전설인 D'angelo의 1집을 집어든 백수 오윤환, 가장 좋아하는 아티스트이기도 하다. 특히나 Untitled(How deos it feel)이라는 곡을 가장 좋아는 백수 오윤환, 음악에 심취해서 1집 앨범을 모두 듣는다.");
                                    System.out.println("\nQ.오늘은 LP를 들으며 동시에 무언가 하고싶은 백수 오윤환, LP를 들으며 같이 할만한 것은?" +
                                            "\n1.잡지 보기   2.인터넷으로 디깅");

                                    int answer100 = sc.nextInt();

                                    for (;;) {

                                        if (answer100 >= 1 && answer100 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer100 == 0) {
                                            System.out.println(answer100+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer100 = sc.nextInt();
                                        }
                                    }

                                    if (answer100 == 1) { // 잡지 보기
                                        System.out.println("가끔씩 서점에 갈 일이 생기면 잡지를 사곤 했던 백수 오윤환, 오늘은 완벽한 문화인으로 거듭나려고 하나보다. 음악과 잡지를 보며 시간을 보낸다.");
                                        System.out.println("\nQ.앨범 하나를 다 듣고 난 후 다음 앨범을 재생하는 백수 오윤환, 이에 맞춰 잡지를 더 볼까?" +
                                                "\n1.더 본다    2.그만 본다");

                                        int answer110 = sc.nextInt();

                                        for (;;) {

                                            if (answer110 >= 1 && answer110 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer110 == 0) {
                                                System.out.println(answer110+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer110 = sc.nextInt();
                                            }
                                        }

                                        if (answer110 == 1) { // 더 본다
                                            System.out.println("이어서 Maxwell의 1집을 재생하는 백수 오윤환, 분위기에 심취한 채로 또 다른 잡지를 집어들어 읽기 시작한다.");

                                        }
                                        else { // 그만 본다
                                            System.out.println("이번에는 한정판으로 발매 되었던 죠지의 FRR앨범을 듣는 백수 오윤환, 잡지를 더 볼까 고민을 했지만 죠지의 단독 콘서트 당시의 기억을 떠올리며 듣기로 한다.");

                                        }
                                    }
                                    else { // 인터넷으로 디깅
                                        System.out.println("오랜만에 인터넷으로 디깅을 하려는 백수 오윤환, 그의 최근 관심사는 옷 그리고 CD/LP 이다.");

                                    }

                                }
                                else if (answer99 == 2){ // Maxwell의 1집
                                    System.out.println("Maxwell의 1집을 집어들어 재생한다. 특히나 이 앨범에서 Life time이라는 곡을 가장 좋아하는 백수 오윤환, 음악에 심취한 상태로 의자에 앉는다.");
                                    System.out.println("\nQ.앨범을 다 듣고 상당히 만족한 백수 오윤환, 콧노래를 흥얼거리며 무엇을 할지 고민한다. 이제 무엇을 할까?" +
                                            "\n1.노래 디깅    2.공부");

                                    int answer101 = sc.nextInt();

                                    for (;;) {

                                        if (answer101 >= 1 && answer101 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer101 == 0) {
                                            System.out.println(answer101+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer101 = sc.nextInt();
                                        }
                                    }

                                    if (answer101 == 1) { // 노래 디깅
                                        System.out.println("오랜만에 가장 좋아하는 음악을 들을 수 있어서 행복한 백수 오윤환, 음악에 필이 왔으니 곧장 이어서 플레이리스트에 추가할 음악을 디깅한다.");
                                        System.out.println("\nQ.디깅을 하던 중 고민이 생긴 백수 오윤환. 검색해도 나오지 않는 곡과 앨범 커버가 잘못된 것이 꽤나 있으며," +
                                                "\n기능이 다소 아쉬운 유튜브 뮤직을 해지하고 애플 뮤직으로 넘어갈지 고민하는 백수 오윤환, 어떤 구독 서비스를 이용할까?" +
                                                "\n1.유튜브 뮤직    2.애플 뮤직");

                                        int answer102 = sc.nextInt();

                                        for (;;) {

                                            if (answer102 >= 1 && answer102 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer102 == 0) {
                                                System.out.println(answer102+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer102 = sc.nextInt();
                                            }
                                        }

                                        if (answer102 == 1) { // 유튜브 뮤직
                                            System.out.println("유튜브 뮤직을 그대로 사용하기로 결심한 백수 오윤환, 아무래도 유튜브 뮤직은 사람들이 업로드한 커버곡과 같이 비공식 음원도 들을 수 있다는 메리트가 커서 쉽사리 포기할 수 없는 거 같다.");

                                        }
                                        else { // 애플 뮤직
                                            System.out.println("애플 뮤직으로 옮기는 백수 오윤환, 훨씬 많은 음원의 수와 예쁜 인터페이스 그리고 다양한 기능을 제공하는 애플 뮤직이 딥하게 음악을 듣는 백수 오윤환에게 더 합리적인 것 같다.");

                                        }
                                    }
                                    else { // 공부
                                        System.out.println("별 거 아니지만 오랜만에 취미생활을 즐겨 기분이 좋은 백수 오윤환, 현재의 기분으로 공부를 한다면 즐겁게 그리고 집중해서 할 수 있을 것만 같다. 모니터를 켜고 공부를 시작하하는 백수 오윤환.");
                                        System.out.println("\nQ.오늘은 지난번 듣다가 말앗던 인프런 강의를 들으려고 하는데, 진도를 어디까지 나갈까?" +
                                                "\n1.5강    2.7강");

                                        int answer103 = sc.nextInt();

                                        for (;;) {

                                            if (answer103 >= 1 && answer103 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer103 == 0) {
                                                System.out.println(answer103+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer103 = sc.nextInt();
                                            }
                                        }

                                        if (answer103 == 1) { // 5강
                                            System.out.println("5강 까지 시청하며 공부하기로 결심한 백수 오윤환, 선생님의 자세한 설명과 직접 적용해보는 시간을 가지며 집중해서 공부를 한다.");
                                            System.out.println("\nQ.강의 한 편당 시간이 꽤 길고 배운 내용들을 직접 적용해서 공부를 하다보니 자야할 시간이 됐다. 바로 잘까?" +
                                                    "\n1.바로 잔다    2.유튜브를 보다가 잔다");

                                            int answer155 = sc.nextInt();

                                            for (;;) {

                                                if (answer155 >= 1 && answer155 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer155 == 0) {
                                                    System.out.println(answer155+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer155 = sc.nextInt();
                                                }
                                            }

                                            if (answer155 == 1) { // 바로 잔다
                                                System.out.println("공부를 할 때도 피곤했는지 계속 하품을 하던 백수 오윤환, 공부를 마치자마자 침대에 들어가 기절하듯 잠을 청한다." +
                                                        "\n수면패턴이 돌아오면 알바 때문에 다시 깨지고를 반복해서인지 최근 체력이 많이 부족해 보이는 백수 오윤환." +
                                                        "\n하루 빨리 취업에 성공하고 건강한 수면패턴을 유지할 수 있기를!" +
                                                        "\n-THE END-");

                                            }
                                            else { // 유튜브를 보다가 잔다
                                                System.out.println("공부를 마치고 침대에 누운 백수 오윤환, 자기 전 유튜브를 보는 것이 꽤나 익숙하다.");
                                                System.out.println("\nQ.볼만한 영상을 고르는 백수 오윤환, 어떤 영상을 봐볼까?" +
                                                        "\n1.우주과학 영상    2.해외축구 하이라이트");

                                                int answer156 = sc.nextInt();

                                                for (;;) {

                                                    if (answer156 >= 1 && answer156 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer156 == 0) {
                                                        System.out.println(answer156+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer156 = sc.nextInt();
                                                    }
                                                }

                                                if (answer156 == 1) { // 우주과학 영상
                                                    System.out.println("어렸을 때부터 우주과학에 관심이 많았던 백수 오윤환, 유튜브로 가장 많이 보는 영상도 우주과학 관련 영상이다. 오늘도 우주과학 영상을 유튜브로 시청한다." +
                                                            "\n고요한 우주 영상을 보다보니 어느새 잠든 백수 오윤환, 우주에 관심이 많은 것은 밤 하늘의 별처럼 빛나고싶어서일까?" +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료

                                                }
                                                else { // 해외축구 하이라이트
                                                    System.out.println("해외축구 경기가 있는 날은 무조건 하이라이트를 챙겨보고 자는 백수 오윤환, 오늘 있었던 해외축구 경기들의 하이라이트 영상을 본다." +
                                                            "\n우리나라 해외파 선수들의 활약에 국뽕이 차올라 오랜시간 영상을 찾아보던 백수 오윤환은 그렇게 영상을 보다가 스르르 잠든다." +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료

                                                }

                                            }
                                        }
                                        else { // 7강
                                            System.out.println("7강 까지 시청하며 공부하기로 결심한 백수 오윤환, 선생님의 자세한 설명과 직접 적용해보는 시간을 가지며 집중해서 공부를 한다.");

                                        }
                                    }
                                } // 하위 스토리 모두 완료
                                else { // Michael Jackson의 5집
                                    System.out.println("Michael Jackson의 5집을 재생하는 백수 오윤환, 이 앨범은 펑크와 소울 모두를 느낄 수 있는 구성과 마이클 잭슨 특유의 미성이 돋보이는 곡들이 있어서 백수 오윤환이 좋아하는 앨범이다.");
                                    System.out.println("\nQ.언제나 음악을 들을 때면 행복한 백수 오윤환, 앨범 하나를 다 듣는데 시간이 꽤나 걸리기 때문에 다른 앨범도 들을지 고민을 한다. 어떻게 할까?" +
                                            "\n1.더 듣기    2.그만 듣기");

                                    int answer111 = sc.nextInt();

                                    for (;;) {

                                        if (answer111 >= 1 && answer111 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer111 == 0) {
                                            System.out.println(answer111+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer111 = sc.nextInt();
                                        }
                                    }

                                    if (answer111 == 1) { // 더 듣기
                                        System.out.println("오늘 제대로 날을 잡은 듯 결심한 백수 오윤환, 한번 마음을 잡고 음악을 들으면 몇시간이고 만족할 때까지 음악만 듣기도 하는데, 아마도 오늘이 그 날이 될 예정이다.");
                                        System.out.println("\nQ.이어서 들을 앨범을 고르는 백수 오윤환, 다음 후보엔 Chet Baker의 sings 앨범과 Taylor Swift의 7집이 있다. 어떤 것을 들을까?" +
                                                "\n1.Chet Baker의 sings 앨범    2.Taylor Swift의 7집");

                                        int answer112 = sc.nextInt();

                                        for (;;) {

                                            if (answer112 >= 1 && answer112 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer112 == 0) {
                                                System.out.println(answer112+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer112 = sc.nextInt();
                                            }
                                        }

                                        if (answer112 == 1) { // Chet Baker의 sings 앨범
                                            System.out.println("Chet Baker의 sings 앨범을 선택한 백수 오윤환, Chet Baker의 연주곡을 자주 듣기도 하지만 보컬이 들어간 곡도 굉장히 좋아하는 백수 오윤환이다.");
                                            System.out.println("\nQ.Chet Baker의 sings의 앨범까지 다 듣고 감상에 젖어 다른 앨범까지 들어버린 백수 오윤환, 결국 오늘 하루가 얼마 남지 않았다. 남은 하루를 어떻게 보낼까?" +
                                                    "\n1.LP를 더 감상  2.공부하기");

                                            int answer154 = sc.nextInt();

                                            for (;;) {

                                                if (answer154 >= 1 && answer154 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer154 == 0) {
                                                    System.out.println(answer154+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer154 = sc.nextInt();
                                                }
                                            }

                                            if (answer154 == 1) { // LP를 더 감상
                                                System.out.println("이왕 이렇게 된 거 LP감상을 더 하는 백수 오윤환, 엄마가 젊은 시절 모았던 LP까지 가져와서 감상한다. 이 모습을 본 엄마도 추억에 젖어 함께 음악을 듣는다." +
                                                        "\n최근 LP를 자주 듣지 않기 때문에 오늘 기회로 음악도 듣고 엄마와 시간도 보내는 백수 오윤환은 꽤나 즐거워보인다." +
                                                        "\n그렇게 늦은 밤까지 엄마와 이야기를 나누며 LP를 감상하고 내일을 위해 잠을 청하는 백수 오윤환, 대단한 것을 하지 않았어도 나름 뿌듯한 하루라고 생각한다." +
                                                        "\n-THE END-");
                                                sc.close(); // 프로그램 종료

                                            }
                                            else { // 공부하기
                                                System.out.println("LP는 다음에 더 듣고 얼마 남지 않은 오늘 하루는 공부로 마무리해서 유종의 미를 거두려는 백수 오윤환, 지난번 시청하던 인프런 강의를 마저 보며 공부를 한다." +
                                                        "\n긴 시간은 아니지만 마지막을 공부로 마무리할 수 있어서 뿌듯한 백수 오윤환, 오늘은 잠시 머리를 식히는 하루였다고 생각하고 내일의 위해 잠을 청한다." +
                                                        "\n-THE END-");
                                                sc.close(); // 프로그램 종료

                                            }
                                        }
                                        else { // Taylor Swift의 7집
                                            System.out.println("Taylor Swift의 7집을 선택한 백수 오윤환, 우선 디스크가 굉장히 예쁘기 때문에 소장가치가 충분한 앨범. 더욱이 해당 앨범에 Lover라는 곡을 너무 좋아하기 때문에 자주 듣는 앨범이다.");
                                            System.out.println("\nQ.Taylor Swift의 앨범까지 다 듣고 감상에 젖어 다른 앨범까지 들어버린 백수 오윤환, 결국 오늘 하루가 얼마 남지 않았다. 남은 하루를 어떻게 보낼까?" +
                                                    "\n1.LP를 더 감상  2.공부하기");

                                            int answer153 = sc.nextInt();

                                            for (;;) {

                                                if (answer153 >= 1 && answer153 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer153 == 0) {
                                                    System.out.println(answer153+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer153 = sc.nextInt();
                                                }
                                            }

                                            if (answer153 == 1) { // LP를 더 감상
                                                System.out.println("이왕 이렇게 된 거 LP감상을 더 하는 백수 오윤환, 엄마가 젊은 시절 모았던 LP까지 가져와서 감상한다. 이 모습을 본 엄마도 추억에 젖어 함께 음악을 듣는다." +
                                                        "\n최근 LP를 자주 듣지 않기 때문에 오늘 기회로 음악도 듣고 엄마와 시간도 보내는 백수 오윤환은 꽤나 즐거워보인다." +
                                                        "\n그렇게 늦은 밤까지 엄마와 이야기를 나누며 LP를 감상하고 내일을 위해 잠을 청하는 백수 오윤환, 대단한 것을 하지 않았어도 나름 뿌듯한 하루라고 생각한다." +
                                                        "\n-THE END-");
                                                sc.close(); // 프로그램 종료

                                            }
                                            else { // 공부하기
                                                System.out.println("LP는 다음에 더 듣고 얼마 남지 않은 오늘 하루는 공부로 마무리해서 유종의 미를 거두려는 백수 오윤환, 지난번 시청하던 인프런 강의를 마저 보며 공부를 한다." +
                                                        "\n긴 시간은 아니지만 마지막을 공부로 마무리할 수 있어서 뿌듯한 백수 오윤환, 오늘은 잠시 머리를 식히는 하루였다고 생각하고 내일의 위해 잠을 청한다." +
                                                        "\n-THE END-");
                                                sc.close(); // 프로그램 종료

                                            }
                                        }
                                    } // 하위 스토리 모두 완료
                                    else { // 그만 듣기
                                        System.out.println("앨범 하나를 다 듣기 위해서는 평균 1시간은 소모가 되기 때문에 그만 듣기로 결정한 백수 오윤환.");
                                        System.out.println("하지만 오랜만에 LP로 음악을 들으니 참을 수가 없었던 백수 오윤환, 그동안 참아왔던 LP감상 욕구를 다 풀어버린다." +
                                                "\n본인이 구매했던 음반까지 다 듣고, 엄마를 불러 함께 엄마가 젊은 시절에 모았던 LP도 같이 감상하며 남은 하루를 보낸다." +
                                                "\n비록 별 거 없이 하루가 지나간 거 같았지만, 최근 엄마와 이야기할 일이 별로 없고 시간을 함께 보내지 못해 마음이 쓰였던 백수 오윤환은" +
                                                "\n오늘 이 시간이 전혀 아깝지 않았다고 생각한다." +
                                                "\n-THE END-");
                                        sc.close(); // 프로그램 종료
                                    }
                                }
                            } // 하위 스토리 모두 완료
                            else { // 인터넷 쇼핑
                                System.out.println("한동안 쇼핑과는 거리가 멀었던 백수 오윤환, 오프라인 쇼핑을 더 선호하지만 오늘은 기분전환 겸 인터넷 쇼핑을 하려고 한다.");
                                System.out.println("\nQ.최근 안경테를 하나 더 사고싶다는 생각을 한 백수 오윤환, 여러 사이트를 돌아다니며 안경테를 디깅한다. 원하는 가격대를 정해두고 디깅하려고 하는데 얼마로 설정할까? " +
                                        "\n1.10만원대    2.30만원대");

                                int answer112 = sc.nextInt();

                                for (;;) {

                                    if (answer112 >= 1 && answer112 <= 2) {
                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                    }
                                    else if (answer112 == 0) {
                                        System.out.println(answer112+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                        sc.close();
                                        return;
                                    }
                                    else {
                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                        answer112 = sc.nextInt();
                                    }
                                }

                                if (answer112 == 1) { // 10만원대
                                    System.out.println("현재 상황에서는 큰 금액대가 부담스럽기 때문에 10만원대의 안경테를 알아보기로 결심한 백수 오윤환, 하지만 자꾸 눈에 들어오는 것은 비싼 안경테다.");
                                    System.out.println("\nQ.선택지를 좁혀가며 안경테를 디깅하던 백수 오윤환은 몇가지 후보를 선정했다. 하지만 뿔테와 하금테 중 어떤 것을 구매할지 고민에 빠지는데, 어떤 테가 좋을까?" +
                                            "\n1.뿔테    2.하금테");

                                    int answer113 = sc.nextInt();

                                    for (;;) {

                                        if (answer113 >= 1 && answer113 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer113 == 0) {
                                            System.out.println(answer113+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer113 = sc.nextInt();
                                        }
                                    }

                                    if (answer113 == 1) { // 뿔테
                                        System.out.println("이미 뿔테를 쓰고 있지만 또 다시 뿔테를 구매하기로 마음 먹은 백수 오윤환, 같이 후보에 있던 하금테보다 조금 더 저렴한 가격" +
                                                "\n그리고 기존에 쓰고 있는 뿔테와 다른 사이즈와 컬러로 구매한다면 뿔테의 다양한 매력을 경험할 수 있기 때문이다." +
                                                "\n결제창으로 넘어가 결제를 하기 직전 다시 고민을 해보는데, 다음에 금전적인 여유가 생기면 구매하기로 결심한다.");
                                        System.out.println("\nQ.결국 안경테를 구매하지 않고 인터넷 쇼핑을 마치는 백수 오윤환, 저녁시간이 되어 동생과 밥을 먹으려고 한다. 무엇을 먹을까?" +
                                                "\n1.대패삼겹살    2.마파두부");

                                        int answer143 = sc.nextInt();

                                        for (;;) {

                                            if (answer143 >= 1 && answer143 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer143 == 0) {
                                                System.out.println(answer143+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer143 = sc.nextInt();
                                            }
                                        }

                                        if (answer143 == 1) { // 대패삽겹살
                                            System.out.println("자난번 엄마와 마트에서 사온 대패삼겹을 구워먹는 백수 오윤환, 역시 고기는 언제 먹어도 맛이 있다.");
                                            System.out.println("\nQ.식사를 마친 후 엄마가 카페에서 커피를 테이크아웃 해오라고 한다. 어떻게 할까?" +
                                                    "\n1.동생과 다녀온다    2.동생만 보낸다");

                                            int answer144 = sc.nextInt();

                                            for (;;) {

                                                if (answer144 >= 1 && answer144 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer144 == 0) {
                                                    System.out.println(answer144+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer144 = sc.nextInt();
                                                }
                                            }

                                            if (answer144 == 1) { // 동생과 다녀온다
                                                System.out.println("소화도 시키고 커피도 얻어 먹을 겸 심부름을 가는 백수 오윤환, 절대 혼자 가지 않고 동생을 끌고 가서 함께 커피를 사온다.");
                                                System.out.println("\nQ.테이크아웃 해서 온 커피를 맛있게 마시는 백수 오윤환, 얼마 남지 않은 오늘을 어떻게 보낼지 고민한다. 무엇을 할까?" +
                                                        "\n1.동생과 게임    2.영화 감상");

                                                int answer146 = sc.nextInt();

                                                for (;;) {

                                                    if (answer146 >= 1 && answer146 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer146 == 0) {
                                                        System.out.println(answer146+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer146 = sc.nextInt();
                                                    }
                                                }

                                                if (answer146 == 1) { // 동생과 게임
                                                    System.out.println("오랜만에 동생과 함께 게임을 하기로 한 백수 오윤환, 둘은 지독한 축구게임 라이벌이다.");
                                                    System.out.println("\nQ.치열하게 엎치락 뒤치락하는 승률을 보이는 두 사람. 현재 스코어는 4승 5패로 백수 오윤환이 열세다. 마지막으로 한판만 더 할까?" +
                                                            "\n1.더 한다    2.그만하고 잔다");

                                                    int answer151 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer151 >= 1 && answer151 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer151 == 0) {
                                                            System.out.println(answer151+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer151 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer151 == 1) { // 더 한다
                                                        System.out.println("이대로 패배로 끝내는 것은 용납할 수가 없는 백수 오윤환, 동생에게 마지막 한판 승부를 제시한다. 하지만 동생은 미소와 함께 거절을 하고 방으로 들어간다." +
                                                                "\n단단히 열받은 백수 오윤환은 그렇게 만족할 때까지 특훈을 하고 잠에 든다." +
                                                                "\n내일부터는 이 승부욕과 근성을 공부에 사용하길 바란다." +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    } // 하위 스토리 모두 완료
                                                    else { // 그만하고 잔다
                                                        System.out.println("이미 자신의 실력에 빈정이 상한 백수 오윤환, 동생에게 그만 하자고 말한 뒤 자려고 침대에 눕는다. 하지만 많이 분했는지 홀로 게임을 하는데" +
                                                                "\n랭킹전에서 기여코 1승을 챙긴 뒤 다시 잠을 청하는 백수 오윤환, 내일부터는 이 승부욕을 공부에 사용하길 바란다." +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                } // 하위 스토리 모두 완료
                                                else { // 영화 감상
                                                    System.out.println("영화 한편을 보고나면 딱 자야할 시간이다. 오늘은 영화를 보고 자려는 백수 오윤환, 볼만한 영화를 찾아본다.");
                                                    System.out.println("\nQ.볼만한 영화를 추린 백수 오윤환 후보는 아래와 같다. 어떤 영화를 볼까?" +
                                                            "\n1.인터스텔라    2.이터널션샤인");

                                                    int answer150 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer150 >= 1 && answer150 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer150 == 0) {
                                                            System.out.println(answer150+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer150 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer150 == 1) { // 인터스텔라
                                                        System.out.println("평소 우주과학에 대해 관심이 매우 많아 관련 유튜브도 찾아보는 백수 오윤환, 예전에 한번 본적이 있는 인터스텔라지만 지식이 더 쌓인 지금 한번 더 감상을 한다." +
                                                                "\n영화를 보는 내내 그동안 유튜브를 보며 쌓았던 지식을 접목시켜서 보니 이전과 다른 이해도와 몰입도를 갖게 된 백수 오윤환. 3시간이 넘는 러닝타임 동안 전혀 지루하지 않게 감상했다." +
                                                                "\n새로운 재미를 느낄 수 있어서 기분이 좋은 백수 오윤환은 기분 좋게 잠을 청한다." +
                                                                "-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                    else { // 이터널션샤인
                                                        System.out.println("백수 오윤환이 정말 좋아해서 여러번 감상한 영화 중 하나이다. 오랜만에 잔잔한 로맨스 영화가 보고싶었기 때문에 한번 더 이터널션샤인을 감상하는 백수 오윤환" +
                                                                "\n여러번 감상했어서인가 아님녀 너무 잔잔해서인가, 영화를 보다가 잠든 백수 오윤환, 오늘 하루도 이렇게 마무리가 된다" +
                                                                "\n-THE END-.");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                }
                                            } // 하위 스토리 모두 완료
                                            else { // 동생만 보낸다
                                                System.out.println("밖에 나가기가 귀찮은 백수 오윤환, 커피를 사줄테니 동생에게 다녀오라고 떠넘긴다. 동생은 별 생각 없는듯 심부름을 가고 백수 오윤환은 설거지를 한다.");
                                                System.out.println("\nQ.설거지와 뒷정리를 마치고 동생이 사온 커피를 마시는 백수 오윤환, 든든히 식사도 하고 밥도 먹었으니 개발공부를 하려고 한다. 어떤 공부를 할까?" +
                                                        "\n1.까먹은 문법 복기    2.새로운 IDE 설치 및 공부");

                                                int answer147 = sc.nextInt();

                                                for (;;) {

                                                    if (answer147 >= 1 && answer147 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer147 == 0) {
                                                        System.out.println(answer147+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer147 = sc.nextInt();
                                                    }
                                                }

                                                if (answer147 == 1) { // 까먹은 문법 복기
                                                    System.out.println("오늘은 그동안 자주 사용하지 않아 까먹은 문법을 복기하는 공부를 하는 백수 오윤환, 예전에 정리해두었던 블로그 글을 보며 공부하고 다시 코드를 쳐보며 공부에 집중을 한다.");
                                                    System.out.println("블로그를 보면서 다시 코드를 치며 공부하다보니 자야할 시간이 되었다. 전기장판으로 따듯히 데워놓은 침대에 누워 잠을 청하는 백수 오윤환." +
                                                            "\n내일은 공부한 것을 바탕으로 무언가 만들어보겠다는 다짐을 해본다." +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료
                                                }
                                                else { // 새로운 IDE 설치 및 공부
                                                    System.out.println("인텔리제이를 써보고싶었던 백수 오윤환은 유료버전을 결제하고 설치하여 새로운 IDE 사용법을 공부하며 간단한 자바 프로그램을 만들어본다.");
                                                    System.out.println("\nQ.새로운 IDE도 사용해보고 간단한 자바 프로그램도 만들어보며 공부를 마친 백수 오윤환, 깃헙에 연동해서 커밋까지 시도해볼까?" +
                                                            "\n1.시도한다    2.다음에 한다");

                                                    int answer149 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer149 >= 1 && answer149 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer149 == 0) {
                                                            System.out.println(answer149+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer149 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer149 == 1) { // 시도한다
                                                        System.out.println("인텔리제이에서는 깃헙과의 연동성이 좋아서 커밋을 하기가 편하다는 것을 본 적이 있는 백수 오윤환, 이참에 오늘 공부한 것을 깃헙에 커밋해보는데 역시 유료 IDE의 힘인가" +
                                                                "\n이클립스에서는 여러 과정을 거쳐야했던 것이 인텔리제이에서는 계정 연동과 클릭 몇번으로 금방 끝나버린다." +
                                                                "\n뿌듯함을 안고 이만 취침을 하는 백수 오윤환, 내일도 새로운 IDE로 공부할 생각에 설레는 것 같다." +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                    else { // 다음에 한다
                                                        System.out.println("인텔리제이에서는 깃헙 연동이 매우 간단하다는 것을 본 적이 있는 백수 오윤환, 금방할 수 있을 것 같고 오늘은 피곤하기도 하니 내일 하기로 하고 잠을 청한다." +
                                                                "\n내일은 새로운 IDE를 더 많이 사용해보고 공부도 더 많이 하기로 결심했다." +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }

                                                }
                                            }

                                        } // 하위 스토리 모두 완료
                                        else { // 마파두부
                                            System.out.println("지난번 엄마와 마트에 갔을 때 사온 마파두부 밀키트를 해먹는다, 카레보다 마파두부를 더 좋아하는 백수 오윤환이다.");
                                            System.out.println("\nQ.식사를 마치고 설거지를 직접할지 동생에게 부탁할지 고민하는 백수 오윤환, 어떻게 할까?" +
                                                    "\n1.직접한다    2.동생에게 부탁한다");

                                            int answer145 = sc.nextInt();

                                            for (;;) {

                                                if (answer145 >= 1 && answer145 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer145 == 0) {
                                                    System.out.println(answer145+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer145 = sc.nextInt();
                                                }
                                            }

                                            if (answer145 == 1) { // 직접한다
                                                System.out.println("오늘 저녁식사의 준비부터 마무리까지 모든 것을 책임지는 백수 오윤환, 깨끗하게 설거지와 뒷정리까지 마친다.");
                                                System.out.println("\nQ.정리를 맟미고 동생이 사온 커피도 마신 백수 오윤환, 내일은 새벽에 일어나 아침 일찍 아르바이트에 가는 날이다. " +
                                                        "\n거실에서 가족들과 조금의 시간을 보내고 일찍 잠을 청하는 백수 오윤환, 오늘 하루도 무난히 지나갔다. 내일은 알바를 다녀와서 공부도 하는 하루가 되길!" +
                                                        "\n-THE END-");
                                                sc.close(); // 프로그램 종료

                                            }
                                            else { // 동생에게 부탁한다
                                                System.out.println("저녁식사를 준비했으니 설거지와 뒷정리는 동생에게 부탁하고 방으로 들어가는 백수 오윤환.");
                                                System.out.println("\nQ.오랜만에 애니메이션을 보고 잠을 자려는 백수 오윤환, 어떤 애니메이션을 볼까?" +
                                                        "\n1.주술회전    2.전생슬");

                                                int answer148 = sc.nextInt();

                                                for (;;) {

                                                    if (answer148 >= 1 && answer148 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer148 == 0) {
                                                        System.out.println(answer148+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer148 = sc.nextInt();
                                                    }
                                                }

                                                if (answer148 == 1) { // 주술회전
                                                    System.out.println("최근 인기가 정말 많았던 주술회전을 정주행하는 백수 오윤환, 애니메이션도 쌓아두었다가 몰아서 보는 편이라 오늘도 정주행을 한다.");
                                                    System.out.println("1기 정주행을 하던 중 잠에 들어버린 백수 오윤환, 오늘 하루도 평소와 같이 무탈히 지나갔다." +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료

                                                }
                                                else { // 전생슬
                                                    System.out.println("예전부터 재미있다는 이야기를 많이 들었던 전생슬을 정주행하는 백수 오윤환, 애니를 몰아서 보기를 좋아하기 때문에 시간 가는줄도 모르고 시청한다" +
                                                            "\n그렇게 애니를 보다가 스르르 잠든 백수 오윤환, 오늘은 편안한 하루를 보냈으니 내일은 좀 더 치열하게 살아가는 하루를 보내길!" +
                                                            "\n-THE END-.");
                                                    sc.close(); // 프로그램 종료

                                                }
                                            }
                                        }

                                    } // 하위 스토리 모두 완료
                                    else { // 하금테
                                        System.out.println("찾기 힘든 상하 폭이 좁은 안경테를 좋아하는 백수 오윤환, 마음에 쏙 드는 안경테를 발견했다." +
                                                "\n뿔테보다 가격은 조금 더 있지만 10만원대에 일본생산 그리고 직선적이고 각진 디자인이 마음에 들었던 백수 오윤환은 하금테를 구매한다.");
                                        System.out.println("\nQ.남은 저녁시간을 어떻게 보낼지 고민하는 백수 오윤환, 어떻게 하루를 마무리 할까?" +
                                                "\n1.가족들과 시간 보내기    2.혼자 시간 보내기");

                                        int answer152 = sc.nextInt();

                                        for (;;) {

                                            if (answer152 >= 1 && answer152 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer152 == 0) {
                                                System.out.println(answer152+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer152 = sc.nextInt();
                                            }
                                        }

                                        if (answer152 == 1) { // 가족들과 시간 보내기
                                            System.out.println("가족들과 저녁식사도 하고 도란도란 이야기를 나누며 남은 하루를 보내는 백수 오윤환, 오늘은 평소보다 마음이 편안한 하루였다." +
                                                    "-THE END-");
                                            sc.close(); // 프로그램 종료

                                        }
                                        else { // 혼자 시간 보내기
                                            System.out.println("남은 저녁 시간, 자기 전까지 홀로 방에서 밀린 공부도 하고 새벽 늦게까지 웹툰도 보는 백수 오윤환. 최근 부쩍 홀로 보내는 시간이 많아졌다. 가끔은 가족들과 함께 오순도순 시간을 보내는 것도 필요해 보인다." +
                                                    "\n-THE END-");
                                            sc.close(); // 프로그램 종료

                                        }
                                    }
                                } // 하위 스토리 모두 완료
                                else { // 30만원대
                                    System.out.println("인상과 바로 직결되는 얼굴에 쓰는 안경테이기 때문에 좋은 것을 써야한다는 생각이 있는 백수 오윤환, 가격대가 있더라도 30만원대를 설정한다. 지난번 구매한 뿔테도 30만원대에 구매해서 매우 잘 쓰고 있다." +
                                            "\n사실 30만원대의 안경테는 지갑 사정상 현재 살 수 없다. 아쉽지만 장바구니에 마음에 드는 안경을 넣어두고 동기부여로 이용하려는 백수 오윤환.");
                                    System.out.println("\nQ.마음에 드는 메탈 프레임의 안경테와 뿔테를 발견한 백수 오윤환, 장바구니에 넣어두고 다른 것도 디깅하려고 한다. 무엇을 디깅할까?" +
                                            "\n1.향수    2.그만하기");

                                    int answer114 = sc.nextInt();

                                    for (;;) {

                                        if (answer114 >= 1 && answer114 <= 2) {
                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                        }
                                        else if (answer114 == 0) {
                                            System.out.println(answer114+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                            sc.close();
                                            return;
                                        }
                                        else {
                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                            answer114 = sc.nextInt();
                                        }
                                    }

                                    if (answer114 == 1) { // 향수
                                        System.out.println("향수에도 관심이 있는 백수 오윤환, 딥티크 오르페옹을 쓰며 굉장히 만족했던 기억이 있다. 고가의 가격이기 때문에 현재는 구매할 여력되지 않지만 좋아하는 향에는 어떤 향수들이 있는지 찾아보는 백수 오윤환.");
                                        System.out.println("\nQ.원래 우디하고 스파이시한 향을 좋아하는 백수 오윤환, 열심히 디깅을 하던 중 마음에 드는 저렴한 향수를 발견한다. 당장 급한건 아니지만 미리 사둘까?" +
                                                "\n1.사두자    2.사지 말자");

                                        int answer115 = sc.nextInt();

                                        for (;;) {

                                            if (answer115 >= 1 && answer115 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer115 == 0) {
                                                System.out.println(answer115+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer115 = sc.nextInt();
                                            }
                                        }

                                        if (answer115 == 1) { // 사두자
                                            System.out.println("어차피 사두면 쓰게 되어있고 가격도 상당히 합리적이라고 생각하는 백수 오윤환, 무언가에 홀린듯 결제를 해버린다. 결국 사고마는 백수 오윤환.");
                                            System.out.println("\nQ.쇼핑을 마치고 저녁을 먹으려는 백수 오윤환, 오늘의 저녁 메뉴로 무엇을 먹을까?" +
                                                    "\n1.된장찌개    2.순대국");

                                            int answer135 = sc.nextInt();

                                            for (;;) {

                                                if (answer135 >= 1 && answer135 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer135 == 0) {
                                                    System.out.println(answer135+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer135 = sc.nextInt();
                                                }
                                            }

                                            if (answer135 == 1) { // 된장찌개
                                                System.out.println("침대에 누워 먹을 것이 뭐가 있는지 떠올려보는 백수 오윤환, 엄마가 해둔 된장찌개가 있는 것이 생각이 났고 데워서 먹기로 한다." +
                                                        "\n하지만 침대에 누운 상태 그대로 잠에 들어버리는 백수 오윤환... 결국 아무것도 먹지 않고 잠든다.");
                                                System.out.println("\nQ.새벽에 잠애서 깬 백수 오윤환, 뭔가 먹을지 말지 고민이 된다. 어떻게 할까?" +
                                                        "\n1.먹는다    2.잔다");

                                                int answer136 = sc.nextInt();

                                                for (;;) {

                                                    if (answer136 >= 1 && answer136 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer136 == 0) {
                                                        System.out.println(answer136+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer136 = sc.nextInt();
                                                    }
                                                }

                                                if (answer136 == 1) { // 먹는다
                                                    System.out.println("배가 고픈 백수 오윤환, 뭐라도 먹겠다고 생각을 했지만 밀려오는 잠을 이기지 못하고 다시 잠에든다" +
                                                            "\n-THE END-.");
                                                    sc.close(); // 프로그램 종료

                                                }
                                                else { // 잔다
                                                    System.out.println("비몽사몽인 백수 오윤환, 잠시 생각만 했을 뿐 다시 기절하듯 잠을 잔다" +
                                                            "-THE END-.");
                                                    sc.close(); // 프로그램 종료

                                                }

                                            }
                                            else { // 순대국
                                                System.out.println("엄마가 포장해온 순대국을 데워서 먹는 백수 오윤환, 동네에서 가장 맛있기로 유명한 순대국집이라 언제 먹어도 맛있다.");
                                                System.out.println("\nQ.뜨끈한 순대국을 먹고 공부를 시작하는 백수 오윤환, 오늘은 알고리즘과 인프런 강의 듣기 중 어떤 것을 할까?" +
                                                        "\n1.알고리즘    2.인프런 강의 듣기");

                                                int answer137 = sc.nextInt();

                                                for (;;) {

                                                    if (answer137 >= 1 && answer137 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer137 == 0) {
                                                        System.out.println(answer137+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer137 = sc.nextInt();
                                                    }
                                                }

                                                if (answer137 == 1) { // 알고리즘
                                                    System.out.println("어제 인프런에서 강의를 듣고 블로그에 정리까지 했으니 오늘은 알고리즘을 공부하자. 프로그래머스에서 알고리즘 단계별 문제를 푸는 백수 오윤환.");
                                                    System.out.println("\nQ.알고리즘을 풀면서 처음 보는 유형에 애를 먹는 중인 백수 오윤환, 결국 제대로 푼 문제가 없다. 조금 더 혼자 고민하며 풀어볼까? 해설을 찾아보고 공부할까?" +
                                                            "\n1.혼자 더 고민해보자    2.해설을 찾아본 후 공부하자");

                                                    int answer138 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer138 >= 1 && answer138 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer138 == 0) {
                                                            System.out.println(answer138+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer138 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer138 == 1) { // 혼자 더 고민해보자
                                                        System.out.println("이대로 해설을 찾아보기엔 아쉬운 백수 오윤환, 결국 혼자 더 고민해보며 문제를 풀어보지만 해결하지 못하고 여러 풀이를 찾아보며 공부를 한다.");
                                                        System.out.println("\nQ.오늘 풀어본 알고리즘 문제들도 블로그에 정리할지 고민을 하는 백수 오윤환, 어떻게 할까?" +
                                                                "\n1.정리한다    2.정리하지 않는다");

                                                        int answer140 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer140 >= 1 && answer140 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer140 == 0) {
                                                                System.out.println(answer140+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer140 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer140 == 1) { // 정리한다
                                                            System.out.println("오늘 제대로 문제를 풀지 못했기 때문에 확실한 공부를 위해 블로그에 문제들을 정리하는 백수 오윤환. 시간이 오래 걸리는 작업이지만 그만큼 오래 기억에 남는 효과가 있다" +
                                                                    "\n블로그에 정리를 완료하고 잠을 청하는 백수 오윤환, 이렇게 한 걸음씩 나아가다보면 언젠가는 목표에 다가설 수 있을 것이라는 희망을 가지며 오늘 하루도 마무리 한다." +
                                                                    "\n-THE END-.");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                        else { // 정리하지 않는다
                                                            System.out.println("풀지 못한 문제들은 여러 풀이법을 찾아보며 공부하다보니 시간이 많이 흘러버렸기 때문에 따로 정리는 하지 않는 백수 오윤환. 잠을 자기 위해 자리에 눕지만 자꾸만 마음에 걸린다." +
                                                                    "\n결국 다시 책상에 앉아 블로그에 문제들을 정리하고 복습한 뒤 다시 잠을 청하는 백수 오윤환. 힘든 작업이지만 그만큼 효과가 있을 것이다." +
                                                                    "\n점점 발전하는 자신의 모습을 기대하며 오늘 하루를 마무리한다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                    }
                                                    else { // 해설을 찾아본 후 공부하자
                                                        System.out.println("이미 여러 문제를 제대로 풀지 못한 백수 오윤환, 결국 여러 사람들의 해설을 찾아보고 공부한다." +
                                                                "\n해설을 찾아보고 모르는 부분들을 다시 공부하며 문제를 풀어보니 어느덧 새벽이 되었다. 내일을 위해 잠을 청하는 백수 오윤환." +
                                                                "\n공부를 하는 것 자체는 힘들지 않지만, 모르는 것이 나올 때마다 좌절을 경험하는 것이 힘들다. 하지만 분명 성장하고 있으니 좌절만 하지 않기를!" +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }

                                                }
                                                else { // 인프런 강의 듣기
                                                    System.out.println("어제 인프런에서 강의를 듣고 블로그에 정리를 깔끔하게 해두었다, 흐름을 이어가기 위해 이어서 강의를 듣고 공부를 하는 오윤환.");
                                                    System.out.println("\nQ.지난번과 같이 강의를 본 후에 혼자 복습하며, 공부한 것을 블로그에 기록하는 백수 오윤환. 추가로 알고리도 풀어볼까?" +
                                                            "\n1.풀어보자    2.오늘은 마치자");

                                                    int answer139 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer139 >= 1 && answer139 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer139 == 0) {
                                                            System.out.println(answer139+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer139 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer139 == 1) { // 풀어보자
                                                        System.out.println("오늘도 꼼꼼하게 공부를 한 백수 오윤환, 아직 오늘 공부가 부족하다고 느꼈는지 알고리즘 공부까지 한다." +
                                                                "\n오늘의 모든 공부를 마친 후 지친 몸을 이끌고 침대에 누워 잠을 청하는 백수 오윤환. 마지막에 열심히 공부를 했더니 유종의 미를 거둔 기분이다." +
                                                                "\n내일은 오늘보다 더 발전된 모습이 되어있길 바라며!" +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                    else { // 오늘은 마치자
                                                        System.out.println("이미 강의를 보는 것과 공부한 것을 정리하는데 많은 시간이 소요되어 잠을 잘 시간이 되었다. 오늘 공부는 여기서 마치는 백수 오윤환.");
                                                        System.out.println("오늘 하루는 여가생활도 즐기고 열심히 공부도 했던 하루였기에 만족하며 잠을 청하는 백수 오윤환, 평소 무기력하게 보냈던 지난 날을 반성하고" +
                                                                "\n하루하루 더 나아지는 자신의 모습을 꿈꾸며 잠에 든다." +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료
                                                    }
                                                }
                                            }
                                        }
                                        else { // 사지 말자
                                            System.out.println("분명히 잠깐 쓰고 나중에 좋은 향수를 사면 안 쓸게 분명하다. 이성의 끈을 놓지 않으며 합리적인 생각으로 충동구매를 억제한 백수 오윤환.");
                                            System.out.println("\nQ.충동구매까지 참으며 알차게 온라인 쇼핑을 마친 백수 오윤환, 내일 알바를 신청할지 말지 고민이 된다. 어떻게 할까?" +
                                                    "\n1.신청한다    2.신청하지 않는다");

                                            int answer141 = sc.nextInt();

                                            for (;;) {

                                                if (answer141 >= 1 && answer141 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer141 == 0) {
                                                    System.out.println(answer141+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer141 = sc.nextInt();
                                                }
                                            }

                                            if (answer141 == 1) { // 신청한다
                                                System.out.println("어플에 접속해 내일 알바를 신청하는 백수 오윤환. 최근 알바를 많이 하며 돈을 열심히 모으는 중이다. 신청한 알바가 수락이 되는 것을 확인까지 하고" +
                                                        "\n꼬여버린 수면패턴을 바로잡기 위해 매우 빨리 잠을 청하는 백수 오윤환, 내일은 알바에 가기 전 공부를 할 것을 다짐한다." +
                                                        "\n-THE END-");
                                                sc.close(); // 프로그램 종료

                                            }
                                            else { // 신청하지 않는다
                                                System.out.println("내일은 알바를 쉬고 이튿날 알바를 신청한 백수 오윤환, 내일은 새벽부터 일어나 대학교 동기의 소방학교 수료식에 가기로 한 날이라 일찍 잠에 청한다." +
                                                        "\n-THE END-.");
                                                sc.close(); // 프로그램 종료

                                            }
                                        }
                                    }
                                    else { // 그만하기
                                        System.out.println("이것저것 찾아보다보니 시간이 많이 흘렀다. 인터넷 쇼핑은 이쯤에서 마무리하는 백수 오윤환. 취업을 하면 원하는 것을 더욱 쉽게 살 수 있을 것이라는 부푼 기대를 갖는다.");
                                        System.out.println("\nQ.동기부여가 되었는지 공부를 하려는 백수 오윤환, 공부를 하기 전에 저녁을 먹고 할까?" +
                                                "\n1.먹고 공부    2.바로 공부");

                                        int answer116 = sc.nextInt();

                                        for (;;) {

                                            if (answer116 >= 1 && answer116 <= 2) {
                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                            }
                                            else if (answer116 == 0) {
                                                System.out.println(answer116+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                sc.close();
                                                return;
                                            }
                                            else {
                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                answer116 = sc.nextInt();
                                            }
                                        }

                                        if (answer116 == 1) { // 먹고 공부
                                            System.out.println("공부를 하다가 배가 고프면 집중이 안 될게 뻔하니 저녁을 챙겨 먹은 뒤 공부를 하기로 결심한 백수 오윤환, 저녁 메뉴를 고민한다.");
                                            System.out.println("\nQ.점심에 라면을 먹었으니 저녁은 든든히 먹으려고 하는 백수 오윤환, 오늘 저녁 메뉴로 무엇을 먹을까?" +
                                                    "\n1.김치찌개    2.치킨");

                                            int answer117 = sc.nextInt();

                                            for (;;) {

                                                if (answer117 >= 1 && answer117 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer117 == 0) {
                                                    System.out.println(answer117+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer117 = sc.nextInt();
                                                }
                                            }

                                            if (answer117 == 1) { // 김치찌개
                                                System.out.println("엄마가 끓여둔 돼지고기가 잔뜩 들어간 김치찌개를 데워서 먹는 백수 오윤환, 역시 흰쌀밥에 김치찌개는 집밥의 정석이다.");
                                                System.out.println("\nQ.맛있게 밥을 먹고 공부를 시작하려는 백수 오윤환, 배도 부르고 막상 공부를 하려니 하기가 싫다. 어떻게 할까?" +
                                                        "\n1.공부를 한다    2.공부를 하지 않는다");

                                                int answer124 = sc.nextInt();

                                                for (;;) {

                                                    if (answer124 >= 1 && answer124 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer124 == 0) {
                                                        System.out.println(answer124+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer124 = sc.nextInt();
                                                    }
                                                }

                                                if (answer124 == 1) { // 공부를 한다
                                                    System.out.println("디깅했던 아이템들을 떠올리며 마음을 다잡아 공부를 시작하는 백수 오윤환, 효과가 있었는지 상당히 집중해서 공부를 한다.");
                                                    System.out.println("\nQ.공부를 마치고 잠에 청하려는 백수 오윤환, 오늘은 노래를 틀어두고 자려고 한다. 자장가로 틀 플레이리스트는?" +
                                                            "\n1.잔잔한 재즈 모음 플레이리스트   2.직접 만든 R&B 플레이리스트");

                                                    int answer125 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer125 >= 1 && answer125 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer125 == 0) {
                                                            System.out.println(answer125+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer125 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer125 == 1) { // 잔잔한 재즈 모음 플레이리스트
                                                        System.out.println("잔잔한 재즈 모음 플레이리스트를 찾아서 재생하는 백수 오윤환, 역시 자장가로는 잔잔한 재즈만한 것이 없다. 금방 잠이 든 백수 오윤환의 코골이 소리가 들린다." +
                                                                "\n내일은 더욱 일찍 일어나 미래의 자신을 위한 시간을 더 많이 갖기를!" +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                    else { // 직접 만든 R&B 플레이리스트
                                                        System.out.println("직접 만든 R&B 플레이리스트를 재생하고 침대에 눕는 백수 오윤환. 본인의 탁월한 선곡에 스스로 감탄을 한다. 때문에 자꾸만 노래에 집중하게 되어 잠에 들지 못하는 백수 오윤환." +
                                                                "\n결국 노래를 종료하고 다시 잠을 청하자 금새 새근새근 숨소리가 들린다. 하루빨리 취업에 성공해서 좋아하는 음반을 많이 살 수 있기를!" +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                }
                                                else { // 공부를 하지 않는다
                                                    System.out.println("배도 부르고 막상 다시 책상에 앉고싶지 않은 백수 오윤환, 결국 공부는 저 멀리한채로 거실 소파에 자리를 잡고 엄마와 TV를 본다.");
                                                    System.out.println("\nQ.오랜만에 엄마와 수다를 떨며 TV를 보던 중 어깨가 아픈지 계속 두드리는 엄마, 오랜만에 안마를 해드릴까?" +
                                                            "\n1.해드린다    2.해드리지 않는다");

                                                    int answer126 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer126 >= 1 && answer126 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer126 == 0) {
                                                            System.out.println(answer126+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer126 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer126 == 1) { // 해드린다
                                                        System.out.println("일을 다닌 후로 부쩍 몸에 고질병이 많아진 엄마를 보니 마음이 좋지 않은 백수 오윤환, 엄마의 어깨를 주물러드리고 뭉친 곳을 열심히 안마 해드린다.");
                                                        System.out.println("\nQ.안마를 해드리고 TV를 보다보니 어느덧 잘 시간이 되어 방으로 들어 왔다. 전기장판이 있지만 방 보일러를 켜고 잘까?" +
                                                                "\n1.켠다    2.안 켠다");

                                                        int answer127 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer127 >= 1 && answer127 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer127 == 0) {
                                                                System.out.println(answer127+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer127 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer127 == 1) { // 켠다
                                                            System.out.println("전기장판이 있지만 방 안의 공기가 너무나 차갑다. 보일러를 켜고 전기장판을 틀어둔 이불 속으로 들어가는 백수 오윤환," +
                                                                    "\n오늘 있었던 일들을 떠올리며 내일은 더욱 열심히 살아야겠다고 다짐을 한 뒤 잠에 든다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료
                                                        }
                                                        else { // 안 켠다
                                                            System.out.println("방 안의 공기가 너무 차갑지만 전기장판을 틀어둔 이불 속에 들어가면 버틸 수 있을 것 같다. 그렇게 전기장판만 틀고 잠을 청하는 백수 오윤환." +
                                                                    "\n하지만 얼마 지나지 않아 추위 때문에 잠에서 깨고, 결국 보일러를 튼 뒤 다시 잠에 든다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료
                                                        }
                                                    } // else 하위 스토리 모두 완료
                                                    else { // 해드리지 않는다
                                                        System.out.println("엄마가 안쓰럽기도 하고 마음이 좋지 않았던 백수 오윤환, 귀찮은 마음이 더 컷는지 모른척하고 넘어간다. 하지만 얼마 못가 결국 엄마가 걱정되어 안마를 해드린다.");
                                                        System.out.println("\nQ.오랜만에 엄마와 시간을 보내니 시간이 훌쩍 지났다. 방에 들어와서 잘 준비를 마친 백수 오윤환, 트위치를 보다가 잘까?" +
                                                                "\n1.본다    2.안 본다");

                                                        int answer128 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer128 >= 1 && answer128 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer128 == 0) {
                                                                System.out.println(answer128+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer128 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer128 == 1) { // 본다
                                                            System.out.println("트위치를 보다가 잠을 자려는 백수 오윤환, 누워서 휴대폰으로 트위치를 보다가 얼마 지나지 않아 스르르 잠 든다." +
                                                                    "\n평소와 같이 크게 다를 것 없는 일상이지만 그 일상의 소중함을 조금은 느낄 수 있었던 하루였던 거 같다." +
                                                                    "\n-THE END-");
                                                            sc.close();

                                                        }
                                                        else { // 안 본다
                                                            System.out.println("항상 휴대폰을 보다보면 늦게 잠들고 때문에 생활패턴이 꼬였다. 오늘 정상적인 패턴을 보냈기 때문에 유지를 위해 바로 잠을 청하는 백수 오윤환." +
                                                                    "\n앞으로 더 부지런하고 멋진 하루를 보내길!" +
                                                                    "\n-THE END-");
                                                            sc.close();

                                                        }
                                                    }
                                                }
                                            }// 하위 스토리 모두 완료
                                            else { // 치킨
                                                System.out.println("맛있는 것이 먹고싶었던 백수 오윤환, 배달의 민족에 들어가 교촌치킨 레허반 순살을 주문한다. 설레는 마음으로 배달을 기다리는 백수 오윤환");
                                                System.out.println("\nQ.시간이 얼마 지나지 않아서 메뉴 품절로 주문이 불가능하다는 연락을 받은 백수 오윤환, 다른 치킨을 주문할까?" +
                                                        "\n1.다른 치킨 주문    2.공부 시작");

                                                int answer129 = sc.nextInt();

                                                for (;;) {

                                                    if (answer129 >= 1 && answer129 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer129 == 0) {
                                                        System.out.println(answer129+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer129 = sc.nextInt();
                                                    }
                                                }

                                                if (answer129 == 1) { // 다른 치킨 주문
                                                    System.out.println("꼭 레허반이 아니라도 괜찮은 백수 오윤환, 굽네치킨에서 고추바사삭을 주문한다.");
                                                    System.out.println("\nQ.주문한 치킨을 받아서 맛있게 먹은 백수 오윤환, 뒷정리까지 마친 후 공부를 시작하려고 하는데 랄로가 방송을 시작했따는 트위치 알림을 보게 된다. 어떻게 할까?" +
                                                            "\n1.랄로 방송을 본다    2.공부를 한다");

                                                    int answer130 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer130 >= 1 && answer130 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer130 == 0) {
                                                            System.out.println(answer130+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer130 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer130 == 1) { // 랄로 방송을 본다
                                                        System.out.println("자주 방송을 하지 않는 랄로, 오늘은 지난 방송으로 부터 한 달이 넘어서 돌아왔다. 참을 수 없는 백수 오윤환은 공부를 제쳐두고 랄로의 방송을 본다.");
                                                        System.out.println("\nQ.돌아온 랄로는 옛날 메이플을 구현해놓은 메이플랜드를 한다. 추억에 빠져들은 백수 오윤환, 넋을 놓고 몰입해서 방송을 본다." +
                                                                "\n이 때, 국가권력급 노가다 목장갑 강화를 시도하는 랄로, 채널포인트로 내기를 열어준다. 공11 노목 성공유무, 백수 오윤환의 선택은? " +
                                                                "\n1.성공    2.실패");

                                                        int answer131 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer131 >= 1 && answer131 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer131 == 0) {
                                                                System.out.println(answer131+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer131 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer131 == 1) { // 성공
                                                            System.out.println("성공에 채널포인트를 올인한 백수 오윤환, 역배이기에 예측 성공시 상당한 채널포인트를 얻게 된다. 긴장되는 순간, 랄로는 망설이다가 연속으로 주문서를 바르고 결과를 확인하는데..." +
                                                                    "\n공11 노목 만들기에 성공하는 랄로! 백수 오윤환도 역배가 성공하여 많은 채널포인트를 얻게 된다... 그렇게 계속 방송을 보는 백수 오윤환." +
                                                                    "\n장장 7시간의 방송을 모두 챙겨보고 잠에 든다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료
                                                        }
                                                        else { // 실패
                                                            System.out.println("실패에 모든 채널포인트를 건 백수 오윤환. 실패가 정배인 가운데 주문서를 망설임 없이 바르는 랄로! 뒤도 돌아보지 않고 딜을 체크하기 위해 사냥을 하러 가보는데..." +
                                                                    "\n뭔가 강해진 느낌이다. 확인해보니 결국 공11 노목 만들기에 성공... 백수 오윤환은 안전자산으로 정배에 올인했지만 모든 채널포인트를 잃었다." +
                                                                    "\n채널포인트를 잃어서 속상하지만 있어도 없어도 그만이기에 다시 재미있게 방송을 보는 백수 오윤환, 장장 7시간의 방송을 모두 챙겨보고 잠에 든다..." +
                                                                    "\n도박에 역배와 정배 모두 안전한 것은 없으며, 다시한번 실제 도박의 위험성을 깨달은 백수 오윤환이다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료
                                                        }
                                                    }
                                                    else { // 공부를 한다
                                                        System.out.println("랄로의 방송이 너무 보고싶지만 유튜브에 풀버전 다시보기를 보기로 다짐하고 공부를 시작하는 백수 오윤환.");
                                                        System.out.println("\nQ.공부를 계속 하지만 랄로의 늪에 빠져버린 백수 오윤환, 자꾸만 손이 근질거린다. 어떻게 할까? " +
                                                                "\n1.참고 공부한다    2.랄로 방송을 본다");

                                                        int answer132 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer132 >= 1 && answer132 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer132 == 0) {
                                                                System.out.println(answer132+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer132 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer132 == 1) { // 참고 공부한다
                                                            System.out.println("유혹이 계속 되지만 끝까지 참아내고 집중해서 공부를 하는 백수 오윤환, 상당히 발전한 모습이다." +
                                                                    "\n그렇게 끝까지 공부를 마무리하고 잠을 청하는 백수 오윤환. 유혹 속에서도 끝까지 견디고 공부를 했다는 사실에 스스로 만족하는 것 같다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                        else { // 랄로 방송을 본다
                                                            System.out.println("계속되는 유혹에 결국 방송을 틀어보데, 이미 방송은 종료 되었다. 생각보다 짧게 방송을 하고 간 랄로." +
                                                                    "\n아쉬운 마음이 들면서도 한편으로는 다행이라는 생각이 드는 백수 오윤환은 온전히 집중해서 공부를 마친다." +
                                                                    "\n어찌 되었든 공부까지 마무리한 백수 오윤환, 앞으로 많은 유혹을 이겨내고 목표를 위해 정진하길!" +
                                                                    "\n-THE END-.");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                    }

                                                }
                                                else { // 공부 시작
                                                    System.out.println("이렇게 된 거, 흐름이 깨졌기 때문에 바로 공부를 시작하는 백수 오윤환. 인프런에서 강의를 보기 시작한다.");
                                                    System.out.println("\nQ.강의를 보며 열심히 공부를 한 백수 오윤환, 공부한 것들을 블로그에 정리할지 말지 고민이 된다. 어떻게 할까?" +
                                                            "\n1.정리한다    2.깃헙에 커밋만 한다");

                                                    int answer133 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer133 >= 1 && answer133 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer133 == 0) {
                                                            System.out.println(answer133+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer133 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer133 == 1) { // 정리 한다
                                                        System.out.println("강의의 분량도 많고, 공부한 것들을 정리해서 블로그에 올리면 시간도 상당히 오래걸린다." +
                                                                "\n하지만 기록으로 남겨두면 기억하는데 도움이 되고, 언제든 찾아볼 수 있기 때문에 블로그에 정리를 하는 백수 오윤환.");
                                                        System.out.println("\nQ.블로그에 기록까지 완료한 백수 오윤환, 어느덧 잠 잘 시간이 되었고 침대에 몸을 뉘어 본다. 바로 잠을 잘까?" +
                                                                "\n1.나중에 잔다    2.바로 잔다");

                                                        int answer134 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer134 >= 1 && answer134 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer134 == 0) {
                                                                System.out.println(answer134+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer134 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer134 == 1) { // 나중에 잔다
                                                            System.out.println("이대로 바로 자기는 아쉬운 백수 오윤환, 휴대폰을 만지작 거리지만 피곤했는지 그대로 잠들어버린다." +
                                                                    "\n오랜만에 알찬 하루를 보낸 백수 오윤환, 앞으로도 배운 것들을 열심히 기록하고 머릿속에 남겨두는 연습을 하자!" +
                                                                    "\n-THE END-.");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                        else { // 바로 잔다
                                                            System.out.println("쉴 틈이 없이 알차게 보낸 오늘, 특히 장시간 이어진 공부 때문인지 곧바로 잠들어버린다." +
                                                                    "\n앞으로도 해야할 것과 하지 말아야할 것을 잘 구분하고 알차게 시간을 보내자!" +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                    }
                                                    else { // 깃헙에 커밋만 한다
                                                        System.out.println("강의를 보며 주석을 단 코드들과 직접 작성하며 공부한 것들을 깃헙에 커밋만 하면 보다 편하다." +
                                                                "\n주석을 달며 공부를 했기 때문에 깃헙에 잔디만 심어도 충분하다고 생각한 백수 오윤환." +
                                                                "\n이렇게 공부까지 마치고 하루의 모든 일정을 마무리했다. 앞으로는 조금 더 부지런히 그리고 공부에 더 많은 시간을 투자하길!" +
                                                                "\n-THE END-");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                }
                                            }
                                        } // 하위 스토리 모두 완료
                                        else { // 바로 공부
                                            System.out.println("지금 느낌이 왔을 때 공부를 해야 집중해서 효과적으로 공부할 수 있다. 저녁은 나중에 해결할 문제니 바로 공부를 하기로 결심한 백수 오윤환이다.");
                                            System.out.println("\nQ.책상에 앉아 공부를 시작하는 백수 오윤환, 막상 공부를 시작하니 생각보다 집중이 되지 않는다. 카페에 가서 공부를 할까?" +
                                                    "\n1.집    2.카페");

                                            int answer118 = sc.nextInt();

                                            for (;;) {

                                                if (answer118 >= 1 && answer118 <= 2) {
                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                }
                                                else if (answer118 == 0) {
                                                    System.out.println(answer118+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                    sc.close();
                                                    return;
                                                }
                                                else {
                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                    answer118 = sc.nextInt();
                                                }
                                            }

                                            if (answer118 == 1) { // 집
                                                System.out.println("다시 마음을 다잡고 공부를 시작하는 백수 오윤환, 다행히도 금방 집중을 할 수 있었다. 사뭇 진지한 모습으로 공부를 하는 모습이 오랜만이다.");
                                                System.out.println("\nQ.오랜시간 집중해서 시간이 훌쩍 흘렀다. 공부를 마치고 씻으러 가는 백수 오윤환, 자기 전 샤워를 할까?" +
                                                        "\n1.샤워    2.세면");

                                                int answer119 = sc.nextInt();

                                                for (;;) {

                                                    if (answer119 >= 1 && answer119 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer119 == 0) {
                                                        System.out.println(answer119+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer119 = sc.nextInt();
                                                    }
                                                }

                                                if (answer119 == 1) { // 샤워
                                                    System.out.println("하루를 마무리하며 하는 샤워는 그 날의 피로를 날려주는 것만 같다. 샤워를 하는 동안 오늘 하루 있었던 일들을 떠올리며 더 나은 내일을 바라는 백수 오윤환.");
                                                    System.out.println("\nQ.샤워를 하고 침대에 누운 백수 오윤환, 샤워를 하며 생각을 해보니 나름 하루를 알차게 보낸 것만 같다. 더 나은 내일을 위해 지금 바로 잘까?" +
                                                            "\n1.잔다    2.안 잔다");

                                                    int answer120 = sc.nextInt();

                                                    for (;;) {

                                                        if (answer120 >= 1 && answer120 <= 2) {
                                                            break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                        }
                                                        else if (answer120 == 0) {
                                                            System.out.println(answer120+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                            sc.close();
                                                            return;
                                                        }
                                                        else {
                                                            System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                            answer120 = sc.nextInt();
                                                        }
                                                    }

                                                    if (answer120 == 1) { // 잔다
                                                        System.out.println("내일은 더 일찍 일어나서 더 알찬 하루를 보내기로 결심한 백수 오윤환은 곧장 잠을 청한다. 오늘 하루를 나름 알차게 보내 마음이 편했는지 불면증 없이 잠에 든 백수 오윤환" +
                                                                "\n취업 전까지 매일매일 더 발전하는 하루를 살아가길 바란다" +
                                                                "\n-THE END-.");
                                                        sc.close(); // 프로그램 종료

                                                    }
                                                    else { // 안 잔다
                                                        System.out.println("지금 자기에는 조금 이른 것 같다. 잠을 청하기 전 잠시 휴대폰을 하려는 백수 오윤환.");
                                                        System.out.println("\nQ.잠자기 전 한때는 정말 많이했던 모바일 축구게임에 접속한 백수 오윤환, 오랜만에 실력 점검을 하려고 하는데 AI모드와 대인전 중 어떤 것을 할까?" +
                                                                "\n1.AI모드    2.대인전");

                                                        int answer121 = sc.nextInt();

                                                        for (;;) {

                                                            if (answer121 >= 1 && answer121 <= 2) {
                                                                break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                            }
                                                            else if (answer121 == 0) {
                                                                System.out.println(answer121+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                sc.close();
                                                                return;
                                                            }
                                                            else {
                                                                System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                answer121 = sc.nextInt();
                                                            }
                                                        }

                                                        if (answer121 == 1) { // AI모드
                                                            System.out.println("AI모드로 가볍게 손도 풀고, 가장 어려운 난이도에서 실력 점검을 하는 백수 오윤환. 한때 가장 높은 랭킹까지 갔던 경험이 있어서인지 아직 꽤나 노련한 플레이를 보여준다." +
                                                                    "\n그렇게 게임을 하다가 스르르 잠들어버리는 백수 오윤환... 이제는 체력이 예전과 같지 않다는 것을 사뭇 느낀다." +
                                                                    "\n-THE END-");
                                                            sc.close(); // 프로그램 종료

                                                        }
                                                        else { // 대인전
                                                            System.out.println("남자라면 대인전에서 승리하여 실력을 증명한다. 대인전 랭킹모드에서 게임을 즐기는 백수 오윤환, 한때 가장 높은 단계까지 갔던 유저의 저력을 보여주기 위해 고군분투 한다.");
                                                            System.out.println("\nQ.경기에 들어가기 전, 선발풀전 명단을 보니 손흥민의 컨디션이 좋지 않다. 다른 선수로 바꿔줄까?" +
                                                                    "\n1.바꾼다    2.바꾸지 않는다");

                                                            int answer122 = sc.nextInt();

                                                            for (;;) {

                                                                if (answer122 >= 1 && answer122 <= 2) {
                                                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                                }
                                                                else if (answer122 == 0) {
                                                                    System.out.println(answer122+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                                    sc.close();
                                                                    return;
                                                                }
                                                                else {
                                                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                                    answer122 = sc.nextInt();
                                                                }
                                                            }

                                                            if (answer122 == 1) { // 바꾼다
                                                                System.out.println("현실과 같이 게임에서도 빠른 속도와 좋은 슈팅 능력을 보유한 손흥민이지만, 게임상 컨디션이 좋지 않아 선발에서 제외하는 백수 오윤환. 손흥민 대신 음바페를 투입한다." +
                                                                        "\n경기를 시작했는데 손흥민이 그대로 보인다. 분명 음바페를 선발로 넣었던 백수 오윤환은 당황하며 스쿼드를 살핀다. 터치가 제대로 되지 않아 그대로 손흥민이 선발 출전하게 되었다." +
                                                                        "\n그리고 그 여파로 처참히 패배하는 백수 오윤환, 빡종 후 내일 재접속해서 승리할 것을 다짐하며 잠을 청한다." +
                                                                        "\n-THE END-");
                                                                sc.close(); // 프로그램 종료

                                                            }
                                                            else { // 바꾸지 않는다
                                                                System.out.println("국뽕을 극한으로 느끼기 위해서는 끝까지 손흥민을 밀고가는 것이 맞다. 사실 손흥민보다 좋은 선수도 보유하고 있는 백수 오윤환이지만 국뽕을 위해 손흥민 선발을 고집해왔다" +
                                                                        "\n손흥민 선발 그대로 경기를 하는 백수 오윤환, 컨디션 능력치의 문제 때문인지 모든 찬스를 살리지 못하는 손흥민. 하지만 중거리 감아차기 특수 능력이 달려있는 카드의 능력이 발휘되어" +
                                                                        "\n실제 축구에서 손흥민이 자주 보여주었던 골과 유사한 결승골을 넣고 승리한다. 기분좋게 게임을 종료하고 잠에 드는 백수 오윤환. 오늘은 전체적으로 완벽한 하루였다." +
                                                                        "\n-THE END-");
                                                                sc.close(); // 프로그램 종료

                                                            }
                                                        }

                                                    }
                                                }
                                                else { // 세면
                                                    System.out.println("하루종일 집에 있었으니 간단히 세면을 하는 백수 오윤환, 내일 아침에 샤워를 하는 것이 잠도 잘 깨고 좋을 것 같다." +
                                                            "\n세면 후 침대에 눕는 백수 오윤환, 오늘은 웬일인지 곧장 잠에 든다." +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료
                                                }
                                            }
                                            else { // 카페
                                                System.out.println("이대로 버티며 있다가는 죽도 밥도 안 될것 같음을 느낀 백수 오윤환, 카페로 가기 위해 짐을 챙겨 밖으로 나간다." +
                                                        "\n하지만 엄청난 강추위에 곧장 집으로 돌아오는 백수 오윤환. 찬 바람을 맞고난 후 정신을 차려서인지 집중을 잘 한다.");
                                                System.out.println("\nQ.열심히 집중을 하면서 공부를 하던 중, 결국 꾸벅꾸벅 조는 백수 오윤환, 이 모습을 본 엄마는 불을 끄더니 그냥 푹 자라고 한다. 어떻게 할까?" +
                                                        "\n1.잔다    2.참는다");

                                                int answer123 = sc.nextInt();

                                                for (;;) {

                                                    if (answer123 >= 1 && answer123 <= 2) {
                                                        break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                                    }
                                                    else if (answer123 == 0) {
                                                        System.out.println(answer123+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                                        sc.close();
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                                        answer123 = sc.nextInt();
                                                    }
                                                }

                                                if (answer123 == 1) { // 잔다
                                                    System.out.println("이렇게 잠이 쏟아질 때는 그냥 자는게 더 낫다는 사실을 알고 있는 백수 오윤환, 참았을 때마다 이도저도 아니게 되었던 경험이 꽤나 있었다. 결국 침대로 향한다." +
                                                            "\n평소보다 일찍 하루를 마치는 백수 오윤환, 오늘 일찍 잠들었으니 내일은 오늘보다 하루를 더 빨리 시작할 것이다. 오늘이 정상적인 생활패턴으로 바뀌는 계기가 되었길!" +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료

                                                }
                                                else { // 참는다
                                                    System.out.println("공부를 하고 있었기 때문에 필사적으로 잠이 오는 것을 참는 백수 오윤환, 하지만 그는 쉽게 잠을 이길 수 없었다." +
                                                            "\n최근 생활패턴이 무너져 수면이 부족했기 때문에 밀려오는 잠을 이기지 못하고 침대에 들어가 잠들어버린다." +
                                                            "\n-THE END-");
                                                    sc.close(); // 프로그램 종료

                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                        else { // 짜파게티
                            System.out.println("짜파게티에 파김치? 이 조합은 치트키지, 계란후라이까지 얹어서 야무지게 먹어버리는 백수 오윤환.");
                            System.out.println("\nQ.역시 실패할 수가 없는 조합이다. 든든히 배를 채운 백수 오윤환, 여유로운 하루를 보내고싶다. 이제 무엇을 할까?" +
                                    "\n1.PC방    2.화상채팅");

                            int answer49 = sc.nextInt();

                            for (;;) {

                                if (answer49 >= 1 && answer49 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer49 == 0) {
                                    System.out.println(answer49+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer49 = sc.nextInt();
                                }
                            }

                            if (answer49 == 1) { // PC방
                                System.out.println("문득 PC방에 가고싶다는 생각이 든 백수 오윤환, 마지막으로 갔던게 언제인지도 기억이 안 난다. 동생을 꼬셔서 함께 PC방으로 향한다.");

                            }
                            else { // 화상채팅
                                System.out.println("COS에서 일을 하면서 외국인과 대화할 일이 많았던 백수 오윤환, 그 뒤로 영어로 대화하는 것에 재미를 느끼고 종종 화상채팅을 했었다. 오랜만에 화상채팅을 해보자.");

                            }
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
                            System.out.println("\nQ.여러 문제를 풀며 공부를 하다보니 시간이 꽤나 흘렀다. 어느덧 저녁시간대를 넘어 밤이 되었다. 공부에는 더이상 집중이 안 되는 백수 오윤환, 무엇을 할까?" +
                                    "\n1.가족들과 시간 보내기    2.트위치 보기");

                            int answer50 = sc.nextInt();

                            for (;;) {

                                if (answer50 >= 1 && answer50 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer50 == 0) {
                                    System.out.println(answer50+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer50 = sc.nextInt();
                                }
                            }

                            if (answer50 == 1) { // 가족들과 시간 보내기
                                System.out.println("요즘 각자 일이 바빠 함께 시간을 보냈던 적이 없던 것 같다. 거실로 나가 이야기도 나누며 함께 시간을 보내자.");

                            }
                            else { // 트위치 보기
                                System.out.println("진성 트수인 오윤환 하루라도 트위치를 안 보면 입에 가시가 돋나보다. 트위치에 접속해서 어떤 방송을 볼지 고민한다.");

                            }
                        }
                        else { // 인프런 강의
                            System.out.println("비싼 돈을 주고 결제했지만 그동안 보지 않았던 김영한의 인프런 강의를 보며 공부하는 백수 오윤환, 세심한 강의 자료와 설명에 돈값을 한다고 느끼는 것 같다.");
                            System.out.println("\nQ.연강으로 보면서 공부를 하다보니 어느새 시간도 꽤 흐르고 저녁을 먹지 않아 배도 고프다. 야식이 먹고싶은 백수 오윤환, 무엇을 먹을까?" +
                                    "\n1.치킨    2.피자    3.족발");

                            int answer51 = sc.nextInt();

                            for (;;) {

                                if (answer51 >= 1 && answer51 <= 3) {
                                    break; // 1이상 3이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer51 == 0) {
                                    System.out.println(answer51+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer51 = sc.nextInt();
                                }
                            }

                            if (answer51 == 1) { // 치킨
                                System.out.println("치킨은 절대 실패할 수가 없다. 야식의 황태자 치킨을 주문하는 백수 오윤환, 주문하는 순간부터 설렌다.");

                            }
                            else if (answer51 == 2) { // 피자
                                System.out.println("야식을 먹으면 주로 치킨만 먹다보니 오랜만에 피자가 땡겼다. 치즈크러스트와 갈릭디핑소스를 추가해서 주문을 한 백수 오윤환, 오랜만에 피자를 먹을 생각에 설렌다.");
                            }
                            else { // 족발
                                System.out.println("최근 유튜브에서 최고의 밈으로 떠올랐던 말왕의 장충동왕족발보쌈을 보다보니 족스라이팅이 되어버려 족발이 먹고싶어진 백수 오윤환, 바로 족발을 주문한다.");

                            }
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
                            System.out.println("늘 이런식이다... 오늘은 늦게 일어난 김에 그냥 뒹굴거리며 쉬기로 한 백수 오윤환, 전기장판으로 따듯하게 데운 침대에 들어가 트위치를 켠다.");
                            System.out.println("\nQ.하루를 버린 것 같다는 자책은 잠시일 뿐, 트위치에 들어가 방송 볼 생각을 하니 기분이 좋아 보이는 백수 오윤환. 팔로우한 스트리머 중 방송을 켠 사람은 한명. 어떤 방송을 볼까? " +
                                    "\n1.팔로우한 스트리머    2.처음 보는 스트리머");

                            int answer52 = sc.nextInt();

                            for (;;) {

                                if (answer52 >= 1 && answer52 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer52 == 0) {
                                    System.out.println(answer52+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer52 = sc.nextInt();
                                }
                            }

                            if (answer52 == 1) { // 팔로우한 스트리머
                                System.out.println(".");

                            }
                            else { // 처음 보는 스트리머
                                System.out.println("오늘은 처음 보는 스트리머의 방송을 보자. 주로 음악 방송이나 게임방송을 시청하는 백수 오윤환, 어떤 카테고리의 방송을 볼까?.");

                            }
                        }
                        else { // 친구 만나기
                            System.out.println("오랜만에 친구를 만나기로 결심한 백수 오윤환, 친구들에게 연락을 돌리고 답장이 온 대학 동기의 자취방에 놀러가기로 한다.");
                            System.out.println("\nQ.지하철을 타고 우장산역에 도착한 백수 오윤환, 친구가 사는 오피스텔 아래 스타벅스가 있다. 커피를 사서 갈까?" +
                                    "\n1.커피를 산다    2.그냥 간다");

                            int answer53 = sc.nextInt();

                            for (;;) {

                                if (answer53 >= 1 && answer53 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer53 == 0) {
                                    System.out.println(answer53+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer53 = sc.nextInt();
                                }
                            }

                            if (answer53 == 1) { // 커피를 사서 가자
                                System.out.println("3명이 모이기로 했지만, 한 명은 아직 도착하려면 시간이 꽤 남았다. 같이 커피를 마시며 기다릴 겸 테이크 아웃을 하는 백수 오윤환");

                            }
                            else { // 그냥 간다
                                System.out.println("오늘 왠지 지출이 클 것만 같다. 가뜩이나 돈도 없는 백수 오윤환은 그냥 가기로 한다.");

                            }
                        }
                    }
                }
                else { // 저녁 식사
                    System.out.println("늦게 일어났기 때문에 배가 고픈 백수 오윤환, 저녁을 먹기 위해 부엌으로 간다.");
                    System.out.println("\nQ.부엌을 여기저기 살펴보는 백수 오윤환, 마땅히 먹을만한 것이 없어 보인다. 집밥을 먹을지 그냥 굶을지 고민을 하는데, 백수 오윤환의 선택은?" +
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
                            System.out.println("\nQ.카페에서 공부를 하려고 하는 백수 오윤환, 카페로 가던 중 코인 노래방에 가고싶은 마음이 들었다. 어떻게 할까?" +
                                    "\n1.카페로 간다    2.코인 노래방으로 간다");

                            int answer54 = sc.nextInt();

                            for (;;) {

                                if (answer54 >= 1 && answer54 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer54 == 0) {
                                    System.out.println(answer54+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer54 = sc.nextInt();
                                }
                            }

                            if (answer54 == 1) { // 카페로 간다
                                System.out.println("늦게 일어났으니 공부라도 제대로 하자! 유혹을 떨쳐내고 곧장 카페로 가는 백수 오윤환.");

                            }
                            else { // 코인 노래방으로 간다
                                System.out.println("코노 천원 정도는 괜찮지 않을까? 가던 길을 벗어나 코인 노래방 먼저 들리는 백수 오윤환.");

                            }
                        }
                        else { // 영어 스피킹 공부
                            System.out.println("평소 영어로 말하는 것에 흥미가 많았던 백수 오윤환, 종종 이용하던 해외 화상채팅 사이트에 접속을 해서 외국인 친구들과 영어로 대화를 나눈다.");
                            System.out.println("\nQ.계속해서 여러 외국인 친구들과 대화를 나누는 백수 오윤환, 한 외국인 친구가 인스타그램 또는 연락처를 교환하자고 한다. 어떻게 할까?" +
                                    "\n1.교환한다    2.거절한다");

                            int answer55 = sc.nextInt();

                            for (;;) {

                                if (answer55 >= 1 && answer55 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer55 == 0) {
                                    System.out.println(answer55+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer55 = sc.nextInt();
                                }
                            }

                            if (answer55 == 1) { // 교환한다
                                System.out.println("대화를 하는 내내 이야기가 즐거웠기 때문에 연락처를 교환하는 것도 나쁘지 않을 것 같다. 외국인 친구와 인스타그램 또는 연락처를 교환하는 백수 오윤환.");

                            }
                            else { // 거절한다
                                System.out.println("즐거운 대화였지만 연락처를 교환하는 것은 부담스럽다. 아쉽지만 사과의 말을 건네고 인스타그램을 하지 않는다고 거짓말을 하며 넘어가는 백수 오윤환.");

                            }
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
                            System.out.println("\nQ.엄마와 마트에 도착한 백수 오윤환, 맛있어 보이는 것들이 많은데 그 중에서도 닭강정이 자꾸만 눈에 밟힌다. 닭강정을 사갈까?" +
                                    "\n1.사간다    2.사지 않는다");

                            int answer56 = sc.nextInt();

                            for (;;) {

                                if (answer56 >= 1 && answer56 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer56 == 0) {
                                    System.out.println(answer56+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer56 = sc.nextInt();
                                }
                            }

                            if (answer56 == 1) { // 사간다
                                System.out.println("때마침 멤버십 할인도 진행 중인 닭강정, 엄마에게 무언의 눈빛을 보내며 먹고싶다는 것을 어필한다. 결국 닭강정을 사가는 백수 오윤환.");

                            }
                            else { // 사지 않는다
                                System.out.println("백수 신분으로 지낸지 어언 반년, 왠지모르게 사소한 것도 눈치가 보이는 백수 오윤환, 눈물을 머금으며 참고 넘어간다.");

                            }
                        }
                        else { // 미뤄뒀던 방청소
                            System.out.println("며칠 동안 방청소를 못한 백수 오윤환, 본인이 보기에도 방이 너무 더러웠던 것일까? 열심히 방청소를 시작한다.");
                            System.out.println("\nQ.데스크를 먼저 청소하는 백수 오윤환, 항상 디스플레이 되어 있는 QWER의 앨범을 치울지 말지 고민이다. 어떻게 할까? " +
                                    "\n1.치운다    2.그대로 둔다");

                            int answer57 = sc.nextInt();

                            for (;;) {

                                if (answer57 >= 1 && answer57 <= 2) {
                                    break; // 1이상 2이하의 보기 선택시 반복 벗어나 다음 코드 실행
                                }
                                else if (answer57 == 0) {
                                    System.out.println(answer57+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
                                    sc.close();
                                    return;
                                }
                                else {
                                    System.out.println("⚠︎알림: 보기에 제시 되어진 숫자만 입력해주세요.");
                                    answer57 = sc.nextInt();
                                }
                            }

                            if (answer57 == 1) { // 치운다
                                System.out.println("디스플레이 용도로 두었던 QWER의 앨범, 시간이 지날수록 자리만 차지하고 이제는 예뻐보이지 않는다. 물건 박스에 옮겨 담는 백수 오윤환..");

                            }
                            else { // 그대로 둔다
                                System.out.println("새로 구매한 실리카겔의 앨범이 올 때까지는 그대로 두자, 위에 쌓인 먼지만 정리하고 다시 청소를 하는 백수 오윤환.");

                            }
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
