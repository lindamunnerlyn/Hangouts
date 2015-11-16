// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import can;
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
            a = new HashMap(7);
            a.put(can.a, Integer.valueOf(0));
            a.put(can.b, Integer.valueOf(1));
            a.put(can.c, Integer.valueOf(2));
            a.put(can.d, Integer.valueOf(3));
            a.put(can.e, Integer.valueOf(4));
            a.put(can.f, Integer.valueOf(5));
            a.put(can.g, Integer.valueOf(6));
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
            can.a(hlp);
            return;

        case 1: // '\001'
            can.a(context, hlp);
            return;

        case 2: // '\002'
            can.b(context, hlp);
            return;

        case 3: // '\003'
            can.b(hlp);
            return;

        case 4: // '\004'
            can.c(hlp);
            return;

        case 5: // '\005'
            can.d(hlp);
            return;

        case 6: // '\006'
            can.e(hlp);
            break;
        }
    }

    public ()
    {
    }
}
