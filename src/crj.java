// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class crj
{

    private List a;

    public crj()
    {
    }

    public int a()
    {
        return a.size();
    }

    public cra a(int i)
    {
        return (cra)a.get(i);
    }

    public void a(Context context)
    {
        a = hgx.c(context, cqv);
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((cra)iterator.next()).a(context))
            {
                iterator.remove();
            }
        } while (true);
        Collections.sort(a);
    }

    public boolean b(int i)
    {
        a.get(i);
        return false;
    }
}
