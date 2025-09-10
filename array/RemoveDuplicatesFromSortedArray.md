## 문제
<img width="902" height="511" alt="image" src="https://github.com/user-attachments/assets/5be06e99-c3b9-4b1d-893a-c29d5078a46d" />

## 문제 분석
<p>비감소 정렬 배열에서 중복된 값을 제자리에서 제거하고 요소의 정렬상태는 유지시켜야 된다.</p>
<p>새로운 배열을 반환하는 것이 아닌 nums 배열에서 고유 요소의 갯수를 반환.</p>
<p>핵심 : nums의 고유 요소 개수를 k라고 할 때 배열 nums를 변경하여 nums의 첫 번째 k개 요소가 nums에 처음 있던 순서대로 고유 요소를 포함시켜야 된다.</p>

## 전략
<p>제약조건은 "1 <= nums.length <= 3 * 10^4"으로 최대 3만개까지 입력된다.</p>
<p>정렬된 배열에서 중복을 제거해야되기 때문에 앞에서부터 처리해도 데이터 손실 위험이 없다.</p>
<p>연속된 중복 요소들 중 첫 번째만 유지하고 나머지는 건너뛰어 그 다음 중복된 요소랑 교환하기 위해, two pointer 알고리즘 사용.</p>

### 변수
<p>writeIndex: 고유 요소 저장할 포인터</p>
<p>readIndex: 배열을 순회하며 현재 검사 중인 요소의 포인터</p>

## 정답
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int writeIndex = 0;
        
        for(int readIndex = 1; readIndex < nums.length; readIndex++) {
            if(nums[readIndex] != nums[writeIndex]) {
                writeIndex++;
                nums[writeIndex] = nums[readIndex];
            }
        }
        return writeIndex + 1;
    }
}
```
