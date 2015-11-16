// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class cac extends dhh
{

    cwi a;
    Exception b;
    Context c;
    final cab d;
    private ConditionVariable e;

    cac(cab cab, Context context, ConditionVariable conditionvariable)
    {
        d = cab;
        super(context);
        c = context;
        e = conditionvariable;
    }

    protected void a(dgu dgu1)
    {
        a = (cwi)dgu1.c();
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
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(dac.b(null, (String)collection.next()))) { }
        g.a(new cad(this, i, arraylist));
    }
}
