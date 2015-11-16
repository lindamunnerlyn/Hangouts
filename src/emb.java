// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class emb
    implements Runnable
{

    final ely a;
    private final int b;
    private final ConnectionResult c;

    public emb(ely ely1, int i, ConnectionResult connectionresult)
    {
        a = ely1;
        super();
        b = i;
        c = connectionresult;
    }

    public void run()
    {
        if (c.a())
        {
            try
            {
                int i = a.getActivity().t_().d().indexOf(a);
                c.a(a.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                ely.a(a);
            }
            return;
        }
        if (ejn.b(c.c()))
        {
            ejn.a(c.c(), a.getActivity(), a, 2, a);
            return;
        } else
        {
            ely.a(a, b, c);
            return;
        }
    }
}
