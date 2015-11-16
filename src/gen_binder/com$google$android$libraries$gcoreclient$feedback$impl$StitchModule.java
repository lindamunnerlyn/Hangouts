// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gce;
import hlp;
import hlw;
import java.util.HashMap;

public final class 
    implements hlw
{

    private HashMap a;

    public void a(Context context, Class class1, hlp hlp)
    {
        if (a == null)
        {
            a = new HashMap(4);
            a.put(gce.a, Integer.valueOf(0));
            a.put(gce.b, Integer.valueOf(1));
            a.put(gce.c, Integer.valueOf(2));
            a.put(gce.d, Integer.valueOf(3));
        }
        context = (Integer)a.get(class1.getName());
        if (context == null)
        {
            return;
        }
        switch (context.intValue())
        {
        default:
            return;

        case 0: // '\0'
            gce.a(hlp);
            return;

        case 1: // '\001'
            gce.b(hlp);
            return;

        case 2: // '\002'
            gce.c(hlp);
            return;

        case 3: // '\003'
            gce.d(hlp);
            break;
        }
    }

    public ()
    {
    }
}
