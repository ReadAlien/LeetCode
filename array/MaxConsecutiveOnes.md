## 문제
<img width="911" height="469" alt="image" src="https://github.com/user-attachments/assets/922b76f6-1df0-45ec-8c14-2da1ff8deea8" />

## 문제 분석
<p>배열에서 연속된 1의 최대 개수를 찾는 것이다.</p>
<p>핵심 : 0과 1로만 구성된 배열(nums[i] is either 0 or 1.)이고 1이 연속으로 가장 많이 나타난 횟수 반환</p>

## 전략
<p>제약조건은 "1 <= nums.length <= 10^5"으로 최대 10만개까지만 입력된다</p>
<p>이 정도 크기는 배열을 한 번 순회하는 O(n) 알고리즘으로 충분히 해결 가능하기 때문에 전체 배열 순회하여 해결</p>

### 변수
<p>max: 지금까지 발견한 연속된 1의 최대 개수</p>
<p>current: 현재 연속으로 카운팅 중인 1의 개수</p>

## 정답
```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
            } else {
                current = 0;
            }
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
}
```
