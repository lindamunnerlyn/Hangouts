// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class gwk
    implements hnh, hoy
{

    private List a;

    public gwk(hof hof1)
    {
        a = new ArrayList();
        hof1.a(this);
    }

    public gwk a(gwm gwm1)
    {
        if (a.contains(gwm1))
        {
            throw new IllegalStateException("BackNavigationHandler already on stack.");
        } else
        {
            a.add(gwm1);
            return this;
        }
    }

    public boolean a()
    {
        for (int i = a.size() - 1; i >= 0; i--)
        {
            if (((gwm)a.get(i)).a())
            {
                return true;
            }
        }

        return false;
    }
}
