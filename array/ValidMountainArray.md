## 문제
<img width="572" height="518" alt="image" src="https://github.com/user-attachments/assets/dd3b2a5a-7a60-4a86-bd00-8350d6cd8647" />

## 문제 분석
<p>정수 배열 arr이 주어지면 배열의 형태가 산 형태를 나타내는지 확인하라.</p>
<p>배열의 요소들이 오름차순으로 오르다가 내림차순으로 바뀔 때 배열의 끝까지 내림차순으로 가는지 확인해야 한다.</p>
<p>또한 배열의 크기 3이상이여야 하고 오름차순으로 끝나거나 내림차순으로 끝나면 안 된다.</p>
<p>핵심 : 여러 개의 조건을 확인하기 위해 반복문을 여러 번 사용하고, 현재 요소를 가리키는 인덱스가 배열 전체 크기 - 1 과 같다면</p>
<p>모든 조건을 다 통과했다는 의미이기 때문에 true 반환</p>

## 전략
<p>첫 번째 반복문에서 오름차순인지 확인</p>
<p>두 번째 반복문에서 현재 요소를 가리키는 인덱스가 증가하지 않았거나 배열의 끝까지 도착했다면 false</p>
<p>세 번째 반복문에서 내림차순인지 확인</p>

### 변수
currentIndex : 현재 확인중인 요소

## 정답
```java
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        
        if(arr.length < 3) {
            return false;
        }
        
        while(i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        
        while(i == 0 || i == arr.length - 1) {
            return false;
        }
        
        while(i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        
        return i == arr.length - 1;
    }
}
```
