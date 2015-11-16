// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

final class dat
{

    boolean a;
    boolean b;
    String c;
    private final Context d;
    private final int e;

    dat(Context context, int i)
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
            context.setContentView(g.oH);
            ((TextView)context.findViewById(g.oD)).setOnClickListener(new dau(context));
            context.show();
        } else
        if (a)
        {
            oncancellistener = c;
            String s = context.getString(g.oK, new Object[] {
                "11"
            });
            context = new Dialog(context);
            context.requestWindowFeature(1);
            context.setContentView(g.oG);
            ((TextView)context.findViewById(g.oF)).setText((new StringBuilder(String.valueOf(oncancellistener).length() + 2)).append("\"").append(oncancellistener).append("\"").toString());
            ((TextView)context.findViewById(g.oE)).setText(s);
            ((TextView)context.findViewById(g.oD)).setOnClickListener(new dav(context));
            context.show();
            return;
        }
    }

    boolean a()
    {
        return !((ahl)hgx.a(d, ahl)).b(e) && (a || b);
    }
}
