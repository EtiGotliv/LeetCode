# ClearDigits - Java Solution

## Description
This Java program removes digits from a given string, along with the character preceding each digit.
It uses a `StringBuilder` for efficient string manipulation.

## Problem Statement
You are given a string `s`. Your task is to remove all digits by doing this operation repeatedly:
- Delete the first digit and the closest non-digit character to its left.
- Return the resulting string after removing all digits.

### Constraints:
- `1 <= s.length <= 100`
- `s` consists only of lowercase English letters and digits.
- The input is generated such that it is possible to delete all digits.

## Usage
1. Create an instance of the `Solution` class.
2. Call the `clearDigits` method with a string input.
3. The method will return the modified string.

## Example
```java
Solution sol = new Solution();
String result = sol.clearDigits("a1b2c3");
System.out.println(result); // Output: ""
```

## Explanation
- If a digit is found, it is removed along with the character before it.
- The loop continues until all digits and preceding characters are processed.
- The method ensures safe removal by checking index bounds.

## Time and Space Complexity
- **Time Complexity:**

  **Worst case:** O(n^2), because each call to deleteCharAt(i) shifts all subsequent characters, making each deletion take up to O(n). Since there can be up to 
                  O(n) deletions, the total worst-case complexity is O(n^2).

  **Best case:** O(n), when there are no digits in the string, so we only traverse the string once without performing deletions.
- **Space Complexity:** `O(n)`, since we use a `StringBuilder` which can store up to `n` characters in the worst case.

