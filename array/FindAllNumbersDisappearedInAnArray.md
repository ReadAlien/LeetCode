## 문제
<img width="891" height="325" alt="image" src="https://github.com/user-attachments/assets/e6112fc0-bafa-4867-8831-2723d2be2a24" />

## 문제분석
<p>주어진 배열의 크기가 n이라면 1 ~ n 까지의 숫자중 없는 숫자를 반환하라</p>

## 전략
<p>배열의 첫 번째 요소부터 순회하여 요소의 숫자를 인덱스의 위치로 바꿔주면서 해당 숫자가 존재함을 표시하기 위해 -1 을 곱해준다.</p>
<p>해당 인덱스의 숫자가 0보다 크면 존재하지 않았던 숫자이기 때문에 0보다 큰 인덱스 반환.</p>

### 변수
<p>index : 배열에 존재하는 값을 찾아 표시할 자리</p>

## 정답
```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if(nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
```
