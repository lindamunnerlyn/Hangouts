// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;
import android.view.View;

public class bmk extends hhj
{

    private int j;
    public Toolbar l;

    public bmk()
    {
        j = com.google.android.apps.hangouts.R.drawable.bV;
        p.a(hiv, q);
    }

    private void j()
    {
        l = (Toolbar)findViewById(h.cH);
        gbh.b("Toolbar needs to be in the layout with id hangouts_toolbar", l);
        l.e(com.google.android.apps.hangouts.R.drawable.aY);
        a(l);
        g().b(j);
    }

    public void a(int i, int k)
    {
        super.setContentView(i);
        j = k;
        j();
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
        j();
    }

    public Toolbar l()
    {
        return l;
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        j();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        j();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        j();
    }
}
