// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import ddb;
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
            a.put(ddb.a, Integer.valueOf(0));
            a.put(ddb.b, Integer.valueOf(1));
            a.put(ddb.c, Integer.valueOf(2));
            a.put(ddb.d, Integer.valueOf(3));
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
            ddb.a(context, hlp);
            return;

        case 1: // '\001'
            ddb.b(context, hlp);
            return;

        case 2: // '\002'
            ddb.c(context, hlp);
            return;

        case 3: // '\003'
            ddb.d(context, hlp);
            break;
        }
    }

    public ()
    {
    }
}
