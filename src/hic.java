// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hic
    implements fsn, hje, hkc, hkd
{

    private List a;
    private boolean b;
    private boolean c;
    private boolean d;

    hic(hjm hjm1)
    {
        a = new ArrayList();
        d = true;
        hjm1.a(this);
    }

    hic(hjm hjm1, byte byte0)
    {
        a = new ArrayList();
        d = true;
        hjm1.a(this);
    }

    private void c()
    {
        boolean flag;
        if (b && d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != c)
        {
            c = flag;
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                iterator.next();
            }
        }
    }

    public void a(boolean flag)
    {
        d = flag;
        c();
    }

    public void j_()
    {
        b = true;
        c();
    }

    public void k_()
    {
        b = false;
        c();
    }
}
