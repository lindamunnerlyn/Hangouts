// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class aza extends dsp
{

    public aza(ad ad, hjm hjm)
    {
        super(ad, hjm);
    }

    public aza a(hgx hgx)
    {
        super.b(hgx);
        return this;
    }

    protected void a(dsn dsn, boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)b.getParent();
        Snackbar snackbar = (Snackbar)a.getLayoutInflater().inflate(g.fq, viewgroup, false);
        viewgroup.addView(snackbar);
        a(snackbar);
        super.a(dsn, flag);
    }

    public dsp b(hgx hgx)
    {
        return a(hgx);
    }
}
