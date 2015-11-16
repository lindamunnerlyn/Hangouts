// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class elx
    implements Runnable
{

    final elv a;
    private final int b;
    private final ConnectionResult c;

    public elx(elv elv1, int i, ConnectionResult connectionresult)
    {
        a = elv1;
        super();
        b = i;
        c = connectionresult;
    }

    public void run()
    {
        if (!elv.a(a) || elv.b(a))
        {
            return;
        }
        elv.c(a);
        elv.a(a, b);
        elv.a(a, c);
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
                elv.d(a);
            }
            return;
        }
        if (ejn.b(c.c()))
        {
            ejn.a(c.c(), a.getActivity(), a, 2, a);
            return;
        } else
        {
            elv.a(a, b, c);
            return;
        }
    }
}
