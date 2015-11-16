// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class cbf extends diq
{

    cym a;
    Exception b;
    Context c;
    final cbe d;
    private ConditionVariable e;

    cbf(cbe cbe, Context context, ConditionVariable conditionvariable)
    {
        d = cbe;
        super(context);
        c = context;
        e = conditionvariable;
    }

    protected void a(did did1)
    {
        a = (cym)did1.c();
        e.open();
    }

    protected void a(Exception exception)
    {
        b = exception;
        e.open();
    }

    void a(Collection collection, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(dbi.b(null, (String)collection.next()))) { }
        g.a(new cbg(this, i, arraylist));
    }

    void b(Collection collection, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(dbi.b((String)collection.next(), null))) { }
        g.a(new cbh(this, i, arraylist));
    }
}
