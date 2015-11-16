// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

final class aor
    implements Runnable
{

    final String a;

    aor(String s)
    {
        a = s;
        super();
    }

    public void run()
    {
        Context context = g.nU;
        Toast.makeText(context, context.getString(l.gb, new Object[] {
            a
        }), 0).show();
    }
}
