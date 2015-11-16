// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class hmi
    implements hlw, hma, hov, hoy
{

    public final hof a;
    private Set b;
    private final Class c;
    private hmh d;

    public hmi(hof hof1, Class class1)
    {
        b = new HashSet();
        a = hof1;
        c = class1;
        hof1.a(this);
    }

    public abstract hmh a(Context context);

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        if (bundle != null)
        {
            context = bundle.getStringArray("extra_auto_bound_objects");
            int j = context.length;
            int i = 0;
            while (i < j) 
            {
                bundle = context[i];
                try
                {
                    hlp1.a(Class.forName(bundle));
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.e("BaseAutoBinderModule", "Autobound class not found upon reconstruction", bundle);
                }
                i++;
            }
        }
    }

    public void a(Context context, Class class1, hlp hlp1)
    {
        this;
        JVM INSTR monitorenter ;
        Class class2 = c;
        if (class1 != class2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (d == null)
        {
            d = a(context);
        }
        context = class1.getName();
        class1 = d.a(class1);
        if (class1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b.add(context);
        context = class1.iterator();
        while (context.hasNext()) 
        {
            a((hmg)context.next(), a, hlp1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public abstract void a(hmg hmg1, hof hof1, hlp hlp1);

    public void b(Bundle bundle)
    {
        bundle.putStringArray("extra_auto_bound_objects", (String[])b.toArray(new String[b.size()]));
    }
}
