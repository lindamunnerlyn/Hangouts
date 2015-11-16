// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class dbw extends djb
{

    final cyt a;

    public dbw(cyt cyt1)
    {
        a = cyt1;
    }

    public void a(aoe aoe1)
    {
        Iterator iterator = a.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cyu cyu1 = (cyu)iterator.next();
            if (cyu1.b != 0)
            {
                String s = cyu1.a;
                boolean flag;
                if (cyu1.b == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aoe1.a(s, null, flag);
            }
        } while (true);
    }
}
