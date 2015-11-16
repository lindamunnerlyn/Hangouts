// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axy
    implements Runnable
{

    final avv a;

    axy(avv avv1)
    {
        a = avv1;
        super();
    }

    public void run()
    {
        gdv.a("Expected condition to be true", avv.p(a));
        if (a.isAdded() && !avv.q(a))
        {
            android.view.View view = a.getView();
            if (view != null)
            {
                avv.a(a, view);
            }
        }
    }
}
