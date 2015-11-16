// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import ale;
import android.content.Context;
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
            a = new HashMap(5);
            a.put(ale.a, Integer.valueOf(0));
            a.put(ale.b, Integer.valueOf(1));
            a.put(ale.c, Integer.valueOf(2));
            a.put(ale.d, Integer.valueOf(3));
            a.put(ale.e, Integer.valueOf(4));
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
            ale.a(context, hlp);
            return;

        case 1: // '\001'
            ale.a(hlp);
            return;

        case 2: // '\002'
            ale.b(context, hlp);
            return;

        case 3: // '\003'
            ale.c(context, hlp);
            return;

        case 4: // '\004'
            ale.d(context, hlp);
            break;
        }
    }

    public ()
    {
    }
}
