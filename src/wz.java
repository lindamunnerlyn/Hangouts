// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class wz
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final wx a;

    wz(wx wx1)
    {
        a = wx1;
        super();
    }

    public void onGlobalLayout()
    {
        if (!wx.a(a, a.a))
        {
            a.k();
            return;
        } else
        {
            a.b();
            wx.b(a);
            return;
        }
    }
}
