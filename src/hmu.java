// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hmu
    implements hnw, how, hox, hoy
{

    private List a;
    private boolean b;
    private boolean c;
    private boolean d;

    hmu(hof hof1)
    {
        a = new ArrayList();
        d = true;
        hof1.a(this);
    }

    hmu(hof hof1, byte byte0)
    {
        a = new ArrayList();
        d = true;
        hof1.a(this);
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

    public void k_()
    {
        b = true;
        c();
    }

    public void l_()
    {
        b = false;
        c();
    }
}
