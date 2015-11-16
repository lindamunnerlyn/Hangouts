// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class eoy
    implements Runnable
{

    final eow a;
    private final int b;
    private final ConnectionResult c;

    public eoy(eow eow1, int i, ConnectionResult connectionresult)
    {
        a = eow1;
        super();
        b = i;
        c = connectionresult;
    }

    public void run()
    {
        if (!eow.a(a) || eow.b(a))
        {
            return;
        }
        eow.c(a);
        eow.a(a, b);
        eow.a(a, c);
        if (c.a())
        {
            try
            {
                int i = a.getActivity().u_().d().indexOf(a);
                c.a(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                eow.d(a);
            }
            return;
        }
        if (emo.b(c.c()))
        {
            emo.a(c.c(), a.getActivity(), a, 2, a);
            return;
        } else
        {
            eow.a(a, b, c);
            return;
        }
    }
}
