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
                    "\n1.오전 9시    2.오후 12시    3.오후 r5시");

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

            // 보기 선택에 따른 스토리 진행
            if (answer2 == 1) {
                System.out.println("나름 갓생을 살기로 결심했는지 백수 오윤환은 아침 9시에 기상을 합니다.");



            } else if (answer2 == 2) {
                System.out.println("백수 오윤환, 역시나 백수 답게 늦잠을 잤습니다, 오후 12시가 되어서야 기상합니다.");



            } else if (answer2 == 3) {
                System.out.println("백수 오윤환, 그는 역시나 백수들의 백수 입니다. 오후 5시가 되어서야 기상을 합니다.");



            }


        // 프로그램 종료 및 경고알림
        } else if (answer1 == 2) { // 프로그램 종료
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
