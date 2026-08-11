class Solution {
    static boolean compareFreq(int count1[], int count2[]) {
        for(int i=0;i<26;i++) {
            if(count1[i]!=count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) {
            return false;
        }
        int count1[]=new int[26];
        for(int i=0;i<s1.length();i++) {
            char ch=s1.charAt(i);
            int index=ch - 'a';
            count1[index]++;
        }
        int windowLen=s1.length();
        int count2[]=new int[26];
        for(int i=0;i<windowLen;i++) {
            char ch=s2.charAt(i);
            int index=ch - 'a';
            count2[index]++;
        }
        if(compareFreq(count1,count2)) {
            return true;
        }
        int i=windowLen;
        while(i<s2.length()) {
            char newChar=s2.charAt(i);
            int newIndex=newChar-'a';
            count2[newIndex]++;
            int oldPosition=i-windowLen;
            char oldChar=s2.charAt(oldPosition);
            int oldIndex=oldChar - 'a';
            count2[oldIndex]--;
            if(compareFreq(count1,count2)) {
                return true;
            }
            i++;
        }
        return false;
    }
}