// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

final class dzc extends aqv
{

    final csz c;
    final Object d;
    final dza e;

    dzc(dza dza1, gms gms, int i, String s, csz csz, Object obj)
    {
        e = dza1;
        c = csz;
        d = obj;
        super(gms, i, s);
    }

    protected void a(Cursor cursor)
    {
        synchronized (e.b)
        {
            crk crk1 = e.a(b, true);
            crk1.a(cursor);
            e.a(crk1, b, c, d);
        }
        return;
        cursor;
        ebb;
        JVM INSTR monitorexit ;
        throw cursor;
    }
}
