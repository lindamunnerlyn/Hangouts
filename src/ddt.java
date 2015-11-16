// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ddt
    implements Runnable
{

    final ani a;
    final dbz b;
    final dbx c;
    final ai d;
    final dds e;

    ddt(dds dds, ani ani1, dbz dbz1, dbx dbx, ai ai1)
    {
        e = dds;
        a = ani1;
        b = dbz1;
        c = dbx;
        d = ai1;
        super();
    }

    public void run()
    {
        switch (a.X())
        {
        default:
            ebw.f("Babel", "GetVoiceAccountData didn't return valid account info");
            return;

        case 1: // '\001'
            b.b(c);
            return;

        case 2: // '\002'
            android.content.Intent intent = g.a(a, c);
            d.startActivityForResult(intent, 5100);
            return;

        case 3: // '\003'
            ebr.a(d, l.ty);
            break;
        }
    }
}
