// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axl
    implements Runnable
{

    final ave a;

    axl(ave ave1)
    {
        a = ave1;
        super();
    }

    public void run()
    {
        gbh.a(ave.q(a));
        if (a.isAdded() && !ave.r(a))
        {
            android.view.View view = a.getView();
            if (view != null)
            {
                ave.a(a, view);
            }
        }
    }
}
