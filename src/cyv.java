// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class cyv extends cyq
{

    private static final long serialVersionUID = 1L;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final String c;

    public cyv(ira ira1, String s)
    {
        boolean flag = false;
        super();
        c = s;
        s = ira1.a;
        int k = s.length;
        for (int i = 0; i < k; i++)
        {
            Object obj = s[i];
            a.add(((ivz) (obj)).b);
        }

        ira1 = ira1.b;
        k = ira1.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            s = ira1[j];
            b.add(((ivz) (s)).b);
        }

    }
}
