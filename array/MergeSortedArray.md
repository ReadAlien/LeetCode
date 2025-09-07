## 문제
<img width="725" height="742" alt="image" src="https://github.com/user-attachments/assets/a26d722c-473c-4eeb-a2c1-c17419f79428" />

## 문제 분석
<p>비감소 정렬 상태인 두 배열 nums1과 nums2를 하나로 합쳐서 정렬된 상태로 만드는 것이다.</p>
<p>핵심 : nums1 배열의 크기가 m+n으로 미리 확장되어 있고, 뒤쪽 n개(nums2 배열의 크기) 공간은 0으로 채워져 있다. 별도 배열 없이 nums1에 직접 결과를 저장(해야 한다.</p>

## 전략
<p>제약조건은 "0 <= m, n <= 200"이고 "1 <= m + n <= 200"으로 최대 200개까지 입력된다</p>
<p>앞에서부터 병합하면 nums1의 아직 처리하지 않은 원소들이 덮어써질 위험이 있고, 크기 비교 후 정렬하기 위한 방법이 복잡해진다.</p>
<p>뒤에서부터 병합하면 nums1의 빈 공간(0으로 채워진 부분)부터 채우므로 기존 데이터 손실 없이 안전하게 병합이 가능하다.</p>
<p>투포인터 알고리즘으로 두 배열의 끝에서부터 큰 값을 비교하여 역순 병합</p>
<p>만약 nums1의 모든 원소를 먼저 처리했다면 nums2에 남은 원소들을 그대로 nums1 우측에 병합</p>
<p>그게 아닌 nums2를 먼저 처리했다면 nums1은 이미 정렬상태이기 때문에 추가 작업 X</p>

### 변수
<p>nums1LastIndex : nums1에서 아직 처리하지 않은 마지막 원소의 인덱스(뒤에서부터 앞으로 이동해야하기 때문에 Last로 표현)</p>
<p>nums2LastIndex : nums2에서 아직 처리하지 않은 마지막 원소의 인덱스  (뒤에서부터 앞으로 이동해야하기 때문에 Last로 표현)</p>
<p>writeIndex : 병합된 결과 값을 nums1에 실제로 쓸 위치를 가리키는 포인터 (뒤에서부터 앞으로 이동)</p>

## 정답
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1LastIndex = m - 1;
        int nums2LastIndex = n - 1;
        int writeIndex = m + n - 1;

        while(nums1LastIndex >= 0 && nums2LastIndex >=0) {
            if(nums1[nums1LastIndex] <= nums2[nums2LastIndex]) {
                nums1[writeIndex] = nums2[nums2LastIndex];
                nums2LastIndex--;
            } else {
                nums1[writeIndex] = nums1[nums1LastIndex];
                nums1LastIndex--;
            }
            writeIndex--;
        }
        while (nums2LastIndex >= 0) {
            nums1[writeIndex] = nums2[nums2LastIndex];
            nums2LastIndex--;
            writeIndex--;
        }
    }
}
```

