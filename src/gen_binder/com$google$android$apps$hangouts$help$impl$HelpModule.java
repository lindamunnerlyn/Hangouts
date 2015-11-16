// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import bws;
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
            a.put(bws.a, Integer.valueOf(0));
            a.put(bws.b, Integer.valueOf(1));
            a.put(bws.c, Integer.valueOf(2));
            a.put(bws.d, Integer.valueOf(3));
        }
        class1 = (Integer)a.get(class1.getName());
        if (class1 == null)
        {
            return;
        }
        switch (class1.intValue())
        {
        default:
            return;

        case 0: // '\0'
            bws.a(hlp);
            return;

        case 1: // '\001'
            bws.b(hlp);
            return;

        case 2: // '\002'
            bws.a(context, hlp);
            return;

        case 3: // '\003'
            bws.c(hlp);
            break;
        }
    }

    public ()
    {
    }
}
