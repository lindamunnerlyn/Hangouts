// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

final class dzd extends aqv
{

    final dza c;

    dzd(dza dza1, gms gms, int i, String s)
    {
        c = dza1;
        super(gms, i, s);
    }

    protected void a(Cursor cursor)
    {
        synchronized (c.b)
        {
            c.a(b, true).a(cursor);
        }
        return;
        cursor;
        ebb;
        JVM INSTR monitorexit ;
        throw cursor;
    }
}
