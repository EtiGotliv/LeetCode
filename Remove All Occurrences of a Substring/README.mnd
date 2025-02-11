# Remove All Occurrences of a Substring - Java Solution

## Description
This Java program removes all occurrences of a given substring `part` from the string `s`.
It uses a `StringBuilder` for efficient string manipulation.

## Problem Statement
Given two strings `s` and `part`, perform the following operation on `s` until all occurrences of the substring `part` are removed:
- Find the leftmost occurrence of the substring `part` and remove it from `s`.
- Return `s` after removing all occurrences of `part`.

A substring is a contiguous sequence of characters in a string.

### Constraints:
- `1 <= s.length <= 1000`
- `1 <= part.length <= 1000`
- `s` and `part` consist only of lowercase English letters.

## Usage
1. Create an instance of the `Solution` class.
2. Call the `removeOccurrences` method with `s` and `part` as inputs.
3. The method will return the modified string.

## Example
```java
Solution sol = new Solution();
String result = sol.removeOccurrences("daabcbaabcbc", "abc");
System.out.println(result); // Output: "dab"
```

## Explanation
- The method iterates over `s` and appends characters to `StringBuilder`.
- After adding a character, it checks if the end of the `StringBuilder` matches `part`.
- If a match is found, it removes `part` from the end.
- This process continues until no occurrences of `part` are left.

## Time and Space Complexity
- **Time Complexity:**
  - Worst case: `O(n * m)`, where `n` is the length of `s` and `m` is the length of `part`.
  - This happens if `part` frequently appears at the end of `StringBuilder`.
  - Best case: `O(n)`, if `part` is not found in `s`.
- **Space Complexity:**
  - `O(n)`, as we use `StringBuilder` to store the modified string.

