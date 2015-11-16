// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class jyo extends jyj
{

    final jyk b;
    final Character c;

    jyo(String s, String s1, Character character)
    {
        this(new jyk(s, s1.toCharArray()), character);
    }

    jyo(jyk jyk1, Character character)
    {
        b = (jyk)n.b(jyk1);
        boolean flag;
        if (character == null || !jyk1.b(character.charValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag, "Padding character %s was already in alphabet", new Object[] {
            character
        });
        c = character;
    }

    int a(int i)
    {
        return (int)(((long)b.p * (long)i + 7L) / 8L);
    }

    int a(byte abyte0[], CharSequence charsequence)
    {
        n.b(abyte0);
        charsequence = a().a(charsequence);
        if (!b.b(charsequence.length()))
        {
            int i = charsequence.length();
            throw new jyn((new StringBuilder(32)).append("Invalid input length ").append(i).toString());
        }
        int k = 0;
        for (int j = 0; j < charsequence.length(); j += b.q)
        {
            long l2 = 0L;
            int l = 0;
            for (int i1 = 0; i1 < b.q; i1++)
            {
                l2 <<= b.p;
                if (j + i1 < charsequence.length())
                {
                    long l3 = b.c(charsequence.charAt(l + j));
                    l++;
                    l2 |= l3;
                }
            }

            int k1 = b.r;
            int l1 = b.p;
            for (int j1 = b.r - 1 << 3; j1 >= (k1 << 3) - l * l1;)
            {
                abyte0[k] = (byte)(int)(l2 >>> j1 & 255L);
                j1 -= 8;
                k++;
            }

        }

        return k;
    }

    jmr a()
    {
        if (c == null)
        {
            return jmr.n;
        } else
        {
            return jmr.a(c.charValue());
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("BaseEncoding.");
        stringbuilder.append(b.toString());
        if (8 % b.p != 0)
        {
            if (c == null)
            {
                stringbuilder.append(".omitPadding()");
            } else
            {
                stringbuilder.append(".withPadChar(").append(c).append(')');
            }
        }
        return stringbuilder.toString();
    }
}
