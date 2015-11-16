// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class efp extends ea
{

    private final int f;
    private final String g;

    public efp(Context context, int i, String s)
    {
        super(context);
        f = i;
        g = s;
    }

    public Object d()
    {
        Object obj = any.f(new aoe(n(), f), g);
        if (((List) (obj)).isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(ebz.p((String)((Iterator) (obj)).next()))) { }
        return jgu.a(", ").a(arraylist);
    }
}
