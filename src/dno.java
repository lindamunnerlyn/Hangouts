// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class dno extends dmw
{

    private static final long serialVersionUID = 1L;
    public final List a;

    public dno(jdn jdn1)
    {
        a = new ArrayList(jdn1.a.length);
        jdn1 = jdn1.a;
        int j = jdn1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = jdn1[i];
            a.add(new eeh(((jdm) (obj)).a, ((jdm) (obj)).b));
        }

    }
}
