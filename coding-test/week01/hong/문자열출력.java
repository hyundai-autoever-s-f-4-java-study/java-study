
/**
 * 문제: 두 수의 합
 * 출처: 프로그래머스
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/181952?language=java
 *
 * 문제 설명
문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 1,000,000
str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
입출력 예
입력 #1

HelloWorld!
출력 #1

HelloWorld!
 *
 * 예시:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * 설명: nums[0] + nums[1] = 2 + 7 = 9
 * testtesttets
 */

import java.util.Scanner;

public class 문자열출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a);
    }
}
