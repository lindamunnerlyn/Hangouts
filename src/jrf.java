// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jrf
    implements jrg
{

    int a;
    final CharSequence b;

    public jrf(CharSequence charsequence)
    {
        b = charsequence;
        super();
        a = 0;
    }

    public int a()
    {
        if (a < b.length())
        {
            CharSequence charsequence = b;
            int i = a;
            a = i + 1;
            return charsequence.charAt(i);
        } else
        {
            return -1;
        }
    }
}
