// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ddf extends dko
{

    final dmz a;

    public ddf(dmz dmz1)
    {
        a = dmz1;
    }

    public void a(aow aow1)
    {
        Iterator iterator = a.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dna dna1 = (dna)iterator.next();
            if (dna1.b != 0)
            {
                String s = dna1.a;
                boolean flag;
                if (dna1.b == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aow1.a(s, null, flag);
            }
        } while (true);
    }
}
