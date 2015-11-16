// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class bkj extends bkp
    implements android.widget.AbsListView.OnScrollListener
{

    public coy f;

    public bkj()
    {
    }

    public boolean isEmpty()
    {
        return f == null || f.a() == null || f.getCount() == 0;
    }

    public void onDetach()
    {
        if (f != null)
        {
            f.b(null);
        }
        super.onDetach();
    }

    public void onPause()
    {
        super.onPause();
        if (f != null && f.a() != null)
        {
            f.c();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (f != null && f.a() != null)
        {
            f.d();
        }
    }
}
