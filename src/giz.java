// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class giz
{

    long a;
    int b;
    List c;

    public giz()
    {
        b = 0;
        c = new ArrayList();
    }

    static void a(giz giz1, long l, String s, byte abyte0[])
    {
        gjb gjb1 = new gjb();
        gjb1.a = l;
        gjb1.c = abyte0;
        gjb1.b = s;
        giz1.c.add(gjb1);
    }
}
