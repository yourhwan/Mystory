package simulation;

import java.util.*;

public class Ohday {
    public static void main(String[] args) {

        System.out.println("해당 시뮬레이션은 실화에 기반 했음을 알려 드립니다."
                + "\n모든 답변은 주어지는 보기의 번호를 입력해 주시면 됩니다.\n");

        Scanner sc = new Scanner(System.in);

        int answer1 = sc.nextInt();

        // 프로그램 시작 여부 질문
        System.out.println("본격적으로 오윤환의 하루를 시작하기 원하신다면 숫자 1을 입력해 주세요. 2를 입력할 경우 해당 프로그램은 종료되며, 2회 이상 잘못 입력시 프로그램은 종료 됩니다.");

        //answer1 = sc.nextInt();

        if (answer1 == 1) {
            System.out.println("본격 백수 오윤환의 하루를 시작합니다.");

            // 이어서 스토리 진행

        } else if (answer1 == 2) { // 프로그램 종료
            System.out.println("프로그램을 종료합니다. 다음에 만나요!");

        } else { // 보기 이외의 입력값을 입력 했을 경우
            System.out.println("⚠︎알림: 1 또는 2 중에서 선택해야 합니다. 프로그램을 종료합니다.");

        }
        sc.close();
    }

}// public class
