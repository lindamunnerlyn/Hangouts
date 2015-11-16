// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jym extends jyo
{

    jym(String s, String s1, Character character)
    {
        this(new jyk(s, s1.toCharArray()), character);
    }

    private jym(jyk jyk1, Character character)
    {
        super(jyk1, character);
        boolean flag;
        if (jyk.a(jyk1).length == 64)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
    }

    int a(byte abyte0[], CharSequence charsequence)
    {
        int k = 0;
        n.b(abyte0);
        charsequence = a().a(charsequence);
        if (!b.b(charsequence.length()))
        {
            int i = charsequence.length();
            throw new jyn((new StringBuilder(32)).append("Invalid input length ").append(i).toString());
        }
        int j = 0;
        while (k < charsequence.length()) 
        {
            jyk jyk1 = b;
            int l = k + 1;
            int i1 = jyk1.c(charsequence.charAt(k));
            jyk1 = b;
            k = l + 1;
            int k1 = i1 << 18 | jyk1.c(charsequence.charAt(l)) << 12;
            l = j + 1;
            abyte0[j] = (byte)(k1 >>> 16);
            if (k < charsequence.length())
            {
                jyk jyk2 = b;
                int j1 = k + 1;
                k1 |= jyk2.c(charsequence.charAt(k)) << 6;
                j = l + 1;
                abyte0[l] = (byte)(k1 >>> 8);
                if (j1 < charsequence.length())
                {
                    jyk jyk3 = b;
                    k = j1 + 1;
                    j1 = jyk3.c(charsequence.charAt(j1));
                    l = j + 1;
                    abyte0[j] = (byte)(k1 | j1);
                    j = l;
                } else
                {
                    k = j1;
                }
            } else
            {
                j = l;
            }
        }
        return j;
    }
}
