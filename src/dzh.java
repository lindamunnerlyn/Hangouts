// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class dzh
    implements Runnable
{

    final int a;
    final dzg b;

    dzh(dzg dzg1, int i)
    {
        b = dzg1;
        a = i;
        super();
    }

    public void run()
    {
        for (int i = dzg.a(b).size() - 1; i >= 0; i--)
        {
            Object obj = (dzi)dzg.a(b).get(i);
            if ((a & ((dzi) (obj)).a) != 0)
            {
                obj = ((dzi) (obj)).b;
                String s = b.a;
                ((ebc) (obj)).a(b.b);
            }
        }

    }
}
