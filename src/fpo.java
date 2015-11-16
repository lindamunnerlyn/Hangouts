// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class fpo
{

    Context a;
    List b;
    ArrayList c;
    HashMap d;
    fpp e;
    private fpq f;

    public fpo(Context context, fpp fpp1)
    {
        a = context;
        d = new HashMap();
        c = new ArrayList();
        b = new ArrayList();
        e = fpp1;
    }

    void a()
    {
        d.clear();
        c.clear();
        b.clear();
    }

    public void a(List list)
    {
        if (e == null)
        {
            return;
        }
        if (list == null || list.isEmpty())
        {
            e.a(null);
            return;
        }
        b = list;
        if (f != null)
        {
            f.cancel(true);
        }
        f = new fpq(this);
        f.execute(new Void[0]);
    }
}
