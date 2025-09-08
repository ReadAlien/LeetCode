## 문제
<img width="721" height="765" alt="image" src="https://github.com/user-attachments/assets/57989d88-f98f-4c93-88c9-af31c5a90235" />


## 문제 분석
<p>배열 nums에서 val과 같은 모든 원소를 제거하되, 별도 배열을 생성하지 않고 기존 배열을 직접 수정해라.</p>
<p>핵심 : 제거 후 남은 원소들을 배열 앞쪽에 모아두고, 그 개수를 반환한다. 남은 원소들의 순서는 바뀌어도 상관없다</p>
<p>Custom Judge를 확인해보면 단순히 개수 k만 반환해서는 안 되고, 배열 nums의 앞쪽 k개의 요소들을 val이 아닌 요소들로 채워야만 정답 인정된다.</p>

## 전략
<p>제약조건은 "0 <= nums.length <= 100"으로 최대 100개까지 입력된다</p>
<p>배열을 한 번 순회하면서 val이 아닌 원소를 발견할 때마다 배열 앞쪽부터 차례로 저장한다. 읽기용 포인터와 쓰기용 포인터를 분리하여 투 포인터 기법으로 해결한다.</p>
<p>val이 아닌 원소만 앞쪽에 모으고, 쓰기용 포인터가 남은 원소의 개수가 된다.</p>
<p>어차피 val이 아닌 원소들의 갯수만큼만 배열에서 확인하기 때문에 그 이후에 나오는 val 값은 있어도 상관없다.</p>

### 변수
<p>writeIndex : val이 아닌 원소를 저장할 다음 위치 (결과적으로 남은 원소의 개수)</p>
<p>readIndex : 현재 읽고 있는 배열의 위치</p>

## 정답
```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int writeIndex = 0;
        
        for(int readIndex = 0; readIndex < nums.length; readIndex++) {
            if(nums[readIndex] != val) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
```
