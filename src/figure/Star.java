package figure;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        System.out.println("숫자를 입력하세요.");
        Scanner input = new Scanner(System.in);

        int answer; // 입력 정수
        int height; // 별의 세로 길이
        int width; // 별의 가로 길이
        int center; // 가로 중앙점
        int top; // 머리 끝 지점
        int middle; // 몸통 끝 지점
        int bottom; // 다리 끝 지점

        // 입력 정수 저장
        answer = input.nextInt();

        // 별의 세로 길이 생성
        height = answer * 6;

        // 별의 가로 길이 생성
        width = answer * 12;



        // 가로 중앙점 생성
        center = width / 2;

        // 머리, 몸통, 다리 끝 지점 지정
        top = height / 3;
        middle = top * 2;
        bottom = top * 3;

        char[][] star = new char[height][width]; // 별의 세로와 가로 길이로 배열 생성

        int start; // 시작점
        int end; // 끝점
        int startBottom; // 다리 시작점
        int endBottom; // 다리 끝 점

        // 별 머리 생성
        start = center;
        end = center;
        for (int a = 0; a < top; a++) {
            for (int b = 0; b < width; b++) {
                if (start <= b && b <= end) {
                    star[a][b] = '*';
                } else {
                    star[a][b] = ' ';
                }
            }
            start--;
            end++;
        }

        // 별 몸통 생성
        start = 0;
        end = width - 1;
        for (int a = top; a < middle; a++) {
            for (int b = 0; b < width; b++) {
                if (start <= b && b <= end) {
                    star[a][b] = '*';
                } else {
                    star[a][b] = ' ';
                }
            }
            start++;
            end--;
        }

        // 별 다리 생성
        startBottom = center - 1;
        endBottom = center + 1;
        for (int a = middle; a < bottom; a++) {
            for (int b = 0; b < width; b++) {
                if (startBottom <= b && b <= endBottom) {
                    star[a][b] = ' ';
                } else {
                    star[a][b] = '*';
                }
                if (start - 1 > b || end + 1 < b) {
                    star[a][b] = ' ';
                }
            }
            start--;
            end++;
            startBottom -= 3;
            endBottom += 3;
        }

        // 별 배열 출력
        for (int a = 0; a < height; a++) {
            for (int b = 0; b < width; b++) {
                System.out.print(star[a][b]);
            }
            System.out.println();
        }
    }
}