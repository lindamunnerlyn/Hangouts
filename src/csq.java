// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class csq
    implements Runnable
{

    final int a;
    final csp b;

    csq(csp csp1, int i)
    {
        b = csp1;
        a = i;
        super();
    }

    public void run()
    {
        for (int i = csp.a(b).size() - 1; i >= 0; i--)
        {
            Object obj = (csr)csp.a(b).get(i);
            if ((a & ((csr) (obj)).a) != 0)
            {
                obj = ((csr) (obj)).b;
                String s = b.a;
                ((csv) (obj)).a(b.b);
            }
        }

    }
}
