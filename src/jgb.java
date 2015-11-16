// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jgb
    implements jhd
{

    public static final jgb a = new jgc();
    public static final jgb b = a('\0', '\177', "CharMatcher.ASCII");
    public static final jgb c;
    public static final jgb d = new jgf("CharMatcher.JAVA_DIGIT");
    public static final jgb e = new jgg("CharMatcher.JAVA_LETTER");
    public static final jgb f = new jgh("CharMatcher.JAVA_LETTER_OR_DIGIT");
    public static final jgb g = new jgi("CharMatcher.JAVA_UPPER_CASE");
    public static final jgb h = new jgj("CharMatcher.JAVA_LOWER_CASE");
    public static final jgb i = a('\0', '\037').a(a('\177', '\237')).a("CharMatcher.JAVA_ISO_CONTROL");
    public static final jgb j = new jgp("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
    public static final jgb k = new jgp("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
    public static final jgb l = new jgk("CharMatcher.ANY");
    public static final jgb m = new jgl("CharMatcher.NONE");
    static final int o = Integer.numberOfLeadingZeros(31);
    public static final jgb p = new jge("WHITESPACE");
    private static final String q;
    final String n;

    public jgb()
    {
        n = super.toString();
    }

    jgb(String s)
    {
        n = s;
    }

    public static jgb a(char c1)
    {
        return new jgm((new StringBuilder("CharMatcher.is('")).append(c(c1)).append("')").toString(), c1);
    }

    private static jgb a(char c1, char c2)
    {
        boolean flag;
        if (c2 >= c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
        return a(c1, c2, (new StringBuilder("CharMatcher.inRange('")).append(c(c1)).append("', '").append(c(c2)).append("')").toString());
    }

    private static jgb a(char c1, char c2, String s)
    {
        return new jgd(s, c1, c2);
    }

    private static String c(char c1)
    {
        char ac[] = new char[6];
        char[] _tmp = ac;
        ac[0] = '\\';
        ac[1] = 'u';
        ac[2] = '\0';
        ac[3] = '\0';
        ac[4] = '\0';
        ac[5] = '\0';
        boolean flag = false;
        char c2 = c1;
        for (c1 = flag; c1 < '\004'; c1++)
        {
            ac[5 - c1] = "0123456789ABCDEF".charAt(c2 & 0xf);
            c2 >>= '\004';
        }

        return String.copyValueOf(ac);
    }

    public String a(CharSequence charsequence)
    {
        for (int i1 = charsequence.length() - 1; i1 >= 0; i1--)
        {
            if (!b(charsequence.charAt(i1)))
            {
                return charsequence.subSequence(0, i1 + 1).toString();
            }
        }

        return "";
    }

    jgb a(String s)
    {
        throw new UnsupportedOperationException();
    }

    public jgb a(jgb jgb1)
    {
        return new jgo(this, (jgb)n.b(jgb1));
    }

    public boolean a(Character character)
    {
        return b(character.charValue());
    }

    public volatile boolean a(Object obj)
    {
        return a((Character)obj);
    }

    public abstract boolean b(char c1);

    public String toString()
    {
        return n;
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder(31);
        for (int i1 = 0; i1 < 31; i1++)
        {
            stringbuilder.append((char)("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".charAt(i1) + 9));
        }

        q = stringbuilder.toString();
        c = new jgp("CharMatcher.DIGIT", "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray(), q.toCharArray());
    }
}
