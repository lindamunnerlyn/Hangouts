// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

final class dbz
{

    boolean a;
    boolean b;
    String c;
    private final Context d;
    private final int e;

    dbz(Context context, int i)
    {
        d = context;
        e = i;
    }

    void a(Context context, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        if (b)
        {
            context = new Dialog(context);
            context.requestWindowFeature(1);
            context.setContentView(g.oJ);
            ((TextView)context.findViewById(g.oF)).setOnClickListener(new dca(context));
            context.show();
        } else
        if (a)
        {
            oncancellistener = c;
            String s = context.getString(g.oM, new Object[] {
                "11"
            });
            context = new Dialog(context);
            context.requestWindowFeature(1);
            context.setContentView(g.oI);
            ((TextView)context.findViewById(g.oH)).setText((new StringBuilder(String.valueOf(oncancellistener).length() + 2)).append("\"").append(oncancellistener).append("\"").toString());
            ((TextView)context.findViewById(g.oG)).setText(s);
            ((TextView)context.findViewById(g.oF)).setOnClickListener(new dcb(context));
            context.show();
            return;
        }
    }

    boolean a()
    {
        return !((ahd)hlp.a(d, ahd)).d(e) && (a || b);
    }
}
