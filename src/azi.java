// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class azi extends gqn
{

    private final String a;
    private final int b;
    private final Context e;

    public azi(Context context, String s, int i)
    {
        String s1 = String.valueOf("MarkEventObservedTask");
        String s2 = String.valueOf(s);
        if (s2.length() != 0)
        {
            s1 = s1.concat(s2);
        } else
        {
            s1 = new String(s1);
        }
        super(context, s1);
        a = s;
        b = i;
        e = context;
    }

    protected grk a()
    {
        csk csk1 = (new aoe(e, b)).z(a);
        if (csk1.b().size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(csk1);
            dbf.h(dbf.e(b)).a(h.a(new dko[] {
                new ded(arraylist)
            }), 0);
            return new grk(true);
        } else
        {
            return new grk(false);
        }
    }
}
