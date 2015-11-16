// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

final class csn extends arm
{

    final cvc c;
    final Object d;
    final csl e;

    csn(csl csl1, Context context, gqz gqz, int i, String s, cvc cvc, Object obj)
    {
        e = csl1;
        c = cvc;
        d = obj;
        super(context, gqz, i, s);
    }

    protected void a(Cursor cursor)
    {
        synchronized (e.b)
        {
            ctu ctu1 = e.a(b, true);
            ctu1.a(cursor);
            e.a(ctu1, b, c, d);
        }
        return;
        cursor;
        css;
        JVM INSTR monitorexit ;
        throw cursor;
    }
}
