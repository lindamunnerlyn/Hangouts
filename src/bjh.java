// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bjh
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final bje a;

    bjh(bje bje1)
    {
        a = bje1;
        super();
    }

    public void onGlobalLayout()
    {
        gke.a(bje.b(a), this);
        if (a.getActivity() == null)
        {
            return;
        } else
        {
            bje.f(a);
            return;
        }
    }
}
