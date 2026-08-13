
/**
 * 문제: 두 수의 합
 * 출처: 프로그래머스
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/1
 *
 * 주어진 정수 배열 nums에서 합이 target이 되는 두 수의 인덱스를 반환하세요.
 * 같은 원소를 두 번 사용할 수 없습니다.
 *
 * 예시:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * 설명: nums[0] + nums[1] = 2 + 7 = 9
 * testtesttets
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = solution(nums, target);
        System.out.println("결과: [" + result[0] + ", " + result[1] + "]");
    }
}
