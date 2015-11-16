// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class bnr
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, bos
{

    private final bnd a = bnd.a();
    private final bof b = bof.a();
    private final bns c = new bns(this);
    private final Context d;
    private bot e;
    private bpl f;
    private AlertDialog g;

    public bnr(Context context)
    {
        d = context;
    }

    static bot a(bnr bnr1)
    {
        return bnr1.e;
    }

    static bpl a(bnr bnr1, bpl bpl1)
    {
        bnr1.f = bpl1;
        return bpl1;
    }

    static AlertDialog b(bnr bnr1)
    {
        return bnr1.g;
    }

    private void b()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(d);
        Resources resources = d.getResources();
        builder.setMessage(f.b());
        builder.setPositiveButton(resources.getString(l.hJ), this);
        builder.setNegativeButton(resources.getString(l.cS), this);
        builder.setCancelable(false);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            builder.setOnDismissListener(this);
        }
        g = builder.create();
        g.show();
    }

    static AlertDialog c(bnr bnr1)
    {
        bnr1.g = null;
        return null;
    }

    static void d(bnr bnr1)
    {
        bnr1.b();
    }

    public void a(int i)
    {
    }

    public void a(bot bot1)
    {
        e = bot1;
        b.a(c);
        if (e.c() == 2)
        {
            f = a.t().L();
            if (f != null)
            {
                b();
            }
        }
    }

    public void i_()
    {
        b.b(c);
        if (g != null)
        {
            g.dismiss();
            g = null;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.t();
        if (i == -1)
        {
            dialoginterface.e(f.a());
            gbh.a(g);
            return;
        } else
        {
            gbh.a(Integer.valueOf(i), Integer.valueOf(-2));
            dialoginterface.c(1004);
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (dialoginterface == g)
        {
            onClick(dialoginterface, -2);
        }
    }
}
