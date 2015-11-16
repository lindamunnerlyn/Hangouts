// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class enb extends end
{

    public final int a;
    public final Bundle b;
    final ena c;

    protected enb(ena ena1, int i, Bundle bundle)
    {
        c = ena1;
        super(ena1, Boolean.valueOf(true));
        a = i;
        b = bundle;
    }

    protected abstract void a(ConnectionResult connectionresult);

    protected void a(Boolean boolean1)
    {
        Object obj = null;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        ena.a(c, 1);
_L4:
        return;
_L2:
        switch (a)
        {
        default:
            ena.a(c, 1);
            boolean1 = obj;
            if (b != null)
            {
                boolean1 = (PendingIntent)b.getParcelable("pendingIntent");
            }
            a(new ConnectionResult(a, boolean1));
            return;

        case 0: // '\0'
            if (!a())
            {
                ena.a(c, 1);
                a(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            ena.a(c, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(Object obj)
    {
        a((Boolean)obj);
    }

    protected abstract boolean a();
}
