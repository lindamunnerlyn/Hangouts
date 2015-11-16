// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class awd
    implements bzj
{

    final avv a;

    awd(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            android.content.Intent intent = ((bzi)avv.T(a).a(bzi)).a(a.getActivity());
            avv.U(a).a(g.km, intent);
            return;
        } else
        {
            eev.e("Conv", "Location permission not granted!");
            return;
        }
    }
}
