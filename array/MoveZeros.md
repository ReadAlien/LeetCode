## 문제
<img width="886" height="482" alt="image" src="https://github.com/user-attachments/assets/f0810b99-d6ba-46cc-83d9-69db081709b1" />

## 문제 분석
<p>배열 nums가 주어지면 배열에 존재하는 모든 0은 배열의 끝으로 이동시키고, 0이 아닌 숫자는 오름차순으로 정렬시켜라.</p>
<p>핵심 : 새로운 배열을 반환하는 것이 아닌 주어진 nums 배열에서 0을 제외한 숫자들은 오름차순 정렬 후 0은 뒤로 나열.</p>

## 전략
<p>1. 0이 아닌 요소를 먼저 배열의 앞부분으로 모두 옮긴 후, 나머지 공간을 0으로 채우기.</p>
<p>2. 0이 아닌 요소를 발견할 때마다, 현재 writeIndex가 가리키는 위치에 있는 요소와 교환.</p>

<p>2번 방식은 이미 0이 아닌 값일 때도 교환이 발생할 수 있기 때문에 1번으로 진행.</p>

### 변수
<p>writeIndex : 0이 아닌 숫자를 입력할 위치</p>
<p>readIndex : 배열의 모든 요소를 순회하는 인덱스</p>

## 정답
```java
class Solution {
    public void moveZeroes(int[] nums) {
        
        int writeIndex = 0;
        
        for(int readIndex = 0; readIndex < nums.length; readIndex ++) {
            if(nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        
        while(writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }
}
```
