// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import daq;
import hgx;
import hhe;
import java.util.HashMap;

public final class 
    implements hhe
{

    private HashMap a;

    public void a(Context context, Class class1, hgx hgx)
    {
        if (a == null)
        {
            a = new HashMap(3);
            a.put(daq.a, Integer.valueOf(0));
            a.put(daq.b, Integer.valueOf(1));
            a.put(daq.c, Integer.valueOf(2));
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
            daq.a(hgx);
            return;

        case 1: // '\001'
            daq.b(hgx);
            return;

        case 2: // '\002'
            daq.c(hgx);
            break;
        }
    }

    public ()
    {
    }
}
