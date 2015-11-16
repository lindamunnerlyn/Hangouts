// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.util.Iterator;
import java.util.Set;

public final class isj
{

    private final hof a;
    private final Set b;

    isj(Activity activity, Set set)
    {
        b = set;
        if (activity instanceof hoe)
        {
            a = ((hoe)activity).getLifecycle();
            return;
        } else
        {
            a = null;
            return;
        }
    }

    public void a()
    {
        if (a != null)
        {
            a a1;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); a.a(a1))
            {
                a1 = (a)iterator.next();
            }

        }
    }
}
