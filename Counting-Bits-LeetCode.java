import java.util.StringTokenizer;
class Solution {
    public int[] countBits(int num) {
        int iResulArr[]=new int[num+1]; 
        for(int i=0;i<=num;i++)
        {
                int iSum=0;
                StringTokenizer stSplit=new StringTokenizer(Integer.toBinaryString(i),"0");
                while(stSplit.hasMoreTokens())
                {
                        String st=stSplit.nextToken();
                iSum+=st.length();
                }
                iResulArr[i]=iSum;
        }
            return iResulArr;
    }
}
