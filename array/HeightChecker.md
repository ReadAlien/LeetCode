## 문제
<img width="895" height="623" alt="image" src="https://github.com/user-attachments/assets/b650e144-c13f-43a7-b33a-3313126969bc" />

## 문제분석
<p>배열이 주어지면 그 배열을 정렬 상태로 만든 다음, 주어진 배열과 정렬된 배열에서의 요소가 다른 것의 갯수를 찾아 반환하라.</p>

## 전략
<p>자바에서 제공하는 배열 복사와 정렬 메서드를 활용하여 배열을 복사하고,</p>
<p>주어진 배열과 비교 후 갯수 반환</p>

### 변수
<p>expected : 주어진 배열을 복사하고 정렬한 상태의 배열을 저장하기 위한 변수</p>
<p>resultCount : 주어진 배열과 정렬된 배열에서 인덱스에 따른 요소가 다른 갯수</p>

## 정답
```java
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        
        int resultCount = 0;
        
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) {
                resultCount++;
            }
        }
        
        return resultCount;
    }
}
```
