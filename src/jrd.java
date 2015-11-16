// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrd extends jra
{

    private final jrb a;
    private final Character b;

    jrd(String s, String s1, Character character)
    {
        this(new jrb(s, s1.toCharArray()), character);
    }

    private jrd(jrb jrb1, Character character)
    {
        a = (jrb)n.b(jrb1);
        boolean flag;
        if (character == null || !jrb1.b(character.charValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag, "Padding character %s was already in alphabet", new Object[] {
            character
        });
        b = character;
    }

    static jrb a(jrd jrd1)
    {
        return jrd1.a;
    }

    int a(int i)
    {
        return (int)(((long)a.r * (long)i + 7L) / 8L);
    }

    jgb a()
    {
        if (b == null)
        {
            return jgb.m;
        } else
        {
            return jgb.a(b.charValue());
        }
    }

    jrg a(jrg jrg)
    {
        n.b(jrg);
        return new jre(this, jrg);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("BaseEncoding.");
        stringbuilder.append(a.toString());
        if (8 % a.r != 0)
        {
            if (b == null)
            {
                stringbuilder.append(".omitPadding()");
            } else
            {
                stringbuilder.append(".withPadChar(").append(b).append(')');
            }
        }
        return stringbuilder.toString();
    }
}
