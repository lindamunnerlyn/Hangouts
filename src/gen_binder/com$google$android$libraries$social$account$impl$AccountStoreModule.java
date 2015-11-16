// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gsl;
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
            a = new HashMap(6);
            a.put(gsl.a, Integer.valueOf(0));
            a.put(gsl.b, Integer.valueOf(1));
            a.put(gsl.c, Integer.valueOf(2));
            a.put(gsl.d, Integer.valueOf(3));
            a.put(gsl.e, Integer.valueOf(4));
            a.put(gsl.f, Integer.valueOf(5));
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
            gsl.a(hlp);
            return;

        case 1: // '\001'
            gsl.a(context, hlp);
            return;

        case 2: // '\002'
            gsl.b(context, hlp);
            return;

        case 3: // '\003'
            gsl.c(context, hlp);
            return;

        case 4: // '\004'
            gsl.b(hlp);
            return;

        case 5: // '\005'
            gsl.c(hlp);
            break;
        }
    }

    public ()
    {
    }
}
