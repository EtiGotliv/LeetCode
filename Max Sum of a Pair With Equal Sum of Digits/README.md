# Max Sum of a Pair With Equal Sum of Digits - Java Solution

## Description

This Java program finds the maximum sum of a pair of numbers in an array where both numbers have the same sum of digits.

## Problem Statement

You are given a 0-indexed array `nums` consisting of positive integers. You can choose two indices `i` and `j` such that `i != j`, and the sum of digits of `nums[i]` is equal to that of `nums[j]`.

Return the maximum value of `nums[i] + nums[j]` that you can obtain over all possible indices `i` and `j` that satisfy the conditions.

### Constraints:

- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^9`

## Usage

1. Create an instance of the `Solution` class.
2. Call the `maximumSum` method with an integer array as input.
3. The method will return the maximum sum of a valid pair, or `-1` if no such pair exists.

## Example

```java
Solution sol = new Solution();
int[] nums = {18, 43, 36, 13, 7};
int result = sol.maximumSum(nums);
System.out.println(result); // Output: 54
```

## Explanation

- Compute the sum of digits for each number in `nums`.
- Use a HashMap to store the maximum number found for each sum of digits.
- If another number with the same sum of digits appears, compute the sum and update the maximum found.
- Return the highest sum found.

## Time and Space Complexity

- **Time Complexity:** `O(N*logn)`, where `N` is the number of elements in `nums`. Each element is processed once.
- **Space Complexity:** `O(N)`, as a HashMap is used to store the highest number for each sum of digits.

