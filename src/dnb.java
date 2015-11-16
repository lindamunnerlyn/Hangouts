// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class dnb extends dmw
{

    private static final long serialVersionUID = 1L;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final String c;

    public dnb(ixf ixf1, String s)
    {
        boolean flag = false;
        super();
        c = s;
        s = ixf1.a;
        int k = s.length;
        for (int i = 0; i < k; i++)
        {
            Object obj = s[i];
            a.add(((jce) (obj)).b);
        }

        ixf1 = ixf1.b;
        k = ixf1.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            s = ixf1[j];
            b.add(((jce) (s)).b);
        }

    }
}
