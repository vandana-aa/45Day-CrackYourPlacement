Same time complexity- O(N*M)

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}


# MY SOLUTION


class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length()<needle.length())
        return -1;

        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int k=i,j=0;
                while(j<needle.length() && k< haystack.length())
                {
                    
                    if(haystack.charAt(k) !=needle.charAt(j))
                    {
                    break;
                    }
                    k++;j++;

                }
                if(j==needle.length())
                return i;
            }
        }
        return -1;
        
    }
}




