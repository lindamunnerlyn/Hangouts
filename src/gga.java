// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class gga
{

    gfz a;

    public gga()
    {
        a = new gfz();
    }

    public gfz a()
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

    public gga a(long l, String s, byte abyte0[])
    {
        gfz.a(a, l, s, abyte0);
        return this;
    }

    public gga a(long l, String s, byte abyte0[], int i)
    {
        a.b = i;
        a.a = l;
        gfz.a(a, l, s, abyte0);
        return this;
    }
}
