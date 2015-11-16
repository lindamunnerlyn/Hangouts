// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.widget.ArrayAdapter;

public final class atr
{

    final Context a;
    ani b;
    ark c;
    ceu d;
    String e;

    public atr(Context context)
    {
        a = (Context)n.b(context);
    }

    static void a(Runnable runnable)
    {
        (new aub(runnable)).execute(new Void[0]);
    }

    public AlertDialog a()
    {
        n.b(b);
        n.b(c);
        n.b(e);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        ArrayAdapter arrayadapter = new ArrayAdapter(a, 0x1090003);
        int i = b.h();
        arrayadapter.add(new auc(c.a, i, true));
        arrayadapter.add(new auc(c.a, i, false));
        arrayadapter.add(new att(this, "Remove conversation", i));
        arrayadapter.add(new atv(this, "Inspect conversation"));
        arrayadapter.add(new atw(this, "Email conversation"));
        arrayadapter.add(new aty(this, "Show SMS target", i));
        arrayadapter.add(new aua(this, "Start Stress Test"));
        arrayadapter.add(new aue(this, "Debug contact info"));
        builder.setAdapter(arrayadapter, new ats(this, arrayadapter));
        return builder.create();
    }

    public atr a(ani ani1)
    {
        b = (ani)n.b(ani1);
        return this;
    }

    public atr a(ark ark1)
    {
        c = (ark)n.b(ark1);
        return this;
    }

    public atr a(ceu ceu)
    {
        d = ceu;
        return this;
    }

    public atr a(String s)
    {
        e = (String)n.b(s);
        return this;
    }
}
