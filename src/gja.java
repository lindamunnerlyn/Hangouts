// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class gja
{

    giz a;

    public gja()
    {
        a = new giz();
    }

    public giz a()
    {
        if (a.c.isEmpty())
        {
            throw new IllegalArgumentException("Need to have atleast one request");
        }
        if (a.b == 0)
        {
            throw new IllegalArgumentException("Need a non zero timeout");
        } else
        {
            return a;
        }
    }

    public gja a(long l, String s, byte abyte0[])
    {
        giz.a(a, l, s, abyte0);
        return this;
    }

    public gja a(long l, String s, byte abyte0[], int i)
    {
        a.b = i;
        a.a = l;
        giz.a(a, l, s, abyte0);
        return this;
    }
}
