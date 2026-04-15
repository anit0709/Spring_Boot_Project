package org.practice;

public class Calc {

    public int sum(int input1, int input2)
    {
        int result=0;
        result=input1+input2;
        return result;
    }

    public String removeAstringFromStart(String str)
    {
        String str2 = "";
        if(str!=null && str.startsWith("A") && str.length()>=2)
        {
            return str.substring(2);
        }
        return str;
    }

    public boolean isfirstAndLastequals(String str)
    {
        if(str.length()<=1)
        {
            return false;
        }
        if (str.length()==2)
        {
            return true;
        }

        String first=str.substring(0,2);
        String last=str.substring(str.length()-2);
        if(first.equals(last))
        {
            return true;
        }
        return false;
    }
}
