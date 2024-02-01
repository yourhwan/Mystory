package figure;

import java.util.*;

public class Circle {
    public static void main(String[] args) {

        System.out.println("원의 넓이를 입력해주세요.\n:");
        Scanner input = new Scanner(System.in);

        int answer; // 입력 받은 정수
        int height; // 총 세로 길이
        int width; // 총 가로 길이
        int top; // 상단
        int radius; // 반지름

        // 입력 받은 정수 저장
        answer = input.nextInt();

        // 입력 받은 정수를 기준으로 총 세로 길이 생성
        height = answer * 18;

        // 입력 받은 정수를 기준으로 총 가로 길이 생성
        width = answer * 40;

        // 상단, 하단 종료 위치 설정, /2를 한 이유는 원을 절반으로 나누어 출력하기 때문이다.
        top = height / 2;

        // 반지름
        radius = height / 2 + 1;

        char[][] star = new char[height][width]; // 입력 받아 계산한 정수를 배열 생성에 사용

        int start = 0; // 시작 지점
        int end = 0; // 종료 지점

        // 원 상단 생성
        for (int a = top; a > 0; a--) {
            int bLine = (int) Math.round(Math.sqrt(Math.pow(radius - 1, 2) - Math.pow(a-0.5, 2))); // 피타고라스 공식
            bLine = (bLine + 1) * 2; // 가로행의 중앙에서 양쪽으로 점을 찍어 되는 거리

            // System.out.println(a+" 행의 길이는 " + bLine + " 입니다.");

            int realRow = Math.abs(a - top); // 세로행의 위치
            start = (width / 2) - bLine; // 가로행의 시작 지점
            end = ((width / 2) - 1) + bLine; // 가로행의 종료 지

            // 배열에 원 상단 입력
            for (int b = 0; b < width; b++) {
                if (start <= b && b < end) {
                    star[realRow][b] = '*';
                } else {
                    star[realRow][b] = ' ';
                }
            }
        }
        // 원 상단 출력
        for (int a = 0; a < top; a++) {
            for (int b = 0; b < width; b++) {
                System.out.print(star[a][b]);
            }
            System.out.println();
        }
        // 원 하단 출력(상단을 반전한 모양)
        for (int a = top - 1; a >= 0; a--) {
            for (int b = 0; b < width; b++) {
                System.out.print(star[a][b]);
            }
            System.out.println();
        }

    }
}
