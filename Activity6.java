/*Design an algorithm to accept a given string from the user. The algorithm must then remove
characters from the string which appear more than once.
For Example –
If input string is – malayalam
The output must be – maly*/


import java.util.*;
public class Activity6 {
	static String removeDuplicate(char str[], int n)
    {
        int index = 0;
 
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    public static void main(String[] args)
    {
        char str[] = "malayalam".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}
