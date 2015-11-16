// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class gfz
{

    long a;
    int b;
    List c;

    public gfz()
    {
        b = 0;
        c = new ArrayList();
    }

    static void a(gfz gfz1, long l, String s, byte abyte0[])
    {
        ggb ggb1 = new ggb();
        ggb1.a = l;
        ggb1.c = abyte0;
        ggb1.b = s;
        gfz1.c.add(ggb1);
    }
}
