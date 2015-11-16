// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class cyt extends cyq
{

    private static final long serialVersionUID = 1L;
    public final List a = new ArrayList();

    public cyt(iqk iqk1)
    {
        iqk1 = iqk1.a;
        int j = iqk1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = iqk1[i];
            String s = ((iql) (obj)).a.b;
            int k = g.a(((iql) (obj)).b, 0);
            a.add(new cyu(s, k));
        }

    }
}
