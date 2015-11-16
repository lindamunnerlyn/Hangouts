// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class azo extends dvi
{

    public azo(ad ad, hof hof)
    {
        super(ad, hof);
    }

    public azo a(hlp hlp)
    {
        super.b(hlp);
        return this;
    }

    protected void a(dvg dvg, boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)c.getParent();
        Snackbar snackbar = (Snackbar)b.getLayoutInflater().inflate(g.fo, viewgroup, false);
        viewgroup.addView(snackbar);
        a(snackbar);
        super.a(dvg, flag);
    }

    public dvi b(hlp hlp)
    {
        return a(hlp);
    }
}
