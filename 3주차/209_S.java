class Solution {
  // 1.
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println("[" + i +"," + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

  // 9.
  public boolean isPalindrome(int x) {
    String tokens = Integer.toString(x);
    int left = 0;
    int right = tokens.length() - 1;

        while (left < right) {
            if (tokens.charAt(left) != tokens.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

  // 13.
  public int romanToInt(String s) {
        int num = 0, result = 0;
        for(int i=s.length()-1; i>=0; i--) {
            switch(s.charAt(i)) {
                case 'I':
                    num=1; break;
                case 'V':
                    num=5; break;
                case 'X':
                    num=10; break;
                case 'L':
                    num=50; break;
                case 'C':
                    num=100; break;
                case 'D':
                    num=500; break;
                case 'M':
                    num=1000; break;
            }
            if (4 * num < result) result -= num;
            else result += num;
        }
        return result;
    }

  // 14.
  public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String commonPrefix = "";
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0;
        while(index<s1.length() && index<s2.length()) {
            if(s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return s1.substring(0, index);
    }

  // 20.
  public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

  // 21.
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            } else {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
        }
        if(list1 == null)
            return list2;
        return list1;
    }

  // 26.
  public int removeDuplicates(int[] nums) {
        int duplicated = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[duplicated]) {
                nums[++duplicated] = nums[i];
            }
        }
        return duplicated+1;
    }

  // 27.
  public int removeElement(int[] nums, int val) {
        int duplicated = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[duplicated] = nums[i];
                duplicated++;
            }
        }
        return duplicated;
    }

  // 28.
  public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;

        for(int i=0; i<haystack.length(); i++) {
            if(i+needle.length() > haystack.length()) {
                break;
            }
            for(int j=0; j<needle.length(); j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
                if(j == needle.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
