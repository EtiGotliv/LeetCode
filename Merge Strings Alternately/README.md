# Merge Strings Alternately - Java Solution

## Description

This Java program merges two strings by alternating their characters. If one string is longer than the other, the remaining characters of the longer string are appended at the end.

## Problem Statement

You are given two strings `word1` and `word2`. Merge them by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

### Constraints:

- `1 <= word1.length, word2.length <= 100`
- `word1` and `word2` consist of lowercase English letters.

## Usage

1. Create an instance of the `Solution` class.
2. Call the `mergeAlternately` method with two string inputs.
3. The method will return the merged string.

## Example

```java
Solution sol = new Solution();
String result = sol.mergeAlternately("abc", "pqr");
System.out.println(result); // Output: "apbqcr"
```

## Explanation

- Iterate through the characters of both strings up to the length of the shorter string.
- Append characters alternately from `word1` and `word2`.
- If one string is longer, append the remaining characters at the end.

## Time and Space Complexity

- **Time Complexity:** `O(n + m)`, where `n` is the length of `word1` and `m` is the length of `word2`. The method iterates through both strings once.
- **Space Complexity:** `O(n + m)`, as the result string is stored and returned.

