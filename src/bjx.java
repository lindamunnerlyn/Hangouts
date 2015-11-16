// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class bjx extends bkd
    implements android.widget.AbsListView.OnScrollListener
{

    public cng g;

    public bjx()
    {
    }

    public boolean isEmpty()
    {
        return g == null || g.a() == null || g.getCount() == 0;
    }

    public void onDetach()
    {
        if (g != null)
        {
            g.b(null);
        }
        super.onDetach();
    }

    public void onPause()
    {
        super.onPause();
        if (g != null && g.a() != null)
        {
            g.c();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (g != null && g.a() != null)
        {
            g.d();
        }
    }
}
