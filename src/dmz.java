// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class dmz extends dmw
{

    private static final long serialVersionUID = 1L;
    public final List a = new ArrayList();

    public dmz(iwp iwp1)
    {
        iwp1 = iwp1.a;
        int j = iwp1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = iwp1[i];
            String s = ((iwq) (obj)).a.b;
            int k = g.a(((iwq) (obj)).b, 0);
            a.add(new dna(s, k));
        }

    }
}
