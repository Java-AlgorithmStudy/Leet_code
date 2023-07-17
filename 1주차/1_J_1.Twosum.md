## 문제 설명
📌 **1. Two Sum**
🌟 난이도: 쉬움
👍 48K
💬 1.6K
🏢 회사

정수 배열 `nums`와 정수 `target`이 주어지면, 두 수의 합이 `target`이 되는 두 수의 인덱스를 반환합니다.

각 입력은 정확히 하나의 해결책이 있으며, 동일한 요소를 두 번 사용할 수 없습니다.

결과는 어떤 순서로든 반환할 수 있습니다.

## 예시 1:

**입력:**
```plaintext
nums = [2,7,11,15], target = 9
```

**출력:**
```plaintext
[0,1]
```

**설명:**
`nums[0] + nums[1] == 9`이므로 `[0, 1]`을 반환합니다.

## 예시 2:

**입력:**
```plaintext
nums = [3,2,4], target = 6
```

**출력:**
```plaintext
[1,2]
```

## 예시 3:

**입력:**
```plaintext
nums = [3,3], target = 6
```

**출력:**
```plaintext
[0,1]
```

## 제약 조건:

- `2 <= nums.length <= 104`
- `-109 <= nums[i] <= 109`
- `-109 <= target <= 109`
- 정답은 하나만 존재합니다.

## 문제 해결 방법
이 문제는 주어진 조건에 따라 두 수의 합이 `target`이 되는 두 수의 인덱스를 찾아야 합니다. 배열을 순회하면서 두 수를 선택하여 합을 계산하고, 합이 `target`과 일치하면 해당 인덱스를 반환합니다.

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int nums_Length = nums.length;
        for (int i = 0; i<nums_Length-1; i++){
            for (int j = i+1; j<nums_Length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
```

위 코드는 배열을 두 번 순회하여 합을 계산하고, 일치하는 합을 가지는 두 수의 인덱스를 반환합니다. 이 코드를 사용하여 문제를 성공적으로 해결했습니다.
