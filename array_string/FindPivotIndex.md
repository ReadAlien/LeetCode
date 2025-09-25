## 문제
<img width="908" height="578" alt="image" src="https://github.com/user-attachments/assets/f9e9a5fd-d7bc-47dd-ac57-350a652916c2" />

## 문제 분석
<p>피벗 인덱스를 찾는 문제이다.</p>
<p>피벗 인덱스는, 특정 인덱스의 왼쪽 요소들의 합과 오른쪽 요소들의 합이 같은 것을 말한다.</p>
<p>피벗 인덱스가 있을 경우 피벗 인덱스를 반환하고, 피벗 인덱스가 없을경우에는 -1을 반환하면 된다.</p>

## 전략
<p>처음에 배열을 한 번 순회해 배열의 총합을 구한다.</p>
<p>총합을 구한 뒤 다시 배열의 첫 번쨰 요소부터 순회하면서, "총합 - 왼쪽 요소들의 합 - 현재 인덱스"의 값이 오른쪽 요소들의 합과 같은지 비교한다.</p>
<p>같은 게 있을 경우 인덱스 반환, 없을 경우 -1 반환</p>

### 변수
<p>totalSum : 주어진 배열의 총 합</p>
<p>rightSum : 주어진 배열에서 특정 인덱스 왼쪽 요소들의 합</p>
<p>leftSum  : 주어진 배열에서 특정 인덱스 오른쪽 요소들의 합</p>

## 정답
```java
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            
            if(leftSum == rightSum) {
                return i;
            }
            
            leftSum += nums[i];
        }
        return -1;
    }
}
```
