// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class azv extends guy
{

    private final String a;
    private final int b;
    private final Context c;

    public azv(Context context, String s, int i)
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
        c = context;
    }

    protected gvv a()
    {
        cun cun1 = (new aow(c, b)).z(a);
        if (cun1.b().size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(cun1);
            dcn.g(dcn.e(b)).a(h.a(new dmf[] {
                new dfl(arraylist)
            }), 0);
            return new gvv(true);
        } else
        {
            return new gvv(false);
        }
    }
}
