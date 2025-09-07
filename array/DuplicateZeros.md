## 문제
<img width="914" height="536" alt="image" src="https://github.com/user-attachments/assets/baa28f4b-5b33-47ab-8cf2-ed57f3518332" />

## 문제 분석
<p>정수 배열의 크기가 고정된 상태에서 0이 나올 때마다 바로 오른쪽에 0을 복제하고 나머지 원소들을 오른쪽으로 이동시키는 문제.</p>
<p>핵심 : 0을 발견할 때마다 즉시 복제하여 삽입하고, 원본 배열 크기는 고정이므로 오른쪽 끝에서 밀려나는 원소들은 삭제.</p>
<p>별도 배열 생성 없이 기존 배열을 직접 수정하고 반환.</p>

## 전략
<p>제약조건은 "1 <= arr.length <= 10^4"으로 최대 1만개까지 입력된다</p>
<p>앞에서부터 처리하면 아직 처리하지 않은 뒤쪽 원소들이 덮어써질 위험이 있어, 뒤에서부터 역순으로 처리</p>
<p>뒤에서부터 역순으로 처리하면 원소를 오른쪽으로 이동시킬 때 이미 사용이 끝난 뒤쪽 공간으로 이동시키기 때문에 기존 데이터를 보존할 수 있다.</p>
<p>먼저 0의 개수를 세어 최종 배열 크기를 예측하고, 기존 배열의 끝부터 앞의 원소들을 배치해야하기 때문에 two pointer 알고리즘으로 해결</p>

### 변수
n : 원본 배열의 길이<br>
zeroCount : 원본 배열이 가지고 있는 0의 갯수<br>
originalIndex : 원본 배열에서 0 복제로 인한 새로운 위치 배치를 위해 현재 읽고 있는 원소의 인덱스<br>
copyIndex : 0 복제 후 최종 배열에서 원소가 들어갈 인덱스 위치<br>

## 정답
```java
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeroCount = 0;
        
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }
        
        int originalIndex = n - 1;
        int copyIndex = n + zeroCount - 1;
        
        while(originalIndex >= 0) {
            if(copyIndex < n) {
                arr[copyIndex] = arr[originalIndex];
            }
            
            if(arr[originalIndex] == 0) {
                copyIndex--;
                if(copyIndex < n) {
                    arr[copyIndex] = 0;
                }
            }
            originalIndex--;
            copyIndex--;
        }
        
    }
}
```
