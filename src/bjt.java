// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bjt
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final bjq a;

    bjt(bjq bjq1)
    {
        a = bjq1;
        super();
    }

    public void onGlobalLayout()
    {
        gng.a(bjq.b(a), this);
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            bjq.f(a);
            return;
        }
    }
}
