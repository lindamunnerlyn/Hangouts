// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class dfb
    implements Runnable
{

    final aoa a;
    final ddi b;
    final ddg c;
    final ai d;
    final dfa e;

    dfb(dfa dfa, aoa aoa1, ddi ddi1, ddg ddg, ai ai1)
    {
        e = dfa;
        a = aoa1;
        b = ddi1;
        c = ddg;
        d = ai1;
        super();
    }

    public void run()
    {
        switch (a.U())
        {
        default:
            eev.f("Babel", "GetVoiceAccountData didn't return valid account info");
            return;

        case 1: // '\001'
            b.b(c);
            return;

        case 2: // '\002'
            android.content.Intent intent = g.a(a, c);
            d.startActivityForResult(intent, 5100);
            return;

        case 3: // '\003'
            Toast.makeText(d, l.sQ, 0).show();
            break;
        }
    }
}
