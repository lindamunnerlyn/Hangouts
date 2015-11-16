// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.widget.ArrayAdapter;

public final class aui
{

    final Context a;
    aoa b;
    asa c;
    cfz d;
    String e;

    public aui(Context context)
    {
        a = (Context)n.b(context);
    }

    static void a(Runnable runnable)
    {
        (new aus(runnable)).execute(new Void[0]);
    }

    public AlertDialog a()
    {
        n.b(b);
        n.b(c);
        n.b(e);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        ArrayAdapter arrayadapter = new ArrayAdapter(a, 0x1090003);
        int i = b.h();
        arrayadapter.add(new aut(c.a, i, true));
        arrayadapter.add(new aut(c.a, i, false));
        arrayadapter.add(new auk(this, "Remove conversation", i));
        arrayadapter.add(new aum(this, "Inspect conversation"));
        arrayadapter.add(new aun(this, "Email conversation"));
        arrayadapter.add(new aup(this, "Show SMS target", i));
        arrayadapter.add(new aur(this, "Start Stress Test"));
        arrayadapter.add(new auv(this, "Debug contact info"));
        builder.setAdapter(arrayadapter, new auj(this, arrayadapter));
        return builder.create();
    }

    public aui a(aoa aoa1)
    {
        b = (aoa)n.b(aoa1);
        return this;
    }

    public aui a(asa asa1)
    {
        c = (asa)n.b(asa1);
        return this;
    }

    public aui a(cfz cfz)
    {
        d = cfz;
        return this;
    }

    public aui a(String s)
    {
        e = (String)n.b(s);
        return this;
    }
}
