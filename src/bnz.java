// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class bnz
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, bpb
{

    bpc a;
    bpu b;
    AlertDialog c;
    private final bnk d = bnk.a();
    private final boo e = boo.a();
    private final boa f = new boa(this);
    private final Context g;

    public bnz(Context context)
    {
        g = context;
    }

    public void a(int i)
    {
    }

    public void a(bpc bpc1)
    {
        a = bpc1;
        e.a(f);
        if (a.c() == 2)
        {
            b = d.s().K();
            if (b != null)
            {
                b();
            }
        }
    }

    void b()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(g);
        Resources resources = g.getResources();
        builder.setMessage(b.b());
        builder.setPositiveButton(resources.getString(l.hd), this);
        builder.setNegativeButton(resources.getString(l.cB), this);
        builder.setCancelable(false);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            builder.setOnDismissListener(this);
        }
        c = builder.create();
        c.show();
    }

    public void j_()
    {
        e.b(f);
        if (c != null)
        {
            c.dismiss();
            c = null;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = d.s();
        if (i == -1)
        {
            dialoginterface.e(b.a());
            gdv.a("Expected null", c);
            return;
        } else
        {
            gdv.a(Integer.valueOf(i), Integer.valueOf(-2));
            dialoginterface.c(1004);
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (dialoginterface == c)
        {
            onClick(dialoginterface, -2);
        }
    }
}
