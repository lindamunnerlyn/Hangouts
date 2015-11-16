// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class grz
    implements fsn, hip
{

    private List a;

    public grz(hjm hjm1)
    {
        a = new ArrayList();
        hjm1.a(this);
    }

    public grz a(gsb gsb1)
    {
        if (a.contains(gsb1))
        {
            throw new IllegalStateException("BackNavigationHandler already on stack.");
        } else
        {
            a.add(gsb1);
            return this;
        }
    }

    public boolean a()
    {
        for (int i = a.size() - 1; i >= 0; i--)
        {
            if (((gsb)a.get(i)).a())
            {
                return true;
            }
        }

        return false;
    }
}
