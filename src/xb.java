// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class xb
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final wz a;

    xb(wz wz1)
    {
        a = wz1;
        super();
    }

    public void onGlobalLayout()
    {
        if (!wz.a(a, a.a))
        {
            a.k();
            return;
        } else
        {
            a.b();
            wz.b(a);
            return;
        }
    }
}
