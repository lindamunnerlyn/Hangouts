// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import java.lang.reflect.Method;

final class dxe extends PhoneStateListener
{

    private final Context a;
    private dxc b;
    private ServiceState c;
    private SignalStrength d;

    dxe(Context context, dxc dxc1)
    {
        a = context;
        b = dxc1;
    }

    private void a()
    {
        if (c != null && d != null && b != null)
        {
            b.a(dxb.a(a, c.getState(), b()));
            b = null;
        }
    }

    private int b()
    {
        if (dxb.a != -1)
        {
            return dxb.a(dxb.a);
        }
        Method method = d.getClass().getDeclaredMethod("getLevel", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int i = dxb.a(g.a((Integer)method.invoke(d, new Object[0]), 0));
        return i;
        Exception exception;
        exception;
        eev.e("Babel_telephony", "TeleCellServiceUtils.getSignalLevelPercent, error calling SignalStrength.getLevel", exception);
        return -1;
    }

    public void onServiceStateChanged(ServiceState servicestate)
    {
        String s = String.valueOf(servicestate);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 41)).append("CellStateListener.onServiceStateChanged: ").append(s).toString());
        c = servicestate;
        a();
    }

    public void onSignalStrengthsChanged(SignalStrength signalstrength)
    {
        String s = String.valueOf(signalstrength);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 44)).append("CellStateListener.onSignalStrengthsChanged: ").append(s).toString());
        d = signalstrength;
        a();
    }
}
