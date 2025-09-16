## 문제
<img width="896" height="532" alt="image" src="https://github.com/user-attachments/assets/36d892c7-f46f-4726-b034-219db0b29dc4" />

## 문제 
<p>배열의 각 요소를 오른쪽에서 가장 큰 값으로 교체하고, 마지막 요소는 -1로 바꾸는 것입니다.</p>
<p>이중 for문으로 해결할 수 있지만 더 효율적으로 해결하려면, 배열을 오른쪽에서 왼쪽으로 한 번만 순회하면 된다.</p>

## 전략
<p>가장 오른쪽에서부터 순회하기 때문에 max 변수 선언 후 마지막 요소는 -1로 바꿔야하기 때문에 -1로 초기화</p>
<p>max 변수를 배열에서 가장 큰 값을 추적하는 용도로 사용</p>

### 변수
<p>max : 가장 큰 값을 추적</p>
<p>currentElement : 현재 값 (가장 큰 값과의 비교 대상)</p>

## 정답
```java
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        
        for(int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];
            
            arr[i] = max;
            
            max = Math.max(max, currentElement);
        }
        
        return arr;
    }
}
```
