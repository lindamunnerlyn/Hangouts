// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

final class cso extends arm
{

    final csl c;

    cso(csl csl1, Context context, gqz gqz, int i, String s)
    {
        c = csl1;
        super(context, gqz, i, s);
    }

    protected void a(Cursor cursor)
    {
        synchronized (c.b)
        {
            c.a(b, true).a(cursor);
        }
        return;
        cursor;
        css;
        JVM INSTR monitorexit ;
        throw cursor;
    }
}
