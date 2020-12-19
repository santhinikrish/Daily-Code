/*
Example Input/Output 1:
Input:
SkillRack
Output:
FxvyyEnpx
Explanation:
The first half of the alphabets are a, b, c, d, e, f, g, h, i, j, k, l and m.
The second half of the alphabets are n, o, p, q, r, s, t, u, v, w, x, y and z.
After replacing the first half alphabet with the corresponding alphabet in the second half of the alphabets and vice versa, the string becomes FxvyyEnpx.
Hence the output is FxvyyEnpx

Example Input/Output 2:
Input:
WELCOME TO THE PARTY
Output:
JRYPBZR GB GUR CNEGL
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        ArrayList<Character> a=new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m'));
        ArrayList<Character> b=new ArrayList<Character>(Arrays.asList('n','o','p','q','r','s','t','u','v','w','x','y','z'));
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==' ') System.out.print(" ");
            else
            {
                for(int j=0;j<a.size();j++)
                {
                    char c=Character.toLowerCase(s[i]);
                    if(c==a.get(j))
                    {
                        if(Character.isUpperCase(s[i]))
                        {
                            System.out.print(Character.toUpperCase(b.get(j)));
                            break;
                        }
                        else
                        {
                            System.out.print(b.get(j));
                            break;
                        }
                    }
                    else if(c==b.get(j))
                    {
                        if(Character.isUpperCase(s[i]))
                        {
                            System.out.print(Character.toUpperCase(a.get(j)));
                            break;
                        }
                        else
                        {
                            System.out.print(a.get(j));
                            break;
                        }
                    }
                }
            }
        }

	}
}
