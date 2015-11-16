// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jyl extends jyo
{

    final char a[];

    jyl(String s, String s1)
    {
        this(new jyk(s, s1.toCharArray()));
    }

    private jyl(jyk jyk1)
    {
        int i = 0;
        super(jyk1, null);
        a = new char[512];
        boolean flag;
        if (jyk.a(jyk1).length == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
        for (; i < 256; i++)
        {
            a[i] = jyk1.a(i >>> 4);
            a[i | 0x100] = jyk1.a(i & 0xf);
        }

    }

    int a(byte abyte0[], CharSequence charsequence)
    {
        int k = 0;
        n.b(abyte0);
        if (charsequence.length() % 2 == 1)
        {
            int i = charsequence.length();
            throw new jyn((new StringBuilder(32)).append("Invalid input length ").append(i).toString());
        }
        int j;
        for (j = 0; k < charsequence.length(); j++)
        {
            int l = b.c(charsequence.charAt(k));
            abyte0[j] = (byte)(b.c(charsequence.charAt(k + 1)) | l << 4);
            k += 2;
        }

        return j;
    }
}
