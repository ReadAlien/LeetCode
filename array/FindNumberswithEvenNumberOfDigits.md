## 문제
<img width="897" height="615" alt="image" src="https://github.com/user-attachments/assets/692b0dbb-e416-4aaa-9a6d-7f9be7f3d432" />

## 문제 분석
<p>배열의 각 원소가 몇 자릿수인지 확인하고, 자릿수가 짝수인 원소의 개수를 세는 것이다.</p>
<p>핵심 : 각 숫자를 문자열로 바꾼 후 몇 자릿수인지 계산하고 짝수인지 판별하여 카운팅</p>

## 전략
<p>제약조건은 "1 <= nums.length <= 500", "1 <= nums[i] <= 10^5"으로 최대 500개의 원소와 최대 5자리 숫자까지 입력된다</p>
<p>배열을 한 번 순회하는 O(n) 알고리즘으로 해결 시 최대 500번 순회하기 때문에 충분히 해결 가능하여 전체 배열 순회하여 해결</p>

## 변수
evenNumber : 발견된 짝수 갯수

## 정답
```java
class Solution {
    public int findNumbers(int[] nums) {
        int evenNumber = 0;
        for(int num : nums) {
            String s = String.valueOf(num);
            
            if(s.length() % 2 == 0) {
                evenNumber++;
            }
        }
        return evenNumber;
    }
}
```
