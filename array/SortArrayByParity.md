## 문제
<img width="776" height="501" alt="image" src="https://github.com/user-attachments/assets/f53c7c19-3eb5-4e34-a3b1-66a1367a8a9a" />

## 문제 분석
<p>배열이 주어지면 짝수 요소를 앞으로 땅겨서 반환하는 문제.</p>
<p>정렬 상태는 상관 없이 앞의 요소중 짝수가 나온 후 홀수가 나오면 된다.</p>

## 전략
<p>설명란에서 반환된 요소들은 정렬된 상태가 아니여도 된다고 나와있다.</p>
<p>그렇기 때문에 그냥 배열의 처음부터 순회하고 짝수를 발견하면 스와핑 해주어 해결.</p>

### 변수
<p>readIndex : 홀수인지 짝수인지 읽을 요소</p>
<p>writeIndex : 짝수를 발견했을 때 바꿔쓸 요소 위치</p>

## 정답
```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int writeIndex = 0;
        
        for(int readIndex = 0; readIndex < nums.length; readIndex++) {
            if(nums[readIndex] % 2 == 0) {
                int temp = nums[writeIndex];
                nums[writeIndex] = nums[readIndex];
                nums[readIndex] = temp;
                
                writeIndex++;
            }
        }
        return nums;
    }
}
```
