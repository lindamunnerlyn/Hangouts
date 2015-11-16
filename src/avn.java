// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class avn
    implements byg
{

    final ave a;

    avn(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            android.content.Intent intent = ((byf)ave.S(a).a(byf)).a(a.getActivity());
            ave.T(a).a(g.kt, intent);
            return;
        } else
        {
            ebw.e("Conv", "Location permission not granted!");
            return;
        }
    }
}
