class Vowel 
{
    static String isVowel(char c) 
    {
        c = Character.toLowerCase(c);
        if(c >= 'a' && c<='z')
        {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                return "YES";
            }
            else
            {
                return "NO";
            }
        }
        else
        {
            return "Enter valid input";
        }
    }
    public static void main(String[] args)
    {
        char c = 'a';
        System.out.println(isVowel(c));
    }
}
